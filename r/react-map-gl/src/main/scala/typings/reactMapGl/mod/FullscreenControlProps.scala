package typings.reactMapGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenControlProps
  extends StObject
     with BaseControlProps {
  
  var className: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
}
object FullscreenControlProps {
  
  inline def apply(): FullscreenControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlProps]
  }
  
  extension [Self <: FullscreenControlProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
