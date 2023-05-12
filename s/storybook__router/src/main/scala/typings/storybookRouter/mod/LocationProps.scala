package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProps extends StObject {
  
  def children(renderData: RenderData): Any
}
object LocationProps {
  
  inline def apply(children: RenderData => Any): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[LocationProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: RenderData => Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
