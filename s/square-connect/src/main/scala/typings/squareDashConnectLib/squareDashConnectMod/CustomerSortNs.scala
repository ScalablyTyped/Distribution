package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerSort")
@js.native
object CustomerSortNs extends js.Object {
  @js.native
  sealed trait FieldEnum extends js.Object
  
  @js.native
  sealed trait OrderEnum extends js.Object
  
  @js.native
  object FieldEnum extends js.Object {
    @js.native
    sealed trait CREATED_AT
      extends squareDashConnectLib.squareDashConnectMod.CustomerSortNs.FieldEnum
    
    @js.native
    sealed trait DEFAULT
      extends squareDashConnectLib.squareDashConnectMod.CustomerSortNs.FieldEnum
    
    /* "CREATED_AT" */ val CREATED_AT: CREATED_AT with java.lang.String = js.native
    /* "DEFAULT" */ val DEFAULT: DEFAULT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CustomerSortNs.FieldEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object OrderEnum extends js.Object {
    @js.native
    sealed trait ASC
      extends squareDashConnectLib.squareDashConnectMod.CustomerSortNs.OrderEnum
    
    @js.native
    sealed trait DESC
      extends squareDashConnectLib.squareDashConnectMod.CustomerSortNs.OrderEnum
    
    /* "ASC" */ val ASC: ASC with java.lang.String = js.native
    /* "DESC" */ val DESC: DESC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CustomerSortNs.OrderEnum with java.lang.String
      ] = js.native
  }
  
}

