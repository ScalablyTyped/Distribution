package typings.radixUiReactPortal

import typings.radixUiReactPrimitive.mod.ComponentPropsWithoutRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@radix-ui/react-portal", "Portal")
  @js.native
  val Portal: ForwardRefExoticComponent[PortalProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@radix-ui/react-portal", "Root")
  @js.native
  val Root: ForwardRefExoticComponent[PortalProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any> extends any ? 'ref' extends keyof react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any> ? std.Pick<react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any>, std.Exclude<keyof react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any>, 'ref'>> : react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any> : react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div * / any> */ trait PortalProps extends StObject {
    
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
  
  type PrimitiveDivProps = ComponentPropsWithoutRef[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Primitive.div */ Any
  ]
}
