package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EClientStatAggregateMethod extends js.Object
@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod with Double] = js.native
  
  @js.native
  sealed trait Event extends EClientStatAggregateMethod
  /* 2 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  @js.native
  sealed trait LatestOnly extends EClientStatAggregateMethod
  /* 0 */ @js.native
  object LatestOnly extends TopLevel[LatestOnly with Double]
  
  @js.native
  sealed trait Scalar extends EClientStatAggregateMethod
  /* 3 */ @js.native
  object Scalar extends TopLevel[Scalar with Double]
  
  @js.native
  sealed trait Sum extends EClientStatAggregateMethod
  /* 1 */ @js.native
  object Sum extends TopLevel[Sum with Double]
}
