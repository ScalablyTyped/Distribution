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
  var onChange: js.UndefOr[js.Function1[/* contentState */ ContentState, RawDraftContentState]] = js.undefined
  var onContentStateChange: js.UndefOr[js.Function1[/* contentState */ ContentState, RawDraftContentState]] = js.undefined
  var onDownArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onEditorStateChange: js.UndefOr[js.Function1[/* editorState */ EditorState, scala.Unit]] = js.undefined
  var onEscape: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* event */ SyntheticEvent, scala.Unit]] = js.undefined
  var onLeftArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onRightArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var onUpArrow: js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
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
  var uploadCallback: js.UndefOr[js.Function1[/* file */ js.Object, stdLib.Promise[js.Object]]] = js.undefined
  var wrapperClassName: js.UndefOr[java.lang.String] = js.undefined
  var wrapperId: js.UndefOr[scala.Double] = js.undefined
  var wrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

