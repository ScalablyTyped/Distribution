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
  
  val booleanType: booleanType with java.lang.String = js.native
  val int32TYpe: int32TYpe with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val stringArrayType: stringArrayType with java.lang.String = js.native
  val stringType: stringType with java.lang.String = js.native
  val unSupportedType: unSupportedType with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.MicrosoftNs.SharePointNs.ClientNs.SearchNs.QueryNs.QueryPropertyValueType with java.lang.String
  ] = js.native
}

