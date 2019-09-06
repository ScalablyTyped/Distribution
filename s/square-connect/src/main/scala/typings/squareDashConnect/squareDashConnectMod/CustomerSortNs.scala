package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerSortNs.FieldEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerSort")
@js.native
object CustomerSortNs extends js.Object {
  @js.native
  sealed trait FieldEnum extends js.Object
  
  @js.native
  object FieldEnum extends js.Object {
    @js.native
    sealed trait CREATED_AT extends FieldEnum
    
    @js.native
    sealed trait DEFAULT extends FieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: typings.squareDashConnect.squareDashConnectMod.CustomerSortNs.FieldEnum.CREATED_AT with String = js.native
    /* "DEFAULT" */ val DEFAULT: typings.squareDashConnect.squareDashConnectMod.CustomerSortNs.FieldEnum.DEFAULT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FieldEnum with String] = js.native
  }
  
}

