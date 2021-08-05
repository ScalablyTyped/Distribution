package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlProps
  extends StObject
     with SvgProps {
  
  var `override`: js.UndefOr[SvgProps] = js.undefined
  
  var xml: String | Null
}
object XmlProps {
  
  inline def apply(): XmlProps = {
    val __obj = js.Dynamic.literal(xml = null)
    __obj.asInstanceOf[XmlProps]
  }
  
  extension [Self <: XmlProps](x: Self) {
    
    inline def setOverride(value: SvgProps): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlNull: Self = StObject.set(x, "xml", null)
  }
}
