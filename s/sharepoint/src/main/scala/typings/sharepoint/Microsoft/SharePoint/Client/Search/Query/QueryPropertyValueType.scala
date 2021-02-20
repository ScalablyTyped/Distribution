package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryPropertyValueType extends StObject
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType")
@js.native
object QueryPropertyValueType extends StObject {
  
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
}
