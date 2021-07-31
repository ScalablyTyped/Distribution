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
  
  @scala.inline
  def apply(): XmlProps = {
    val __obj = js.Dynamic.literal(xml = null)
    __obj.asInstanceOf[XmlProps]
  }
  
  @scala.inline
  implicit class XmlPropsMutableBuilder[Self <: XmlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: SvgProps): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    @scala.inline
    def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlNull: Self = StObject.set(x, "xml", null)
  }
}
