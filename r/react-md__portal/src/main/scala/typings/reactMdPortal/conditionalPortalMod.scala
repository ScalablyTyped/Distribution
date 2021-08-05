package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.getContainerMod.PortalInto
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionalPortalMod {
  
  object ConditionalPortal {
    
    inline def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/portal/types/ConditionalPortal", "ConditionalPortal.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      inline def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      inline def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
    }
  }
  
  trait ConditionalPortalProps
    extends StObject
       with RenderConditionalPortalProps {
    
    /**
      * This children to render.
      */
    var children: ReactElement | Null
  }
  object ConditionalPortalProps {
    
    inline def apply(): ConditionalPortalProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ConditionalPortalProps]
    }
    
    extension [Self <: ConditionalPortalProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
    }
  }
  
  trait RenderConditionalPortalProps extends StObject {
    
    /**
      * Boolean if the portal should be used.
      */
    var portal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @see {@link Portal#into}
      */
    var portalInto: js.UndefOr[PortalInto] = js.undefined
    
    /**
      * @see {@link Portal#intoId}
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
