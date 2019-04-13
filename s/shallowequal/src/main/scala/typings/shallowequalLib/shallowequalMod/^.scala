package typings
package shallowequalLib.shallowequalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shallowequal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[TCtx](objA: js.Any, objB: js.Any): scala.Boolean = js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx]): scala.Boolean = js.native
  def apply[TCtx](objA: js.Any, objB: js.Any, customizer: Customizer[TCtx], compareContext: TCtx): scala.Boolean = js.native
}

