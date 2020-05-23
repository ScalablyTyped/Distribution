package typings.reactDraftWysiwyg.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactDraftWysiwyg.mod.ContentBlock
import typings.reactDraftWysiwyg.mod.EditorState
import typings.reactDraftWysiwyg.mod.RawDraftContentState
import typings.reactDraftWysiwyg.mod.SyntheticEvent
import typings.reactDraftWysiwyg.mod.SyntheticKeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-draft-wysiwyg.react-draft-wysiwyg.EditorProps> */
trait ReadonlyEditorProps extends js.Object {
  val ariaActiveDescendantID: js.UndefOr[String] = js.undefined
  val ariaAutoComplete: js.UndefOr[String] = js.undefined
  val ariaDescribedBy: js.UndefOr[String] = js.undefined
  val ariaExpanded: js.UndefOr[String] = js.undefined
  val ariaHasPopup: js.UndefOr[String] = js.undefined
  val ariaLabel: js.UndefOr[String] = js.undefined
  val ariaOwneeID: js.UndefOr[String] = js.undefined
  val contentState: js.UndefOr[RawDraftContentState] = js.undefined
  val customBlockRenderFunc: js.UndefOr[js.Function1[/* block */ ContentBlock, _]] = js.undefined
  val customDecorators: js.UndefOr[js.Array[js.Object]] = js.undefined
  val customStyleMap: js.UndefOr[js.Object] = js.undefined
  val defaultContentState: js.UndefOr[RawDraftContentState] = js.undefined
  val defaultEditorState: js.UndefOr[EditorState] = js.undefined
  val editorClassName: js.UndefOr[String] = js.undefined
  val editorRef: js.UndefOr[js.Function1[/* ref */ js.Object, Unit]] = js.undefined
  val editorState: js.UndefOr[EditorState] = js.undefined
  val editorStyle: js.UndefOr[CSSProperties] = js.undefined
  val handlePastedText: js.UndefOr[
    js.Function4[
      /* text */ String, 
      /* html */ String, 
      /* editorState */ EditorState, 
      /* onChange */ js.Function1[/* editorState */ EditorState, Unit], 
      Boolean
    ]
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
  val wrapperClassName: js.UndefOr[String] = js.undefined
  val wrapperId: js.UndefOr[Double] = js.undefined
  val wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object ReadonlyEditorProps {
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
    tabIndex: js.UndefOr[Double] = js.undefined,
    textAlignment: String = null,
    toolbar: js.Object = null,
    toolbarClassName: String = null,
    toolbarCustomButtons: js.Array[ReactElement] = null,
    toolbarHidden: js.UndefOr[Boolean] = js.undefined,
    toolbarOnFocus: js.UndefOr[Boolean] = js.undefined,
    toolbarStyle: js.Object = null,
    uploadCallback: /* file */ js.Object => js.Promise[js.Object] = null,
    wrapperClassName: String = null,
    wrapperId: js.UndefOr[Double] = js.undefined,
    wrapperStyle: CSSProperties = null
  ): ReadonlyEditorProps = {
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
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (textAlignment != null) __obj.updateDynamic("textAlignment")(textAlignment.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (toolbarClassName != null) __obj.updateDynamic("toolbarClassName")(toolbarClassName.asInstanceOf[js.Any])
    if (toolbarCustomButtons != null) __obj.updateDynamic("toolbarCustomButtons")(toolbarCustomButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarHidden)) __obj.updateDynamic("toolbarHidden")(toolbarHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarOnFocus)) __obj.updateDynamic("toolbarOnFocus")(toolbarOnFocus.get.asInstanceOf[js.Any])
    if (toolbarStyle != null) __obj.updateDynamic("toolbarStyle")(toolbarStyle.asInstanceOf[js.Any])
    if (uploadCallback != null) __obj.updateDynamic("uploadCallback")(js.Any.fromFunction1(uploadCallback))
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapperId)) __obj.updateDynamic("wrapperId")(wrapperId.get.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyEditorProps]
  }
}

