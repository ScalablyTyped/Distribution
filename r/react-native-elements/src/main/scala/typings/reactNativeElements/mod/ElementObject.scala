package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementObject extends StObject {
  
  var element: ReactElement | ReactType[js.Any]
}
object ElementObject {
  
  inline def apply(element: ReactElement | ReactType[js.Any]): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementObject]
  }
  
  extension [Self <: ElementObject](x: Self) {
    
    inline def setElement(value: ReactElement | ReactType[js.Any]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
