package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ModifierListNs.SelectionTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1ModifierList")
@js.native
object V1ModifierListNs extends js.Object {
  @js.native
  sealed trait SelectionTypeEnum extends js.Object
  
  @js.native
  object SelectionTypeEnum extends js.Object {
    @js.native
    sealed trait MULTIPLE extends SelectionTypeEnum
    
    @js.native
    sealed trait SINGLE extends SelectionTypeEnum
    
    /* "MULTIPLE" */ val MULTIPLE: typings.squareDashConnect.squareDashConnectMod.V1ModifierListNs.SelectionTypeEnum.MULTIPLE with String = js.native
    /* "SINGLE" */ val SINGLE: typings.squareDashConnect.squareDashConnectMod.V1ModifierListNs.SelectionTypeEnum.SINGLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SelectionTypeEnum with String] = js.native
  }
  
}

