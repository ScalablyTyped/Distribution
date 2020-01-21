package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EClientStatAggregateMethod extends js.Object

@JSImport("steam-client", "EClientStatAggregateMethod")
@js.native
object EClientStatAggregateMethod extends js.Object {
  @js.native
  sealed trait Event extends EClientStatAggregateMethod
  
  @js.native
  sealed trait LatestOnly extends EClientStatAggregateMethod
  
  @js.native
  sealed trait Scalar extends EClientStatAggregateMethod
  
  @js.native
  sealed trait Sum extends EClientStatAggregateMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EClientStatAggregateMethod with Double] = js.native
  /* 2 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  /* 0 */ @js.native
  object LatestOnly extends TopLevel[LatestOnly with Double]
  
  /* 3 */ @js.native
  object Scalar extends TopLevel[Scalar with Double]
  
  /* 1 */ @js.native
  object Sum extends TopLevel[Sum with Double]
  
}

