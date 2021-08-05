package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForcedXMLVersion
  extends StObject
     with XMLVersionOptions {
  
  @JSName("defaultXMLVersion")
  var defaultXMLVersion_ForcedXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], Unit]
  
  @JSName("forceXMLVersion")
  var forceXMLVersion_ForcedXMLVersion: `true`
}
object ForcedXMLVersion {
  
  inline def apply(): ForcedXMLVersion = {
    val __obj = js.Dynamic.literal(forceXMLVersion = true)
    __obj.asInstanceOf[ForcedXMLVersion]
  }
  
  extension [Self <: ForcedXMLVersion](x: Self) {
    
    inline def setDefaultXMLVersion(value: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], Unit]): Self = StObject.set(x, "defaultXMLVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultXMLVersionUndefined: Self = StObject.set(x, "defaultXMLVersion", js.undefined)
    
    inline def setForceXMLVersion(value: `true`): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
  }
}
