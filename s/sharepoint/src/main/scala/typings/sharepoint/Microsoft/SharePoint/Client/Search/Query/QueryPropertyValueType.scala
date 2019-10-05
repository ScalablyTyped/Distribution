package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryPropertyValueType extends js.Object

@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType")
@js.native
object QueryPropertyValueType extends js.Object {
  @js.native
  sealed trait booleanType extends QueryPropertyValueType
  
  @js.native
  sealed trait int32TYpe extends QueryPropertyValueType
  
  @js.native
  sealed trait none extends QueryPropertyValueType
  
  @js.native
  sealed trait stringArrayType extends QueryPropertyValueType
  
  @js.native
  sealed trait stringType extends QueryPropertyValueType
  
  @js.native
  sealed trait unSupportedType extends QueryPropertyValueType
  
  /* 3 */ val booleanType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.booleanType with Double = js.native
  /* 2 */ val int32TYpe: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.int32TYpe with Double = js.native
  /* 0 */ val none: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.none with Double = js.native
  /* 4 */ val stringArrayType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringArrayType with Double = js.native
  /* 1 */ val stringType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringType with Double = js.native
  /* 5 */ val unSupportedType: typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.unSupportedType with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryPropertyValueType with Double] = js.native
}

