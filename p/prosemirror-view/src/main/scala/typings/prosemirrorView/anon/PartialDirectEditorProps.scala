package typings.prosemirrorView.anon

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.DOMParser
import typings.prosemirrorModel.mod.DOMSerializer
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.mod.DecorationSource
import typings.prosemirrorView.mod.MarkViewConstructor
import typings.prosemirrorView.mod.NodeViewConstructor
import typings.std.ClipboardEvent
import typings.std.DragEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Plugin
import typings.std.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<prosemirror-view.prosemirror-view.DirectEditorProps> */
trait PartialDirectEditorProps extends StObject {
  
  var attributes: js.UndefOr[
    StringDictionary[String] | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
      StringDictionary[String]
    ])
  ] = js.undefined
  
  var clipboardParser: js.UndefOr[DOMParser] = js.undefined
  
  var clipboardSerializer: js.UndefOr[DOMSerializer] = js.undefined
  
  var clipboardTextParser: js.UndefOr[
    js.ThisFunction3[
      /* this */ Any, 
      /* text */ String, 
      /* $context */ ResolvedPos, 
      /* plain */ Boolean, 
      Slice
    ]
  ] = js.undefined
  
  var clipboardTextSerializer: js.UndefOr[js.ThisFunction1[/* this */ Any, /* content */ Slice, String]] = js.undefined
  
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
    js.ThisFunction1[
      /* this */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
      js.UndefOr[DecorationSource | Null]
    ]
  ] = js.undefined
  
  var dispatchTransaction: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ /* tr */ Any, 
      Unit
    ]
  ] = js.undefined
  
  var domParser: js.UndefOr[DOMParser] = js.undefined
  
  var editable: js.UndefOr[
    js.ThisFunction1[
      /* this */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
      Boolean
    ]
  ] = js.undefined
  
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
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  var scrollMargin: js.UndefOr[Double | Bottom] = js.undefined
  
  var scrollThreshold: js.UndefOr[Double | Bottom] = js.undefined
  
  var state: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ Any
  ] = js.undefined
  
  var transformCopied: js.UndefOr[js.ThisFunction1[/* this */ Any, /* slice */ Slice, Slice]] = js.undefined
  
  var transformPasted: js.UndefOr[js.ThisFunction1[/* this */ Any, /* slice */ Slice, Slice]] = js.undefined
  
  var transformPastedHTML: js.UndefOr[js.ThisFunction1[/* this */ Any, /* html */ String, String]] = js.undefined
  
  var transformPastedText: js.UndefOr[js.ThisFunction2[/* this */ Any, /* text */ String, /* plain */ Boolean, String]] = js.undefined
}
object PartialDirectEditorProps {
  
  inline def apply(): PartialDirectEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDirectEditorProps]
  }
  
  extension [Self <: PartialDirectEditorProps](x: Self) {
    
    inline def setAttributes(
      value: StringDictionary[String] | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
          StringDictionary[String]
        ])
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any => StringDictionary[String]
    ): Self = StObject.set(x, "attributes", js.Any.fromFunction1(value))
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setClipboardParser(value: DOMParser): Self = StObject.set(x, "clipboardParser", value.asInstanceOf[js.Any])
    
    inline def setClipboardParserUndefined: Self = StObject.set(x, "clipboardParser", js.undefined)
    
    inline def setClipboardSerializer(value: DOMSerializer): Self = StObject.set(x, "clipboardSerializer", value.asInstanceOf[js.Any])
    
    inline def setClipboardSerializerUndefined: Self = StObject.set(x, "clipboardSerializer", js.undefined)
    
    inline def setClipboardTextParser(
      value: js.ThisFunction3[
          /* this */ Any, 
          /* text */ String, 
          /* $context */ ResolvedPos, 
          /* plain */ Boolean, 
          Slice
        ]
    ): Self = StObject.set(x, "clipboardTextParser", value.asInstanceOf[js.Any])
    
    inline def setClipboardTextParserUndefined: Self = StObject.set(x, "clipboardTextParser", js.undefined)
    
    inline def setClipboardTextSerializer(value: js.ThisFunction1[/* this */ Any, /* content */ Slice, String]): Self = StObject.set(x, "clipboardTextSerializer", value.asInstanceOf[js.Any])
    
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
      value: js.ThisFunction1[
          /* this */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
          js.UndefOr[DecorationSource | Null]
        ]
    ): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    inline def setDecorationsUndefined: Self = StObject.set(x, "decorations", js.undefined)
    
    inline def setDispatchTransaction(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction */ /* tr */ Any => Unit
    ): Self = StObject.set(x, "dispatchTransaction", js.Any.fromFunction1(value))
    
    inline def setDispatchTransactionUndefined: Self = StObject.set(x, "dispatchTransaction", js.undefined)
    
    inline def setDomParser(value: DOMParser): Self = StObject.set(x, "domParser", value.asInstanceOf[js.Any])
    
    inline def setDomParserUndefined: Self = StObject.set(x, "domParser", js.undefined)
    
    inline def setEditable(
      value: js.ThisFunction1[
          /* this */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ /* state */ Any, 
          Boolean
        ]
    ): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
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
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setScrollMargin(value: Double | Bottom): Self = StObject.set(x, "scrollMargin", value.asInstanceOf[js.Any])
    
    inline def setScrollMarginUndefined: Self = StObject.set(x, "scrollMargin", js.undefined)
    
    inline def setScrollThreshold(value: Double | Bottom): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
    
    inline def setState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState */ Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTransformCopied(value: js.ThisFunction1[/* this */ Any, /* slice */ Slice, Slice]): Self = StObject.set(x, "transformCopied", value.asInstanceOf[js.Any])
    
    inline def setTransformCopiedUndefined: Self = StObject.set(x, "transformCopied", js.undefined)
    
    inline def setTransformPasted(value: js.ThisFunction1[/* this */ Any, /* slice */ Slice, Slice]): Self = StObject.set(x, "transformPasted", value.asInstanceOf[js.Any])
    
    inline def setTransformPastedHTML(value: js.ThisFunction1[/* this */ Any, /* html */ String, String]): Self = StObject.set(x, "transformPastedHTML", value.asInstanceOf[js.Any])
    
    inline def setTransformPastedHTMLUndefined: Self = StObject.set(x, "transformPastedHTML", js.undefined)
    
    inline def setTransformPastedText(value: js.ThisFunction2[/* this */ Any, /* text */ String, /* plain */ Boolean, String]): Self = StObject.set(x, "transformPastedText", value.asInstanceOf[js.Any])
    
    inline def setTransformPastedTextUndefined: Self = StObject.set(x, "transformPastedText", js.undefined)
    
    inline def setTransformPastedUndefined: Self = StObject.set(x, "transformPasted", js.undefined)
  }
}
