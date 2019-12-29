package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExpressionType extends js.Object

@JSImport("@riotjs/dom-bindings", "ExpressionType")
@js.native
object ExpressionType extends js.Object {
  @js.native
  sealed trait ATTRIBUTE extends ExpressionType
  
  @js.native
  sealed trait EVENT extends ExpressionType
  
  @js.native
  sealed trait TEXT extends ExpressionType
  
  @js.native
  sealed trait VALUE extends ExpressionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpressionType with Double] = js.native
  /* 0 */ @js.native
  object ATTRIBUTE extends TopLevel[ATTRIBUTE with Double]
  
  /* 1 */ @js.native
  object EVENT extends TopLevel[EVENT with Double]
  
  /* 2 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 3 */ @js.native
  object VALUE extends TopLevel[VALUE with Double]
  
}

