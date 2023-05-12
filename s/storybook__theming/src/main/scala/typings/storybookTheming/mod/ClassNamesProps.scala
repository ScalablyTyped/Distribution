package typings.storybookTheming.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNamesProps extends StObject {
  
  def children(content: ClassNamesContent): ReactNode
}
object ClassNamesProps {
  
  inline def apply(children: ClassNamesContent => ReactNode): ClassNamesProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ClassNamesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassNamesProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ClassNamesContent => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
