package typings
package reduxDashSagaLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEffectDescriptor extends js.Object {
  var args: js.Array[_]
  def selector(state: js.Any, args: js.Any*): js.Any
}

