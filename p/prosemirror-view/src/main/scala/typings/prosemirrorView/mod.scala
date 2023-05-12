package typings.prosemirrorView

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ParseRule
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTransform.mod.Mapping
import typings.prosemirrorView.anon.Atom
import typings.prosemirrorView.anon.Bottom
import typings.prosemirrorView.anon.ContentDOM
import typings.prosemirrorView.anon.Dictkey
import typings.prosemirrorView.anon.From
import typings.prosemirrorView.anon.InclusiveEnd
import typings.prosemirrorView.anon.Inside
import typings.prosemirrorView.anon.Left
import typings.prosemirrorView.anon.Mount
import typings.prosemirrorView.anon.Move
import typings.prosemirrorView.anon.Offset
import typings.prosemirrorView.anon.OnRemove
import typings.prosemirrorView.anon.PartialDirectEditorProps
import typings.prosemirrorView.anon.Pos
import typings.prosemirrorView.anon.Right
import typings.prosemirrorView.prosemirrorViewBooleans.`true`
import typings.prosemirrorView.prosemirrorViewStrings.attributes
import typings.prosemirrorView.prosemirrorViewStrings.backward
import typings.prosemirrorView.prosemirrorViewStrings.clipboardParser
import typings.prosemirrorView.prosemirrorViewStrings.clipboardSerializer
import typings.prosemirrorView.prosemirrorViewStrings.clipboardTextParser
import typings.prosemirrorView.prosemirrorViewStrings.clipboardTextSerializer
import typings.prosemirrorView.prosemirrorViewStrings.createSelectionBetween
import typings.prosemirrorView.prosemirrorViewStrings.decorations
import typings.prosemirrorView.prosemirrorViewStrings.domParser
import typings.prosemirrorView.prosemirrorViewStrings.down
import typings.prosemirrorView.prosemirrorViewStrings.editable
import typings.prosemirrorView.prosemirrorViewStrings.forward
import typings.prosemirrorView.prosemirrorViewStrings.handleClick
import typings.prosemirrorView.prosemirrorViewStrings.handleClickOn
import typings.prosemirrorView.prosemirrorViewStrings.handleDOMEvents
import typings.prosemirrorView.prosemirrorViewStrings.handleDoubleClick
import typings.prosemirrorView.prosemirrorViewStrings.handleDoubleClickOn
import typings.prosemirrorView.prosemirrorViewStrings.handleDrop
import typings.prosemirrorView.prosemirrorViewStrings.handleKeyDown
import typings.prosemirrorView.prosemirrorViewStrings.handleKeyPress
import typings.prosemirrorView.prosemirrorViewStrings.handlePaste
import typings.prosemirrorView.prosemirrorViewStrings.handleScrollToSelection
import typings.prosemirrorView.prosemirrorViewStrings.handleTextInput
import typings.prosemirrorView.prosemirrorViewStrings.handleTripleClick
import typings.prosemirrorView.prosemirrorViewStrings.handleTripleClickOn
import typings.prosemirrorView.prosemirrorViewStrings.left
import typings.prosemirrorView.prosemirrorViewStrings.markViews
import typings.prosemirrorView.prosemirrorViewStrings.nodeViews
import typings.prosemirrorView.prosemirrorViewStrings.right
import typings.prosemirrorView.prosemirrorViewStrings.scrollMargin
import typings.prosemirrorView.prosemirrorViewStrings.scrollThreshold
import typings.prosemirrorView.prosemirrorViewStrings.transformCopied
import typings.prosemirrorView.prosemirrorViewStrings.transformPasted
import typings.prosemirrorView.prosemirrorViewStrings.transformPastedHTML
import typings.prosemirrorView.prosemirrorViewStrings.transformPastedText
import typings.prosemirrorView.prosemirrorViewStrings.up
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.Document
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.HTMLElementEventMap
import typings.std.InputEvent
import typings.std.InstanceType
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.MutationRecord
import typings.std.NonNullable
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Decoration objects can be provided to the view through the
  [`decorations` prop](https://prosemirror.net/docs/ref/#view.EditorProps.decorations). They come in
  several variants—see the static members of this class for details.
  */
  @JSImport("prosemirror-view", "Decoration")
  @js.native
  open class Decoration () extends StObject {
    
    /**
      The start position of the decoration.
      */
    val from: Double = js.native
    
    /**
      The spec provided when creating this decoration. Can be useful
      if you've stored extra information in that object.
      */
    def spec: Any = js.native
    
    /**
      The end position. Will be the same as `from` for [widget
      decorations](https://prosemirror.net/docs/ref/#view.Decoration^widget).
      */
    val to: Double = js.native
  }
  object Decoration {
    
    @JSImport("prosemirror-view", "Decoration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Creates an inline decoration, which adds the given attributes to
      each inline node between `from` and `to`.
      */
    /* static member */
    inline def `inline`(from: Double, to: Double, attrs: DecorationAttrs): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("inline")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Decoration]
    inline def `inline`(from: Double, to: Double, attrs: DecorationAttrs, spec: InclusiveEnd): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("inline")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Decoration]
    
    /**
      Creates a node decoration. `from` and `to` should point precisely
      before and after a node in the document. That node, and only that
      node, will receive the given attributes.
      */
    /* static member */
    inline def node(from: Double, to: Double, attrs: DecorationAttrs): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Decoration]
    inline def node(from: Double, to: Double, attrs: DecorationAttrs, spec: Any): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("node")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Decoration]
    
    /**
      Creates a widget decoration, which is a DOM node that's shown in
      the document at the given position. It is recommended that you
      delay rendering the widget by passing a function that will be
      called when the widget is actually drawn in a view, but you can
      also directly pass a DOM node. `getPos` can be used to find the
      widget's current document position.
      */
    /* static member */
    inline def widget(pos: Double, toDOM: WidgetConstructor): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("widget")(pos.asInstanceOf[js.Any], toDOM.asInstanceOf[js.Any])).asInstanceOf[Decoration]
    inline def widget(pos: Double, toDOM: WidgetConstructor, spec: Dictkey): Decoration = (^.asInstanceOf[js.Dynamic].applyDynamic("widget")(pos.asInstanceOf[js.Any], toDOM.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Decoration]
  }
  
  /**
  A collection of [decorations](https://prosemirror.net/docs/ref/#view.Decoration), organized in such
  a way that the drawing algorithm can efficiently use and compare
  them. This is a persistent data structure—it is not modified,
  updates create a new value.
  */
  @JSImport("prosemirror-view", "DecorationSet")
  @js.native
  open class DecorationSet ()
    extends StObject
       with DecorationSource {
    
    /**
      Add the given array of decorations to the ones in the set,
      producing a new set. Needs access to the current document to
      create the appropriate tree structure.
      */
    def add(doc: Node, decorations: js.Array[Decoration]): DecorationSet = js.native
    
    /* private */ var addInner: Any = js.native
    
    /**
      Find all decorations in this set which touch the given range
      (including decorations that start or end directly at the
      boundaries) and match the given predicate on their spec. When
      `start` and `end` are omitted, all decorations in the set are
      considered. When `predicate` isn't given, all decorations are
      assumed to match.
      */
    def find(): js.Array[Decoration] = js.native
    def find(start: Double): js.Array[Decoration] = js.native
    def find(start: Double, end: Double): js.Array[Decoration] = js.native
    def find(start: Double, end: Double, predicate: js.Function1[/* spec */ Any, Boolean]): js.Array[Decoration] = js.native
    def find(start: Double, end: Unit, predicate: js.Function1[/* spec */ Any, Boolean]): js.Array[Decoration] = js.native
    def find(start: Unit, end: Double): js.Array[Decoration] = js.native
    def find(start: Unit, end: Double, predicate: js.Function1[/* spec */ Any, Boolean]): js.Array[Decoration] = js.native
    def find(start: Unit, end: Unit, predicate: js.Function1[/* spec */ Any, Boolean]): js.Array[Decoration] = js.native
    
    /* private */ var findInner: Any = js.native
    
    def map(mapping: Mapping, doc: Node, options: OnRemove): DecorationSet = js.native
    /**
      Map the set of decorations in response to a change in the
      document.
      */
    /* CompleteClass */
    override def map(mapping: Mapping, node: Node): DecorationSource = js.native
    
    /**
      Create a new set that contains the decorations in this set, minus
      the ones in the given array.
      */
    def remove(decorations: js.Array[Decoration]): DecorationSet = js.native
    
    /* private */ var removeInner: Any = js.native
  }
  object DecorationSet {
    
    @JSImport("prosemirror-view", "DecorationSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      Create a set of decorations, using the structure of the given
      document.
      */
    /* static member */
    inline def create(doc: Node, decorations: js.Array[Decoration]): DecorationSet = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], decorations.asInstanceOf[js.Any])).asInstanceOf[DecorationSet]
    
    /**
      The empty set of decorations.
      */
    /* static member */
    @JSImport("prosemirror-view", "DecorationSet.empty")
    @js.native
    def empty: DecorationSet = js.native
    inline def empty_=(x: DecorationSet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  }
  
  /**
  An editor view manages the DOM structure that represents an
  editable document. Its state and behavior are determined by its
  [props](https://prosemirror.net/docs/ref/#view.DirectEditorProps).
  */
  @JSImport("prosemirror-view", "EditorView")
  @js.native
  open class EditorView protected () extends StObject {
    def this(place: js.Function1[/* editor */ HTMLElement, Unit], props: DirectEditorProps) = this()
    /**
      Create a view. `place` may be a DOM node that the editor should
      be appended to, a function that will place it into the document,
      or an object whose `mount` property holds the node to use as the
      document container. If it is `null`, the editor will not be
      added to the document.
      */
    def this(place: Null, props: DirectEditorProps) = this()
    def this(place: Mount, props: DirectEditorProps) = this()
    def this(place: DOMNode, props: DirectEditorProps) = this()
    
    /* private */ var _props: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /**
      Holds `true` when a
      [composition](https://w3c.github.io/uievents/#events-compositionevents)
      is active.
      */
    def composing: Boolean = js.native
    
    /**
      Returns the viewport rectangle at a given document position.
      `left` and `right` will be the same number, as this returns a
      flat cursor-ish rectangle. If the position is between two things
      that aren't directly adjacent, `side` determines which element
      is used. When < 0, the element before the position is used,
      otherwise the element after.
      */
    def coordsAtPos(pos: Double): Right = js.native
    def coordsAtPos(pos: Double, side: Double): Right = js.native
    
    /**
      Removes the editor from the DOM and destroys all [node
      views](https://prosemirror.net/docs/ref/#view.NodeView).
      */
    def destroy(): Unit = js.native
    
    /* private */ var destroyPluginViews: Any = js.native
    
    /* private */ var directPlugins: Any = js.native
    
    /**
      Dispatch a transaction. Will call
      [`dispatchTransaction`](https://prosemirror.net/docs/ref/#view.DirectEditorProps.dispatchTransaction)
      when given, and otherwise defaults to applying the transaction to
      the current state and calling
      [`updateState`](https://prosemirror.net/docs/ref/#view.EditorView.updateState) with the result.
      This method is bound to the view instance, so that it can be
      easily passed around.
      */
    def dispatch(tr: Transaction): Unit = js.native
    
    /**
      Used for testing.
      */
    def dispatchEvent(event: Event): Unit = js.native
    
    /**
      An editable DOM node containing the document. (You probably
      should not directly interfere with its content.)
      */
    val dom: HTMLElement = js.native
    
    /**
      Find the DOM position that corresponds to the given document
      position. When `side` is negative, find the position as close as
      possible to the content before the position. When positive,
      prefer positions close to the content after the position. When
      zero, prefer as shallow a position as possible.
      
      Note that you should **not** mutate the editor's internal DOM,
      only inspect it (and even that is usually not necessary).
      */
    def domAtPos(pos: Double): typings.prosemirrorView.anon.Node = js.native
    def domAtPos(pos: Double, side: Double): typings.prosemirrorView.anon.Node = js.native
    
    /**
      When editor content is being dragged, this object contains
      information about the dragged slice and whether it is being
      copied or moved. At any other time, it is null.
      */
    var dragging: Null | Move = js.native
    
    /**
      Indicates whether the editor is currently [editable](https://prosemirror.net/docs/ref/#view.EditorProps.editable).
      */
    var editable: Boolean = js.native
    
    /**
      Find out whether the selection is at the end of a textblock when
      moving in a given direction. When, for example, given `"left"`,
      it will return true if moving left from the current cursor
      position would leave that position's parent textblock. Will apply
      to the view's current state by default, but it is possible to
      pass a different state.
      */
    def endOfTextblock(dir: up | down | left | right | forward | backward): Boolean = js.native
    def endOfTextblock(dir: up | down | left | right | forward | backward, state: EditorState): Boolean = js.native
    
    /**
      Focus the editor.
      */
    def focus(): Unit = js.native
    
    /**
      Query whether the view has focus.
      */
    def hasFocus(): Boolean = js.native
    
    /**
      This is true when the view has been
      [destroyed](https://prosemirror.net/docs/ref/#view.EditorView.destroy) (and thus should not be
      used anymore).
      */
    def isDestroyed: Boolean = js.native
    
    /* private */ var mounted: Any = js.native
    
    /**
      Find the DOM node that represents the document node after the
      given position. May return `null` when the position doesn't point
      in front of a node or if the node is inside an opaque node view.
      
      This is intended to be able to call things like
      `getBoundingClientRect` on that DOM node. Do **not** mutate the
      editor DOM directly, or add styling this way, since that will be
      immediately overriden by the editor as it redraws the node.
      */
    def nodeDOM(pos: Double): DOMNode | Null = js.native
    
    /**
      Run the editor's paste logic with the given HTML string. The
      `event`, if given, will be passed to the
      [`handlePaste`](https://prosemirror.net/docs/ref/#view.EditorProps.handlePaste) hook.
      */
    def pasteHTML(html: String): Boolean = js.native
    def pasteHTML(html: String, event: ClipboardEvent): Boolean = js.native
    
    /**
      Run the editor's paste logic with the given plain-text input.
      */
    def pasteText(text: String): Boolean = js.native
    def pasteText(text: String, event: ClipboardEvent): Boolean = js.native
    
    /* private */ var pluginViews: Any = js.native
    
    /**
      Given a pair of viewport coordinates, return the document
      position that corresponds to them. May return null if the given
      coordinates aren't inside of the editor. When an object is
      returned, its `pos` property is the position nearest to the
      coordinates, and its `inside` property holds the position of the
      inner node that the position falls inside of, or -1 if it is at
      the top level, not in any node.
      */
    def posAtCoords(coords: Left): Inside | Null = js.native
    
    /**
      Find the document position that corresponds to a given DOM
      position. (Whenever possible, it is preferable to inspect the
      document structure directly, rather than poking around in the
      DOM, but sometimes—for example when interpreting an event
      target—you don't have a choice.)
      
      The `bias` parameter can be used to influence which side of a DOM
      node to use when the position is inside a leaf node.
      */
    def posAtDOM(node: DOMNode, offset: Double): Double = js.native
    def posAtDOM(node: DOMNode, offset: Double, bias: Double): Double = js.native
    
    /* private */ var prevDirectPlugins: Any = js.native
    
    /**
      The view's current [props](https://prosemirror.net/docs/ref/#view.EditorProps).
      */
    def props: DirectEditorProps = js.native
    
    /**
      Get the document root in which the editor exists. This will
      usually be the top-level `document`, but might be a [shadow
      DOM](https://developer.mozilla.org/en-US/docs/Web/Web_Components/Shadow_DOM)
      root if the editor is inside one.
      */
    def root: Document | ShadowRoot = js.native
    
    /**
      Update the view by updating existing props object with the object
      given as argument. Equivalent to `view.update(Object.assign({},
      view.props, props))`.
      */
    def setProps(props: PartialDirectEditorProps): Unit = js.native
    
    @JSName("someProp")
    def someProp_attributes(propName: attributes): js.UndefOr[
        NonNullable[
          js.UndefOr[
            StringDictionary[String] | (js.Function1[/* state */ EditorState, StringDictionary[String]])
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_attributes[Result](
      propName: attributes,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              StringDictionary[String] | (js.Function1[/* state */ EditorState, StringDictionary[String]])
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_clipboardParser(propName: clipboardParser): js.UndefOr[NonNullable[js.UndefOr[DOMParser]]] = js.native
    @JSName("someProp")
    def someProp_clipboardParser[Result](propName: clipboardParser, f: js.Function1[/* value */ NonNullable[js.UndefOr[DOMParser]], Result]): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_clipboardSerializer(propName: clipboardSerializer): js.UndefOr[NonNullable[js.UndefOr[DOMSerializer]]] = js.native
    @JSName("someProp")
    def someProp_clipboardSerializer[Result](
      propName: clipboardSerializer,
      f: js.Function1[/* value */ NonNullable[js.UndefOr[DOMSerializer]], Result]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_clipboardTextParser(propName: clipboardTextParser): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction4[
              /* this */ Any, 
              /* text */ String, 
              /* $context */ ResolvedPos, 
              /* plain */ Boolean, 
              /* view */ this.type, 
              Slice
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_clipboardTextParser[Result](
      propName: clipboardTextParser,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction4[
                /* this */ Any, 
                /* text */ String, 
                /* $context */ ResolvedPos, 
                /* plain */ Boolean, 
                /* view */ this.type, 
                Slice
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_clipboardTextSerializer(propName: clipboardTextSerializer): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction2[/* this */ Any, /* content */ Slice, /* view */ this.type, String]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_clipboardTextSerializer[Result](
      propName: clipboardTextSerializer,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction2[/* this */ Any, /* content */ Slice, /* view */ this.type, String]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_createSelectionBetween(propName: createSelectionBetween): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[
              /* this */ Any, 
              /* view */ this.type, 
              /* anchor */ ResolvedPos, 
              /* head */ ResolvedPos, 
              Selection | Null
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_createSelectionBetween[Result](
      propName: createSelectionBetween,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[
                /* this */ Any, 
                /* view */ this.type, 
                /* anchor */ ResolvedPos, 
                /* head */ ResolvedPos, 
                Selection | Null
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_decorations(propName: decorations): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction1[/* this */ Any, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_decorations[Result](
      propName: decorations,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction1[/* this */ Any, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_domParser(propName: domParser): js.UndefOr[NonNullable[js.UndefOr[DOMParser]]] = js.native
    @JSName("someProp")
    def someProp_domParser[Result](propName: domParser, f: js.Function1[/* value */ NonNullable[js.UndefOr[DOMParser]], Result]): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_editable(propName: editable): js.UndefOr[
        NonNullable[js.UndefOr[js.ThisFunction1[/* this */ Any, /* state */ EditorState, Boolean]]]
      ] = js.native
    @JSName("someProp")
    def someProp_editable[Result](
      propName: editable,
      f: js.Function1[
          /* value */ NonNullable[js.UndefOr[js.ThisFunction1[/* this */ Any, /* state */ EditorState, Boolean]]], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleClick(propName: handleClick): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleClick[Result](
      propName: handleClick,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* event */ MouseEvent, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleClickOn(propName: handleClickOn): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction6[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleClickOn[Result](
      propName: handleClickOn,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction6[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* node */ Node, 
                /* nodePos */ Double, 
                /* event */ MouseEvent, 
                /* direct */ Boolean, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleDOMEvents(propName: handleDOMEvents): js.UndefOr[
        NonNullable[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : any, view : this, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */ js.Any
          ]
        ]
      ] = js.native
    /**
      Goes over the values of a prop, first those provided directly,
      then those from plugins given to the view, then from plugins in
      the state (in order), and calls `f` every time a non-undefined
      value is found. When `f` returns a truthy value, that is
      immediately returned. When `f` isn't provided, it is treated as
      the identity function (the prop value is returned directly).
      */
    @JSName("someProp")
    def someProp_handleDOMEvents[Result](
      propName: handleDOMEvents,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : any, view : this, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */ js.Any
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleDoubleClick(propName: handleDoubleClick): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleDoubleClick[Result](
      propName: handleDoubleClick,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* event */ MouseEvent, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleDoubleClickOn(propName: handleDoubleClickOn): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction6[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleDoubleClickOn[Result](
      propName: handleDoubleClickOn,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction6[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* node */ Node, 
                /* nodePos */ Double, 
                /* event */ MouseEvent, 
                /* direct */ Boolean, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleDrop(propName: handleDrop): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction4[
              /* this */ Any, 
              /* view */ this.type, 
              /* event */ DragEvent, 
              /* slice */ Slice, 
              /* moved */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleDrop[Result](
      propName: handleDrop,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction4[
                /* this */ Any, 
                /* view */ this.type, 
                /* event */ DragEvent, 
                /* slice */ Slice, 
                /* moved */ Boolean, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleKeyDown(propName: handleKeyDown): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleKeyDown[Result](
      propName: handleKeyDown,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleKeyPress(propName: handleKeyPress): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleKeyPress[Result](
      propName: handleKeyPress,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handlePaste(propName: handlePaste): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[
              /* this */ Any, 
              /* view */ this.type, 
              /* event */ ClipboardEvent, 
              /* slice */ Slice, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handlePaste[Result](
      propName: handlePaste,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[
                /* this */ Any, 
                /* view */ this.type, 
                /* event */ ClipboardEvent, 
                /* slice */ Slice, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleScrollToSelection(propName: handleScrollToSelection): js.UndefOr[
        NonNullable[js.UndefOr[js.ThisFunction1[/* this */ Any, /* view */ this.type, Boolean]]]
      ] = js.native
    @JSName("someProp")
    def someProp_handleScrollToSelection[Result](
      propName: handleScrollToSelection,
      f: js.Function1[
          /* value */ NonNullable[js.UndefOr[js.ThisFunction1[/* this */ Any, /* view */ this.type, Boolean]]], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleTextInput(propName: handleTextInput): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction4[
              /* this */ Any, 
              /* view */ this.type, 
              /* from */ Double, 
              /* to */ Double, 
              /* text */ String, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleTextInput[Result](
      propName: handleTextInput,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction4[
                /* this */ Any, 
                /* view */ this.type, 
                /* from */ Double, 
                /* to */ Double, 
                /* text */ String, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleTripleClick(propName: handleTripleClick): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleTripleClick[Result](
      propName: handleTripleClick,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* event */ MouseEvent, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_handleTripleClickOn(propName: handleTripleClickOn): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction6[
              /* this */ Any, 
              /* view */ this.type, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_handleTripleClickOn[Result](
      propName: handleTripleClickOn,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction6[
                /* this */ Any, 
                /* view */ this.type, 
                /* pos */ Double, 
                /* node */ Node, 
                /* nodePos */ Double, 
                /* event */ MouseEvent, 
                /* direct */ Boolean, 
                Boolean | Unit
              ]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_markViews(propName: markViews): js.UndefOr[NonNullable[js.UndefOr[StringDictionary[MarkViewConstructor]]]] = js.native
    @JSName("someProp")
    def someProp_markViews[Result](
      propName: markViews,
      f: js.Function1[/* value */ NonNullable[js.UndefOr[StringDictionary[MarkViewConstructor]]], Result]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_nodeViews(propName: nodeViews): js.UndefOr[NonNullable[js.UndefOr[StringDictionary[NodeViewConstructor]]]] = js.native
    @JSName("someProp")
    def someProp_nodeViews[Result](
      propName: nodeViews,
      f: js.Function1[/* value */ NonNullable[js.UndefOr[StringDictionary[NodeViewConstructor]]], Result]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_scrollMargin(propName: scrollMargin): js.UndefOr[NonNullable[js.UndefOr[Double | Bottom]]] = js.native
    @JSName("someProp")
    def someProp_scrollMargin[Result](
      propName: scrollMargin,
      f: js.Function1[/* value */ NonNullable[js.UndefOr[Double | Bottom]], Result]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_scrollThreshold(propName: scrollThreshold): js.UndefOr[NonNullable[js.UndefOr[Double | Bottom]]] = js.native
    @JSName("someProp")
    def someProp_scrollThreshold[Result](
      propName: scrollThreshold,
      f: js.Function1[/* value */ NonNullable[js.UndefOr[Double | Bottom]], Result]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_transformCopied(propName: transformCopied): js.UndefOr[
        NonNullable[
          js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_transformCopied[Result](
      propName: transformCopied,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_transformPasted(propName: transformPasted): js.UndefOr[
        NonNullable[
          js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_transformPasted[Result](
      propName: transformPasted,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_transformPastedHTML(propName: transformPastedHTML): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction2[/* this */ Any, /* html */ String, /* view */ this.type, String]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_transformPastedHTML[Result](
      propName: transformPastedHTML,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction2[/* this */ Any, /* html */ String, /* view */ this.type, String]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    @JSName("someProp")
    def someProp_transformPastedText(propName: transformPastedText): js.UndefOr[
        NonNullable[
          js.UndefOr[
            js.ThisFunction3[/* this */ Any, /* text */ String, /* plain */ Boolean, /* view */ this.type, String]
          ]
        ]
      ] = js.native
    @JSName("someProp")
    def someProp_transformPastedText[Result](
      propName: transformPastedText,
      f: js.Function1[
          /* value */ NonNullable[
            js.UndefOr[
              js.ThisFunction3[/* this */ Any, /* text */ String, /* plain */ Boolean, /* view */ this.type, String]
            ]
          ], 
          Result
        ]
    ): js.UndefOr[Result] = js.native
    
    /**
      The view's current [state](https://prosemirror.net/docs/ref/#state.EditorState).
      */
    var state: EditorState = js.native
    
    /**
      Update the view's props. Will immediately cause an update to
      the DOM.
      */
    def update(props: DirectEditorProps): Unit = js.native
    
    /* private */ var updatePluginViews: Any = js.native
    
    /**
      Update the editor's `state` prop, without touching any of the
      other props.
      */
    def updateState(state: EditorState): Unit = js.native
    
    /* private */ var updateStateInner: Any = js.native
  }
  
  /**
  Helper type that maps event names to event object types, but
  includes events that TypeScript's HTMLElementEventMap doesn't know
  about.
  */
  trait DOMEventMap
    extends StObject
       with HTMLElementEventMap
       with /* event */ StringDictionary[Any]
  object DOMEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      paste: ClipboardEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): DOMEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMEventMap]
    }
  }
  
  type DOMNode = InstanceType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.Node */ Any
  ]
  
  /**
  A set of attributes to add to a decorated node. Most properties
  simply directly correspond to DOM attributes of the same name,
  which will be set to the property's value. These are exceptions:
  */
  trait DecorationAttrs
    extends StObject
       with /**
    Any other properties are treated as regular DOM attributes.
    */
  /* attribute */ StringDictionary[js.UndefOr[String]] {
    
    /**
      A CSS class name or a space-separated set of class names to be
      _added_ to the classes that the node already had.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      When non-null, the target node is wrapped in a DOM element of
      this type (and the other attributes are applied to this element).
      */
    var nodeName: js.UndefOr[String] = js.undefined
    
    /**
      A string of CSS to be _added_ to the node's existing `style` property.
      */
    var style: js.UndefOr[String] = js.undefined
  }
  object DecorationAttrs {
    
    inline def apply(): DecorationAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorationAttrs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecorationAttrs] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameUndefined: Self = StObject.set(x, "nodeName", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /**
  An object that can [provide](https://prosemirror.net/docs/ref/#view.EditorProps.decorations)
  decorations. Implemented by [`DecorationSet`](https://prosemirror.net/docs/ref/#view.DecorationSet),
  and passed to [node views](https://prosemirror.net/docs/ref/#view.EditorProps.nodeViews).
  */
  trait DecorationSource extends StObject {
    
    /**
      Map the set of decorations in response to a change in the
      document.
      */
    def map(mapping: Mapping, node: Node): DecorationSource
  }
  object DecorationSource {
    
    inline def apply(map: (Mapping, Node) => DecorationSource): DecorationSource = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[DecorationSource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecorationSource] (val x: Self) extends AnyVal {
      
      inline def setMap(value: (Mapping, Node) => DecorationSource): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    }
  }
  
  /**
  The props object given directly to the editor view supports some
  fields that can't be used in plugins:
  */
  trait DirectEditorProps
    extends StObject
       with EditorProps[Any] {
    
    /**
      The callback over which to send transactions (state updates)
      produced by the view. If you specify this, you probably want to
      make sure this ends up calling the view's
      [`updateState`](https://prosemirror.net/docs/ref/#view.EditorView.updateState) method with a new
      state that has the transaction
      [applied](https://prosemirror.net/docs/ref/#state.EditorState.apply). The callback will be bound to have
      the view instance as its `this` binding.
      */
    var dispatchTransaction: js.UndefOr[js.Function1[/* tr */ Transaction, Unit]] = js.undefined
    
    /**
      A set of plugins to use in the view, applying their [plugin
      view](https://prosemirror.net/docs/ref/#state.PluginSpec.view) and
      [props](https://prosemirror.net/docs/ref/#state.PluginSpec.props). Passing plugins with a state
      component (a [state field](https://prosemirror.net/docs/ref/#state.PluginSpec.state) field or a
      [transaction](https://prosemirror.net/docs/ref/#state.PluginSpec.filterTransaction) filter or
      appender) will result in an error, since such plugins must be
      present in the state to work.
      */
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
    
    /**
      The current state of the editor.
      */
    var state: EditorState
  }
  object DirectEditorProps {
    
    inline def apply(state: EditorState): DirectEditorProps = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectEditorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectEditorProps] (val x: Self) extends AnyVal {
      
      inline def setDispatchTransaction(value: /* tr */ Transaction => Unit): Self = StObject.set(x, "dispatchTransaction", js.Any.fromFunction1(value))
      
      inline def setDispatchTransactionUndefined: Self = StObject.set(x, "dispatchTransaction", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  Props are configuration values that can be passed to an editor view
  or included in a plugin. This interface lists the supported props.
  The various event-handling functions may all return `true` to
  indicate that they handled the given event. The view will then take
  care to call `preventDefault` on the event, except with
  `handleDOMEvents`, where the handler itself is responsible for that.
  How a prop is resolved depends on the prop. Handler functions are
  called one at a time, starting with the base props and then
  searching through the plugins (in order of appearance) until one of
  them returns true. For some props, the first plugin that yields a
  value gets precedence.
  The optional type parameter refers to the type of `this` in prop
  functions, and is used to pass in the plugin type when defining a
  [plugin](https://prosemirror.net/docs/ref/#state.Plugin).
  */
  trait EditorProps[P] extends StObject {
    
    /**
      Control the DOM attributes of the editable element. May be either
      an object or a function going from an editor state to an object.
      By default, the element will get a class `"ProseMirror"`, and
      will have its `contentEditable` attribute determined by the
      [`editable` prop](https://prosemirror.net/docs/ref/#view.EditorProps.editable). Additional classes
      provided here will be added to the class. For other attributes,
      the value provided first (as in
      [`someProp`](https://prosemirror.net/docs/ref/#view.EditorView.someProp)) will be used.
      */
    var attributes: js.UndefOr[
        StringDictionary[String] | (js.Function1[/* state */ EditorState, StringDictionary[String]])
      ] = js.undefined
    
    /**
      The [parser](https://prosemirror.net/docs/ref/#model.DOMParser) to use when reading content from
      the clipboard. When not given, the value of the
      [`domParser`](https://prosemirror.net/docs/ref/#view.EditorProps.domParser) prop is used.
      */
    var clipboardParser: js.UndefOr[DOMParser] = js.undefined
    
    /**
      The DOM serializer to use when putting content onto the
      clipboard. If not given, the result of
      [`DOMSerializer.fromSchema`](https://prosemirror.net/docs/ref/#model.DOMSerializer^fromSchema)
      will be used. This object will only have its
      [`serializeFragment`](https://prosemirror.net/docs/ref/#model.DOMSerializer.serializeFragment)
      method called, and you may provide an alternative object type
      implementing a compatible method.
      */
    var clipboardSerializer: js.UndefOr[DOMSerializer] = js.undefined
    
    /**
      A function to parse text from the clipboard into a document
      slice. Called after
      [`transformPastedText`](https://prosemirror.net/docs/ref/#view.EditorProps.transformPastedText).
      The default behavior is to split the text into lines, wrap them
      in `<p>` tags, and call
      [`clipboardParser`](https://prosemirror.net/docs/ref/#view.EditorProps.clipboardParser) on it.
      The `plain` flag will be true when the text is pasted as plain text.
      */
    var clipboardTextParser: js.UndefOr[
        js.ThisFunction4[
          /* this */ P, 
          /* text */ String, 
          /* $context */ ResolvedPos, 
          /* plain */ Boolean, 
          /* view */ EditorView, 
          Slice
        ]
      ] = js.undefined
    
    /**
      A function that will be called to get the text for the current
      selection when copying text to the clipboard. By default, the
      editor will use [`textBetween`](https://prosemirror.net/docs/ref/#model.Node.textBetween) on the
      selected range.
      */
    var clipboardTextSerializer: js.UndefOr[
        js.ThisFunction2[/* this */ P, /* content */ Slice, /* view */ EditorView, String]
      ] = js.undefined
    
    /**
      Can be used to override the way a selection is created when
      reading a DOM selection between the given anchor and head.
      */
    var createSelectionBetween: js.UndefOr[
        js.ThisFunction3[
          /* this */ P, 
          /* view */ EditorView, 
          /* anchor */ ResolvedPos, 
          /* head */ ResolvedPos, 
          Selection | Null
        ]
      ] = js.undefined
    
    /**
      A set of [document decorations](https://prosemirror.net/docs/ref/#view.Decoration) to show in the
      view.
      */
    var decorations: js.UndefOr[
        js.ThisFunction1[/* this */ P, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
      ] = js.undefined
    
    /**
      The [parser](https://prosemirror.net/docs/ref/#model.DOMParser) to use when reading editor changes
      from the DOM. Defaults to calling
      [`DOMParser.fromSchema`](https://prosemirror.net/docs/ref/#model.DOMParser^fromSchema) on the
      editor's schema.
      */
    var domParser: js.UndefOr[DOMParser] = js.undefined
    
    /**
      When this returns false, the content of the view is not directly
      editable.
      */
    var editable: js.UndefOr[js.ThisFunction1[/* this */ P, /* state */ EditorState, Boolean]] = js.undefined
    
    /**
      Called when the editor is clicked, after `handleClickOn` handlers
      have been called.
      */
    var handleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called for each node around a click, from the inside out. The
      `direct` flag will be true for the inner node.
      */
    var handleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* node */ Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Can be an object mapping DOM event type names to functions that
      handle them. Such functions will be called before any handling
      ProseMirror does of events fired on the editable DOM element.
      Contrary to the other event handling props, when returning true
      from such a function, you are responsible for calling
      `preventDefault` yourself (or not, if you want to allow the
      default behavior).
      */
    var handleDOMEvents: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : P, view : prosemirror-view.prosemirror-view.EditorView, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */ js.Any
      ] = js.undefined
    
    /**
      Called when the editor is double-clicked, after `handleDoubleClickOn`.
      */
    var handleDoubleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called for each node around a double click.
      */
    var handleDoubleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* node */ Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called when something is dropped on the editor. `moved` will be
      true if this drop moves from the current selection (which should
      thus be deleted).
      */
    var handleDrop: js.UndefOr[
        js.ThisFunction4[
          /* this */ P, 
          /* view */ EditorView, 
          /* event */ DragEvent, 
          /* slice */ Slice, 
          /* moved */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called when the editor receives a `keydown` event.
      */
    var handleKeyDown: js.UndefOr[
        js.ThisFunction2[/* this */ P, /* view */ EditorView, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    /**
      Handler for `keypress` events.
      */
    var handleKeyPress: js.UndefOr[
        js.ThisFunction2[/* this */ P, /* view */ EditorView, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    /**
      Can be used to override the behavior of pasting. `slice` is the
      pasted content parsed by the editor, but you can directly access
      the event to get at the raw content.
      */
    var handlePaste: js.UndefOr[
        js.ThisFunction3[
          /* this */ P, 
          /* view */ EditorView, 
          /* event */ ClipboardEvent, 
          /* slice */ Slice, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called when the view, after updating its state, tries to scroll
      the selection into view. A handler function may return false to
      indicate that it did not handle the scrolling and further
      handlers or the default behavior should be tried.
      */
    var handleScrollToSelection: js.UndefOr[js.ThisFunction1[/* this */ P, /* view */ EditorView, Boolean]] = js.undefined
    
    /**
      Whenever the user directly input text, this handler is called
      before the input is applied. If it returns `true`, the default
      behavior of actually inserting the text is suppressed.
      */
    var handleTextInput: js.UndefOr[
        js.ThisFunction4[
          /* this */ P, 
          /* view */ EditorView, 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called when the editor is triple-clicked, after `handleTripleClickOn`.
      */
    var handleTripleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Called for each node around a triple click.
      */
    var handleTripleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ P, 
          /* view */ EditorView, 
          /* pos */ Double, 
          /* node */ Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /**
      Pass custom mark rendering functions. Note that these cannot
      provide the kind of dynamic behavior that [node
      views](https://prosemirror.net/docs/ref/#view.NodeView) can—they just provide custom rendering
      logic. The third argument indicates whether the mark's content
      is inline.
      */
    var markViews: js.UndefOr[StringDictionary[MarkViewConstructor]] = js.undefined
    
    /**
      Allows you to pass custom rendering and behavior logic for
      nodes. Should map node names to constructor functions that
      produce a [`NodeView`](https://prosemirror.net/docs/ref/#view.NodeView) object implementing the
      node's display behavior. The third argument `getPos` is a
      function that can be called to get the node's current position,
      which can be useful when creating transactions to update it.
      Note that if the node is not in the document, the position
      returned by this function will be `undefined`.
      
      `decorations` is an array of node or inline decorations that are
      active around the node. They are automatically drawn in the
      normal way, and you will usually just want to ignore this, but
      they can also be used as a way to provide context information to
      the node view without adding it to the document itself.
      
      `innerDecorations` holds the decorations for the node's content.
      You can safely ignore this if your view has no content or a
      `contentDOM` property, since the editor will draw the decorations
      on the content. But if you, for example, want to create a nested
      editor with the content, it may make sense to provide it with the
      inner decorations.
      
      (For backwards compatibility reasons, [mark
      views](https://prosemirror.net/docs/ref/#view.EditorProps.markViews) can also be included in this
      object.)
      */
    var nodeViews: js.UndefOr[StringDictionary[NodeViewConstructor]] = js.undefined
    
    /**
      Determines the extra space (in pixels) that is left above or
      below the cursor when it is scrolled into view. Defaults to 5.
      */
    var scrollMargin: js.UndefOr[Double | Bottom] = js.undefined
    
    /**
      Determines the distance (in pixels) between the cursor and the
      end of the visible viewport at which point, when scrolling the
      cursor into view, scrolling takes place. Defaults to 0.
      */
    var scrollThreshold: js.UndefOr[Double | Bottom] = js.undefined
    
    /**
      Can be used to transform copied or cut content before it is
      serialized to the clipboard.
      */
    var transformCopied: js.UndefOr[js.ThisFunction2[/* this */ P, /* slice */ Slice, /* view */ EditorView, Slice]] = js.undefined
    
    /**
      Can be used to transform pasted or dragged-and-dropped content
      before it is applied to the document.
      */
    var transformPasted: js.UndefOr[js.ThisFunction2[/* this */ P, /* slice */ Slice, /* view */ EditorView, Slice]] = js.undefined
    
    /**
      Can be used to transform pasted HTML text, _before_ it is parsed,
      for example to clean it up.
      */
    var transformPastedHTML: js.UndefOr[js.ThisFunction2[/* this */ P, /* html */ String, /* view */ EditorView, String]] = js.undefined
    
    /**
      Transform pasted plain text. The `plain` flag will be true when
      the text is pasted as plain text.
      */
    var transformPastedText: js.UndefOr[
        js.ThisFunction3[/* this */ P, /* text */ String, /* plain */ Boolean, /* view */ EditorView, String]
      ] = js.undefined
  }
  object EditorProps {
    
    inline def apply[P](): EditorProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorProps[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorProps[?], P] (val x: Self & EditorProps[P]) extends AnyVal {
      
      inline def setAttributes(
        value: StringDictionary[String] | (js.Function1[/* state */ EditorState, StringDictionary[String]])
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesFunction1(value: /* state */ EditorState => StringDictionary[String]): Self = StObject.set(x, "attributes", js.Any.fromFunction1(value))
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClipboardParser(value: DOMParser): Self = StObject.set(x, "clipboardParser", value.asInstanceOf[js.Any])
      
      inline def setClipboardParserUndefined: Self = StObject.set(x, "clipboardParser", js.undefined)
      
      inline def setClipboardSerializer(value: DOMSerializer): Self = StObject.set(x, "clipboardSerializer", value.asInstanceOf[js.Any])
      
      inline def setClipboardSerializerUndefined: Self = StObject.set(x, "clipboardSerializer", js.undefined)
      
      inline def setClipboardTextParser(
        value: js.ThisFunction4[
              /* this */ P, 
              /* text */ String, 
              /* $context */ ResolvedPos, 
              /* plain */ Boolean, 
              /* view */ EditorView, 
              Slice
            ]
      ): Self = StObject.set(x, "clipboardTextParser", value.asInstanceOf[js.Any])
      
      inline def setClipboardTextParserUndefined: Self = StObject.set(x, "clipboardTextParser", js.undefined)
      
      inline def setClipboardTextSerializer(value: js.ThisFunction2[/* this */ P, /* content */ Slice, /* view */ EditorView, String]): Self = StObject.set(x, "clipboardTextSerializer", value.asInstanceOf[js.Any])
      
      inline def setClipboardTextSerializerUndefined: Self = StObject.set(x, "clipboardTextSerializer", js.undefined)
      
      inline def setCreateSelectionBetween(
        value: js.ThisFunction3[
              /* this */ P, 
              /* view */ EditorView, 
              /* anchor */ ResolvedPos, 
              /* head */ ResolvedPos, 
              Selection | Null
            ]
      ): Self = StObject.set(x, "createSelectionBetween", value.asInstanceOf[js.Any])
      
      inline def setCreateSelectionBetweenUndefined: Self = StObject.set(x, "createSelectionBetween", js.undefined)
      
      inline def setDecorations(
        value: js.ThisFunction1[/* this */ P, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
      ): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      inline def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
      
      inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      inline def setDomParserUndefined: Self = StObject.set(x, "domParser", js.undefined)
      
      inline def setEditable(value: js.ThisFunction1[/* this */ P, /* state */ EditorState, Boolean]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setHandleClick(
        value: js.ThisFunction3[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleClickOn(
        value: js.ThisFunction6[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleClickOn", value.asInstanceOf[js.Any])
      
      inline def setHandleClickOnUndefined: Self = StObject.set(x, "handleClickOn", js.undefined)
      
      inline def setHandleClickUndefined: Self = StObject.set(x, "handleClick", js.undefined)
      
      inline def setHandleDOMEvents(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : P, view : prosemirror-view.prosemirror-view.EditorView, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */ js.Any
      ): Self = StObject.set(x, "handleDOMEvents", value.asInstanceOf[js.Any])
      
      inline def setHandleDOMEventsUndefined: Self = StObject.set(x, "handleDOMEvents", js.undefined)
      
      inline def setHandleDoubleClick(
        value: js.ThisFunction3[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleDoubleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleDoubleClickOn(
        value: js.ThisFunction6[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleDoubleClickOn", value.asInstanceOf[js.Any])
      
      inline def setHandleDoubleClickOnUndefined: Self = StObject.set(x, "handleDoubleClickOn", js.undefined)
      
      inline def setHandleDoubleClickUndefined: Self = StObject.set(x, "handleDoubleClick", js.undefined)
      
      inline def setHandleDrop(
        value: js.ThisFunction4[
              /* this */ P, 
              /* view */ EditorView, 
              /* event */ DragEvent, 
              /* slice */ Slice, 
              /* moved */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleDrop", value.asInstanceOf[js.Any])
      
      inline def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
      
      inline def setHandleKeyDown(
        value: js.ThisFunction2[/* this */ P, /* view */ EditorView, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "handleKeyDown", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyDownUndefined: Self = StObject.set(x, "handleKeyDown", js.undefined)
      
      inline def setHandleKeyPress(
        value: js.ThisFunction2[/* this */ P, /* view */ EditorView, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "handleKeyPress", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyPressUndefined: Self = StObject.set(x, "handleKeyPress", js.undefined)
      
      inline def setHandlePaste(
        value: js.ThisFunction3[
              /* this */ P, 
              /* view */ EditorView, 
              /* event */ ClipboardEvent, 
              /* slice */ Slice, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setHandleScrollToSelection(value: js.ThisFunction1[/* this */ P, /* view */ EditorView, Boolean]): Self = StObject.set(x, "handleScrollToSelection", value.asInstanceOf[js.Any])
      
      inline def setHandleScrollToSelectionUndefined: Self = StObject.set(x, "handleScrollToSelection", js.undefined)
      
      inline def setHandleTextInput(
        value: js.ThisFunction4[
              /* this */ P, 
              /* view */ EditorView, 
              /* from */ Double, 
              /* to */ Double, 
              /* text */ String, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleTextInput", value.asInstanceOf[js.Any])
      
      inline def setHandleTextInputUndefined: Self = StObject.set(x, "handleTextInput", js.undefined)
      
      inline def setHandleTripleClick(
        value: js.ThisFunction3[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleTripleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleTripleClickOn(
        value: js.ThisFunction6[
              /* this */ P, 
              /* view */ EditorView, 
              /* pos */ Double, 
              /* node */ Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleTripleClickOn", value.asInstanceOf[js.Any])
      
      inline def setHandleTripleClickOnUndefined: Self = StObject.set(x, "handleTripleClickOn", js.undefined)
      
      inline def setHandleTripleClickUndefined: Self = StObject.set(x, "handleTripleClick", js.undefined)
      
      inline def setMarkViews(value: StringDictionary[MarkViewConstructor]): Self = StObject.set(x, "markViews", value.asInstanceOf[js.Any])
      
      inline def setMarkViewsUndefined: Self = StObject.set(x, "markViews", js.undefined)
      
      inline def setNodeViews(value: StringDictionary[NodeViewConstructor]): Self = StObject.set(x, "nodeViews", value.asInstanceOf[js.Any])
      
      inline def setNodeViewsUndefined: Self = StObject.set(x, "nodeViews", js.undefined)
      
      inline def setScrollMargin(value: Double | Bottom): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollThreshold(value: Double | Bottom): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      inline def setTransformCopied(value: js.ThisFunction2[/* this */ P, /* slice */ Slice, /* view */ EditorView, Slice]): Self = StObject.set(x, "transformCopied", value.asInstanceOf[js.Any])
      
      inline def setTransformCopiedUndefined: Self = StObject.set(x, "transformCopied", js.undefined)
      
      inline def setTransformPasted(value: js.ThisFunction2[/* this */ P, /* slice */ Slice, /* view */ EditorView, Slice]): Self = StObject.set(x, "transformPasted", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedHTML(value: js.ThisFunction2[/* this */ P, /* html */ String, /* view */ EditorView, String]): Self = StObject.set(x, "transformPastedHTML", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedHTMLUndefined: Self = StObject.set(x, "transformPastedHTML", js.undefined)
      
      inline def setTransformPastedText(
        value: js.ThisFunction3[/* this */ P, /* text */ String, /* plain */ Boolean, /* view */ EditorView, String]
      ): Self = StObject.set(x, "transformPastedText", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedTextUndefined: Self = StObject.set(x, "transformPastedText", js.undefined)
      
      inline def setTransformPastedUndefined: Self = StObject.set(x, "transformPasted", js.undefined)
    }
  }
  
  /**
  The function types [used](https://prosemirror.net/docs/ref/#view.EditorProps.markViews) to create
  mark views.
  */
  type MarkViewConstructor = js.Function3[/* mark */ Mark, /* view */ EditorView, /* inline */ Boolean, ContentDOM]
  
  /**
  By default, document nodes are rendered using the result of the
  [`toDOM`](https://prosemirror.net/docs/ref/#model.NodeSpec.toDOM) method of their spec, and managed
  entirely by the editor. For some use cases, such as embedded
  node-specific editing interfaces, you want more control over
  the behavior of a node's in-editor representation, and need to
  [define](https://prosemirror.net/docs/ref/#view.EditorProps.nodeViews) a custom node view.
  Mark views only support `dom` and `contentDOM`, and don't support
  any of the node view methods.
  Objects returned as node views must conform to this interface.
  */
  trait NodeView extends StObject {
    
    /**
      The DOM node that should hold the node's content. Only meaningful
      if the node view also defines a `dom` property and if its node
      type is not a leaf node type. When this is present, ProseMirror
      will take care of rendering the node's children into it. When it
      is not present, the node view itself is responsible for rendering
      (or deciding not to render) its child nodes.
      */
    var contentDOM: js.UndefOr[HTMLElement | Null] = js.undefined
    
    /**
      When defining a `selectNode` method, you should also provide a
      `deselectNode` method to remove the effect again.
      */
    var deselectNode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      Called when the node view is removed from the editor or the whole
      editor is destroyed. (Not available for marks.)
      */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      The outer DOM node that represents the document node.
      */
    var dom: DOMNode
    
    /**
      Called when a DOM
      [mutation](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver)
      or a selection change happens within the view. When the change is
      a selection change, the record will have a `type` property of
      `"selection"` (which doesn't occur for native mutation records).
      Return false if the editor should re-read the selection or
      re-parse the range around the mutation, true if it can safely be
      ignored.
      */
    var ignoreMutation: js.UndefOr[js.Function1[/* mutation */ MutationRecord, Boolean]] = js.undefined
    
    /**
      Can be used to override the way the node's selected status (as a
      node selection) is displayed.
      */
    var selectNode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      This will be called to handle setting the selection inside the
      node. The `anchor` and `head` positions are relative to the start
      of the node. By default, a DOM selection will be created between
      the DOM positions corresponding to those positions, but if you
      override it you can do something else.
      */
    var setSelection: js.UndefOr[
        js.Function3[/* anchor */ Double, /* head */ Double, /* root */ Document | ShadowRoot, Unit]
      ] = js.undefined
    
    /**
      Can be used to prevent the editor view from trying to handle some
      or all DOM events that bubble up from the node view. Events for
      which this returns true are not handled by the editor.
      */
    var stopEvent: js.UndefOr[js.Function1[/* event */ Event, Boolean]] = js.undefined
    
    /**
      When given, this will be called when the view is updating itself.
      It will be given a node (possibly of a different type), an array
      of active decorations around the node (which are automatically
      drawn, and the node view may ignore if it isn't interested in
      them), and a [decoration source](https://prosemirror.net/docs/ref/#view.DecorationSource) that
      represents any decorations that apply to the content of the node
      (which again may be ignored). It should return true if it was
      able to update to that node, and false otherwise. If the node
      view has a `contentDOM` property (or no `dom` property), updating
      its child nodes will be handled by ProseMirror.
      */
    var update: js.UndefOr[
        js.Function3[
          /* node */ Node, 
          /* decorations */ js.Array[Decoration], 
          /* innerDecorations */ DecorationSource, 
          Boolean
        ]
      ] = js.undefined
  }
  object NodeView {
    
    inline def apply(dom: DOMNode): NodeView = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeView]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeView] (val x: Self) extends AnyVal {
      
      inline def setContentDOM(value: HTMLElement): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
      
      inline def setContentDOMNull: Self = StObject.set(x, "contentDOM", null)
      
      inline def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
      
      inline def setDeselectNode(value: () => Unit): Self = StObject.set(x, "deselectNode", js.Any.fromFunction0(value))
      
      inline def setDeselectNodeUndefined: Self = StObject.set(x, "deselectNode", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDom(value: DOMNode): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMutation(value: /* mutation */ MutationRecord => Boolean): Self = StObject.set(x, "ignoreMutation", js.Any.fromFunction1(value))
      
      inline def setIgnoreMutationUndefined: Self = StObject.set(x, "ignoreMutation", js.undefined)
      
      inline def setSelectNode(value: () => Unit): Self = StObject.set(x, "selectNode", js.Any.fromFunction0(value))
      
      inline def setSelectNodeUndefined: Self = StObject.set(x, "selectNode", js.undefined)
      
      inline def setSetSelection(value: (/* anchor */ Double, /* head */ Double, /* root */ Document | ShadowRoot) => Unit): Self = StObject.set(x, "setSelection", js.Any.fromFunction3(value))
      
      inline def setSetSelectionUndefined: Self = StObject.set(x, "setSelection", js.undefined)
      
      inline def setStopEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "stopEvent", js.Any.fromFunction1(value))
      
      inline def setStopEventUndefined: Self = StObject.set(x, "stopEvent", js.undefined)
      
      inline def setUpdate(
        value: (/* node */ Node, /* decorations */ js.Array[Decoration], /* innerDecorations */ DecorationSource) => Boolean
      ): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  /**
  The type of function [provided](https://prosemirror.net/docs/ref/#view.EditorProps.nodeViews) to
  create [node views](https://prosemirror.net/docs/ref/#view.NodeView).
  */
  type NodeViewConstructor = js.Function5[
    /* node */ Node, 
    /* view */ EditorView, 
    /* getPos */ js.Function0[js.UndefOr[Double]], 
    /* decorations */ js.Array[Decoration], 
    /* innerDecorations */ DecorationSource, 
    NodeView
  ]
  
  @js.native
  trait NodeViewDesc
    extends StObject
       with ViewDesc {
    
    def deselectNode(): Unit = js.native
    
    var innerDeco: DecorationSource = js.native
    
    def localCompositionInfo(view: EditorView, pos: Double): Pos | Null = js.native
    
    val nodeDOM: DOMNode = js.native
    
    @JSName("node")
    var node_NodeViewDesc: Node = js.native
    
    var outerDeco: js.Array[Decoration] = js.native
    
    def protectLocalComposition(view: EditorView, param1: Pos): Unit = js.native
    
    def selectNode(): Unit = js.native
    
    def update(node: Node, outerDeco: js.Array[Decoration], innerDeco: DecorationSource, view: EditorView): Boolean = js.native
    
    def updateChildren(view: EditorView, pos: Double): Unit = js.native
    
    def updateInner(node: Node, outerDeco: js.Array[Decoration], innerDeco: DecorationSource, view: EditorView): Unit = js.native
    
    def updateOuterDeco(outerDeco: js.Array[Decoration]): Unit = js.native
  }
  
  @js.native
  trait TextViewDesc
    extends StObject
       with NodeViewDesc {
    
    def domFromPos(pos: Double): Offset = js.native
    
    def inParent(): Boolean = js.native
    
    def slice(from: Double, to: Double, view: EditorView): TextViewDesc = js.native
  }
  
  @js.native
  trait ViewDesc extends StObject {
    
    def border: Double = js.native
    
    var children: js.Array[ViewDesc] = js.native
    
    var contentDOM: HTMLElement | Null = js.native
    
    def contentLost: Boolean | Null = js.native
    
    def descAt(pos: Double): js.UndefOr[ViewDesc] = js.native
    
    def destroy(): Unit = js.native
    
    var dirty: Double = js.native
    
    var dom: DOMNode = js.native
    
    def domAfterPos(pos: Double): DOMNode = js.native
    
    def domAtom: Boolean = js.native
    
    def domFromPos(pos: Double, side: Double): Atom = js.native
    
    def emptyChildAt(side: Double): Boolean = js.native
    
    def getDesc(dom: DOMNode): js.UndefOr[ViewDesc] = js.native
    
    def ignoreForCoords: Boolean = js.native
    
    def ignoreMutation(mutation: MutationRecord): Boolean = js.native
    
    def localPosFromDOM(dom: DOMNode, offset: Double, bias: Double): Double = js.native
    
    def markDirty(from: Double, to: Double): Unit = js.native
    
    def markParentsDirty(): Unit = js.native
    
    def matchesHack(nodeName: String): Boolean = js.native
    
    def matchesMark(mark: Mark): Boolean = js.native
    
    def matchesNode(node: Node, outerDeco: js.Array[Decoration], innerDeco: DecorationSource): Boolean = js.native
    
    def matchesWidget(widget: Decoration): Boolean = js.native
    
    def nearestDesc(dom: DOMNode): js.UndefOr[ViewDesc] = js.native
    @JSName("nearestDesc")
    def nearestDesc_true(dom: DOMNode, onlyNodes: `true`): js.UndefOr[NodeViewDesc] = js.native
    
    var node: Node | Null = js.native
    
    var parent: js.UndefOr[ViewDesc] = js.native
    
    def parseRange(from: Double, to: Double): From = js.native
    def parseRange(from: Double, to: Double, base: Double): From = js.native
    
    def parseRule(): ParseRule | Null = js.native
    
    def posAfter: Double = js.native
    
    def posAtEnd: Double = js.native
    
    def posAtStart: Double = js.native
    
    def posBefore: Double = js.native
    
    def posBeforeChild(child: ViewDesc): Double = js.native
    
    def posFromDOM(dom: DOMNode, offset: Double, bias: Double): Double = js.native
    
    def setSelection(anchor: Double, head: Double, root: Document): Unit = js.native
    def setSelection(anchor: Double, head: Double, root: Document, force: Boolean): Unit = js.native
    def setSelection(anchor: Double, head: Double, root: ShadowRoot): Unit = js.native
    def setSelection(anchor: Double, head: Double, root: ShadowRoot, force: Boolean): Unit = js.native
    
    def size: Double = js.native
    
    def stopEvent(event: Event): Boolean = js.native
  }
  
  type WidgetConstructor = (js.Function2[/* view */ EditorView, /* getPos */ js.Function0[js.UndefOr[Double]], DOMNode]) | DOMNode
  
  object global {
    
    trait Node extends StObject {
      
      var pmViewDesc: js.UndefOr[ViewDesc] = js.undefined
    }
    object Node {
      
      inline def apply(): typings.prosemirrorView.mod.global.Node = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.prosemirrorView.mod.global.Node]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.prosemirrorView.mod.global.Node] (val x: Self) extends AnyVal {
        
        inline def setPmViewDesc(value: ViewDesc): Self = StObject.set(x, "pmViewDesc", value.asInstanceOf[js.Any])
        
        inline def setPmViewDescUndefined: Self = StObject.set(x, "pmViewDesc", js.undefined)
      }
    }
  }
}
