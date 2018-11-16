package typings
package reduxDashUiLib.reduxDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxUIProps[UIStateShape] extends js.Object {
  // The UI state for the component's `uiKey`
  var ui: UIStateShape = js.native
  // The key passed to the decorator from the decorator
  // (eg. 'some-decorator' with `@ui('some-decorator')`
  var uiKey: java.lang.String = js.native
  // A function which resets the state within `uiKey` to its default
  def resetUI(): scala.Unit = js.native
  def updateUI(key: java.lang.String, value: js.Any): scala.Unit = js.native
  // A function accepting either a name/value pair or object which updates
  // state within `uiKey`
  def updateUI(obj: UIStateShape): scala.Unit = js.native
}

