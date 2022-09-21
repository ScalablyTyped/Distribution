package typings.reactFns

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ CompositeComponent[TMergedProps], 
    ComponentClass[TOwnProps, ComponentState]
  ]
  
  type CompositeComponent[P] = (ComponentClass[P, ComponentState]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any)
  
  type InferableComponentDecorator[TOwnProps] = js.Function1[/* component */ CompositeComponent[TOwnProps], CompositeComponent[TOwnProps]]
  
  trait SharedRenderProps[P] extends StObject {
    
    var children: js.UndefOr[(js.Function1[/* props */ P, ReactNode]) | ReactNode] = js.undefined
    
    var component: js.UndefOr[ComponentType[P | Unit]] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* props */ P, ReactNode]] = js.undefined
  }
  object SharedRenderProps {
    
    inline def apply[P](): SharedRenderProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedRenderProps[P]]
    }
    
    extension [Self <: SharedRenderProps[?], P](x: Self & SharedRenderProps[P]) {
      
      inline def setChildren(value: (js.Function1[/* props */ P, ReactNode]) | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ P => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ComponentType[P | Unit]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setRender(value: /* props */ P => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
