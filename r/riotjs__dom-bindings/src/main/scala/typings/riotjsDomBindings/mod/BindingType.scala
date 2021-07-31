package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingType extends StObject
@JSImport("@riotjs/dom-bindings", "BindingType")
@js.native
object BindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingType & Double] = js.native
  
  @js.native
  sealed trait EACH
    extends StObject
       with BindingType
  /* 0 */ val EACH: typings.riotjsDomBindings.mod.BindingType.EACH & Double = js.native
  
  @js.native
  sealed trait IF
    extends StObject
       with BindingType
  /* 1 */ val IF: typings.riotjsDomBindings.mod.BindingType.IF & Double = js.native
  
  @js.native
  sealed trait SIMPLE
    extends StObject
       with BindingType
  /* 2 */ val SIMPLE: typings.riotjsDomBindings.mod.BindingType.SIMPLE & Double = js.native
  
  @js.native
  sealed trait SLOT
    extends StObject
       with BindingType
  /* 4 */ val SLOT: typings.riotjsDomBindings.mod.BindingType.SLOT & Double = js.native
  
  @js.native
  sealed trait TAG
    extends StObject
       with BindingType
  /* 3 */ val TAG: typings.riotjsDomBindings.mod.BindingType.TAG & Double = js.native
}
