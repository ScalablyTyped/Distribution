package typings.reactNativeSvg.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMaskProps extends StObject {
  
  var mask: js.UndefOr[String] = js.undefined
}
object CommonMaskProps {
  
  inline def apply(): CommonMaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMaskProps]
  }
  
  extension [Self <: CommonMaskProps](x: Self) {
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
