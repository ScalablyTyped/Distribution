package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerraformScanInput extends StObject {
  
  var data: Record[String, Record[String, Any]]
  
  var resource: Record[String, Record[String, Any]]
}
object TerraformScanInput {
  
  inline def apply(data: Record[String, Record[String, Any]], resource: Record[String, Record[String, Any]]): TerraformScanInput = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerraformScanInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerraformScanInput] (val x: Self) extends AnyVal {
    
    inline def setData(value: Record[String, Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Record[String, Record[String, Any]]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
