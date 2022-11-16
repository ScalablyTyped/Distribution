package typings.prosemirrorView

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.DOMNode
import typings.prosemirrorView.mod.DecorationSource
import typings.prosemirrorView.mod.MarkViewConstructor
import typings.prosemirrorView.mod.NodeViewConstructor
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CompositionEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.FormDataEvent
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.SubmitEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Atom extends StObject {
    
    var atom: js.UndefOr[Double] = js.undefined
    
    var node: DOMNode
    
    var offset: Double
  }
  object Atom {
    
    inline def apply(node: DOMNode, offset: Double): Atom = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Atom]
    }
    
    extension [Self <: Atom](x: Self) {
      
      inline def setAtom(value: Double): Self = StObject.set(x, "atom", value.asInstanceOf[js.Any])
      
      inline def setAtomUndefined: Self = StObject.set(x, "atom", js.undefined)
      
      inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentDOM extends StObject {
    
    var contentDOM: js.UndefOr[HTMLElement] = js.undefined
    
    var dom: HTMLElement
  }
  object ContentDOM {
    
    inline def apply(dom: HTMLElement): ContentDOM = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDOM]
    }
    
    extension [Self <: ContentDOM](x: Self) {
      
      inline def setContentDOM(value: HTMLElement): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
      
      inline def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
      
      inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var fromOffset: Double
    
    var node: DOMNode
    
    var to: Double
    
    var toOffset: Double
  }
  object From {
    
    inline def apply(from: Double, fromOffset: Double, node: DOMNode, to: Double, toOffset: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromOffset = fromOffset.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], toOffset = toOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromOffset(value: Double): Self = StObject.set(x, "fromOffset", value.asInstanceOf[js.Any])
      
      inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToOffset(value: Double): Self = StObject.set(x, "toOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inside extends StObject {
    
    var inside: Double
    
    var pos: Double
  }
  object Inside {
    
    inline def apply(inside: Double, pos: Double): Inside = {
      val __obj = js.Dynamic.literal(inside = inside.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inside]
    }
    
    extension [Self <: Inside](x: Self) {
      
      inline def setInside(value: Double): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mount extends StObject {
    
    var mount: HTMLElement
  }
  object Mount {
    
    inline def apply(mount: HTMLElement): Mount = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mount]
    }
    
    extension [Self <: Mount](x: Self) {
      
      inline def setMount(value: HTMLElement): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Move extends StObject {
    
    var move: Boolean
    
    var slice: Slice
  }
  object Move {
    
    inline def apply(move: Boolean, slice: Slice): Move = {
      val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move]
    }
    
    extension [Self <: Move](x: Self) {
      
      inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: DOMNode
    
    var offset: Double
  }
  object Node {
    
    inline def apply(node: DOMNode, offset: Double): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: DOMNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnRemove extends StObject {
    
    /**
      When given, this function will be called for each decoration
      that gets dropped as a result of the mapping, passing the
      spec of that decoration.
      */
    var onRemove: js.UndefOr[js.Function1[/* decorationSpec */ Any, Unit]] = js.undefined
  }
  object OnRemove {
    
    inline def apply(): OnRemove = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRemove]
    }
    
    extension [Self <: OnRemove](x: Self) {
      
      inline def setOnRemove(value: /* decorationSpec */ Any => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    }
  }
  
  /* Inlined std.Partial<prosemirror-view.prosemirror-view.DirectEditorProps> */
  trait PartialDirectEditorProps extends StObject {
    
    var attributes: js.UndefOr[
        StringDictionary[String] | (js.Function1[/* state */ EditorState, StringDictionary[String]])
      ] = js.undefined
    
    var clipboardParser: js.UndefOr[DOMParser] = js.undefined
    
    var clipboardSerializer: js.UndefOr[DOMSerializer] = js.undefined
    
    var clipboardTextParser: js.UndefOr[
        js.ThisFunction4[
          /* this */ Any, 
          /* text */ String, 
          /* $context */ ResolvedPos, 
          /* plain */ Boolean, 
          /* view */ this.type, 
          Slice
        ]
      ] = js.undefined
    
    var clipboardTextSerializer: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* content */ Slice, /* view */ this.type, String]
      ] = js.undefined
    
    var createSelectionBetween: js.UndefOr[
        js.ThisFunction3[
          /* this */ Any, 
          /* view */ this.type, 
          /* anchor */ ResolvedPos, 
          /* head */ ResolvedPos, 
          Selection | Null
        ]
      ] = js.undefined
    
    var decorations: js.UndefOr[
        js.ThisFunction1[/* this */ Any, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
      ] = js.undefined
    
    var dispatchTransaction: js.UndefOr[js.Function1[/* tr */ Transaction, Unit]] = js.undefined
    
    var domParser: js.UndefOr[DOMParser] = js.undefined
    
    var editable: js.UndefOr[js.ThisFunction1[/* this */ Any, /* state */ EditorState, Boolean]] = js.undefined
    
    var handleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleDOMEvents: js.UndefOr[eventinkeyofDOMEventMapth] = js.undefined
    
    var handleDoubleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleDoubleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleDrop: js.UndefOr[
        js.ThisFunction4[
          /* this */ Any, 
          /* view */ this.type, 
          /* event */ DragEvent, 
          /* slice */ Slice, 
          /* moved */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleKeyDown: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var handleKeyPress: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var handlePaste: js.UndefOr[
        js.ThisFunction3[
          /* this */ Any, 
          /* view */ this.type, 
          /* event */ ClipboardEvent, 
          /* slice */ Slice, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleScrollToSelection: js.UndefOr[js.ThisFunction1[/* this */ Any, /* view */ this.type, Boolean]] = js.undefined
    
    var handleTextInput: js.UndefOr[
        js.ThisFunction4[
          /* this */ Any, 
          /* view */ this.type, 
          /* from */ Double, 
          /* to */ Double, 
          /* text */ String, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleTripleClick: js.UndefOr[
        js.ThisFunction3[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* event */ MouseEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var handleTripleClickOn: js.UndefOr[
        js.ThisFunction6[
          /* this */ Any, 
          /* view */ this.type, 
          /* pos */ Double, 
          /* node */ typings.prosemirrorModel.mod.Node, 
          /* nodePos */ Double, 
          /* event */ MouseEvent, 
          /* direct */ Boolean, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var markViews: js.UndefOr[StringDictionary[MarkViewConstructor]] = js.undefined
    
    var nodeViews: js.UndefOr[StringDictionary[NodeViewConstructor]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
    
    var scrollMargin: js.UndefOr[Double | Bottom] = js.undefined
    
    var scrollThreshold: js.UndefOr[Double | Bottom] = js.undefined
    
    var state: js.UndefOr[EditorState] = js.undefined
    
    var transformCopied: js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]] = js.undefined
    
    var transformPasted: js.UndefOr[js.ThisFunction2[/* this */ Any, /* slice */ Slice, /* view */ this.type, Slice]] = js.undefined
    
    var transformPastedHTML: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* html */ String, /* view */ this.type, String]
      ] = js.undefined
    
    var transformPastedText: js.UndefOr[
        js.ThisFunction3[/* this */ Any, /* text */ String, /* plain */ Boolean, /* view */ this.type, String]
      ] = js.undefined
  }
  object PartialDirectEditorProps {
    
    inline def apply(): PartialDirectEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDirectEditorProps]
    }
    
    extension [Self <: PartialDirectEditorProps](x: Self) {
      
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
              /* this */ Any, 
              /* text */ String, 
              /* $context */ ResolvedPos, 
              /* plain */ Boolean, 
              PartialDirectEditorProps, 
              Slice
            ]
      ): Self = StObject.set(x, "clipboardTextParser", value.asInstanceOf[js.Any])
      
      inline def setClipboardTextParserUndefined: Self = StObject.set(x, "clipboardTextParser", js.undefined)
      
      inline def setClipboardTextSerializer(value: js.ThisFunction2[/* this */ Any, /* content */ Slice, PartialDirectEditorProps, String]): Self = StObject.set(x, "clipboardTextSerializer", value.asInstanceOf[js.Any])
      
      inline def setClipboardTextSerializerUndefined: Self = StObject.set(x, "clipboardTextSerializer", js.undefined)
      
      inline def setCreateSelectionBetween(
        value: js.ThisFunction3[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* anchor */ ResolvedPos, 
              /* head */ ResolvedPos, 
              Selection | Null
            ]
      ): Self = StObject.set(x, "createSelectionBetween", value.asInstanceOf[js.Any])
      
      inline def setCreateSelectionBetweenUndefined: Self = StObject.set(x, "createSelectionBetween", js.undefined)
      
      inline def setDecorations(
        value: js.ThisFunction1[/* this */ Any, /* state */ EditorState, js.UndefOr[DecorationSource | Null]]
      ): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      inline def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
      
      inline def setDispatchTransaction(value: /* tr */ Transaction => Unit): Self = StObject.set(x, "dispatchTransaction", js.Any.fromFunction1(value))
      
      inline def setDispatchTransactionUndefined: Self = StObject.set(x, "dispatchTransaction", js.undefined)
      
      inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
      
      inline def setDomParserUndefined: Self = StObject.set(x, "domParser", js.undefined)
      
      inline def setEditable(value: js.ThisFunction1[/* this */ Any, /* state */ EditorState, Boolean]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setHandleClick(
        value: js.ThisFunction3[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleClickOn(
        value: js.ThisFunction6[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node, 
              /* nodePos */ Double, 
              /* event */ MouseEvent, 
              /* direct */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleClickOn", value.asInstanceOf[js.Any])
      
      inline def setHandleClickOnUndefined: Self = StObject.set(x, "handleClickOn", js.undefined)
      
      inline def setHandleClickUndefined: Self = StObject.set(x, "handleClick", js.undefined)
      
      inline def setHandleDOMEvents(value: eventinkeyofDOMEventMapth): Self = StObject.set(x, "handleDOMEvents", value.asInstanceOf[js.Any])
      
      inline def setHandleDOMEventsUndefined: Self = StObject.set(x, "handleDOMEvents", js.undefined)
      
      inline def setHandleDoubleClick(
        value: js.ThisFunction3[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleDoubleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleDoubleClickOn(
        value: js.ThisFunction6[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node, 
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
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* event */ DragEvent, 
              /* slice */ Slice, 
              /* moved */ Boolean, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleDrop", value.asInstanceOf[js.Any])
      
      inline def setHandleDropUndefined: Self = StObject.set(x, "handleDrop", js.undefined)
      
      inline def setHandleKeyDown(
        value: js.ThisFunction2[/* this */ Any, PartialDirectEditorProps, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "handleKeyDown", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyDownUndefined: Self = StObject.set(x, "handleKeyDown", js.undefined)
      
      inline def setHandleKeyPress(
        value: js.ThisFunction2[/* this */ Any, PartialDirectEditorProps, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "handleKeyPress", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyPressUndefined: Self = StObject.set(x, "handleKeyPress", js.undefined)
      
      inline def setHandlePaste(
        value: js.ThisFunction3[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* event */ ClipboardEvent, 
              /* slice */ Slice, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handlePaste", value.asInstanceOf[js.Any])
      
      inline def setHandlePasteUndefined: Self = StObject.set(x, "handlePaste", js.undefined)
      
      inline def setHandleScrollToSelection(value: js.ThisFunction1[/* this */ Any, PartialDirectEditorProps, Boolean]): Self = StObject.set(x, "handleScrollToSelection", value.asInstanceOf[js.Any])
      
      inline def setHandleScrollToSelectionUndefined: Self = StObject.set(x, "handleScrollToSelection", js.undefined)
      
      inline def setHandleTextInput(
        value: js.ThisFunction4[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* from */ Double, 
              /* to */ Double, 
              /* text */ String, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleTextInput", value.asInstanceOf[js.Any])
      
      inline def setHandleTextInputUndefined: Self = StObject.set(x, "handleTextInput", js.undefined)
      
      inline def setHandleTripleClick(
        value: js.ThisFunction3[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* event */ MouseEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "handleTripleClick", value.asInstanceOf[js.Any])
      
      inline def setHandleTripleClickOn(
        value: js.ThisFunction6[
              /* this */ Any, 
              PartialDirectEditorProps, 
              /* pos */ Double, 
              /* node */ typings.prosemirrorModel.mod.Node, 
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
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setScrollMargin(value: Double | Bottom): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
      
      inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
      
      inline def setScrollThreshold(value: Double | Bottom): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTransformCopied(value: js.ThisFunction2[/* this */ Any, /* slice */ Slice, PartialDirectEditorProps, Slice]): Self = StObject.set(x, "transformCopied", value.asInstanceOf[js.Any])
      
      inline def setTransformCopiedUndefined: Self = StObject.set(x, "transformCopied", js.undefined)
      
      inline def setTransformPasted(value: js.ThisFunction2[/* this */ Any, /* slice */ Slice, PartialDirectEditorProps, Slice]): Self = StObject.set(x, "transformPasted", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedHTML(value: js.ThisFunction2[/* this */ Any, /* html */ String, PartialDirectEditorProps, String]): Self = StObject.set(x, "transformPastedHTML", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedHTMLUndefined: Self = StObject.set(x, "transformPastedHTML", js.undefined)
      
      inline def setTransformPastedText(
        value: js.ThisFunction3[/* this */ Any, /* text */ String, /* plain */ Boolean, PartialDirectEditorProps, String]
      ): Self = StObject.set(x, "transformPastedText", value.asInstanceOf[js.Any])
      
      inline def setTransformPastedTextUndefined: Self = StObject.set(x, "transformPastedText", js.undefined)
      
      inline def setTransformPastedUndefined: Self = StObject.set(x, "transformPasted", js.undefined)
    }
  }
  
  trait Right extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Right {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Right = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Right]
    }
    
    extension [Self <: Right](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ event in keyof prosemirror-view.prosemirror-view.DOMEventMap ]:? (this : any, view : prosemirror-view.prosemirror-view.EditorView, event : prosemirror-view.prosemirror-view.DOMEventMap[event]): boolean | void} */
  trait eventinkeyofDOMEventMapth extends StObject {
    
    var abort: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ UIEvent, Boolean | Unit]
      ] = js.undefined
    
    var animationcancel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
      ] = js.undefined
    
    var animationend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
      ] = js.undefined
    
    var animationiteration: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
      ] = js.undefined
    
    var animationstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ AnimationEvent, Boolean | Unit]
      ] = js.undefined
    
    var auxclick: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var beforeinput: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ InputEvent, Boolean | Unit]
      ] = js.undefined
    
    var blur: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
      ] = js.undefined
    
    var cancel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var canplay: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var canplaythrough: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var change: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var click: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var close: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var compositionend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
      ] = js.undefined
    
    var compositionstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
      ] = js.undefined
    
    var compositionupdate: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ CompositionEvent, Boolean | Unit]
      ] = js.undefined
    
    var contextmenu: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var copy: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var cuechange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var cut: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var dblclick: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var drag: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var dragend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var dragenter: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var dragleave: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var dragover: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var dragstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var drop: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ DragEvent, Boolean | Unit]
      ] = js.undefined
    
    var durationchange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var emptied: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var ended: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var error: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ErrorEvent, Boolean | Unit]
      ] = js.undefined
    
    var focus: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
      ] = js.undefined
    
    var focusin: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
      ] = js.undefined
    
    var focusout: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FocusEvent, Boolean | Unit]
      ] = js.undefined
    
    var formdata: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ FormDataEvent, Boolean | Unit]
      ] = js.undefined
    
    var fullscreenchange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var fullscreenerror: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var gotpointercapture: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var input: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var invalid: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var keydown: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var keypress: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var keyup: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ KeyboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var load: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var loadeddata: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var loadedmetadata: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var loadstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var lostpointercapture: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var mousedown: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mouseenter: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mouseleave: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mousemove: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mouseout: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mouseover: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var mouseup: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ MouseEvent, Boolean | Unit]
      ] = js.undefined
    
    var paste: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ ClipboardEvent, Boolean | Unit]
      ] = js.undefined
    
    var pause: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var play: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var playing: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var pointercancel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerdown: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerenter: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerleave: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointermove: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerout: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerover: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var pointerup: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ PointerEvent, Boolean | Unit]
      ] = js.undefined
    
    var progress: js.UndefOr[
        js.ThisFunction2[
          /* this */ Any, 
          /* view */ this.type, 
          /* event */ ProgressEvent[EventTarget], 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var ratechange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var reset: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var resize: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ UIEvent, Boolean | Unit]
      ] = js.undefined
    
    var scroll: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var securitypolicyviolation: js.UndefOr[
        js.ThisFunction2[
          /* this */ Any, 
          /* view */ this.type, 
          /* event */ SecurityPolicyViolationEvent, 
          Boolean | Unit
        ]
      ] = js.undefined
    
    var seeked: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var seeking: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var select: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var selectionchange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var selectstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var slotchange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var stalled: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var submit: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ SubmitEvent, Boolean | Unit]
      ] = js.undefined
    
    var suspend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var timeupdate: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var toggle: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var touchcancel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
      ] = js.undefined
    
    var touchend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
      ] = js.undefined
    
    var touchmove: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
      ] = js.undefined
    
    var touchstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TouchEvent, Boolean | Unit]
      ] = js.undefined
    
    var transitioncancel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
      ] = js.undefined
    
    var transitionend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
      ] = js.undefined
    
    var transitionrun: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
      ] = js.undefined
    
    var transitionstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ TransitionEvent, Boolean | Unit]
      ] = js.undefined
    
    var volumechange: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var waiting: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var webkitanimationend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var webkitanimationiteration: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var webkitanimationstart: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var webkittransitionend: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ Event, Boolean | Unit]
      ] = js.undefined
    
    var wheel: js.UndefOr[
        js.ThisFunction2[/* this */ Any, /* view */ this.type, /* event */ WheelEvent, Boolean | Unit]
      ] = js.undefined
  }
  object eventinkeyofDOMEventMapth {
    
    inline def apply(): eventinkeyofDOMEventMapth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[eventinkeyofDOMEventMapth]
    }
    
    extension [Self <: eventinkeyofDOMEventMapth](x: Self) {
      
      inline def setAbort(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ UIEvent, Boolean | Unit]
      ): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setAnimationcancel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
      ): Self = StObject.set(x, "animationcancel", value.asInstanceOf[js.Any])
      
      inline def setAnimationcancelUndefined: Self = StObject.set(x, "animationcancel", js.undefined)
      
      inline def setAnimationend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
      ): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationendUndefined: Self = StObject.set(x, "animationend", js.undefined)
      
      inline def setAnimationiteration(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
      ): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationiterationUndefined: Self = StObject.set(x, "animationiteration", js.undefined)
      
      inline def setAnimationstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ AnimationEvent, Boolean | Unit]
      ): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setAnimationstartUndefined: Self = StObject.set(x, "animationstart", js.undefined)
      
      inline def setAuxclick(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "auxclick", value.asInstanceOf[js.Any])
      
      inline def setAuxclickUndefined: Self = StObject.set(x, "auxclick", js.undefined)
      
      inline def setBeforeinput(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ InputEvent, Boolean | Unit]
      ): Self = StObject.set(x, "beforeinput", value.asInstanceOf[js.Any])
      
      inline def setBeforeinputUndefined: Self = StObject.set(x, "beforeinput", js.undefined)
      
      inline def setBlur(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
      ): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setCancel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCanplay(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "canplay", value.asInstanceOf[js.Any])
      
      inline def setCanplayUndefined: Self = StObject.set(x, "canplay", js.undefined)
      
      inline def setCanplaythrough(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "canplaythrough", value.asInstanceOf[js.Any])
      
      inline def setCanplaythroughUndefined: Self = StObject.set(x, "canplaythrough", js.undefined)
      
      inline def setChange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClick(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setClose(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCompositionend(
        value: js.ThisFunction2[
              /* this */ Any, 
              eventinkeyofDOMEventMapth, 
              /* event */ CompositionEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "compositionend", value.asInstanceOf[js.Any])
      
      inline def setCompositionendUndefined: Self = StObject.set(x, "compositionend", js.undefined)
      
      inline def setCompositionstart(
        value: js.ThisFunction2[
              /* this */ Any, 
              eventinkeyofDOMEventMapth, 
              /* event */ CompositionEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "compositionstart", value.asInstanceOf[js.Any])
      
      inline def setCompositionstartUndefined: Self = StObject.set(x, "compositionstart", js.undefined)
      
      inline def setCompositionupdate(
        value: js.ThisFunction2[
              /* this */ Any, 
              eventinkeyofDOMEventMapth, 
              /* event */ CompositionEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "compositionupdate", value.asInstanceOf[js.Any])
      
      inline def setCompositionupdateUndefined: Self = StObject.set(x, "compositionupdate", js.undefined)
      
      inline def setContextmenu(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      inline def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      inline def setCopy(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      inline def setCuechange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "cuechange", value.asInstanceOf[js.Any])
      
      inline def setCuechangeUndefined: Self = StObject.set(x, "cuechange", js.undefined)
      
      inline def setCut(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      inline def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      inline def setDblclick(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dblclick", value.asInstanceOf[js.Any])
      
      inline def setDblclickUndefined: Self = StObject.set(x, "dblclick", js.undefined)
      
      inline def setDrag(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDragend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dragend", value.asInstanceOf[js.Any])
      
      inline def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
      
      inline def setDragenter(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dragenter", value.asInstanceOf[js.Any])
      
      inline def setDragenterUndefined: Self = StObject.set(x, "dragenter", js.undefined)
      
      inline def setDragleave(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dragleave", value.asInstanceOf[js.Any])
      
      inline def setDragleaveUndefined: Self = StObject.set(x, "dragleave", js.undefined)
      
      inline def setDragover(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dragover", value.asInstanceOf[js.Any])
      
      inline def setDragoverUndefined: Self = StObject.set(x, "dragover", js.undefined)
      
      inline def setDragstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "dragstart", value.asInstanceOf[js.Any])
      
      inline def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
      
      inline def setDrop(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ DragEvent, Boolean | Unit]
      ): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setDurationchange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "durationchange", value.asInstanceOf[js.Any])
      
      inline def setDurationchangeUndefined: Self = StObject.set(x, "durationchange", js.undefined)
      
      inline def setEmptied(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "emptied", value.asInstanceOf[js.Any])
      
      inline def setEmptiedUndefined: Self = StObject.set(x, "emptied", js.undefined)
      
      inline def setEnded(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setEndedUndefined: Self = StObject.set(x, "ended", js.undefined)
      
      inline def setError(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ErrorEvent, Boolean | Unit]
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFocus(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
      ): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFocusin(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
      ): Self = StObject.set(x, "focusin", value.asInstanceOf[js.Any])
      
      inline def setFocusinUndefined: Self = StObject.set(x, "focusin", js.undefined)
      
      inline def setFocusout(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FocusEvent, Boolean | Unit]
      ): Self = StObject.set(x, "focusout", value.asInstanceOf[js.Any])
      
      inline def setFocusoutUndefined: Self = StObject.set(x, "focusout", js.undefined)
      
      inline def setFormdata(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ FormDataEvent, Boolean | Unit]
      ): Self = StObject.set(x, "formdata", value.asInstanceOf[js.Any])
      
      inline def setFormdataUndefined: Self = StObject.set(x, "formdata", js.undefined)
      
      inline def setFullscreenchange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "fullscreenchange", value.asInstanceOf[js.Any])
      
      inline def setFullscreenchangeUndefined: Self = StObject.set(x, "fullscreenchange", js.undefined)
      
      inline def setFullscreenerror(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "fullscreenerror", value.asInstanceOf[js.Any])
      
      inline def setFullscreenerrorUndefined: Self = StObject.set(x, "fullscreenerror", js.undefined)
      
      inline def setGotpointercapture(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "gotpointercapture", value.asInstanceOf[js.Any])
      
      inline def setGotpointercaptureUndefined: Self = StObject.set(x, "gotpointercapture", js.undefined)
      
      inline def setInput(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInvalid(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setKeydown(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "keydown", value.asInstanceOf[js.Any])
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setKeypress(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setKeypressUndefined: Self = StObject.set(x, "keypress", js.undefined)
      
      inline def setKeyup(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ KeyboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "keyup", value.asInstanceOf[js.Any])
      
      inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
      
      inline def setLoad(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoadeddata(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "loadeddata", value.asInstanceOf[js.Any])
      
      inline def setLoadeddataUndefined: Self = StObject.set(x, "loadeddata", js.undefined)
      
      inline def setLoadedmetadata(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "loadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setLoadedmetadataUndefined: Self = StObject.set(x, "loadedmetadata", js.undefined)
      
      inline def setLoadstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "loadstart", value.asInstanceOf[js.Any])
      
      inline def setLoadstartUndefined: Self = StObject.set(x, "loadstart", js.undefined)
      
      inline def setLostpointercapture(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "lostpointercapture", value.asInstanceOf[js.Any])
      
      inline def setLostpointercaptureUndefined: Self = StObject.set(x, "lostpointercapture", js.undefined)
      
      inline def setMousedown(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mousedown", value.asInstanceOf[js.Any])
      
      inline def setMousedownUndefined: Self = StObject.set(x, "mousedown", js.undefined)
      
      inline def setMouseenter(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mouseenter", value.asInstanceOf[js.Any])
      
      inline def setMouseenterUndefined: Self = StObject.set(x, "mouseenter", js.undefined)
      
      inline def setMouseleave(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mouseleave", value.asInstanceOf[js.Any])
      
      inline def setMouseleaveUndefined: Self = StObject.set(x, "mouseleave", js.undefined)
      
      inline def setMousemove(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
      
      inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
      
      inline def setMouseout(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
      
      inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
      
      inline def setMouseover(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
      
      inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
      
      inline def setMouseup(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ MouseEvent, Boolean | Unit]
      ): Self = StObject.set(x, "mouseup", value.asInstanceOf[js.Any])
      
      inline def setMouseupUndefined: Self = StObject.set(x, "mouseup", js.undefined)
      
      inline def setPaste(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ ClipboardEvent, Boolean | Unit]
      ): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setPause(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPlay(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setPlaying(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
      
      inline def setPlayingUndefined: Self = StObject.set(x, "playing", js.undefined)
      
      inline def setPointercancel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointercancel", value.asInstanceOf[js.Any])
      
      inline def setPointercancelUndefined: Self = StObject.set(x, "pointercancel", js.undefined)
      
      inline def setPointerdown(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerdown", value.asInstanceOf[js.Any])
      
      inline def setPointerdownUndefined: Self = StObject.set(x, "pointerdown", js.undefined)
      
      inline def setPointerenter(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerenter", value.asInstanceOf[js.Any])
      
      inline def setPointerenterUndefined: Self = StObject.set(x, "pointerenter", js.undefined)
      
      inline def setPointerleave(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerleave", value.asInstanceOf[js.Any])
      
      inline def setPointerleaveUndefined: Self = StObject.set(x, "pointerleave", js.undefined)
      
      inline def setPointermove(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointermove", value.asInstanceOf[js.Any])
      
      inline def setPointermoveUndefined: Self = StObject.set(x, "pointermove", js.undefined)
      
      inline def setPointerout(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerout", value.asInstanceOf[js.Any])
      
      inline def setPointeroutUndefined: Self = StObject.set(x, "pointerout", js.undefined)
      
      inline def setPointerover(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerover", value.asInstanceOf[js.Any])
      
      inline def setPointeroverUndefined: Self = StObject.set(x, "pointerover", js.undefined)
      
      inline def setPointerup(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ PointerEvent, Boolean | Unit]
      ): Self = StObject.set(x, "pointerup", value.asInstanceOf[js.Any])
      
      inline def setPointerupUndefined: Self = StObject.set(x, "pointerup", js.undefined)
      
      inline def setProgress(
        value: js.ThisFunction2[
              /* this */ Any, 
              eventinkeyofDOMEventMapth, 
              /* event */ ProgressEvent[EventTarget], 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setRatechange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "ratechange", value.asInstanceOf[js.Any])
      
      inline def setRatechangeUndefined: Self = StObject.set(x, "ratechange", js.undefined)
      
      inline def setReset(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setResize(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ UIEvent, Boolean | Unit]
      ): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setScroll(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSecuritypolicyviolation(
        value: js.ThisFunction2[
              /* this */ Any, 
              eventinkeyofDOMEventMapth, 
              /* event */ SecurityPolicyViolationEvent, 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "securitypolicyviolation", value.asInstanceOf[js.Any])
      
      inline def setSecuritypolicyviolationUndefined: Self = StObject.set(x, "securitypolicyviolation", js.undefined)
      
      inline def setSeeked(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "seeked", value.asInstanceOf[js.Any])
      
      inline def setSeekedUndefined: Self = StObject.set(x, "seeked", js.undefined)
      
      inline def setSeeking(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "seeking", value.asInstanceOf[js.Any])
      
      inline def setSeekingUndefined: Self = StObject.set(x, "seeking", js.undefined)
      
      inline def setSelect(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectionchange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "selectionchange", value.asInstanceOf[js.Any])
      
      inline def setSelectionchangeUndefined: Self = StObject.set(x, "selectionchange", js.undefined)
      
      inline def setSelectstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "selectstart", value.asInstanceOf[js.Any])
      
      inline def setSelectstartUndefined: Self = StObject.set(x, "selectstart", js.undefined)
      
      inline def setSlotchange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "slotchange", value.asInstanceOf[js.Any])
      
      inline def setSlotchangeUndefined: Self = StObject.set(x, "slotchange", js.undefined)
      
      inline def setStalled(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "stalled", value.asInstanceOf[js.Any])
      
      inline def setStalledUndefined: Self = StObject.set(x, "stalled", js.undefined)
      
      inline def setSubmit(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ SubmitEvent, Boolean | Unit]
      ): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setSuspend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      
      inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      
      inline def setTimeupdate(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "timeupdate", value.asInstanceOf[js.Any])
      
      inline def setTimeupdateUndefined: Self = StObject.set(x, "timeupdate", js.undefined)
      
      inline def setToggle(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
      
      inline def setTouchcancel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
      ): Self = StObject.set(x, "touchcancel", value.asInstanceOf[js.Any])
      
      inline def setTouchcancelUndefined: Self = StObject.set(x, "touchcancel", js.undefined)
      
      inline def setTouchend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
      ): Self = StObject.set(x, "touchend", value.asInstanceOf[js.Any])
      
      inline def setTouchendUndefined: Self = StObject.set(x, "touchend", js.undefined)
      
      inline def setTouchmove(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
      ): Self = StObject.set(x, "touchmove", value.asInstanceOf[js.Any])
      
      inline def setTouchmoveUndefined: Self = StObject.set(x, "touchmove", js.undefined)
      
      inline def setTouchstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TouchEvent, Boolean | Unit]
      ): Self = StObject.set(x, "touchstart", value.asInstanceOf[js.Any])
      
      inline def setTouchstartUndefined: Self = StObject.set(x, "touchstart", js.undefined)
      
      inline def setTransitioncancel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
      ): Self = StObject.set(x, "transitioncancel", value.asInstanceOf[js.Any])
      
      inline def setTransitioncancelUndefined: Self = StObject.set(x, "transitioncancel", js.undefined)
      
      inline def setTransitionend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
      ): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
      
      inline def setTransitionendUndefined: Self = StObject.set(x, "transitionend", js.undefined)
      
      inline def setTransitionrun(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
      ): Self = StObject.set(x, "transitionrun", value.asInstanceOf[js.Any])
      
      inline def setTransitionrunUndefined: Self = StObject.set(x, "transitionrun", js.undefined)
      
      inline def setTransitionstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ TransitionEvent, Boolean | Unit]
      ): Self = StObject.set(x, "transitionstart", value.asInstanceOf[js.Any])
      
      inline def setTransitionstartUndefined: Self = StObject.set(x, "transitionstart", js.undefined)
      
      inline def setVolumechange(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "volumechange", value.asInstanceOf[js.Any])
      
      inline def setVolumechangeUndefined: Self = StObject.set(x, "volumechange", js.undefined)
      
      inline def setWaiting(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
      
      inline def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
      
      inline def setWebkitanimationend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "webkitanimationend", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationendUndefined: Self = StObject.set(x, "webkitanimationend", js.undefined)
      
      inline def setWebkitanimationiteration(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "webkitanimationiteration", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationiterationUndefined: Self = StObject.set(x, "webkitanimationiteration", js.undefined)
      
      inline def setWebkitanimationstart(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "webkitanimationstart", value.asInstanceOf[js.Any])
      
      inline def setWebkitanimationstartUndefined: Self = StObject.set(x, "webkitanimationstart", js.undefined)
      
      inline def setWebkittransitionend(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ Event, Boolean | Unit]
      ): Self = StObject.set(x, "webkittransitionend", value.asInstanceOf[js.Any])
      
      inline def setWebkittransitionendUndefined: Self = StObject.set(x, "webkittransitionend", js.undefined)
      
      inline def setWheel(
        value: js.ThisFunction2[/* this */ Any, eventinkeyofDOMEventMapth, /* event */ WheelEvent, Boolean | Unit]
      ): Self = StObject.set(x, "wheel", value.asInstanceOf[js.Any])
      
      inline def setWheelUndefined: Self = StObject.set(x, "wheel", js.undefined)
    }
  }
}
