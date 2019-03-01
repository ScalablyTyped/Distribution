package typings
package reactDashDraftDashWysiwygLib.reactDashDraftDashWysiwygMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorProps extends js.Object {
  var ariaActiveDescendantID: js.UndefOr[java.lang.String] = js.undefined
  var ariaAutoComplete: js.UndefOr[java.lang.String] = js.undefined
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  var ariaExpanded: js.UndefOr[java.lang.String] = js.undefined
  var ariaHasPopup: js.UndefOr[java.lang.String] = js.undefined
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var ariaOwneeID: js.UndefOr[java.lang.String] = js.undefined
  var contentState: js.UndefOr[RawDraftContentState] = js.undefined
  var customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.undefined
  var customDecorators: js.UndefOr[js.Array[js.Object]] = js.undefined
  var defaultContentState: js.UndefOr[RawDraftContentState] = js.undefined
  var defaultEditorState: js.UndefOr[EditorState] = js.undefined
  var editorClassName: js.UndefOr[java.lang.String] = js.undefined
  var editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, scala.Unit]] = js.undefined
  var editorState: js.UndefOr[EditorState] = js.undefined
  var editorStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var handlePastedText: js.UndefOr[
    js.Function4[
      /* text */ java.lang.String, 
      /* html */ java.lang.String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, scala.Unit], 
      scala.Boolean
    ]
  ] = js.undefined
  var hashtag: js.UndefOr[js.Object] = js.undefined
  var initialContentState: js.UndefOr[RawDraftContentState] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var localization: js.UndefOr[js.Object] = js.undefined
  var mention: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* event */ SyntheticEvent, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, scala.Unit]] = js.undefined
  var onContentStateChange: js.UndefOr[js.Function1[/* contentState */ RawDraftContentState, scala.Unit]] = js.undefined
  var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, scala.Unit]] = js.undefined
  var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, scala.Unit]] = js.undefined
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var spellCheck: js.UndefOr[scala.Boolean] = js.undefined
  var stripPastedStyles: js.UndefOr[scala.Boolean] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var textAlignment: js.UndefOr[java.lang.String] = js.undefined
  var toolbar: js.UndefOr[js.Object] = js.undefined
  var toolbarClassName: js.UndefOr[java.lang.String] = js.undefined
  var toolbarCustomButtons: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.ReactElement[reactLib.HTMLElement]]] = js.undefined
  var toolbarHidden: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarStyle: js.UndefOr[js.Object] = js.undefined
  var uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, js.Promise[js.Object]]] = js.undefined
  var wrapperClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapperId: js.UndefOr[scala.Double] = js.undefined
  var wrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object EditorProps {
  @scala.inline
  def apply(
    ariaActiveDescendantID: java.lang.String = null,
    ariaAutoComplete: java.lang.String = null,
    ariaDescribedBy: java.lang.String = null,
    ariaExpanded: java.lang.String = null,
    ariaHasPopup: java.lang.String = null,
    ariaLabel: java.lang.String = null,
    ariaOwneeID: java.lang.String = null,
    contentState: RawDraftContentState = null,
    customBlockRenderFunc: js.Function1[/* block */ ContentBlock, _] = null,
    customDecorators: js.Array[js.Object] = null,
    defaultContentState: RawDraftContentState = null,
    defaultEditorState: EditorState = null,
    editorClassName: java.lang.String = null,
    editorRef: js.Function1[/* ref */ js.Object, scala.Unit] = null,
    editorState: EditorState = null,
    editorStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    handlePastedText: js.Function4[
      /* text */ java.lang.String, 
      /* html */ java.lang.String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, scala.Unit], 
      scala.Boolean
    ] = null,
    hashtag: js.Object = null,
    initialContentState: RawDraftContentState = null,
    locale: java.lang.String = null,
    localization: js.Object = null,
    mention: js.Object = null,
    onBlur: js.Function1[/* event */ SyntheticEvent, scala.Unit] = null,
    onChange: js.Function1[/* contentState */ RawDraftContentState, scala.Unit] = null,
    onContentStateChange: js.Function1[/* contentState */ RawDraftContentState, scala.Unit] = null,
    onDownArrow: js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit] = null,
    onEditorStateChange: js.Function1[/* editorState */ EditorState, scala.Unit] = null,
    onEscape: js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit] = null,
    onFocus: js.Function1[/* event */ SyntheticEvent, scala.Unit] = null,
    onLeftArrow: js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit] = null,
    onRightArrow: js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit] = null,
    onTab: js.Function1[/* event */ SyntheticKeyboardEvent, scala.Unit] = null,
    onUpArrow: js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit] = null,
    placeholder: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Int | scala.Double = null,
    textAlignment: java.lang.String = null,
    toolbar: js.Object = null,
    toolbarClassName: java.lang.String = null,
    toolbarCustomButtons: js.Array[reactLib.reactMod.ReactNs.ReactElement[reactLib.HTMLElement]] = null,
    toolbarHidden: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarStyle: js.Object = null,
    uploadCallback: js.Function1[/* file */ js.Object, js.Promise[js.Object]] = null,
    wrapperClassName: java.lang.String = null,
    wrapperId: scala.Int | scala.Double = null,
    wrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null
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
    if (customBlockRenderFunc != null) __obj.updateDynamic("customBlockRenderFunc")(customBlockRenderFunc)
    if (customDecorators != null) __obj.updateDynamic("customDecorators")(customDecorators)
    if (defaultContentState != null) __obj.updateDynamic("defaultContentState")(defaultContentState)
    if (defaultEditorState != null) __obj.updateDynamic("defaultEditorState")(defaultEditorState)
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName)
    if (editorRef != null) __obj.updateDynamic("editorRef")(editorRef)
    if (editorState != null) __obj.updateDynamic("editorState")(editorState)
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle)
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(handlePastedText)
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag)
    if (initialContentState != null) __obj.updateDynamic("initialContentState")(initialContentState)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localization != null) __obj.updateDynamic("localization")(localization)
    if (mention != null) __obj.updateDynamic("mention")(mention)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onContentStateChange != null) __obj.updateDynamic("onContentStateChange")(onContentStateChange)
    if (onDownArrow != null) __obj.updateDynamic("onDownArrow")(onDownArrow)
    if (onEditorStateChange != null) __obj.updateDynamic("onEditorStateChange")(onEditorStateChange)
    if (onEscape != null) __obj.updateDynamic("onEscape")(onEscape)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onLeftArrow != null) __obj.updateDynamic("onLeftArrow")(onLeftArrow)
    if (onRightArrow != null) __obj.updateDynamic("onRightArrow")(onRightArrow)
    if (onTab != null) __obj.updateDynamic("onTab")(onTab)
    if (onUpArrow != null) __obj.updateDynamic("onUpArrow")(onUpArrow)
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
    if (uploadCallback != null) __obj.updateDynamic("uploadCallback")(uploadCallback)
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    if (wrapperId != null) __obj.updateDynamic("wrapperId")(wrapperId.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[EditorProps]
  }
}

