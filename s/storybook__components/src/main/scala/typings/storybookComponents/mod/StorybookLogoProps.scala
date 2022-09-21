package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorybookLogoProps extends StObject {
  
  var alt: String
}
object StorybookLogoProps {
  
  inline def apply(alt: String): StorybookLogoProps = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorybookLogoProps]
  }
  
  extension [Self <: StorybookLogoProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
  }
}
