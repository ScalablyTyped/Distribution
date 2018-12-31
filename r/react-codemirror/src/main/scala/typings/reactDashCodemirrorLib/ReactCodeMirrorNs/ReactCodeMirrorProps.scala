package typings
package reactDashCodemirrorLib.ReactCodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCodeMirrorProps
  extends reactLib.reactMod.ReactNs.Props[ReactCodeMirror] {
  /** Automatically focuses the editor when it is mounted (default false) */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Automatically persist changes to underlying textarea (default false) */
  var autoSave: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds a custom CSS class to the editor */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
  var codeMirrorInstance: js.UndefOr[
    js.Function2[
      /* host */ js.Any, 
      /* options */ js.UndefOr[codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration], 
      codemirrorLib.codemirrorMod.CodeMirrorNs.Editor
    ]
  ] = js.undefined
  /** Provides the default (not changed tracked) value to the editor */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** Set the name of the editor input field */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Called when a change is made */
  var onChange: js.UndefOr[
    js.Function2[
      /* newValue */ java.lang.String, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      _
    ]
  ] = js.undefined
  /** Called when the cursor is moved */
  var onCursorActivity: js.UndefOr[
    js.Function1[/* codemirror */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, _]
  ] = js.undefined
  /** Called when the editor is focused or loses focus */
  var onFocusChange: js.UndefOr[js.Function1[/* focused */ scala.Boolean, _]] = js.undefined
  /** Called when the editor is scrolled */
  var onScroll: js.UndefOr[
    js.Function1[/* scrollInfo */ codemirrorLib.codemirrorMod.CodeMirrorNs.ScrollInfo, _]
  ] = js.undefined
  /** Options passed to the CodeMirror instance */
  var options: js.UndefOr[codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration] = js.undefined
  /** (DEPRECATED), use `name` */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Preserve previous scroll position after updating value */
  var preserveScrollPosition: js.UndefOr[scala.Boolean] = js.undefined
  /** The editor value */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

