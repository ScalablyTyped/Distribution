package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/record_object.htm
trait EnvironmentRecord
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  val Id: String
  
  val attributes: EnvironmentRecordAttributes
}
object EnvironmentRecord {
  
  inline def apply(Id: String, attributes: EnvironmentRecordAttributes): EnvironmentRecord = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentRecord] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: EnvironmentRecordAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
