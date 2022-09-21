package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentIntegration extends StObject {
  
  /**
    * segment connection string
    * @type {string}
    * @memberof SegmentIntegration
    */
  var connection_string: js.UndefOr[String] = js.undefined
}
object SegmentIntegration {
  
  inline def apply(): SegmentIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentIntegration]
  }
  
  extension [Self <: SegmentIntegration](x: Self) {
    
    inline def setConnection_string(value: String): Self = StObject.set(x, "connection_string", value.asInstanceOf[js.Any])
    
    inline def setConnection_stringUndefined: Self = StObject.set(x, "connection_string", js.undefined)
  }
}
