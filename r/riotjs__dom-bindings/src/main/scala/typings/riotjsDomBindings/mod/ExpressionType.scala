package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpressionType extends js.Object
@JSImport("@riotjs/dom-bindings", "ExpressionType")
@js.native
object ExpressionType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpressionType with Double] = js.native
  
  @js.native
  sealed trait ATTRIBUTE extends ExpressionType
  /* 0 */ @js.native
  object ATTRIBUTE extends TopLevel[ATTRIBUTE with Double]
  
  @js.native
  sealed trait EVENT extends ExpressionType
  /* 1 */ @js.native
  object EVENT extends TopLevel[EVENT with Double]
  
  @js.native
  sealed trait TEXT extends ExpressionType
  /* 2 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  @js.native
  sealed trait VALUE extends ExpressionType
  /* 3 */ @js.native
  object VALUE extends TopLevel[VALUE with Double]
}
