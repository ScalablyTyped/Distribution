package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BindingType extends js.Object
@JSImport("@riotjs/dom-bindings", "BindingType")
@js.native
object BindingType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingType with Double] = js.native
  
  @js.native
  sealed trait EACH extends BindingType
  /* 0 */ @js.native
  object EACH extends TopLevel[EACH with Double]
  
  @js.native
  sealed trait IF extends BindingType
  /* 1 */ @js.native
  object IF extends TopLevel[IF with Double]
  
  @js.native
  sealed trait SIMPLE extends BindingType
  /* 2 */ @js.native
  object SIMPLE extends TopLevel[SIMPLE with Double]
  
  @js.native
  sealed trait SLOT extends BindingType
  /* 4 */ @js.native
  object SLOT extends TopLevel[SLOT with Double]
  
  @js.native
  sealed trait TAG extends BindingType
  /* 3 */ @js.native
  object TAG extends TopLevel[TAG with Double]
}
