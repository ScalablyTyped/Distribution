package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlProps extends SvgProps {
  
  var `override`: js.UndefOr[SvgProps] = js.native
  
  var xml: String | Null = js.native
}
object XmlProps {
  
  @scala.inline
  def apply(): XmlProps = {
    val __obj = js.Dynamic.literal()
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
