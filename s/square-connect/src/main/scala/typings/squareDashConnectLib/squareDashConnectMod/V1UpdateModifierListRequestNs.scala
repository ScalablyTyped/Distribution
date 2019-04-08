package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1UpdateModifierListRequest")
@js.native
object V1UpdateModifierListRequestNs extends js.Object {
  @js.native
  sealed trait SelectionTypeEnum extends js.Object
  
  @js.native
  object SelectionTypeEnum extends js.Object {
    @js.native
    sealed trait MULTIPLE
      extends squareDashConnectLib.squareDashConnectMod.V1UpdateModifierListRequestNs.SelectionTypeEnum
    
    @js.native
    sealed trait SINGLE
      extends squareDashConnectLib.squareDashConnectMod.V1UpdateModifierListRequestNs.SelectionTypeEnum
    
    /* "MULTIPLE" */ val MULTIPLE: MULTIPLE with java.lang.String = js.native
    /* "SINGLE" */ val SINGLE: SINGLE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1UpdateModifierListRequestNs.SelectionTypeEnum with java.lang.String
      ] = js.native
  }
  
}

