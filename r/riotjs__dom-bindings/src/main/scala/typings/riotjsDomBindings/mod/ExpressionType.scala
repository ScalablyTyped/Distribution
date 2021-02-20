package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExpressionType extends StObject
@JSImport("@riotjs/dom-bindings", "ExpressionType")
@js.native
object ExpressionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExpressionType with Double] = js.native
  
  @js.native
  sealed trait ATTRIBUTE extends ExpressionType
  /* 0 */ val ATTRIBUTE: typings.riotjsDomBindings.mod.ExpressionType.ATTRIBUTE with Double = js.native
  
  @js.native
  sealed trait EVENT extends ExpressionType
  /* 1 */ val EVENT: typings.riotjsDomBindings.mod.ExpressionType.EVENT with Double = js.native
  
  @js.native
  sealed trait TEXT extends ExpressionType
  /* 2 */ val TEXT: typings.riotjsDomBindings.mod.ExpressionType.TEXT with Double = js.native
  
  @js.native
  sealed trait VALUE extends ExpressionType
  /* 3 */ val VALUE: typings.riotjsDomBindings.mod.ExpressionType.VALUE with Double = js.native
}
