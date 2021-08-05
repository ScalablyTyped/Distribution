package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoForcedXMLVersion
  extends StObject
     with XMLVersionOptions {
  
  @JSName("forceXMLVersion")
  var forceXMLVersion_NoForcedXMLVersion: js.UndefOr[`false`] = js.undefined
}
object NoForcedXMLVersion {
  
  inline def apply(): NoForcedXMLVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoForcedXMLVersion]
  }
  
  extension [Self <: NoForcedXMLVersion](x: Self) {
    
    inline def setForceXMLVersion(value: `false`): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
    
    inline def setForceXMLVersionUndefined: Self = StObject.set(x, "forceXMLVersion", js.undefined)
  }
}
