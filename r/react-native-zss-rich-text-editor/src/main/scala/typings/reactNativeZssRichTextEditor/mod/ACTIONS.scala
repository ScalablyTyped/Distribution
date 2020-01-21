package typings.reactNativeZssRichTextEditor.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ACTIONS extends js.Object

@JSImport("react-native-zss-rich-text-editor", "ACTIONS")
@js.native
object ACTIONS extends js.Object {
  @js.native
  sealed trait alignCenter extends ACTIONS
  
  @js.native
  sealed trait alignFull extends ACTIONS
  
  @js.native
  sealed trait alignLeft extends ACTIONS
  
  @js.native
  sealed trait alignRight extends ACTIONS
  
  @js.native
  sealed trait blurContentEditor extends ACTIONS
  
  @js.native
  sealed trait blurTitleEditor extends ACTIONS
  
  @js.native
  sealed trait enableOnChange extends ACTIONS
  
  @js.native
  sealed trait focusContent extends ACTIONS
  
  @js.native
  sealed trait focusTitle extends ACTIONS
  
  @js.native
  sealed trait getContentHtml extends ACTIONS
  
  @js.native
  sealed trait getSelectedText extends ACTIONS
  
  @js.native
  sealed trait getTitleHtml extends ACTIONS
  
  @js.native
  sealed trait getTitleText extends ACTIONS
  
  @js.native
  sealed trait heading1 extends ACTIONS
  
  @js.native
  sealed trait heading2 extends ACTIONS
  
  @js.native
  sealed trait heading3 extends ACTIONS
  
  @js.native
  sealed trait heading4 extends ACTIONS
  
  @js.native
  sealed trait heading5 extends ACTIONS
  
  @js.native
  sealed trait heading6 extends ACTIONS
  
  @js.native
  sealed trait hideTitle extends ACTIONS
  
  @js.native
  sealed trait init extends ACTIONS
  
  @js.native
  sealed trait insertBulletsList extends ACTIONS
  
  @js.native
  sealed trait insertImage extends ACTIONS
  
  @js.native
  sealed trait insertLink extends ACTIONS
  
  @js.native
  sealed trait insertOrderedList extends ACTIONS
  
  @js.native
  sealed trait prepareInsert extends ACTIONS
  
  @js.native
  sealed trait removeFormat extends ACTIONS
  
  @js.native
  sealed trait restoreSelection extends ACTIONS
  
  @js.native
  sealed trait setBackgroundColor extends ACTIONS
  
  @js.native
  sealed trait setBold extends ACTIONS
  
  @js.native
  sealed trait setContentFocusHandler extends ACTIONS
  
  @js.native
  sealed trait setContentHtml extends ACTIONS
  
  @js.native
  sealed trait setContentPlaceholder extends ACTIONS
  
  @js.native
  sealed trait setCustomCSS extends ACTIONS
  
  @js.native
  sealed trait setEditorHeight extends ACTIONS
  
  @js.native
  sealed trait setFooterHeight extends ACTIONS
  
  @js.native
  sealed trait setHR extends ACTIONS
  
  @js.native
  sealed trait setIndent extends ACTIONS
  
  @js.native
  sealed trait setItalic extends ACTIONS
  
  @js.native
  sealed trait setOutdent extends ACTIONS
  
  @js.native
  sealed trait setParagraph extends ACTIONS
  
  @js.native
  sealed trait setPlatform extends ACTIONS
  
  @js.native
  sealed trait setStrikethrough extends ACTIONS
  
  @js.native
  sealed trait setSubscript extends ACTIONS
  
  @js.native
  sealed trait setSuperscript extends ACTIONS
  
  @js.native
  sealed trait setTextColor extends ACTIONS
  
  @js.native
  sealed trait setTitleFocusHandler extends ACTIONS
  
  @js.native
  sealed trait setTitleHtml extends ACTIONS
  
  @js.native
  sealed trait setTitlePlaceholder extends ACTIONS
  
  @js.native
  sealed trait setUnderline extends ACTIONS
  
  @js.native
  sealed trait showTitle extends ACTIONS
  
  @js.native
  sealed trait toggleTitle extends ACTIONS
  
  @js.native
  sealed trait updateLink extends ACTIONS
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
  /* "justifyCenter" */ @js.native
  object alignCenter extends TopLevel[alignCenter with String]
  
  /* "justifyFull" */ @js.native
  object alignFull extends TopLevel[alignFull with String]
  
  /* "justifyLeft" */ @js.native
  object alignLeft extends TopLevel[alignLeft with String]
  
  /* "justifyRight" */ @js.native
  object alignRight extends TopLevel[alignRight with String]
  
  /* "BLUR_CONTENT_EDITOR" */ @js.native
  object blurContentEditor extends TopLevel[blurContentEditor with String]
  
  /* "BLUR_TITLE_EDITOR" */ @js.native
  object blurTitleEditor extends TopLevel[blurTitleEditor with String]
  
  /* "ENABLE_ON_CHANGE" */ @js.native
  object enableOnChange extends TopLevel[enableOnChange with String]
  
  /* "FOCUS_CONTENT" */ @js.native
  object focusContent extends TopLevel[focusContent with String]
  
  /* "FOCUS_TITLE" */ @js.native
  object focusTitle extends TopLevel[focusTitle with String]
  
  /* "GET_CONTENT_HTML" */ @js.native
  object getContentHtml extends TopLevel[getContentHtml with String]
  
  /* "GET_SELECTED_TEXT" */ @js.native
  object getSelectedText extends TopLevel[getSelectedText with String]
  
  /* "GET_TITLE_HTML" */ @js.native
  object getTitleHtml extends TopLevel[getTitleHtml with String]
  
  /* "GET_TITLE_TEXT" */ @js.native
  object getTitleText extends TopLevel[getTitleText with String]
  
  /* "h1" */ @js.native
  object heading1 extends TopLevel[heading1 with String]
  
  /* "h2" */ @js.native
  object heading2 extends TopLevel[heading2 with String]
  
  /* "h3" */ @js.native
  object heading3 extends TopLevel[heading3 with String]
  
  /* "h4" */ @js.native
  object heading4 extends TopLevel[heading4 with String]
  
  /* "h5" */ @js.native
  object heading5 extends TopLevel[heading5 with String]
  
  /* "h6" */ @js.native
  object heading6 extends TopLevel[heading6 with String]
  
  /* "HIDE_TITLE" */ @js.native
  object hideTitle extends TopLevel[hideTitle with String]
  
  /* "ZSSS_INIT" */ @js.native
  object init extends TopLevel[init with String]
  
  /* "unorderedList" */ @js.native
  object insertBulletsList extends TopLevel[insertBulletsList with String]
  
  /* "INST_IMAGE" */ @js.native
  object insertImage extends TopLevel[insertImage with String]
  
  /* "INST_LINK" */ @js.native
  object insertLink extends TopLevel[insertLink with String]
  
  /* "orderedList" */ @js.native
  object insertOrderedList extends TopLevel[insertOrderedList with String]
  
  /* "PREPARE_INSERT" */ @js.native
  object prepareInsert extends TopLevel[prepareInsert with String]
  
  /* "REMOVE_FORMAT" */ @js.native
  object removeFormat extends TopLevel[removeFormat with String]
  
  /* "RESTORE_SELECTION" */ @js.native
  object restoreSelection extends TopLevel[restoreSelection with String]
  
  /* "SET_BACKGROUND_COLOR" */ @js.native
  object setBackgroundColor extends TopLevel[setBackgroundColor with String]
  
  /* "bold" */ @js.native
  object setBold extends TopLevel[setBold with String]
  
  /* "SET_CONTENT_FOCUS_HANDLER" */ @js.native
  object setContentFocusHandler extends TopLevel[setContentFocusHandler with String]
  
  /* "SET_CONTENT_HTML" */ @js.native
  object setContentHtml extends TopLevel[setContentHtml with String]
  
  /* "SET_CONTENT_PLACEHOLDER" */ @js.native
  object setContentPlaceholder extends TopLevel[setContentPlaceholder with String]
  
  /* "SET_CUSTOM_CSS" */ @js.native
  object setCustomCSS extends TopLevel[setCustomCSS with String]
  
  /* "SET_EDITOR_HEIGHT" */ @js.native
  object setEditorHeight extends TopLevel[setEditorHeight with String]
  
  /* "SET_FOOTER_HEIGHT" */ @js.native
  object setFooterHeight extends TopLevel[setFooterHeight with String]
  
  /* "horizontalRule" */ @js.native
  object setHR extends TopLevel[setHR with String]
  
  /* "indent" */ @js.native
  object setIndent extends TopLevel[setIndent with String]
  
  /* "italic" */ @js.native
  object setItalic extends TopLevel[setItalic with String]
  
  /* "outdent" */ @js.native
  object setOutdent extends TopLevel[setOutdent with String]
  
  /* "SET_PARAGRAPH" */ @js.native
  object setParagraph extends TopLevel[setParagraph with String]
  
  /* "SET_PLATFORM" */ @js.native
  object setPlatform extends TopLevel[setPlatform with String]
  
  /* "strikeThrough" */ @js.native
  object setStrikethrough extends TopLevel[setStrikethrough with String]
  
  /* "subscript" */ @js.native
  object setSubscript extends TopLevel[setSubscript with String]
  
  /* "superscript" */ @js.native
  object setSuperscript extends TopLevel[setSuperscript with String]
  
  /* "SET_TEXT_COLOR" */ @js.native
  object setTextColor extends TopLevel[setTextColor with String]
  
  /* "SET_TITLE_FOCUS_HANDLER" */ @js.native
  object setTitleFocusHandler extends TopLevel[setTitleFocusHandler with String]
  
  /* "SET_TITLE_HTML" */ @js.native
  object setTitleHtml extends TopLevel[setTitleHtml with String]
  
  /* "SET_TITLE_PLACEHOLDER" */ @js.native
  object setTitlePlaceholder extends TopLevel[setTitlePlaceholder with String]
  
  /* "underline" */ @js.native
  object setUnderline extends TopLevel[setUnderline with String]
  
  /* "SHOW_TITLE" */ @js.native
  object showTitle extends TopLevel[showTitle with String]
  
  /* "TOGGLE_TITLE" */ @js.native
  object toggleTitle extends TopLevel[toggleTitle with String]
  
  /* "UPDATE_LINK" */ @js.native
  object updateLink extends TopLevel[updateLink with String]
  
}

