package typings.reactDashCodemirror.ReactCodeMirror

import typings.codemirror.codemirrorMod.Editor
import typings.codemirror.codemirrorMod.EditorChange
import typings.codemirror.codemirrorMod.EditorConfiguration
import typings.codemirror.codemirrorMod.ScrollInfo
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCodeMirrorProps
  extends Props[typings.reactDashCodemirror.ReactCodeMirror.ReactCodeMirror] {
  /** Automatically focuses the editor when it is mounted (default false) */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  /** Automatically persist changes to underlying textarea (default false) */
  var autoSave: js.UndefOr[Boolean] = js.undefined
  /** Adds a custom CSS class to the editor */
  var className: js.UndefOr[String] = js.undefined
  /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
  var codeMirrorInstance: js.UndefOr[
    js.Function2[/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration], Editor]
  ] = js.undefined
  /** Provides the default (not changed tracked) value to the editor */
  var defaultValue: js.UndefOr[String] = js.undefined
  /** Set the name of the editor input field */
  var name: js.UndefOr[String] = js.undefined
  /** Called when a change is made */
  var onChange: js.UndefOr[js.Function2[/* newValue */ String, /* change */ EditorChange, _]] = js.undefined
  /** Called when the cursor is moved */
  var onCursorActivity: js.UndefOr[js.Function1[/* codemirror */ Editor, _]] = js.undefined
  /** Called when the editor is focused or loses focus */
  var onFocusChange: js.UndefOr[js.Function1[/* focused */ Boolean, _]] = js.undefined
  /** Called when the editor is scrolled */
  var onScroll: js.UndefOr[js.Function1[/* scrollInfo */ ScrollInfo, _]] = js.undefined
  /** Options passed to the CodeMirror instance */
  var options: js.UndefOr[EditorConfiguration] = js.undefined
  /** (DEPRECATED), use `name` */
  var path: js.UndefOr[String] = js.undefined
  /** Preserve previous scroll position after updating value */
  var preserveScrollPosition: js.UndefOr[Boolean] = js.undefined
  /** The editor value */
  var value: js.UndefOr[String] = js.undefined
}

object ReactCodeMirrorProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    autoSave: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    codeMirrorInstance: (/* host */ js.Any, /* options */ js.UndefOr[EditorConfiguration]) => Editor = null,
    defaultValue: String = null,
    key: Key = null,
    name: String = null,
    onChange: (/* newValue */ String, /* change */ EditorChange) => _ = null,
    onCursorActivity: /* codemirror */ Editor => _ = null,
    onFocusChange: /* focused */ Boolean => _ = null,
    onScroll: /* scrollInfo */ ScrollInfo => _ = null,
    options: EditorConfiguration = null,
    path: String = null,
    preserveScrollPosition: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[typings.reactDashCodemirror.ReactCodeMirror.ReactCodeMirror] = null,
    value: String = null
  ): ReactCodeMirrorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (codeMirrorInstance != null) __obj.updateDynamic("codeMirrorInstance")(js.Any.fromFunction2(codeMirrorInstance))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onCursorActivity != null) __obj.updateDynamic("onCursorActivity")(js.Any.fromFunction1(onCursorActivity))
    if (onFocusChange != null) __obj.updateDynamic("onFocusChange")(js.Any.fromFunction1(onFocusChange))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScrollPosition)) __obj.updateDynamic("preserveScrollPosition")(preserveScrollPosition.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCodeMirrorProps]
  }
}

