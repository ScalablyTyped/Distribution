package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementObject extends StObject {
  
  var element: ReactElement | ReactType[_] = js.native
}
object ElementObject {
  
  @scala.inline
  def apply(element: ReactElement | ReactType[_]): ElementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementObject]
  }
  
  @scala.inline
  implicit class ElementObjectMutableBuilder[Self <: ElementObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: ReactElement | ReactType[_]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
