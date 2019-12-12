package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.booleanType
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.int32TYpe
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.none
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringArrayType
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.stringType
import typings.sharepoint.Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType.unSupportedType
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QueryPropertyValueType with Double] = js.native
  /* 3 */ @js.native
  object booleanType extends TopLevel[booleanType with Double]
  
  /* 2 */ @js.native
  object int32TYpe extends TopLevel[int32TYpe with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object stringArrayType extends TopLevel[stringArrayType with Double]
  
  /* 1 */ @js.native
  object stringType extends TopLevel[stringType with Double]
  
  /* 5 */ @js.native
  object unSupportedType extends TopLevel[unSupportedType with Double]
  
}

