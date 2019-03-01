package typings
package reduxDashDevtoolsDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  /**
    * dispatch custom actions or action creators
    */
  var dispatch: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * export history of actions in a file
    */
  var export: js.UndefOr[
    scala.Boolean | reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionLibStrings.custom
  ] = js.undefined
  /**
    * import history of actions from a file
    */
  var `import`: js.UndefOr[
    scala.Boolean | reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionLibStrings.custom
  ] = js.undefined
  /**
    * jump back and forth (time travelling)
    */
  var jump: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * lock/unlock dispatching actions and side effects
    */
  var lock: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * start/pause recording of dispatched actions
    */
  var pause: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * persist states on page reloading
    */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * drag and drop actions in the history list
    */
  var reorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * skip (cancel) actions
    */
  var skip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * generate tests for the selected actions
    */
  var test: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Custom {
  @scala.inline
  def apply(
    dispatch: js.UndefOr[scala.Boolean] = js.undefined,
    export: scala.Boolean | reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionLibStrings.custom = null,
    `import`: scala.Boolean | reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionLibStrings.custom = null,
    jump: js.UndefOr[scala.Boolean] = js.undefined,
    lock: js.UndefOr[scala.Boolean] = js.undefined,
    pause: js.UndefOr[scala.Boolean] = js.undefined,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    reorder: js.UndefOr[scala.Boolean] = js.undefined,
    skip: js.UndefOr[scala.Boolean] = js.undefined,
    test: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Custom = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dispatch)) __obj.updateDynamic("dispatch")(dispatch)
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (!js.isUndefined(jump)) __obj.updateDynamic("jump")(jump)
    if (!js.isUndefined(lock)) __obj.updateDynamic("lock")(lock)
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (!js.isUndefined(reorder)) __obj.updateDynamic("reorder")(reorder)
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_Custom]
  }
}

