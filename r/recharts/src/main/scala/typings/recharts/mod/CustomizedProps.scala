package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizedProps extends StObject {
  
  var component: ContentRenderer[js.Any] | ReactElement
}
object CustomizedProps {
  
  inline def apply(component: ContentRenderer[js.Any] | ReactElement): CustomizedProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedProps]
  }
  
  extension [Self <: CustomizedProps](x: Self) {
    
    inline def setComponent(value: ContentRenderer[js.Any] | ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentFunction1(value: js.Any => ReactNode): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
  }
}
