package typings
package reduxDashActionDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashActionDashUtilsMod {
  type ActionCreator[T] = js.Function1[/* repeated */ js.Any, Action with T]
  type OptionsActionCreator[T] = js.Function1[/* data */ T, Action with T]
}
