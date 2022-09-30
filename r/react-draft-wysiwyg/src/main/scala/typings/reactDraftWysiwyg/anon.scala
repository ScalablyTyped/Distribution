package typings.reactDraftWysiwyg

import typings.draftJs.mod.Draft.Model.Constants.DraftEditorCommand
import typings.draftJs.mod.Draft.Model.Constants.DraftHandleValue
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactDraftWysiwyg.mod.ContentBlock
import typings.reactDraftWysiwyg.mod.EditorState
import typings.reactDraftWysiwyg.mod.RawDraftContentState
import typings.reactDraftWysiwyg.mod.SyntheticEvent
import typings.reactDraftWysiwyg.mod.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-draft-wysiwyg.react-draft-wysiwyg.EditorProps> */
  trait ReadonlyEditorProps extends StObject {
    
    val ariaActiveDescendantID: js.UndefOr[String] = js.undefined
    
    val ariaAutoComplete: js.UndefOr[String] = js.undefined
    
    val ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    val ariaExpanded: js.UndefOr[String] = js.undefined
    
    val ariaHasPopup: js.UndefOr[String] = js.undefined
    
    val ariaLabel: js.UndefOr[String] = js.undefined
    
    val ariaOwneeID: js.UndefOr[String] = js.undefined
    
    val contentState: js.UndefOr[RawDraftContentState] = js.undefined
    
    val customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, Any]] = js.undefined
    
    val customDecorators: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    val customStyleMap: js.UndefOr[js.Object] = js.undefined
    
    val defaultContentState: js.UndefOr[RawDraftContentState] = js.undefined
    
    val defaultEditorState: js.UndefOr[EditorState] = js.undefined
    
    val editorClassName: js.UndefOr[String] = js.undefined
    
    val editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.undefined
    
    val editorState: js.UndefOr[EditorState] = js.undefined
    
    val editorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    val handleKeyCommand: js.UndefOr[
        js.Function3[
          /* command */ DraftEditorCommand, 
          /* editorState */ EditorState, 
          /* eventTimeStamp */ Double, 
          DraftHandleValue
        ]
      ] = js.undefined
    
    val handlePastedText: js.UndefOr[
        js.Function4[
          /* text */ String, 
          /* html */ String, 
          /* editorState */ EditorState, 
          /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
          Boolean
        ]
      ] = js.undefined
    
    val handleReturn: js.UndefOr[
        js.Function2[/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState, Boolean]
      ] = js.undefined
    
    val hashtag: js.UndefOr[js.Object] = js.undefined
    
    val initialContentState: js.UndefOr[RawDraftContentState] = js.undefined
    
    val locale: js.UndefOr[String] = js.undefined
    
    val localization: js.UndefOr[js.Object] = js.undefined
    
    val mention: js.UndefOr[js.Object] = js.undefined
    
    val onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.undefined
    
    val onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.undefined
    
    val onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.undefined
    
    val onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.undefined
    
    val onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.undefined
    
    val onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, Unit]] = js.undefined
    
    val placeholder: js.UndefOr[String] = js.undefined
    
    val readOnly: js.UndefOr[Boolean] = js.undefined
    
    val spellCheck: js.UndefOr[Boolean] = js.undefined
    
    val stripPastedStyles: js.UndefOr[Boolean] = js.undefined
    
    val tabIndex: js.UndefOr[Double] = js.undefined
    
    val textAlignment: js.UndefOr[String] = js.undefined
    
    val toolbar: js.UndefOr[js.Object] = js.undefined
    
    val toolbarClassName: js.UndefOr[String] = js.undefined
    
    val toolbarCustomButtons: js.UndefOr[js.Array[ReactElement]] = js.undefined
    
    val toolbarHidden: js.UndefOr[Boolean] = js.undefined
    
    val toolbarOnFocus: js.UndefOr[Boolean] = js.undefined
    
    val toolbarStyle: js.UndefOr[js.Object] = js.undefined
    
    val uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.undefined
    
    val webDriverTestID: js.UndefOr[String] = js.undefined
    
    val wrapperClassName: js.UndefOr[String] = js.undefined
    
    val wrapperId: js.UndefOr[Double] = js.undefined
    
    val wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReadonlyEditorProps {
    
    inline def apply(): ReadonlyEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyEditorProps]
    }
    
    extension [Self <: ReadonlyEditorProps](x: Self) {
      
      inline def setAriaActiveDescendantID(value: String): Self = StObject.set(x, "ariaActiveDescendantID", value.asInstanceOf[js.Any])
      
      inline def setAriaActiveDescendantIDUndefined: Self = StObject.set(x, "ariaActiveDescendantID", js.undefined)
      
      inline def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaExpanded(value: String): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaOwneeID(value: String): Self = StObject.set(x, "ariaOwneeID", value.asInstanceOf[js.Any])
      
      inline def setAriaOwneeIDUndefined: Self = StObject.set(x, "ariaOwneeID", js.undefined)
      
      inline def setContentState(value: RawDraftContentState): Self = StObject.set(x, "contentState", value.asInstanceOf[js.Any])
      
      inline def setContentStateUndefined: Self = StObject.set(x, "contentState", js.undefined)
      
      inline def setCustomBlockRenderFunc(value: /* block */ ContentBlock => Any): Self = StObject.set(x, "customBlockRenderFunc", js.Any.fromFunction1(value))
      
      inline def setCustomBlockRenderFuncUndefined: Self = StObject.set(x, "customBlockRenderFunc", js.undefined)
      
      inline def setCustomDecorators(value: js.Array[js.Object]): Self = StObject.set(x, "customDecorators", value.asInstanceOf[js.Any])
      
      inline def setCustomDecoratorsUndefined: Self = StObject.set(x, "customDecorators", js.undefined)
      
      inline def setCustomDecoratorsVarargs(value: js.Object*): Self = StObject.set(x, "customDecorators", js.Array(value*))
      
      inline def setCustomStyleMap(value: js.Object): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
      
      inline def setDefaultContentState(value: RawDraftContentState): Self = StObject.set(x, "defaultContentState", value.asInstanceOf[js.Any])
      
      inline def setDefaultContentStateUndefined: Self = StObject.set(x, "defaultContentState", js.undefined)
      
      inline def setDefaultEditorState(value: EditorState): Self = StObject.set(x, "defaultEditorState", value.asInstanceOf[js.Any])
      
      inline def setDefaultEditorStateUndefined: Self = StObject.set(x, "defaultEditorState", js.undefined)
      
      inline def setEditorClassName(value: String): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      inline def setEditorClassNameUndefined: Self = StObject.set(x, "editorClassName", js.undefined)
      
      inline def setEditorRef(value: /* ref */ js.Object => Unit): Self = StObject.set(x, "editorRef", js.Any.fromFunction1(value))
      
      inline def setEditorRefUndefined: Self = StObject.set(x, "editorRef", js.undefined)
      
      inline def setEditorState(value: EditorState): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
      
      inline def setEditorStateUndefined: Self = StObject.set(x, "editorState", js.undefined)
      
      inline def setEditorStyle(value: CSSProperties): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
      
      inline def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
      
      inline def setHandleKeyCommand(
        value: (/* command */ DraftEditorCommand, /* editorState */ EditorState, /* eventTimeStamp */ Double) => DraftHandleValue
      ): Self = StObject.set(x, "handleKeyCommand", js.Any.fromFunction3(value))
      
      inline def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
      
      inline def setHandlePastedText(
        value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
      ): Self = StObject.set(x, "handlePastedText", js.Any.fromFunction4(value))
      
      inline def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
      
      inline def setHandleReturn(value: (/* e */ SyntheticKeyboardEvent, /* editorState */ EditorState) => Boolean): Self = StObject.set(x, "handleReturn", js.Any.fromFunction2(value))
      
      inline def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      inline def setHashtag(value: js.Object): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setInitialContentState(value: RawDraftContentState): Self = StObject.set(x, "initialContentState", value.asInstanceOf[js.Any])
      
      inline def setInitialContentStateUndefined: Self = StObject.set(x, "initialContentState", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocalization(value: js.Object): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
      
      inline def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
      
      inline def setMention(value: js.Object): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setOnBlur(value: /* event */ SyntheticEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* contentState */ RawDraftContentState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnContentStateChange(value: /* contentState */ RawDraftContentState => Unit): Self = StObject.set(x, "onContentStateChange", js.Any.fromFunction1(value))
      
      inline def setOnContentStateChangeUndefined: Self = StObject.set(x, "onContentStateChange", js.undefined)
      
      inline def setOnEditorStateChange(value: /* editorState */ EditorState => Unit): Self = StObject.set(x, "onEditorStateChange", js.Any.fromFunction1(value))
      
      inline def setOnEditorStateChangeUndefined: Self = StObject.set(x, "onEditorStateChange", js.undefined)
      
      inline def setOnFocus(value: /* event */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnTab(value: /* event */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
      
      inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      inline def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
      
      inline def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTextAlignment(value: String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setToolbar(value: js.Object): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarClassName(value: String): Self = StObject.set(x, "toolbarClassName", value.asInstanceOf[js.Any])
      
      inline def setToolbarClassNameUndefined: Self = StObject.set(x, "toolbarClassName", js.undefined)
      
      inline def setToolbarCustomButtons(value: js.Array[ReactElement]): Self = StObject.set(x, "toolbarCustomButtons", value.asInstanceOf[js.Any])
      
      inline def setToolbarCustomButtonsUndefined: Self = StObject.set(x, "toolbarCustomButtons", js.undefined)
      
      inline def setToolbarCustomButtonsVarargs(value: ReactElement*): Self = StObject.set(x, "toolbarCustomButtons", js.Array(value*))
      
      inline def setToolbarHidden(value: Boolean): Self = StObject.set(x, "toolbarHidden", value.asInstanceOf[js.Any])
      
      inline def setToolbarHiddenUndefined: Self = StObject.set(x, "toolbarHidden", js.undefined)
      
      inline def setToolbarOnFocus(value: Boolean): Self = StObject.set(x, "toolbarOnFocus", value.asInstanceOf[js.Any])
      
      inline def setToolbarOnFocusUndefined: Self = StObject.set(x, "toolbarOnFocus", js.undefined)
      
      inline def setToolbarStyle(value: js.Object): Self = StObject.set(x, "toolbarStyle", value.asInstanceOf[js.Any])
      
      inline def setToolbarStyleUndefined: Self = StObject.set(x, "toolbarStyle", js.undefined)
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setUploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): Self = StObject.set(x, "uploadCallback", js.Any.fromFunction1(value))
      
      inline def setUploadCallbackUndefined: Self = StObject.set(x, "uploadCallback", js.undefined)
      
      inline def setWebDriverTestID(value: String): Self = StObject.set(x, "webDriverTestID", value.asInstanceOf[js.Any])
      
      inline def setWebDriverTestIDUndefined: Self = StObject.set(x, "webDriverTestID", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      inline def setWrapperId(value: Double): Self = StObject.set(x, "wrapperId", value.asInstanceOf[js.Any])
      
      inline def setWrapperIdUndefined: Self = StObject.set(x, "wrapperId", js.undefined)
      
      inline def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
