package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStatAggregateMethod extends StObject
@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod & Double] = js.native
  
  @js.native
  sealed trait Event
    extends StObject
       with EClientStatAggregateMethod
  /* 2 */ val Event: typings.steamClient.mod.EClientStatAggregateMethod.Event & Double = js.native
  
  @js.native
  sealed trait LatestOnly
    extends StObject
       with EClientStatAggregateMethod
  /* 0 */ val LatestOnly: typings.steamClient.mod.EClientStatAggregateMethod.LatestOnly & Double = js.native
  
  @js.native
  sealed trait Scalar
    extends StObject
       with EClientStatAggregateMethod
  /* 3 */ val Scalar: typings.steamClient.mod.EClientStatAggregateMethod.Scalar & Double = js.native
  
  @js.native
  sealed trait Sum
    extends StObject
       with EClientStatAggregateMethod
  /* 1 */ val Sum: typings.steamClient.mod.EClientStatAggregateMethod.Sum & Double = js.native
}
