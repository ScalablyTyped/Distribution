package typings.reactDraftWysiwyg.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
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
  var customStyleMap: js.UndefOr[js.Object] = js.undefined
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
  var onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, Unit]] = js.undefined
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
    customStyleMap: js.Object = null,
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
    onEditorStateChange: /* editorState */ EditorState => Unit = null,
    onFocus: /* event */ SyntheticEvent => Unit = null,
    onTab: /* event */ SyntheticKeyboardEvent => Unit = null,
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
    if (ariaActiveDescendantID != null) __obj.updateDynamic("ariaActiveDescendantID")(ariaActiveDescendantID.asInstanceOf[js.Any])
    if (ariaAutoComplete != null) __obj.updateDynamic("ariaAutoComplete")(ariaAutoComplete.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaExpanded != null) __obj.updateDynamic("ariaExpanded")(ariaExpanded.asInstanceOf[js.Any])
    if (ariaHasPopup != null) __obj.updateDynamic("ariaHasPopup")(ariaHasPopup.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaOwneeID != null) __obj.updateDynamic("ariaOwneeID")(ariaOwneeID.asInstanceOf[js.Any])
    if (contentState != null) __obj.updateDynamic("contentState")(contentState.asInstanceOf[js.Any])
    if (customBlockRenderFunc != null) __obj.updateDynamic("customBlockRenderFunc")(js.Any.fromFunction1(customBlockRenderFunc))
    if (customDecorators != null) __obj.updateDynamic("customDecorators")(customDecorators.asInstanceOf[js.Any])
    if (customStyleMap != null) __obj.updateDynamic("customStyleMap")(customStyleMap.asInstanceOf[js.Any])
    if (defaultContentState != null) __obj.updateDynamic("defaultContentState")(defaultContentState.asInstanceOf[js.Any])
    if (defaultEditorState != null) __obj.updateDynamic("defaultEditorState")(defaultEditorState.asInstanceOf[js.Any])
    if (editorClassName != null) __obj.updateDynamic("editorClassName")(editorClassName.asInstanceOf[js.Any])
    if (editorRef != null) __obj.updateDynamic("editorRef")(js.Any.fromFunction1(editorRef))
    if (editorState != null) __obj.updateDynamic("editorState")(editorState.asInstanceOf[js.Any])
    if (editorStyle != null) __obj.updateDynamic("editorStyle")(editorStyle.asInstanceOf[js.Any])
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(js.Any.fromFunction4(handlePastedText))
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (initialContentState != null) __obj.updateDynamic("initialContentState")(initialContentState.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localization != null) __obj.updateDynamic("localization")(localization.asInstanceOf[js.Any])
    if (mention != null) __obj.updateDynamic("mention")(mention.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onContentStateChange != null) __obj.updateDynamic("onContentStateChange")(js.Any.fromFunction1(onContentStateChange))
    if (onEditorStateChange != null) __obj.updateDynamic("onEditorStateChange")(js.Any.fromFunction1(onEditorStateChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarCustomButtons != null) __obj.updateDynamic("toolbarCustomButtons")(toolbarCustomButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarHidden)) __obj.updateDynamic("toolbarHidden")(toolbarHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarOnFocus)) __obj.updateDynamic("toolbarOnFocus")(toolbarOnFocus.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    if (uploadCallback != null) __obj.updateDynamic("uploadCallback")(js.Any.fromFunction1(uploadCallback))
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (wrapperId != null) __obj.updateDynamic("wrapperId")(wrapperId.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorProps]
  }
}

