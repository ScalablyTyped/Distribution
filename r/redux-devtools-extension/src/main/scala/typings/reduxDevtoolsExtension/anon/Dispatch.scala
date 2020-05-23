package typings.reduxDevtoolsExtension.anon

import typings.reduxDevtoolsExtension.reduxDevtoolsExtensionStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dispatch extends js.Object {
  /**
    * dispatch custom actions or action creators
    */
  var dispatch: js.UndefOr[Boolean] = js.undefined
  /**
    * export history of actions in a file
    */
  var export: js.UndefOr[Boolean | custom] = js.undefined
  /**
    * import history of actions from a file
    */
  var `import`: js.UndefOr[Boolean | custom] = js.undefined
  /**
    * jump back and forth (time travelling)
    */
  var jump: js.UndefOr[Boolean] = js.undefined
  /**
    * lock/unlock dispatching actions and side effects
    */
  var lock: js.UndefOr[Boolean] = js.undefined
  /**
    * start/pause recording of dispatched actions
    */
  var pause: js.UndefOr[Boolean] = js.undefined
  /**
    * persist states on page reloading
    */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
    * drag and drop actions in the history list
    */
  var reorder: js.UndefOr[Boolean] = js.undefined
  /**
    * skip (cancel) actions
    */
  var skip: js.UndefOr[Boolean] = js.undefined
  /**
    * generate tests for the selected actions
    */
  var test: js.UndefOr[Boolean] = js.undefined
}

object Dispatch {
  @scala.inline
  def apply(
    dispatch: js.UndefOr[Boolean] = js.undefined,
    export: Boolean | custom = null,
    `import`: Boolean | custom = null,
    jump: js.UndefOr[Boolean] = js.undefined,
    lock: js.UndefOr[Boolean] = js.undefined,
    pause: js.UndefOr[Boolean] = js.undefined,
    persist: js.UndefOr[Boolean] = js.undefined,
    reorder: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Boolean] = js.undefined,
    test: js.UndefOr[Boolean] = js.undefined
  ): Dispatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dispatch)) __obj.updateDynamic("dispatch")(dispatch.get.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (!js.isUndefined(jump)) __obj.updateDynamic("jump")(jump.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lock)) __obj.updateDynamic("lock")(lock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reorder)) __obj.updateDynamic("reorder")(reorder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispatch]
  }
}

