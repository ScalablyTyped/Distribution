package typings.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ACTIONS extends StObject
@JSImport("react-native-zss-rich-text-editor", "ACTIONS")
@js.native
object ACTIONS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACTIONS & String] = js.native
  
  @js.native
  sealed trait alignCenter
    extends StObject
       with ACTIONS
  /* "justifyCenter" */ val alignCenter: typings.reactNativeZssRichTextEditor.mod.ACTIONS.alignCenter & String = js.native
  
  @js.native
  sealed trait alignFull
    extends StObject
       with ACTIONS
  /* "justifyFull" */ val alignFull: typings.reactNativeZssRichTextEditor.mod.ACTIONS.alignFull & String = js.native
  
  @js.native
  sealed trait alignLeft
    extends StObject
       with ACTIONS
  /* "justifyLeft" */ val alignLeft: typings.reactNativeZssRichTextEditor.mod.ACTIONS.alignLeft & String = js.native
  
  @js.native
  sealed trait alignRight
    extends StObject
       with ACTIONS
  /* "justifyRight" */ val alignRight: typings.reactNativeZssRichTextEditor.mod.ACTIONS.alignRight & String = js.native
  
  @js.native
  sealed trait blurContentEditor
    extends StObject
       with ACTIONS
  /* "BLUR_CONTENT_EDITOR" */ val blurContentEditor: typings.reactNativeZssRichTextEditor.mod.ACTIONS.blurContentEditor & String = js.native
  
  @js.native
  sealed trait blurTitleEditor
    extends StObject
       with ACTIONS
  /* "BLUR_TITLE_EDITOR" */ val blurTitleEditor: typings.reactNativeZssRichTextEditor.mod.ACTIONS.blurTitleEditor & String = js.native
  
  @js.native
  sealed trait enableOnChange
    extends StObject
       with ACTIONS
  /* "ENABLE_ON_CHANGE" */ val enableOnChange: typings.reactNativeZssRichTextEditor.mod.ACTIONS.enableOnChange & String = js.native
  
  @js.native
  sealed trait focusContent
    extends StObject
       with ACTIONS
  /* "FOCUS_CONTENT" */ val focusContent: typings.reactNativeZssRichTextEditor.mod.ACTIONS.focusContent & String = js.native
  
  @js.native
  sealed trait focusTitle
    extends StObject
       with ACTIONS
  /* "FOCUS_TITLE" */ val focusTitle: typings.reactNativeZssRichTextEditor.mod.ACTIONS.focusTitle & String = js.native
  
  @js.native
  sealed trait getContentHtml
    extends StObject
       with ACTIONS
  /* "GET_CONTENT_HTML" */ val getContentHtml: typings.reactNativeZssRichTextEditor.mod.ACTIONS.getContentHtml & String = js.native
  
  @js.native
  sealed trait getSelectedText
    extends StObject
       with ACTIONS
  /* "GET_SELECTED_TEXT" */ val getSelectedText: typings.reactNativeZssRichTextEditor.mod.ACTIONS.getSelectedText & String = js.native
  
  @js.native
  sealed trait getTitleHtml
    extends StObject
       with ACTIONS
  /* "GET_TITLE_HTML" */ val getTitleHtml: typings.reactNativeZssRichTextEditor.mod.ACTIONS.getTitleHtml & String = js.native
  
  @js.native
  sealed trait getTitleText
    extends StObject
       with ACTIONS
  /* "GET_TITLE_TEXT" */ val getTitleText: typings.reactNativeZssRichTextEditor.mod.ACTIONS.getTitleText & String = js.native
  
  @js.native
  sealed trait heading1
    extends StObject
       with ACTIONS
  /* "h1" */ val heading1: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading1 & String = js.native
  
  @js.native
  sealed trait heading2
    extends StObject
       with ACTIONS
  /* "h2" */ val heading2: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading2 & String = js.native
  
  @js.native
  sealed trait heading3
    extends StObject
       with ACTIONS
  /* "h3" */ val heading3: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading3 & String = js.native
  
  @js.native
  sealed trait heading4
    extends StObject
       with ACTIONS
  /* "h4" */ val heading4: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading4 & String = js.native
  
  @js.native
  sealed trait heading5
    extends StObject
       with ACTIONS
  /* "h5" */ val heading5: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading5 & String = js.native
  
  @js.native
  sealed trait heading6
    extends StObject
       with ACTIONS
  /* "h6" */ val heading6: typings.reactNativeZssRichTextEditor.mod.ACTIONS.heading6 & String = js.native
  
  @js.native
  sealed trait hideTitle
    extends StObject
       with ACTIONS
  /* "HIDE_TITLE" */ val hideTitle: typings.reactNativeZssRichTextEditor.mod.ACTIONS.hideTitle & String = js.native
  
  @js.native
  sealed trait init
    extends StObject
       with ACTIONS
  /* "ZSSS_INIT" */ val init: typings.reactNativeZssRichTextEditor.mod.ACTIONS.init & String = js.native
  
  @js.native
  sealed trait insertBulletsList
    extends StObject
       with ACTIONS
  /* "unorderedList" */ val insertBulletsList: typings.reactNativeZssRichTextEditor.mod.ACTIONS.insertBulletsList & String = js.native
  
  @js.native
  sealed trait insertImage
    extends StObject
       with ACTIONS
  /* "INST_IMAGE" */ val insertImage: typings.reactNativeZssRichTextEditor.mod.ACTIONS.insertImage & String = js.native
  
  @js.native
  sealed trait insertLink
    extends StObject
       with ACTIONS
  /* "INST_LINK" */ val insertLink: typings.reactNativeZssRichTextEditor.mod.ACTIONS.insertLink & String = js.native
  
  @js.native
  sealed trait insertOrderedList
    extends StObject
       with ACTIONS
  /* "orderedList" */ val insertOrderedList: typings.reactNativeZssRichTextEditor.mod.ACTIONS.insertOrderedList & String = js.native
  
  @js.native
  sealed trait prepareInsert
    extends StObject
       with ACTIONS
  /* "PREPARE_INSERT" */ val prepareInsert: typings.reactNativeZssRichTextEditor.mod.ACTIONS.prepareInsert & String = js.native
  
  @js.native
  sealed trait removeFormat
    extends StObject
       with ACTIONS
  /* "REMOVE_FORMAT" */ val removeFormat: typings.reactNativeZssRichTextEditor.mod.ACTIONS.removeFormat & String = js.native
  
  @js.native
  sealed trait restoreSelection
    extends StObject
       with ACTIONS
  /* "RESTORE_SELECTION" */ val restoreSelection: typings.reactNativeZssRichTextEditor.mod.ACTIONS.restoreSelection & String = js.native
  
  @js.native
  sealed trait setBackgroundColor
    extends StObject
       with ACTIONS
  /* "SET_BACKGROUND_COLOR" */ val setBackgroundColor: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setBackgroundColor & String = js.native
  
  @js.native
  sealed trait setBold
    extends StObject
       with ACTIONS
  /* "bold" */ val setBold: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setBold & String = js.native
  
  @js.native
  sealed trait setContentFocusHandler
    extends StObject
       with ACTIONS
  /* "SET_CONTENT_FOCUS_HANDLER" */ val setContentFocusHandler: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setContentFocusHandler & String = js.native
  
  @js.native
  sealed trait setContentHtml
    extends StObject
       with ACTIONS
  /* "SET_CONTENT_HTML" */ val setContentHtml: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setContentHtml & String = js.native
  
  @js.native
  sealed trait setContentPlaceholder
    extends StObject
       with ACTIONS
  /* "SET_CONTENT_PLACEHOLDER" */ val setContentPlaceholder: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setContentPlaceholder & String = js.native
  
  @js.native
  sealed trait setCustomCSS
    extends StObject
       with ACTIONS
  /* "SET_CUSTOM_CSS" */ val setCustomCSS: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setCustomCSS & String = js.native
  
  @js.native
  sealed trait setEditorHeight
    extends StObject
       with ACTIONS
  /* "SET_EDITOR_HEIGHT" */ val setEditorHeight: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setEditorHeight & String = js.native
  
  @js.native
  sealed trait setFooterHeight
    extends StObject
       with ACTIONS
  /* "SET_FOOTER_HEIGHT" */ val setFooterHeight: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setFooterHeight & String = js.native
  
  @js.native
  sealed trait setHR
    extends StObject
       with ACTIONS
  /* "horizontalRule" */ val setHR: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setHR & String = js.native
  
  @js.native
  sealed trait setIndent
    extends StObject
       with ACTIONS
  /* "indent" */ val setIndent: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setIndent & String = js.native
  
  @js.native
  sealed trait setItalic
    extends StObject
       with ACTIONS
  /* "italic" */ val setItalic: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setItalic & String = js.native
  
  @js.native
  sealed trait setOutdent
    extends StObject
       with ACTIONS
  /* "outdent" */ val setOutdent: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setOutdent & String = js.native
  
  @js.native
  sealed trait setParagraph
    extends StObject
       with ACTIONS
  /* "SET_PARAGRAPH" */ val setParagraph: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setParagraph & String = js.native
  
  @js.native
  sealed trait setPlatform
    extends StObject
       with ACTIONS
  /* "SET_PLATFORM" */ val setPlatform: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setPlatform & String = js.native
  
  @js.native
  sealed trait setStrikethrough
    extends StObject
       with ACTIONS
  /* "strikeThrough" */ val setStrikethrough: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setStrikethrough & String = js.native
  
  @js.native
  sealed trait setSubscript
    extends StObject
       with ACTIONS
  /* "subscript" */ val setSubscript: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setSubscript & String = js.native
  
  @js.native
  sealed trait setSuperscript
    extends StObject
       with ACTIONS
  /* "superscript" */ val setSuperscript: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setSuperscript & String = js.native
  
  @js.native
  sealed trait setTextColor
    extends StObject
       with ACTIONS
  /* "SET_TEXT_COLOR" */ val setTextColor: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setTextColor & String = js.native
  
  @js.native
  sealed trait setTitleFocusHandler
    extends StObject
       with ACTIONS
  /* "SET_TITLE_FOCUS_HANDLER" */ val setTitleFocusHandler: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setTitleFocusHandler & String = js.native
  
  @js.native
  sealed trait setTitleHtml
    extends StObject
       with ACTIONS
  /* "SET_TITLE_HTML" */ val setTitleHtml: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setTitleHtml & String = js.native
  
  @js.native
  sealed trait setTitlePlaceholder
    extends StObject
       with ACTIONS
  /* "SET_TITLE_PLACEHOLDER" */ val setTitlePlaceholder: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setTitlePlaceholder & String = js.native
  
  @js.native
  sealed trait setUnderline
    extends StObject
       with ACTIONS
  /* "underline" */ val setUnderline: typings.reactNativeZssRichTextEditor.mod.ACTIONS.setUnderline & String = js.native
  
  @js.native
  sealed trait showTitle
    extends StObject
       with ACTIONS
  /* "SHOW_TITLE" */ val showTitle: typings.reactNativeZssRichTextEditor.mod.ACTIONS.showTitle & String = js.native
  
  @js.native
  sealed trait toggleTitle
    extends StObject
       with ACTIONS
  /* "TOGGLE_TITLE" */ val toggleTitle: typings.reactNativeZssRichTextEditor.mod.ACTIONS.toggleTitle & String = js.native
  
  @js.native
  sealed trait updateLink
    extends StObject
       with ACTIONS
  /* "UPDATE_LINK" */ val updateLink: typings.reactNativeZssRichTextEditor.mod.ACTIONS.updateLink & String = js.native
}
