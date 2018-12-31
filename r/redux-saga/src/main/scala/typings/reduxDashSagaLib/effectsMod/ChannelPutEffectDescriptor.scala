package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelPutEffectDescriptor[T] extends js.Object {
  var action: T
  var channel: reduxDashSagaLib.reduxDashSagaMod.Channel[T]
  var resolve: js.UndefOr[scala.Boolean] = js.undefined
}

