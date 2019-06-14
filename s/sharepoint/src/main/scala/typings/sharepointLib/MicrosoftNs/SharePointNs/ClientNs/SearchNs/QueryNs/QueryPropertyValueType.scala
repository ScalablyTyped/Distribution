package typings
package sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryPropertyValueType extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType")
@js.native
object QueryPropertyValueType extends js.Object {
  @js.native
  sealed trait booleanType
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  @js.native
  sealed trait int32TYpe
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  @js.native
  sealed trait none
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  @js.native
  sealed trait stringArrayType
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  @js.native
  sealed trait stringType
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  @js.native
  sealed trait unSupportedType
    extends sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType
  
  /* 3 */ val booleanType: booleanType with scala.Double = js.native
  /* 2 */ val int32TYpe: int32TYpe with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val stringArrayType: stringArrayType with scala.Double = js.native
  /* 1 */ val stringType: stringType with scala.Double = js.native
  /* 5 */ val unSupportedType: unSupportedType with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType with scala.Double
  ] = js.native
}

