package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingType extends StObject
@JSImport("@riotjs/dom-bindings", "BindingType")
@js.native
object BindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingType with Double] = js.native
  
  @js.native
  sealed trait EACH extends BindingType
  /* 0 */ val EACH: typings.riotjsDomBindings.mod.BindingType.EACH with Double = js.native
  
  @js.native
  sealed trait IF extends BindingType
  /* 1 */ val IF: typings.riotjsDomBindings.mod.BindingType.IF with Double = js.native
  
  @js.native
  sealed trait SIMPLE extends BindingType
  /* 2 */ val SIMPLE: typings.riotjsDomBindings.mod.BindingType.SIMPLE with Double = js.native
  
  @js.native
  sealed trait SLOT extends BindingType
  /* 4 */ val SLOT: typings.riotjsDomBindings.mod.BindingType.SLOT with Double = js.native
  
  @js.native
  sealed trait TAG extends BindingType
  /* 3 */ val TAG: typings.riotjsDomBindings.mod.BindingType.TAG with Double = js.native
}
