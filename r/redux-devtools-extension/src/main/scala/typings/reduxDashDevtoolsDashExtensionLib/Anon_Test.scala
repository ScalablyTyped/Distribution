package typings
package reduxDashDevtoolsDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Test extends js.Object {
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

