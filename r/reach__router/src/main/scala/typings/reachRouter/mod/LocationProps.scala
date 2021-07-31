package typings.reachRouter.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationProps extends StObject {
  
  var children: LocationProviderRenderFn
}
object LocationProps {
  
  @scala.inline
  def apply(children: /* context */ LocationContext => ReactNode): LocationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[LocationProps]
  }
  
  @scala.inline
  implicit class LocationPropsMutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: /* context */ LocationContext => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
