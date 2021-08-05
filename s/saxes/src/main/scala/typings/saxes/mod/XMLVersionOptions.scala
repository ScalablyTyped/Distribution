package typings.saxes.mod

import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLVersionOptions extends StObject {
  
  /**
    * The default XML version to use. If unspecified, and there is no XML
    * encoding declaration, the default version is "1.0".
    */
  var defaultXMLVersion: js.UndefOr[`1Dot0` | `1Dot1`] = js.undefined
  
  /**
    * A flag indicating whether to force the XML version used for parsing to the
    * value of ``defaultXMLVersion``. When this flag is ``true``,
    * ``defaultXMLVersion`` must be specified. If unspecified, the default value
    * of this flag is ``false``.
    */
  var forceXMLVersion: js.UndefOr[Boolean] = js.undefined
}
object XMLVersionOptions {
  
  inline def apply(): XMLVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLVersionOptions]
  }
  
  extension [Self <: XMLVersionOptions](x: Self) {
    
    inline def setDefaultXMLVersion(value: `1Dot0` | `1Dot1`): Self = StObject.set(x, "defaultXMLVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultXMLVersionUndefined: Self = StObject.set(x, "defaultXMLVersion", js.undefined)
    
    inline def setForceXMLVersion(value: Boolean): Self = StObject.set(x, "forceXMLVersion", value.asInstanceOf[js.Any])
    
    inline def setForceXMLVersionUndefined: Self = StObject.set(x, "forceXMLVersion", js.undefined)
  }
}
