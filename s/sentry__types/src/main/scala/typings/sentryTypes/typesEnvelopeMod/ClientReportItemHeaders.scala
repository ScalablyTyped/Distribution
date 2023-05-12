package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.sentryTypesStrings.client_report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientReportItemHeaders extends StObject {
  
  var `type`: client_report
}
object ClientReportItemHeaders {
  
  inline def apply(): ClientReportItemHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("client_report")
    __obj.asInstanceOf[ClientReportItemHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientReportItemHeaders] (val x: Self) extends AnyVal {
    
    inline def setType(value: client_report): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
