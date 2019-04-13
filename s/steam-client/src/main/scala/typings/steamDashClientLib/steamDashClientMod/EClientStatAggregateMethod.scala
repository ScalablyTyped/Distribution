package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientStatAggregateMethod extends js.Object

@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends js.Object {
  @js.native
  sealed trait Event
    extends steamDashClientLib.steamDashClientMod.EClientStatAggregateMethod
  
  @js.native
  sealed trait LatestOnly
    extends steamDashClientLib.steamDashClientMod.EClientStatAggregateMethod
  
  @js.native
  sealed trait Scalar
    extends steamDashClientLib.steamDashClientMod.EClientStatAggregateMethod
  
  @js.native
  sealed trait Sum
    extends steamDashClientLib.steamDashClientMod.EClientStatAggregateMethod
  
  /* 2 */ val Event: Event with scala.Double = js.native
  /* 0 */ val LatestOnly: LatestOnly with scala.Double = js.native
  /* 3 */ val Scalar: Scalar with scala.Double = js.native
  /* 1 */ val Sum: Sum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    steamDashClientLib.steamDashClientMod.EClientStatAggregateMethod with scala.Double
  ] = js.native
}

