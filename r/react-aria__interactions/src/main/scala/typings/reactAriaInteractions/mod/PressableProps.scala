package typings.reactAriaInteractions.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressableProps
  extends StObject
     with PressProps {
  
  var children: ReactElement
}
object PressableProps {
  
  inline def apply(children: ReactElement): PressableProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PressableProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
