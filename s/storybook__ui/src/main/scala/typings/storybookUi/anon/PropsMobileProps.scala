package typings.storybookUi.anon

import typings.storybookUi.mobileMod.MobileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsMobileProps extends StObject {
  
  var props: MobileProps
}
object PropsMobileProps {
  
  inline def apply(props: MobileProps): PropsMobileProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsMobileProps]
  }
  
  extension [Self <: PropsMobileProps](x: Self) {
    
    inline def setProps(value: MobileProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
