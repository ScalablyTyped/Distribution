package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectProps
  extends StObject
     with ControlProps[ObjectValue]
     with ObjectConfig {
  
  var theme: Any
}
object ObjectProps {
  
  inline def apply(name: String, onChange: ObjectValue => ObjectValue | Unit, theme: Any): ObjectProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectProps]
  }
  
  extension [Self <: ObjectProps](x: Self) {
    
    inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
