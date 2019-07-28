package typings.reactDashDraftDashWysiwyg.reactDashDraftDashWysiwygMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[String] = js.undefined
  var ariaAutoComplete: js.UndefOr[String] = js.undefined
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  var ariaExpanded: js.UndefOr[String] = js.undefined
  var ariaHasPopup: js.UndefOr[String] = js.undefined
  var ariaLabel: js.UndefOr[String] = js.undefined
  var ariaOwneeID: js.UndefOr[String] = js.undefined
  var contentState: js.UndefOr[RawDraftContentState] = js.undefined
  var customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.undefined
  var customDecorators: js.UndefOr[js.Array[js.Object]] = js.undefined
  var defaultContentState: js.UndefOr[RawDraftContentState] = js.undefined
  var defaultEditorState: js.UndefOr[EditorState] = js.undefined
  var editorClassName: js.UndefOr[String] = js.undefined
  var editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.undefined
  var editorState: js.UndefOr[EditorState] = js.undefined
  var editorStyle: js.UndefOr[CSSProperties] = js.undefined
  var handlePastedText: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* html */ String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
      Boolean
    ]
  ] = js.undefined
  var hashtag: js.UndefOr[js.Object] = js.undefined
  var initialContentState: js.UndefOr[RawDraftContentState] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var localization: js.UndefOr[js.Object] = js.undefined
  var mention: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.undefined
  var onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, Unit]] = js.undefined
  var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.undefined
  var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.undefined
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var spellCheck: js.UndefOr[Boolean] = js.undefined
  var stripPastedStyles: js.UndefOr[Boolean] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var textAlignment: js.UndefOr[String] = js.undefined
  var toolbar: js.UndefOr[js.Object] = js.undefined
  var toolbarClassName: js.UndefOr[String] = js.undefined
  var toolbarCustomButtons: js.UndefOr[js.Array[ReactElement]] = js.undefined
  var toolbarHidden: js.UndefOr[Boolean] = js.undefined
  var toolbarOnFocus: js.UndefOr[Boolean] = js.undefined
  var toolbarStyle: js.UndefOr[js.Object] = js.undefined
  var uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.undefined
  var wrapperClassName: js.UndefOr[String] = js.undefined
  var wrapperId: js.UndefOr[Double] = js.undefined
  var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    ariaActiveDescendantID: String = null,
    ariaAutoComplete: String = null,
    ariaDescribedBy: String = null,
    ariaExpanded: String = null,
    ariaHasPopup: String = null,
    ariaLabel: String = null,
    ariaOwneeID: String = null,
    contentState: RawDraftContentState = null,
    customBlockRenderFunc: /* block */ ContentBlock => _ = null,
    customDecorators: js.Array[js.Object] = null,
    defaultContentState: RawDraftContentState = null,
    defaultEditorState: EditorState = null,
    editorClassName: String = null,
    editorRef: /* ref */ js.Object => Unit = null,
    editorState: EditorState = null,
    editorStyle: CSSProperties = null,
    handlePastedText: (/* text */ String, /* html */ String, /* editorState */ EditorState, /* onChange */ js.Function1[/* editorState */ EditorState, Unit]) => Boolean = null,
    hashtag: js.Object = null,
    initialContentState: RawDraftContentState = null,
    locale: String = null,
    localization: js.Object = null,
    mention: js.Object = null,
    onBlur: /* event */ SyntheticEvent => Unit = null,
    onChange: /* contentState */ RawDraftContentState => Unit = null,
    onContentStateChange: /* contentState */ RawDraftContentState => Unit = null,
    onDownArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onEditorStateChange: /* editorState */ EditorState => Unit = null,
    onEscape: /* e */ SyntheticKeyboardEvent => Unit = null,
    onFocus: /* event */ SyntheticEvent => Unit = null,
    onLeftArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onRightArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    onTab: /* event */ SyntheticKeyboardEvent => Unit = null,
    onUpArrow: /* e */ SyntheticKeyboardEvent => Unit = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    textAlignment: String = null,
    toolbar: js.Object = null,
    toolbarClassName: String = null,
    toolbarCustomButtons: js.Array[ReactElement] = null,
    toolbarHidden: js.UndefOr[Boolean] = js.undefined,
    toolbarOnFocus: js.UndefOr[Boolean] = js.undefined,
    toolbarStyle: js.Object = null,
    uploadCallback: /* file */ js.Object => js.Promise[js.Object] = null,
    wrapperClassName: String = null,
    wrapperId: Int | Double = null,
    wrapperStyle: CSSProperties = null
  ): EditorProps = {
    val __obj = js.Dynamic.literal()
    if (ariaActiveDescendantID != null) __obj.updateDynamic("ariaActiveDescendantID")(ariaActiveDescendantID)
    if (ariaAutoComplete != null) __obj.updateDynamic("ariaAutoComplete")(ariaAutoComplete)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaExpanded != null) __obj.updateDynamic("ariaExpanded")(ariaExpanded)
    if (ariaHasPopup != null) __obj.updateDynamic("ariaHasPopup")(ariaHasPopup)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaOwneeID != null) __obj.updateDynamic("ariaOwneeID")(ariaOwneeID)
    if (contentState != null) __obj.updateDynamic("contentState")(contentState)
    if (customBlockRenderFunc != null) __obj.updateDynamic("customBlockRenderFunc")(js.Any.fromFunction1(customBlockRenderFunc))
    if (customDecorators != null) __obj.updateDynamic("customDecorators")(customDecorators)
    if (defaultContentState != null) __obj.updateDynamic("defaultContentState")(defaultContentState)
    if (defaultEditorState != null) __obj.updateDynamic("defaultEditorState")(defaultEditorState)
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName)
    if (editorRef != null) __obj.updateDynamic("editorRef")(js.Any.fromFunction1(editorRef))
    if (editorState != null) __obj.updateDynamic("editorState")(editorState)
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle)
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(js.Any.fromFunction4(handlePastedText))
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (initialContentState != null) __obj.updateDynamic("initialContentState")(initialContentState)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localization != null) __obj.updateDynamic("localization")(localization)
    if (mention != null) __obj.updateDynamic("mention")(mention)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentStateChange != null) __obj.updateDynamic("onContentStateChange")(js.Any.fromFunction1(onContentStateChange))
    if (onDownArrow != null) __obj.updateDynamic("onDownArrow")(js.Any.fromFunction1(onDownArrow))
    if (onEditorStateChange != null) __obj.updateDynamic("onEditorStateChange")(js.Any.fromFunction1(onEditorStateChange))
    if (onEscape != null) __obj.updateDynamic("onEscape")(js.Any.fromFunction1(onEscape))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLeftArrow != null) __obj.updateDynamic("onLeftArrow")(js.Any.fromFunction1(onLeftArrow))
    if (onRightArrow != null) __obj.updateDynamic("onRightArrow")(js.Any.fromFunction1(onRightArrow))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (onUpArrow != null) __obj.updateDynamic("onUpArrow")(js.Any.fromFunction1(onUpArrow))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName)
    if (toolbarCustomButtons != null) __obj.updateDynamic("toolbarCustomButtons")(toolbarCustomButtons)
    if (!js.isUndefined(toolbarHidden)) __obj.updateDynamic("toolbarHidden")(toolbarHidden)
    if (!js.isUndefined(toolbarOnFocus)) __obj.updateDynamic("toolbarOnFocus")(toolbarOnFocus)
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle)
    if (uploadCallback != null) __obj.updateDynamic("uploadCallback")(js.Any.fromFunction1(uploadCallback))
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    if (wrapperId != null) __obj.updateDynamic("wrapperId")(wrapperId.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[EditorProps]
  }
}

