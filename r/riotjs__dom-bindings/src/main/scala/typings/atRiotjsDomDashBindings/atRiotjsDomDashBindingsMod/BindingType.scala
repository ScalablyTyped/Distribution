package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

@JSImport("@riotjs/dom-bindings", "BindingType")
@js.native
object BindingType extends js.Object {
  @js.native
  sealed trait EACH extends BindingType
  
  @js.native
  sealed trait IF extends BindingType
  
  @js.native
  sealed trait SIMPLE extends BindingType
  
  @js.native
  sealed trait SLOT extends BindingType
  
  @js.native
  sealed trait TAG extends BindingType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BindingType with Double] = js.native
  /* 0 */ @js.native
  object EACH extends TopLevel[EACH with Double]
  
  /* 1 */ @js.native
  object IF extends TopLevel[IF with Double]
  
  /* 2 */ @js.native
  object SIMPLE extends TopLevel[SIMPLE with Double]
  
  /* 4 */ @js.native
  object SLOT extends TopLevel[SLOT with Double]
  
  /* 3 */ @js.native
  object TAG extends TopLevel[TAG with Double]
  
}

