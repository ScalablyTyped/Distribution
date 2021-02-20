package typings.prosemirrorView

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorTransform.mod.Mapping
import typings.prosemirrorView.anon.Bottom
import typings.prosemirrorView.anon.Dom
import typings.prosemirrorView.anon.Inside
import typings.prosemirrorView.anon.Left
import typings.prosemirrorView.anon.Mount
import typings.prosemirrorView.anon.Move
import typings.prosemirrorView.anon.OnRemove
import typings.prosemirrorView.anon.Right
import typings.prosemirrorView.anon.Target
import typings.prosemirrorView.prosemirrorViewStrings.backward
import typings.prosemirrorView.prosemirrorViewStrings.down
import typings.prosemirrorView.prosemirrorViewStrings.forward
import typings.prosemirrorView.prosemirrorViewStrings.left
import typings.prosemirrorView.prosemirrorViewStrings.right
import typings.prosemirrorView.prosemirrorViewStrings.up
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.DragEvent
import typings.std.Element
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.MutationRecord
import typings.std.Node
import typings.std.Partial
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.Selection
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-view", "Decoration")
  @js.native
  class Decoration[T /* <: js.Object */] () extends StObject {
    
    /**
      * The start position of the decoration.
      */
    var from: Double = js.native
    
    /**
      * The spec provided when creating this decoration. Can be useful
      * if you've stored extra information in that object.
      */
    var spec: T = js.native
    
    /**
      * The end position. Will be the same as `from` for [widget
      * decorations](#view.Decoration^widget).
      */
    var to: Double = js.native
  }
  /* static members */
  object Decoration {
    
    /**
      * Creates a node decoration. `from` and `to` should point precisely
      * before and after a node in the document. That node, and only that
      * node, will receive the given attributes.
      */
    @JSImport("prosemirror-view", "Decoration.node")
    @js.native
    def node[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs): Decoration[T] = js.native
    @JSImport("prosemirror-view", "Decoration.node")
    @js.native
    def node[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs, spec: T): Decoration[T] = js.native
    
    /**
      * Creates a widget decoration, which is a DOM node that's shown in
      * the document at the given position. It is recommended that you
      * delay rendering the widget by passing a function that will be
      * called when the widget is actually drawn in a view, but you can
      * also directly pass a DOM node. getPos can be used to find the
      * widget's current document position.
      */
    @JSImport("prosemirror-view", "Decoration.widget")
    @js.native
    def widget[T /* <: js.Object */](
      pos: Double,
      toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node]
    ): Decoration[T with WidgetDecorationSpec] = js.native
    @JSImport("prosemirror-view", "Decoration.widget")
    @js.native
    def widget[T /* <: js.Object */](
      pos: Double,
      toDOM: js.Function2[/* view */ EditorView[_], /* getPos */ js.Function0[Double], Node],
      spec: T with WidgetDecorationSpec
    ): Decoration[T with WidgetDecorationSpec] = js.native
    @JSImport("prosemirror-view", "Decoration.widget")
    @js.native
    def widget[T /* <: js.Object */](pos: Double, toDOM: Node): Decoration[T with WidgetDecorationSpec] = js.native
    @JSImport("prosemirror-view", "Decoration.widget")
    @js.native
    def widget[T /* <: js.Object */](pos: Double, toDOM: Node, spec: T with WidgetDecorationSpec): Decoration[T with WidgetDecorationSpec] = js.native
    
    /**
      * Creates an inline decoration, which adds the given attributes to
      * each inline node between `from` and `to`.
      */
    @JSImport("prosemirror-view", "Decoration.inline")
    @js.native
    def `inline`[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs): Decoration[T with InlineDecorationSpec] = js.native
    @JSImport("prosemirror-view", "Decoration.inline")
    @js.native
    def `inline`[T /* <: js.Object */](from: Double, to: Double, attrs: DecorationAttrs, spec: T with InlineDecorationSpec): Decoration[T with InlineDecorationSpec] = js.native
  }
  
  @JSImport("prosemirror-view", "DecorationSet")
  @js.native
  class DecorationSet[S /* <: Schema[_, _] */] () extends StObject {
    
    /**
      * Add the given array of decorations to the ones in the set,
      * producing a new set. Needs access to the current document to
      * create the appropriate tree structure.
      */
    def add(doc: typings.prosemirrorModel.mod.Node[S], decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
    
    /**
      * Find all decorations in this set which touch the given range
      * (including decorations that start or end directly at the
      * boundaries) and match the given predicate on their spec. When
      * `start` and `end` are omitted, all decorations in the set are
      * considered. When `predicate` isn't given, all decorations are
      * assumed to match.
      */
    def find(): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(
      start: js.UndefOr[scala.Nothing],
      end: js.UndefOr[scala.Nothing],
      predicate: js.Function1[/* spec */ StringDictionary[js.Any], Boolean]
    ): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(start: js.UndefOr[scala.Nothing], end: Double): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(
      start: js.UndefOr[scala.Nothing],
      end: Double,
      predicate: js.Function1[/* spec */ StringDictionary[js.Any], Boolean]
    ): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(start: Double): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(
      start: Double,
      end: js.UndefOr[scala.Nothing],
      predicate: js.Function1[/* spec */ StringDictionary[js.Any], Boolean]
    ): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(start: Double, end: Double): js.Array[Decoration[StringDictionary[_]]] = js.native
    def find(start: Double, end: Double, predicate: js.Function1[/* spec */ StringDictionary[js.Any], Boolean]): js.Array[Decoration[StringDictionary[_]]] = js.native
    
    /**
      * Map the set of decorations in response to a change in the
      * document.
      */
    def map(mapping: Mapping, doc: typings.prosemirrorModel.mod.Node[S]): DecorationSet[S] = js.native
    def map(mapping: Mapping, doc: typings.prosemirrorModel.mod.Node[S], options: OnRemove): DecorationSet[S] = js.native
    
    /**
      * Create a new set that contains the decorations in this set, minus
      * the ones in the given array.
      */
    def remove(decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
  }
  /* static members */
  object DecorationSet {
    
    @JSImport("prosemirror-view", "DecorationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a set of decorations, using the structure of the given
      * document.
      */
    @JSImport("prosemirror-view", "DecorationSet.create")
    @js.native
    def create[S /* <: Schema[_, _] */](doc: typings.prosemirrorModel.mod.Node[S], decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
    
    /**
      * The empty set of decorations.
      */
    @JSImport("prosemirror-view", "DecorationSet.empty")
    @js.native
    def empty: DecorationSet[js.Any] = js.native
    @scala.inline
    def empty_=(x: DecorationSet[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("prosemirror-view", "EditorView")
  @js.native
  class EditorView[S /* <: Schema[_, _] */] protected () extends StObject {
    def this(place: js.UndefOr[scala.Nothing], props: DirectEditorProps[S]) = this()
    def this(place: js.Function1[/* p */ Node, Unit], props: DirectEditorProps[S]) = this()
    def this(place: Mount, props: DirectEditorProps[S]) = this()
    /**
      * Create a view. `place` may be a DOM node that the editor should
      * be appended to, a function that will place it into the document,
      * or an object whose `mount` property holds the node to use as the
      * document container. If it is `null`, the editor will not be added
      * to the document.
      */
    def this(place: Node, props: DirectEditorProps[S]) = this()
    
    /**
      * Holds true when a composition is active.
      */
    var composing: Boolean = js.native
    
    /**
      * Returns the viewport rectangle at a given document position.
      * `left` and `right` will be the same number, as this returns a
      * flat cursor-ish rectangle. If the position is between two things
      * that aren't directly adjacent, `side` determines which element is
      * used. When < 0, the element before the position is used,
      * otherwise the element after.
      */
    def coordsAtPos(pos: Double): Bottom = js.native
    def coordsAtPos(pos: Double, side: Double): Bottom = js.native
    
    /**
      * Removes the editor from the DOM and destroys all [node
      * views](#view.NodeView).
      */
    def destroy(): Unit = js.native
    
    /**
      * Dispatch a transaction. Will call
      * [`dispatchTransaction`](#view.DirectEditorProps.dispatchTransaction)
      * when given, and otherwise defaults to applying the transaction to
      * the current state and calling
      * [`updateState`](#view.EditorView.updateState) with the result.
      * This method is bound to the view instance, so that it can be
      * easily passed around.
      */
    def dispatch(
      tr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ js.Any
    ): Unit = js.native
    
    /**
      * An editable DOM node containing the document. (You probably
      * should not directly interfere with its content.)
      */
    var dom: Element = js.native
    
    /**
      * Find the DOM position that corresponds to the given document
      * position. Note that you should **not** mutate the editor's
      * internal DOM, only inspect it (and even that is usually not
      * necessary).
      */
    def domAtPos(pos: Double): typings.prosemirrorView.anon.Node = js.native
    
    /**
      * When editor content is being dragged, this object contains
      * information about the dragged slice and whether it is being
      * copied or moved. At any other time, it is null.
      */
    var dragging: js.UndefOr[Move[S] | Null] = js.native
    
    /**
      * Indicates whether the editor is currently [editable](#view.EditorProps.editable).
      */
    var editable: Boolean = js.native
    
    @JSName("endOfTextblock")
    def endOfTextblock_backward(dir: backward): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_backward(
      dir: backward,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_down(dir: down): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_down(
      dir: down,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_forward(dir: forward): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_forward(
      dir: forward,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_left(dir: left): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_left(
      dir: left,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_right(dir: right): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_right(
      dir: right,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    /**
      * Find out whether the selection is at the end of a textblock when
      * moving in a given direction. When, for example, given `"left"`,
      * it will return true if moving left from the current cursor
      * position would leave that position's parent textblock. Will apply
      * to the view's current state by default, but it is possible to
      * pass a different state.
      */
    @JSName("endOfTextblock")
    def endOfTextblock_up(dir: up): Boolean = js.native
    @JSName("endOfTextblock")
    def endOfTextblock_up(
      dir: up,
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Boolean = js.native
    
    /**
      * Focus the editor.
      */
    def focus(): Unit = js.native
    
    /**
      * Query whether the view has focus.
      */
    def hasFocus(): Boolean = js.native
    
    /**
      * Find the DOM node that represents the document node after the
      * given position. May return null when the position doesn't point
      * in front of a node or if the node is inside an opaque node view.
      *
      * This is intended to be able to call things like getBoundingClientRect
      * on that DOM node. Do not mutate the editor DOM directly, or add
      * styling this way, since that will be immediately overriden by the
      * editor as it redraws the node.
      */
    def nodeDOM(pos: Double): js.UndefOr[Node | Null] = js.native
    
    /**
      * Given a pair of viewport coordinates, return the document
      * position that corresponds to them. May return null if the given
      * coordinates aren't inside of the editor. When an object is
      * returned, its `pos` property is the position nearest to the
      * coordinates, and its `inside` property holds the position of the
      * inner node that the position falls inside of, or -1 if it is at
      * the top level, not in any node.
      */
    def posAtCoords(coords: Left): js.UndefOr[Inside | Null] = js.native
    
    /**
      * Find the document position that corresponds to a given DOM position.
      * (Whenever possible, it is preferable to inspect the document structure
      * directly, rather than poking around in the DOM, but sometimes—for
      * example when interpreting an event target—you don't have a choice.)
      *
      * The bias (default: -1) parameter can be used to influence which side of
      * a DOM node to use when the position is inside a leaf node.
      */
    def posAtDOM(node: Node, offset: Double): Double = js.native
    def posAtDOM(node: Node, offset: Double, bias: Double): Double = js.native
    
    /**
      * The view's current [props](#view.EditorProps).
      */
    var props: DirectEditorProps[S] = js.native
    
    /**
      * Get the document root in which the editor exists. This will
      * usually be the top-level `document`, but might be a [shadow
      * DOM](https://developer.mozilla.org/en-US/docs/Web/Web_Components/Shadow_DOM)
      * root if the editor is inside one.
      */
    var root: Document | DocumentFragment = js.native
    
    /**
      * Update the view by updating existing props object with the object
      * given as argument. Equivalent to `view.update(Object.assign({},
      * view.props, props))`.
      */
    def setProps(props: Partial[DirectEditorProps[S]]): Unit = js.native
    
    /**
      * Goes over the values of a prop, first those provided directly,
      * then those from plugins (in order), and calls `f` every time a
      * non-undefined value is found. When `f` returns a truthy value,
      * that is immediately returned. When `f` isn't provided, it is
      * treated as the identity function (the prop value is returned
      * directly).
      */
    def someProp(propName: String): js.Any = js.native
    def someProp(propName: String, f: js.Function1[/* prop */ js.Any, _]): js.Any = js.native
    
    /**
      * The view's current [state](#state.EditorState).
      */
    var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any = js.native
    
    /**
      * Update the view's props. Will immediately cause an update to
      * the DOM.
      */
    def update(props: DirectEditorProps[S]): Unit = js.native
    
    /**
      * Update the editor's `state` prop, without touching any of the
      * other props.
      */
    def updateState(
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Unit = js.native
  }
  
  @JSImport("prosemirror-view", "__endComposition")
  @js.native
  def endComposition(view: EditorView[_]): Boolean = js.native
  @JSImport("prosemirror-view", "__endComposition")
  @js.native
  def endComposition(view: EditorView[_], forceUpdate: Boolean): Boolean = js.native
  
  @JSImport("prosemirror-view", "__parseFromClipboard")
  @js.native
  def parseFromClipboard[S /* <: Schema[_, _] */](view: EditorView[S], text: String, html: String, plainText: Boolean, $context: ResolvedPos[S]): Slice[S] = js.native
  
  @JSImport("prosemirror-view", "__serializeForClipboard")
  @js.native
  def serializeForClipboard[S /* <: Schema[_, _] */](view: EditorView[S], slice: Slice[S]): Dom = js.native
  
  @js.native
  trait DecorationAttrs
    extends /**
    * Specify additional attrs that will be mapped directly to the
    * target node's DOM attributes.
    */
  /* key */ StringDictionary[js.UndefOr[String | Null]] {
    
    /**
      * A CSS class name or a space-separated set of class names to be
      * _added_ to the classes that the node already had.
      */
    var `class`: js.UndefOr[String | Null] = js.native
    
    /**
      * When non-null, the target node is wrapped in a DOM element of
      * this type (and the other attributes are applied to this element).
      */
    var nodeName: js.UndefOr[String | Null] = js.native
    
    /**
      * A string of CSS to be _added_ to the node's existing `style` property.
      */
    var style: js.UndefOr[String | Null] = js.native
  }
  object DecorationAttrs {
    
    @scala.inline
    def apply(): DecorationAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorationAttrs]
    }
    
    @scala.inline
    implicit class DecorationAttrsMutableBuilder[Self <: DecorationAttrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNull: Self = StObject.set(x, "class", null)
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNameNull: Self = StObject.set(x, "nodeName", null)
      
      @scala.inline
      def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DirectEditorProps[S /* <: Schema[_, _] */]
    extends EditorProps[js.Any, S] {
    
    /**
      * The callback over which to send transactions (state updates)
      * produced by the view. If you specify this, you probably want to
      * make sure this ends up calling the view's
      * [`updateState`](#view.EditorView.updateState) method with a new
      * state that has the transaction
      * [applied](#state.EditorState.apply). The callback will be bound to have
      * the view instance as its `this` binding.
      */
    var dispatchTransaction: js.UndefOr[
        (js.ThisFunction1[
          /* this */ EditorView[S], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
          Unit
        ]) | Null
      ] = js.native
    
    /**
      * The current state of the editor.
      */
    var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any = js.native
  }
  object DirectEditorProps {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](
      state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): DirectEditorProps[S] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectEditorProps[S]]
    }
    
    @scala.inline
    implicit class DirectEditorPropsMutableBuilder[Self <: DirectEditorProps[_], S /* <: Schema[_, _] */] (val x: Self with DirectEditorProps[S]) extends AnyVal {
      
      @scala.inline
      def setDispatchTransaction(
        value: js.ThisFunction1[
              /* this */ EditorView[S], 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
              Unit
            ]
      ): Self = StObject.set(x, "dispatchTransaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchTransactionNull: Self = StObject.set(x, "dispatchTransaction", null)
      
      @scala.inline
      def setDispatchTransactionUndefined: Self = StObject.set(x, "dispatchTransaction", js.undefined)
      
      @scala.inline
      def setState(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditorProps[ThisT, S /* <: Schema[_, _] */] extends StObject {
    
    /**
      * Control the DOM attributes of the editable element. May be either
      * an object or a function going from an editor state to an object.
      * By default, the element will get a class `"ProseMirror"`, and
      * will have its `contentEditable` attribute determined by the
      * [`editable` prop](#view.EditorProps.editable). Additional classes
      * provided here will be added to the class. For other attributes,
      * the value provided first (as in
      * [`someProp`](#view.EditorView.someProp)) will be used.
      */
    var attributes: js.UndefOr[
        StringDictionary[String] | (js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
          js.UndefOr[StringDictionary[String] | Null | Unit]
        ]) | Null
      ] = js.native
    
    /**
      * The [parser](#model.DOMParser) to use when reading content from
      * the clipboard. When not given, the value of the
      * [`domParser`](#view.EditorProps.domParser) prop is used.
      */
    var clipboardParser: js.UndefOr[DOMParser[S] | Null] = js.native
    
    /**
      * The DOM serializer to use when putting content onto the
      * clipboard. If not given, the result of
      * [`DOMSerializer.fromSchema`](#model.DOMSerializer^fromSchema)
      * will be used.
      */
    var clipboardSerializer: js.UndefOr[DOMSerializer[S] | Null] = js.native
    
    /**
      * A function to parse text from the clipboard into a document
      * slice. Called after
      * [`transformPastedText`](#view.EditorProps.transformPastedText).
      * The default behavior is to split the text into lines, wrap them
      * in `<p>` tags, and call
      * [`clipboardParser`](#view.EditorProps.clipboardParser) on it.
      * The `plain` flag will be true when the text is pasted as plain
      * text.
      */
    var clipboardTextParser: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* text */ String, 
          /* $context */ ResolvedPos[S], 
          /* plain */ Boolean, 
          Slice[S]
        ]) | Null
      ] = js.native
    
    /**
      * A function that will be called to get the text for the current
      * selection when copying text to the clipboard. By default, the
      * editor will use [`textBetween`](#model.Node.textBetween) on the
      * selected range.
      */
    var clipboardTextSerializer: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String]) | Null] = js.native
    
    /**
      * Can be used to override the way a selection is created when
      * reading a DOM selection between the given anchor and head.
      */
    var createSelectionBetween: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* anchor */ ResolvedPos[S], 
          /* head */ ResolvedPos[S], 
          js.UndefOr[Selection | Null]
        ]) | Null
      ] = js.native
    
    /**
      * A set of [document decorations](#view.Decoration) to show in the
      * view.
      */
    var decorations: js.UndefOr[
        (js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
          js.UndefOr[DecorationSet[S] | Null]
        ]) | Null
      ] = js.native
    
    /**
      * The [parser](#model.DOMParser) to use when reading editor changes
      * from the DOM. Defaults to calling
      * [`DOMParser.fromSchema`](#model.DOMParser^fromSchema) on the
      * editor's schema.
      */
    var domParser: js.UndefOr[DOMParser[S] | Null] = js.native
    
    /**
      * When this returns false, the content of the view is not directly
      * editable.
      */
    var editable: js.UndefOr[
        (js.ThisFunction1[
          /* this */ ThisT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called when the editor is clicked, after `handleClickOn` handlers
      * have been called.
      */
    var handleClick: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called for each node around a click, from the inside out. The
      * `direct` flag will be true for the inner node.
      */
    var handleClickOn: js.UndefOr[
        (js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Can be an object mapping DOM event type names to functions that
      * handle them. Such functions will be called before any handling
      * ProseMirror does of events fired on the editable DOM element.
      * Contrary to the other event handling props, when returning true
      * from such a function, you are responsible for calling
      * `preventDefault` yourself (or not, if you want to allow the
      * default behavior).
      */
    var handleDOMEvents: js.UndefOr[(HandleDOMEventsProp[ThisT, S]) | Null] = js.native
    
    /**
      * Called when the editor is double-clicked, after `handleDoubleClickOn`.
      */
    var handleDoubleClick: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called for each node around a double click.
      */
    var handleDoubleClickOn: js.UndefOr[
        (js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called when something is dropped on the editor. `moved` will be
      * true if this drop moves from the current selection (which should
      * thus be deleted).
      */
    var handleDrop: js.UndefOr[
        (js.ThisFunction4[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ Event, 
          /* slice */ Slice[S], 
          /* moved */ Boolean, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called when the editor receives a `keydown` event.
      */
    var handleKeyDown: js.UndefOr[
        (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
      ] = js.native
    
    /**
      * Handler for `keypress` events.
      */
    var handleKeyPress: js.UndefOr[
        (js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]) | Null
      ] = js.native
    
    /**
      * Can be used to override the behavior of pasting. `slice` is the
      * pasted content parsed by the editor, but you can directly access
      * the event to get at the raw content.
      */
    var handlePaste: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ ClipboardEvent, 
          /* slice */ Slice[S], 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called when the view, after updating its state, tries to scroll
      * the selection into view. A handler function may return false to
      * indicate that it did not handle the scrolling and further
      * handlers or the default behavior should be tried.
      */
    var handleScrollToSelection: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean]) | Null] = js.native
    
    /**
      * Whenever the user directly input text, this handler is called
      * before the input is applied. If it returns `true`, the default
      * behavior of actually inserting the text is suppressed.
      */
    var handleTextInput: js.UndefOr[
        (js.ThisFunction4[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called when the editor is triple-clicked, after `handleTripleClickOn`.
      */
    var handleTripleClick: js.UndefOr[
        (js.ThisFunction3[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Called for each node around a triple click.
      */
    var handleTripleClickOn: js.UndefOr[
        (js.ThisFunction6[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node[S], 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean
        ]) | Null
      ] = js.native
    
    /**
      * Allows you to pass custom rendering and behavior logic for nodes
      * and marks. Should map node and mark names to constructor
      * functions that produce a [`NodeView`](#view.NodeView) object
      * implementing the node's display behavior. For nodes, the third
      * argument `getPos` is a function that can be called to get the
      * node's current position, which can be useful when creating
      * transactions to update it. For marks, the third argument is a
      * boolean that indicates whether the mark's content is inline.
      *
      * `decorations` is an array of node or inline decorations that are
      * active around the node. They are automatically drawn in the
      * normal way, and you will usually just want to ignore this, but
      * they can also be used as a way to provide context information to
      * the node view without adding it to the document itself.
      */
    var nodeViews: js.UndefOr[
        (StringDictionary[
          js.Function4[
            /* node */ typings.prosemirrorModel.mod.Node[S], 
            /* view */ EditorView[S], 
            /* getPos */ js.Function0[Double] | Boolean, 
            /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
            NodeView[S]
          ]
        ]) | Null
      ] = js.native
    
    /**
      * Determines the extra space (in pixels) that is left above or
      * below the cursor when it is scrolled into view. Defaults to 5.
      */
    var scrollMargin: js.UndefOr[Double | Right | Null] = js.native
    
    /**
      * Determines the distance (in pixels) between the cursor and the
      * end of the visible viewport at which point, when scrolling the
      * cursor into view, scrolling takes place. Defaults to 0.
      */
    var scrollThreshold: js.UndefOr[Double | Right | Null] = js.native
    
    /**
      * Can be used to transform pasted content before it is applied to
      * the document.
      */
    var transformPasted: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]]) | Null] = js.native
    
    /**
      * Can be used to transform pasted HTML text, _before_ it is parsed,
      * for example to clean it up.
      */
    var transformPastedHTML: js.UndefOr[(js.ThisFunction1[/* this */ ThisT, /* html */ String, String]) | Null] = js.native
    
    /**
      * Transform pasted plain text. The `plain` flag will be true when
      * the text is pasted as plain text.
      */
    var transformPastedText: js.UndefOr[
        (js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String]) | Null
      ] = js.native
  }
  object EditorProps {
    
    @scala.inline
    def apply[ThisT, S /* <: Schema[_, _] */](): EditorProps[ThisT, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorProps[ThisT, S]]
    }
    
    @scala.inline
    implicit class EditorPropsMutableBuilder[Self <: EditorProps[_, _], ThisT, S /* <: Schema[_, _] */] (val x: Self with (EditorProps[ThisT, S])) extends AnyVal {
      
      @scala.inline
      def setAttributes(
        value: StringDictionary[String] | (js.ThisFunction1[
              /* this */ ThisT, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* p */ js.Any, 
              js.UndefOr[StringDictionary[String] | Null | Unit]
            ])
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesNull: Self = StObject.set(x, "attributes", null)
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setClipboardParser(value: DOMParser[S]): Self = StObject.set(x, "clipboardParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardParserNull: Self = StObject.set(x, "clipboardParser", null)
      
      @scala.inline
      def setClipboardParserUndefined: Self = StObject.set(x, "clipboardParser", js.undefined)
      
      @scala.inline
      def setClipboardSerializer(value: DOMSerializer[S]): Self = StObject.set(x, "clipboardSerializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardSerializerNull: Self = StObject.set(x, "clipboardSerializer", null)
      
      @scala.inline
      def setClipboardSerializerUndefined: Self = StObject.set(x, "clipboardSerializer", js.undefined)
      
      @scala.inline
      def setClipboardTextParser(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* text */ String, 
              /* $context */ ResolvedPos[S], 
              /* plain */ Boolean, 
              Slice[S]
            ]
      ): Self = StObject.set(x, "clipboardTextParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardTextParserNull: Self = StObject.set(x, "clipboardTextParser", null)
      
      @scala.inline
      def setClipboardTextParserUndefined: Self = StObject.set(x, "clipboardTextParser", js.undefined)
      
      @scala.inline
      def setClipboardTextSerializer(value: js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], String]): Self = StObject.set(x, "clipboardTextSerializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipboardTextSerializerNull: Self = StObject.set(x, "clipboardTextSerializer", null)
      
      @scala.inline
      def setClipboardTextSerializerUndefined: Self = StObject.set(x, "clipboardTextSerializer", js.undefined)
      
      @scala.inline
      def setCreateSelectionBetween(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* anchor */ ResolvedPos[S], 
              /* head */ ResolvedPos[S], 
              js.UndefOr[Selection | Null]
            ]
      ): Self = StObject.set(x, "createSelectionBetween", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSelectionBetweenNull: Self = StObject.set(x, "createSelectionBetween", null)
      
      @scala.inline
      def setCreateSelectionBetweenUndefined: Self = StObject.set(x, "createSelectionBetween", js.undefined)
      
      @scala.inline
      def setDecorations(
        value: js.ThisFunction1[
              /* this */ ThisT, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
              js.UndefOr[DecorationSet[S] | Null]
            ]
      ): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorationsNull: Self = StObject.set(x, "decorations", null)
      
      @scala.inline
      def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
      
      @scala.inline
      def setDomParser(value: DOMParser[S]): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomParserNull: Self = StObject.set(x, "domParser", null)
      
      @scala.inline
      def setDomParserUndefined: Self = StObject.set(x, "domParser", js.undefined)
      
      @scala.inline
      def setEditable(
        value: js.ThisFunction1[
              /* this */ ThisT, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ /* state */ js.Any, 
              Boolean
            ]
      ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableNull: Self = StObject.set(x, "editable", null)
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setHandleClick(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleClickNull: Self = StObject.set(x, "handleClick", null)
      
      @scala.inline
      def setHandleClickOn(
        value: js.ThisFunction6[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node[S], 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleClickOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleClickOnNull: Self = StObject.set(x, "handleClickOn", null)
      
      @scala.inline
      def setHandleClickOnUndefined: Self = StObject.set(x, "handleClickOn", js.undefined)
      
      @scala.inline
      def setHandleClickUndefined: Self = StObject.set(x, "handleClick", js.undefined)
      
      @scala.inline
      def setHandleDOMEvents(value: HandleDOMEventsProp[ThisT, S]): Self = StObject.set(x, "handleDOMEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleDOMEventsNull: Self = StObject.set(x, "handleDOMEvents", null)
      
      @scala.inline
      def setHandleDOMEventsUndefined: Self = StObject.set(x, "handleDOMEvents", js.undefined)
      
      @scala.inline
      def setHandleDoubleClick(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleDoubleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleDoubleClickNull: Self = StObject.set(x, "handleDoubleClick", null)
      
      @scala.inline
      def setHandleDoubleClickOn(
        value: js.ThisFunction6[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node[S], 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleDoubleClickOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleDoubleClickOnNull: Self = StObject.set(x, "handleDoubleClickOn", null)
      
      @scala.inline
      def setHandleDoubleClickOnUndefined: Self = StObject.set(x, "handleDoubleClickOn", js.undefined)
      
      @scala.inline
      def setHandleDoubleClickUndefined: Self = StObject.set(x, "handleDoubleClick", js.undefined)
      
      @scala.inline
      def setHandleDrop(
        value: js.ThisFunction4[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* event */ Event, 
              /* slice */ Slice[S], 
              /* moved */ Boolean, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleDropNull: Self = StObject.set(x, "handleDrop", null)
      
      @scala.inline
      def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
      
      @scala.inline
      def setHandleKeyDown(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ): Self = StObject.set(x, "handleKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleKeyDownNull: Self = StObject.set(x, "handleKeyDown", null)
      
      @scala.inline
      def setHandleKeyDownUndefined: Self = StObject.set(x, "handleKeyDown", js.undefined)
      
      @scala.inline
      def setHandleKeyPress(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ): Self = StObject.set(x, "handleKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleKeyPressNull: Self = StObject.set(x, "handleKeyPress", null)
      
      @scala.inline
      def setHandleKeyPressUndefined: Self = StObject.set(x, "handleKeyPress", js.undefined)
      
      @scala.inline
      def setHandlePaste(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* event */ ClipboardEvent, 
              /* slice */ Slice[S], 
              Boolean
            ]
      ): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlePasteNull: Self = StObject.set(x, "handlePaste", null)
      
      @scala.inline
      def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      @scala.inline
      def setHandleScrollToSelection(value: js.ThisFunction1[/* this */ ThisT, /* view */ EditorView[S], Boolean]): Self = StObject.set(x, "handleScrollToSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleScrollToSelectionNull: Self = StObject.set(x, "handleScrollToSelection", null)
      
      @scala.inline
      def setHandleScrollToSelectionUndefined: Self = StObject.set(x, "handleScrollToSelection", js.undefined)
      
      @scala.inline
      def setHandleTextInput(
        value: js.ThisFunction4[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* from */ Double, 
              /* to */ Double, 
              /* text */ String, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleTextInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleTextInputNull: Self = StObject.set(x, "handleTextInput", null)
      
      @scala.inline
      def setHandleTextInputUndefined: Self = StObject.set(x, "handleTextInput", js.undefined)
      
      @scala.inline
      def setHandleTripleClick(
        value: js.ThisFunction3[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleTripleClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleTripleClickNull: Self = StObject.set(x, "handleTripleClick", null)
      
      @scala.inline
      def setHandleTripleClickOn(
        value: js.ThisFunction6[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node[S], 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean
            ]
      ): Self = StObject.set(x, "handleTripleClickOn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleTripleClickOnNull: Self = StObject.set(x, "handleTripleClickOn", null)
      
      @scala.inline
      def setHandleTripleClickOnUndefined: Self = StObject.set(x, "handleTripleClickOn", js.undefined)
      
      @scala.inline
      def setHandleTripleClickUndefined: Self = StObject.set(x, "handleTripleClick", js.undefined)
      
      @scala.inline
      def setNodeViews(
        value: StringDictionary[
              js.Function4[
                /* node */ typings.prosemirrorModel.mod.Node[S], 
                /* view */ EditorView[S], 
                /* getPos */ js.Function0[Double] | Boolean, 
                /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
                NodeView[S]
              ]
            ]
      ): Self = StObject.set(x, "nodeViews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeViewsNull: Self = StObject.set(x, "nodeViews", null)
      
      @scala.inline
      def setNodeViewsUndefined: Self = StObject.set(x, "nodeViews", js.undefined)
      
      @scala.inline
      def setScrollMargin(value: Double | Right): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollMarginNull: Self = StObject.set(x, "scrollMargin", null)
      
      @scala.inline
      def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      @scala.inline
      def setScrollThreshold(value: Double | Right): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollThresholdNull: Self = StObject.set(x, "scrollThreshold", null)
      
      @scala.inline
      def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      @scala.inline
      def setTransformPasted(value: js.ThisFunction1[/* this */ ThisT, /* p */ Slice[S], Slice[S]]): Self = StObject.set(x, "transformPasted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformPastedHTML(value: js.ThisFunction1[/* this */ ThisT, /* html */ String, String]): Self = StObject.set(x, "transformPastedHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformPastedHTMLNull: Self = StObject.set(x, "transformPastedHTML", null)
      
      @scala.inline
      def setTransformPastedHTMLUndefined: Self = StObject.set(x, "transformPastedHTML", js.undefined)
      
      @scala.inline
      def setTransformPastedNull: Self = StObject.set(x, "transformPasted", null)
      
      @scala.inline
      def setTransformPastedText(value: js.ThisFunction2[/* this */ ThisT, /* text */ String, /* plain */ Boolean, String]): Self = StObject.set(x, "transformPastedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformPastedTextNull: Self = StObject.set(x, "transformPastedText", null)
      
      @scala.inline
      def setTransformPastedTextUndefined: Self = StObject.set(x, "transformPastedText", js.undefined)
      
      @scala.inline
      def setTransformPastedUndefined: Self = StObject.set(x, "transformPasted", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{[ K in keyof std.DocumentEventMap ]: (this : ThisT, view : prosemirror-view.prosemirror-view.EditorView<S>, event : std.DocumentEventMap[K]): boolean}> & {[key: string] : (this : ThisT, view : prosemirror-view.prosemirror-view.EditorView<S>, event : any): boolean} */
  @js.native
  trait HandleDOMEventsProp[ThisT, S /* <: Schema[_, _] */]
    extends /* key */ StringDictionary[
          js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ js.Any, Boolean]
        ] {
    
    var abort: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]
      ] = js.native
    
    var animationcancel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ] = js.native
    
    var animationend: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ] = js.native
    
    var animationiteration: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ] = js.native
    
    var animationstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ] = js.native
    
    var auxclick: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var blur: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ] = js.native
    
    var cancel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var canplay: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var canplaythrough: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var change: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var click: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var close: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var contextmenu: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var copy: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ] = js.native
    
    var cuechange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var cut: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ] = js.native
    
    var dblclick: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var drag: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var dragend: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var dragenter: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var dragexit: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var dragleave: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var dragover: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var dragstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var drop: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ] = js.native
    
    var durationchange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var emptied: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var ended: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var error: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ErrorEvent, Boolean]
      ] = js.native
    
    var focus: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ] = js.native
    
    var focusin: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ] = js.native
    
    var focusout: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ] = js.native
    
    var fullscreenchange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var fullscreenerror: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var gotpointercapture: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var input: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var invalid: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var keydown: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ] = js.native
    
    var keypress: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ] = js.native
    
    var keyup: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ] = js.native
    
    var load: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var loadeddata: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var loadedmetadata: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var loadstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var lostpointercapture: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var mousedown: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mouseenter: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mouseleave: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mousemove: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mouseout: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mouseover: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var mouseup: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ] = js.native
    
    var paste: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ] = js.native
    
    var pause: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var play: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var playing: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var pointercancel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerdown: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerenter: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerleave: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerlockchange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var pointerlockerror: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var pointermove: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerout: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerover: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var pointerup: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ] = js.native
    
    var progress: js.UndefOr[
        js.ThisFunction2[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ ProgressEvent[EventTarget], 
          Boolean
        ]
      ] = js.native
    
    var ratechange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var readystatechange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var reset: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var resize: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]
      ] = js.native
    
    var scroll: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var securitypolicyviolation: js.UndefOr[
        js.ThisFunction2[
          /* this */ ThisT, 
          /* view */ EditorView[S], 
          /* event */ SecurityPolicyViolationEvent, 
          Boolean
        ]
      ] = js.native
    
    var seeked: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var seeking: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var select: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var selectionchange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var selectstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var stalled: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var submit: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var suspend: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var timeupdate: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var toggle: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var touchcancel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ] = js.native
    
    var touchend: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ] = js.native
    
    var touchmove: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ] = js.native
    
    var touchstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ] = js.native
    
    var transitioncancel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ] = js.native
    
    var transitionend: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ] = js.native
    
    var transitionrun: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ] = js.native
    
    var transitionstart: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ] = js.native
    
    var visibilitychange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var volumechange: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var waiting: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]
      ] = js.native
    
    var wheel: js.UndefOr[
        js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ WheelEvent, Boolean]
      ] = js.native
  }
  object HandleDOMEventsProp {
    
    @scala.inline
    def apply[ThisT, S /* <: Schema[_, _] */](): HandleDOMEventsProp[ThisT, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleDOMEventsProp[ThisT, S]]
    }
    
    @scala.inline
    implicit class HandleDOMEventsPropMutableBuilder[Self <: HandleDOMEventsProp[_, _], ThisT, S /* <: Schema[_, _] */] (val x: Self with (HandleDOMEventsProp[ThisT, S])) extends AnyVal {
      
      @scala.inline
      def setAbort(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      @scala.inline
      def setAnimationcancel(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationcancelUndefined: Self = StObject.set(x, "animationcancel", js.undefined)
      
      @scala.inline
      def setAnimationend(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
      
      @scala.inline
      def setAnimationiteration(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationiterationUndefined: Self = StObject.set(x, "animationiteration", js.undefined)
      
      @scala.inline
      def setAnimationstart(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ AnimationEvent, Boolean]
      ): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationstartUndefined: Self = StObject.set(x, "animationstart", js.undefined)
      
      @scala.inline
      def setAuxclick(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxclickUndefined: Self = StObject.set(x, "auxclick", js.undefined)
      
      @scala.inline
      def setBlur(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setCancel(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCanplay(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplayUndefined: Self = StObject.set(x, "canplay", js.undefined)
      
      @scala.inline
      def setCanplaythrough(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanplaythroughUndefined: Self = StObject.set(x, "canplaythrough", js.undefined)
      
      @scala.inline
      def setChange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClick(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setClose(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setContextmenu(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      @scala.inline
      def setCopy(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setCuechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCuechangeUndefined: Self = StObject.set(x, "cuechange", js.undefined)
      
      @scala.inline
      def setCut(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setDblclick(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      @scala.inline
      def setDrag(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setDragend(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      @scala.inline
      def setDragenter(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      @scala.inline
      def setDragexit(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "dragexit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragexitUndefined: Self = StObject.set(x, "dragexit", js.undefined)
      
      @scala.inline
      def setDragleave(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      @scala.inline
      def setDragover(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      @scala.inline
      def setDragstart(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      @scala.inline
      def setDrop(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ DragEvent, Boolean]
      ): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setDurationchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationchangeUndefined: Self = StObject.set(x, "durationchange", js.undefined)
      
      @scala.inline
      def setEmptied(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
      
      @scala.inline
      def setEnded(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
      
      @scala.inline
      def setError(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ErrorEvent, Boolean]
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFocus(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setFocusin(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusinUndefined: Self = StObject.set(x, "focusin", js.undefined)
      
      @scala.inline
      def setFocusout(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ FocusEvent, Boolean]
      ): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusoutUndefined: Self = StObject.set(x, "focusout", js.undefined)
      
      @scala.inline
      def setFullscreenchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
      
      @scala.inline
      def setFullscreenerror(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenerrorUndefined: Self = StObject.set(x, "fullscreenerror", js.undefined)
      
      @scala.inline
      def setGotpointercapture(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotpointercaptureUndefined: Self = StObject.set(x, "gotpointercapture", js.undefined)
      
      @scala.inline
      def setInput(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setInvalid(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setKeydown(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      @scala.inline
      def setKeypress(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
      
      @scala.inline
      def setKeyup(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ KeyboardEvent, Boolean]
      ): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
      
      @scala.inline
      def setLoad(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLoadeddata(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadeddataUndefined: Self = StObject.set(x, "loadeddata", js.undefined)
      
      @scala.inline
      def setLoadedmetadata(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedmetadataUndefined: Self = StObject.set(x, "loadedmetadata", js.undefined)
      
      @scala.inline
      def setLoadstart(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadstartUndefined: Self = StObject.set(x, "loadstart", js.undefined)
      
      @scala.inline
      def setLostpointercapture(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLostpointercaptureUndefined: Self = StObject.set(x, "lostpointercapture", js.undefined)
      
      @scala.inline
      def setMousedown(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
      
      @scala.inline
      def setMouseenter(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
      
      @scala.inline
      def setMouseleave(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      @scala.inline
      def setMousemove(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
      
      @scala.inline
      def setMouseout(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      @scala.inline
      def setMouseover(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      @scala.inline
      def setMouseup(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ MouseEvent, Boolean]
      ): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
      
      @scala.inline
      def setPaste(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ ClipboardEvent, Boolean]
      ): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      @scala.inline
      def setPause(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPlay(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setPlaying(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      @scala.inline
      def setPointercancel(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointercancelUndefined: Self = StObject.set(x, "pointercancel", js.undefined)
      
      @scala.inline
      def setPointerdown(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerdownUndefined: Self = StObject.set(x, "pointerdown", js.undefined)
      
      @scala.inline
      def setPointerenter(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerenterUndefined: Self = StObject.set(x, "pointerenter", js.undefined)
      
      @scala.inline
      def setPointerleave(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerleaveUndefined: Self = StObject.set(x, "pointerleave", js.undefined)
      
      @scala.inline
      def setPointerlockchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "pointerlockchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerlockchangeUndefined: Self = StObject.set(x, "pointerlockchange", js.undefined)
      
      @scala.inline
      def setPointerlockerror(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "pointerlockerror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerlockerrorUndefined: Self = StObject.set(x, "pointerlockerror", js.undefined)
      
      @scala.inline
      def setPointermove(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointermoveUndefined: Self = StObject.set(x, "pointermove", js.undefined)
      
      @scala.inline
      def setPointerout(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointeroutUndefined: Self = StObject.set(x, "pointerout", js.undefined)
      
      @scala.inline
      def setPointerover(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointeroverUndefined: Self = StObject.set(x, "pointerover", js.undefined)
      
      @scala.inline
      def setPointerup(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ PointerEvent, Boolean]
      ): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerupUndefined: Self = StObject.set(x, "pointerup", js.undefined)
      
      @scala.inline
      def setProgress(
        value: js.ThisFunction2[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* event */ ProgressEvent[EventTarget], 
              Boolean
            ]
      ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setRatechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatechangeUndefined: Self = StObject.set(x, "ratechange", js.undefined)
      
      @scala.inline
      def setReadystatechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "readystatechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadystatechangeUndefined: Self = StObject.set(x, "readystatechange", js.undefined)
      
      @scala.inline
      def setReset(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setResize(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ UIEvent, Boolean]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setScroll(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSecuritypolicyviolation(
        value: js.ThisFunction2[
              /* this */ ThisT, 
              /* view */ EditorView[S], 
              /* event */ SecurityPolicyViolationEvent, 
              Boolean
            ]
      ): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecuritypolicyviolationUndefined: Self = StObject.set(x, "securitypolicyviolation", js.undefined)
      
      @scala.inline
      def setSeeked(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekedUndefined: Self = StObject.set(x, "seeked", js.undefined)
      
      @scala.inline
      def setSeeking(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
      
      @scala.inline
      def setSelect(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectionchange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionchangeUndefined: Self = StObject.set(x, "selectionchange", js.undefined)
      
      @scala.inline
      def setSelectstart(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectstartUndefined: Self = StObject.set(x, "selectstart", js.undefined)
      
      @scala.inline
      def setStalled(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStalledUndefined: Self = StObject.set(x, "stalled", js.undefined)
      
      @scala.inline
      def setSubmit(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      @scala.inline
      def setSuspend(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      @scala.inline
      def setTimeupdate(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
      
      @scala.inline
      def setToggle(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      @scala.inline
      def setTouchcancel(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
      
      @scala.inline
      def setTouchend(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
      
      @scala.inline
      def setTouchmove(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
      
      @scala.inline
      def setTouchstart(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TouchEvent, Boolean]
      ): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
      
      @scala.inline
      def setTransitioncancel(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitioncancelUndefined: Self = StObject.set(x, "transitioncancel", js.undefined)
      
      @scala.inline
      def setTransitionend(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionendUndefined: Self = StObject.set(x, "transitionend", js.undefined)
      
      @scala.inline
      def setTransitionrun(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionrunUndefined: Self = StObject.set(x, "transitionrun", js.undefined)
      
      @scala.inline
      def setTransitionstart(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ TransitionEvent, Boolean]
      ): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionstartUndefined: Self = StObject.set(x, "transitionstart", js.undefined)
      
      @scala.inline
      def setVisibilitychange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "visibilitychange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilitychangeUndefined: Self = StObject.set(x, "visibilitychange", js.undefined)
      
      @scala.inline
      def setVolumechange(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumechangeUndefined: Self = StObject.set(x, "volumechange", js.undefined)
      
      @scala.inline
      def setWaiting(value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ Event, Boolean]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
      
      @scala.inline
      def setWheel(
        value: js.ThisFunction2[/* this */ ThisT, /* view */ EditorView[S], /* event */ WheelEvent, Boolean]
      ): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
  
  @js.native
  trait InlineDecorationSpec extends StObject {
    
    /**
      * Determines how the right side of the decoration is mapped.
      */
    var inclusiveEnd: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * Determines how the left side of the decoration is
      * [mapped](#transform.Position_Mapping) when content is
      * inserted directly at that position. By default, the decoration
      * won't include the new content, but you can set this to `true`
      * to make it inclusive.
      */
    var inclusiveStart: js.UndefOr[Boolean | Null] = js.native
  }
  object InlineDecorationSpec {
    
    @scala.inline
    def apply(): InlineDecorationSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineDecorationSpec]
    }
    
    @scala.inline
    implicit class InlineDecorationSpecMutableBuilder[Self <: InlineDecorationSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInclusiveEnd(value: Boolean): Self = StObject.set(x, "inclusiveEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusiveEndNull: Self = StObject.set(x, "inclusiveEnd", null)
      
      @scala.inline
      def setInclusiveEndUndefined: Self = StObject.set(x, "inclusiveEnd", js.undefined)
      
      @scala.inline
      def setInclusiveStart(value: Boolean): Self = StObject.set(x, "inclusiveStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclusiveStartNull: Self = StObject.set(x, "inclusiveStart", null)
      
      @scala.inline
      def setInclusiveStartUndefined: Self = StObject.set(x, "inclusiveStart", js.undefined)
    }
  }
  
  @js.native
  trait NodeView[S /* <: Schema[_, _] */] extends StObject {
    
    /**
      * The DOM node that should hold the node's content. Only meaningful
      * if the node view also defines a `dom` property and if its node
      * type is not a leaf node type. When this is present, ProseMirror
      * will take care of rendering the node's children into it. When it
      * is not present, the node view itself is responsible for rendering
      * (or deciding not to render) its child nodes.
      */
    var contentDOM: js.UndefOr[Node | Null] = js.native
    
    /**
      * When defining a `selectNode` method, you should also provide a
      * `deselectNode` method to remove the effect again.
      */
    var deselectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    /**
      * Called when the node view is removed from the editor or the whole
      * editor is destroyed.
      */
    var destroy: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    /**
      * The outer DOM node that represents the document node. When not
      * given, the default strategy is used to create a DOM node.
      */
    var dom: js.UndefOr[Node | Null] = js.native
    
    /**
      * Called when a DOM
      * [mutation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
      * or a selection change happens within the view. When the change is
      * a selection change, the record will have a `type` property of
      * `"selection"` (which doesn't occur for native mutation records).
      * Return false if the editor should re-read the selection or
      * re-parse the range around the mutation, true if it can safely be
      * ignored.
      */
    var ignoreMutation: js.UndefOr[(js.Function1[/* p */ MutationRecord | Target, Boolean]) | Null] = js.native
    
    /**
      * Can be used to override the way the node's selected status (as a
      * node selection) is displayed.
      */
    var selectNode: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    /**
      * This will be called to handle setting the selection inside the
      * node. The `anchor` and `head` positions are relative to the start
      * of the node. By default, a DOM selection will be created between
      * the DOM positions corresponding to those positions, but if you
      * override it you can do something else.
      */
    var setSelection: js.UndefOr[
        (js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document, Unit]) | Null
      ] = js.native
    
    /**
      * Can be used to prevent the editor view from trying to handle some
      * or all DOM events that bubble up from the node view. Events for
      * which this returns true are not handled by the editor.
      */
    var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.native
    
    /**
      * When given, this will be called when the view is updating itself.
      * It will be given a node (possibly of a different type), and an
      * array of active decorations (which are automatically drawn, and
      * the node view may ignore if it isn't interested in them), and
      * should return true if it was able to update to that node, and
      * false otherwise. If the node view has a `contentDOM` property (or
      * no `dom` property), updating its child nodes will be handled by
      * ProseMirror.
      */
    var update: js.UndefOr[
        (js.Function2[
          /* node */ typings.prosemirrorModel.mod.Node[S], 
          /* decorations */ js.Array[Decoration[StringDictionary[_]]], 
          Boolean
        ]) | Null
      ] = js.native
  }
  object NodeView {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](): NodeView[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeView[S]]
    }
    
    @scala.inline
    implicit class NodeViewMutableBuilder[Self <: NodeView[_], S /* <: Schema[_, _] */] (val x: Self with NodeView[S]) extends AnyVal {
      
      @scala.inline
      def setContentDOM(value: Node): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDOMNull: Self = StObject.set(x, "contentDOM", null)
      
      @scala.inline
      def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
      
      @scala.inline
      def setDeselectNode(value: () => Unit): Self = StObject.set(x, "deselectNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeselectNodeNull: Self = StObject.set(x, "deselectNode", null)
      
      @scala.inline
      def setDeselectNodeUndefined: Self = StObject.set(x, "deselectNode", js.undefined)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyNull: Self = StObject.set(x, "destroy", null)
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomNull: Self = StObject.set(x, "dom", null)
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setIgnoreMutation(value: /* p */ MutationRecord | Target => Boolean): Self = StObject.set(x, "ignoreMutation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreMutationNull: Self = StObject.set(x, "ignoreMutation", null)
      
      @scala.inline
      def setIgnoreMutationUndefined: Self = StObject.set(x, "ignoreMutation", js.undefined)
      
      @scala.inline
      def setSelectNode(value: () => Unit): Self = StObject.set(x, "selectNode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelectNodeNull: Self = StObject.set(x, "selectNode", null)
      
      @scala.inline
      def setSelectNodeUndefined: Self = StObject.set(x, "selectNode", js.undefined)
      
      @scala.inline
      def setSetSelection(value: (/* anchor */ Double, /* head */ Double, /* root */ Document) => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetSelectionNull: Self = StObject.set(x, "setSelection", null)
      
      @scala.inline
      def setSetSelectionUndefined: Self = StObject.set(x, "setSelection", js.undefined)
      
      @scala.inline
      def setStopEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "stopEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopEventNull: Self = StObject.set(x, "stopEvent", null)
      
      @scala.inline
      def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* node */ typings.prosemirrorModel.mod.Node[S], /* decorations */ js.Array[Decoration[StringDictionary[_]]]) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateNull: Self = StObject.set(x, "update", null)
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait WidgetDecorationSpec extends StObject {
    
    /**
      * When comparing decorations of this type (in order to decide
      * whether it needs to be redrawn), ProseMirror will by default
      * compare the widget DOM node by identity. If you pass a key,
      * that key will be compared instead, which can be useful when
      * you generate decorations on the fly and don't want to store
      * and reuse DOM nodes. Make sure that any widgets with the same
      * key are interchangeable—if widgets differ in, for example,
      * the behavior of some event handler, they should get
      * different keys.
      */
    var key: js.UndefOr[String | Null] = js.native
    
    /**
      * The precise set of marks to draw around the widget.
      */
    var marks: js.UndefOr[js.Array[Mark[_]] | Null] = js.native
    
    /**
      * Controls which side of the document position this widget is
      * associated with. When negative, it is drawn before a cursor
      * at its position, and content inserted at that position ends
      * up after the widget. When zero (the default) or positive, the
      * widget is drawn after the cursor and content inserted there
      * ends up before the widget.
      *
      * When there are multiple widgets at a given position, their
      * `side` values determine the order in which they appear. Those
      * with lower values appear first. The ordering of widgets with
      * the same `side` value is unspecified.
      *
      * When `marks` is null, `side` also determines the marks that
      * the widget is wrapped in—those of the node before when
      * negative, those of the node after when positive.
      */
    var side: js.UndefOr[Double | Null] = js.native
    
    /**
      * Can be used to control which DOM events, when they bubble out
      * of this widget, the editor view should ignore.
      */
    var stopEvent: js.UndefOr[(js.Function1[/* event */ Event, Boolean]) | Null] = js.native
  }
  object WidgetDecorationSpec {
    
    @scala.inline
    def apply(): WidgetDecorationSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WidgetDecorationSpec]
    }
    
    @scala.inline
    implicit class WidgetDecorationSpecMutableBuilder[Self <: WidgetDecorationSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMarks(value: js.Array[Mark[_]]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksNull: Self = StObject.set(x, "marks", null)
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMarksVarargs(value: Mark[js.Any]*): Self = StObject.set(x, "marks", js.Array(value :_*))
      
      @scala.inline
      def setSide(value: Double): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideNull: Self = StObject.set(x, "side", null)
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setStopEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "stopEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopEventNull: Self = StObject.set(x, "stopEvent", null)
      
      @scala.inline
      def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
    }
  }
}
