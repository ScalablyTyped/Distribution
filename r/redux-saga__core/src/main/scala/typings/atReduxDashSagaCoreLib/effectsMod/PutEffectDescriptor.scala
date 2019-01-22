package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEffectDescriptor[A /* <: reduxLib.reduxMod.Action[_] */] extends js.Object {
  var action: A
  var channel: scala.Null
  var resolve: js.UndefOr[scala.Boolean] = js.undefined
}

