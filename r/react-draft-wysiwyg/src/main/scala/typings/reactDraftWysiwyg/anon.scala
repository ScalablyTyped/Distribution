package typings.reactDraftWysiwyg

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactDraftWysiwyg.mod.ContentBlock
import typings.reactDraftWysiwyg.mod.EditorState
import typings.reactDraftWysiwyg.mod.RawDraftContentState
import typings.reactDraftWysiwyg.mod.SyntheticEvent
import typings.reactDraftWysiwyg.mod.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-draft-wysiwyg.react-draft-wysiwyg.EditorProps> */
  @js.native
  trait ReadonlyEditorProps extends StObject {
    
    val ariaActiveDescendantID: js.UndefOr[String] = js.native
    
    val ariaAutoComplete: js.UndefOr[String] = js.native
    
    val ariaDescribedBy: js.UndefOr[String] = js.native
    
    val ariaExpanded: js.UndefOr[String] = js.native
    
    val ariaHasPopup: js.UndefOr[String] = js.native
    
    val ariaLabel: js.UndefOr[String] = js.native
    
    val ariaOwneeID: js.UndefOr[String] = js.native
    
    val contentState: js.UndefOr[RawDraftContentState] = js.native
    
    val customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.native
    
    val customDecorators: js.UndefOr[js.Array[js.Object]] = js.native
    
    val customStyleMap: js.UndefOr[js.Object] = js.native
    
    val defaultContentState: js.UndefOr[RawDraftContentState] = js.native
    
    val defaultEditorState: js.UndefOr[EditorState] = js.native
    
    val editorClassName: js.UndefOr[String] = js.native
    
    val editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.native
    
    val editorState: js.UndefOr[EditorState] = js.native
    
    val editorStyle: js.UndefOr[CSSProperties] = js.native
    
    val handlePastedText: js.UndefOr[
        js.Function4[
          /* text */ String, 
          /* html */ String, 
          /* editorState */ EditorState, 
          /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
          Boolean
        ]
      ] = js.native
    
    val hashtag: js.UndefOr[js.Object] = js.native
    
    val initialContentState: js.UndefOr[RawDraftContentState] = js.native
    
    val locale: js.UndefOr[String] = js.native
    
    val localization: js.UndefOr[js.Object] = js.native
    
    val mention: js.UndefOr[js.Object] = js.native
    
    val onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.native
    
    val onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
    
    val onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.native
    
    val onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.native
    
    val onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.native
    
    val onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, Unit]] = js.native
    
    val placeholder: js.UndefOr[String] = js.native
    
    val readOnly: js.UndefOr[Boolean] = js.native
    
    val spellCheck: js.UndefOr[Boolean] = js.native
    
    val stripPastedStyles: js.UndefOr[Boolean] = js.native
    
    val tabIndex: js.UndefOr[Double] = js.native
    
    val textAlignment: js.UndefOr[String] = js.native
    
    val toolbar: js.UndefOr[js.Object] = js.native
    
    val toolbarClassName: js.UndefOr[String] = js.native
    
    val toolbarCustomButtons: js.UndefOr[js.Array[ReactElement]] = js.native
    
    val toolbarHidden: js.UndefOr[Boolean] = js.native
    
    val toolbarOnFocus: js.UndefOr[Boolean] = js.native
    
    val toolbarStyle: js.UndefOr[js.Object] = js.native
    
    val uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.native
    
    val wrapperClassName: js.UndefOr[String] = js.native
    
    val wrapperId: js.UndefOr[Double] = js.native
    
    val wrapperStyle: js.UndefOr[CSSProperties] = js.native
  }
  object ReadonlyEditorProps {
    
    @scala.inline
    def apply(): ReadonlyEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyEditorProps]
    }
    
    @scala.inline
    implicit class ReadonlyEditorPropsMutableBuilder[Self <: ReadonlyEditorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaActiveDescendantID(value: String): Self = StObject.set(x, "ariaActiveDescendantID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaActiveDescendantIDUndefined: Self = StObject.set(x, "ariaActiveDescendantID", js.undefined)
      
      @scala.inline
      def setAriaAutoComplete(value: String): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaExpanded(value: String): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      @scala.inline
      def setAriaHasPopup(value: String): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaOwneeID(value: String): Self = StObject.set(x, "ariaOwneeID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaOwneeIDUndefined: Self = StObject.set(x, "ariaOwneeID", js.undefined)
      
      @scala.inline
      def setContentState(value: RawDraftContentState): Self = StObject.set(x, "contentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStateUndefined: Self = StObject.set(x, "contentState", js.undefined)
      
      @scala.inline
      def setCustomBlockRenderFunc(value: /* block */ ContentBlock => _): Self = StObject.set(x, "customBlockRenderFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomBlockRenderFuncUndefined: Self = StObject.set(x, "customBlockRenderFunc", js.undefined)
      
      @scala.inline
      def setCustomDecorators(value: js.Array[js.Object]): Self = StObject.set(x, "customDecorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDecoratorsUndefined: Self = StObject.set(x, "customDecorators", js.undefined)
      
      @scala.inline
      def setCustomDecoratorsVarargs(value: js.Object*): Self = StObject.set(x, "customDecorators", js.Array(value :_*))
      
      @scala.inline
      def setCustomStyleMap(value: js.Object): Self = StObject.set(x, "customStyleMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStyleMapUndefined: Self = StObject.set(x, "customStyleMap", js.undefined)
      
      @scala.inline
      def setDefaultContentState(value: RawDraftContentState): Self = StObject.set(x, "defaultContentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultContentStateUndefined: Self = StObject.set(x, "defaultContentState", js.undefined)
      
      @scala.inline
      def setDefaultEditorState(value: EditorState): Self = StObject.set(x, "defaultEditorState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultEditorStateUndefined: Self = StObject.set(x, "defaultEditorState", js.undefined)
      
      @scala.inline
      def setEditorClassName(value: String): Self = StObject.set(x, "editorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorClassNameUndefined: Self = StObject.set(x, "editorClassName", js.undefined)
      
      @scala.inline
      def setEditorRef(value: /* ref */ js.Object => Unit): Self = StObject.set(x, "editorRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorRefUndefined: Self = StObject.set(x, "editorRef", js.undefined)
      
      @scala.inline
      def setEditorState(value: EditorState): Self = StObject.set(x, "editorState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorStateUndefined: Self = StObject.set(x, "editorState", js.undefined)
      
      @scala.inline
      def setEditorStyle(value: CSSProperties): Self = StObject.set(x, "editorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditorStyleUndefined: Self = StObject.set(x, "editorStyle", js.undefined)
      
      @scala.inline
      def setHandlePastedText(
        value: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean
      ): Self = StObject.set(x, "handlePastedText", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
      
      @scala.inline
      def setHashtag(value: js.Object): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setInitialContentState(value: RawDraftContentState): Self = StObject.set(x, "initialContentState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialContentStateUndefined: Self = StObject.set(x, "initialContentState", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLocalization(value: js.Object): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
      
      @scala.inline
      def setMention(value: js.Object): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* event */ SyntheticEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* contentState */ RawDraftContentState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnContentStateChange(value: /* contentState */ RawDraftContentState => Unit): Self = StObject.set(x, "onContentStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentStateChangeUndefined: Self = StObject.set(x, "onContentStateChange", js.undefined)
      
      @scala.inline
      def setOnEditorStateChange(value: /* editorState */ EditorState => Unit): Self = StObject.set(x, "onEditorStateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEditorStateChangeUndefined: Self = StObject.set(x, "onEditorStateChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* event */ SyntheticEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnTab(value: /* event */ SyntheticKeyboardEvent => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Boolean): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTextAlignment(value: String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setToolbar(value: js.Object): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarClassName(value: String): Self = StObject.set(x, "toolbarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarClassNameUndefined: Self = StObject.set(x, "toolbarClassName", js.undefined)
      
      @scala.inline
      def setToolbarCustomButtons(value: js.Array[ReactElement]): Self = StObject.set(x, "toolbarCustomButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarCustomButtonsUndefined: Self = StObject.set(x, "toolbarCustomButtons", js.undefined)
      
      @scala.inline
      def setToolbarCustomButtonsVarargs(value: ReactElement*): Self = StObject.set(x, "toolbarCustomButtons", js.Array(value :_*))
      
      @scala.inline
      def setToolbarHidden(value: Boolean): Self = StObject.set(x, "toolbarHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarHiddenUndefined: Self = StObject.set(x, "toolbarHidden", js.undefined)
      
      @scala.inline
      def setToolbarOnFocus(value: Boolean): Self = StObject.set(x, "toolbarOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarOnFocusUndefined: Self = StObject.set(x, "toolbarOnFocus", js.undefined)
      
      @scala.inline
      def setToolbarStyle(value: js.Object): Self = StObject.set(x, "toolbarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarStyleUndefined: Self = StObject.set(x, "toolbarStyle", js.undefined)
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      @scala.inline
      def setUploadCallback(value: /* file */ js.Object => js.Promise[js.Object]): Self = StObject.set(x, "uploadCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUploadCallbackUndefined: Self = StObject.set(x, "uploadCallback", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      @scala.inline
      def setWrapperId(value: Double): Self = StObject.set(x, "wrapperId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperIdUndefined: Self = StObject.set(x, "wrapperId", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
