package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdPortal.typesGetContainerMod.PortalInto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConditionalPortalMod {
  
  @JSImport("@react-md/portal/types/ConditionalPortal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConditionalPortal(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalPortal")(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ConditionalPortalProps
    extends StObject
       with RenderConditionalPortalProps {
    
    /**
      * This children to render.
      *
      * @remarks \@since 4.0.0 Allows `ReactNode` instead of `ReactElement | null`
      */
    var children: ReactNode
  }
  object ConditionalPortalProps {
    
    inline def apply(): ConditionalPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalPortalProps]
    }
    
    extension [Self <: ConditionalPortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait RenderConditionalPortalProps extends StObject {
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see {@link PortalProps.into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * @see {@link PortalProps.intoId}
      */
    var portalIntoId: js.UndefOr[String] = js.undefined
  }
  object RenderConditionalPortalProps {
    
    inline def apply(): RenderConditionalPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderConditionalPortalProps]
    }
    
    extension [Self <: RenderConditionalPortalProps](x: Self) {
      
      inline def setPortal(value: Boolean): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalInto(value: PortalInto): Self = StObject.set(x, "portalInto", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "portalInto", js.Any.fromFunction0(value))
      
      inline def setPortalIntoId(value: String): Self = StObject.set(x, "portalIntoId", value.asInstanceOf[js.Any])
      
      inline def setPortalIntoIdUndefined: Self = StObject.set(x, "portalIntoId", js.undefined)
      
      inline def setPortalIntoNull: Self = StObject.set(x, "portalInto", null)
      
      inline def setPortalIntoUndefined: Self = StObject.set(x, "portalInto", js.undefined)
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
}
