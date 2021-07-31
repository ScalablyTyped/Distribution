package typings.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QueryPropertyValueType extends StObject
@JSGlobal("Microsoft.SharePoint.Client.Search.Query.QueryPropertyValueType")
@js.native
object QueryPropertyValueType extends StObject {
  
  @js.native
  sealed trait booleanType
    extends StObject
       with QueryPropertyValueType
  
  @js.native
  sealed trait int32TYpe
    extends StObject
       with QueryPropertyValueType
  
  @js.native
  sealed trait none
    extends StObject
       with QueryPropertyValueType
  
  @js.native
  sealed trait stringArrayType
    extends StObject
       with QueryPropertyValueType
  
  @js.native
  sealed trait stringType
    extends StObject
       with QueryPropertyValueType
  
  @js.native
  sealed trait unSupportedType
    extends StObject
       with QueryPropertyValueType
}
