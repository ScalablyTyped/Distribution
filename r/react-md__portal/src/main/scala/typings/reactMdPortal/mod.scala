package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import typings.reactMdPortal.portalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ConditionalPortal {
    
    @scala.inline
    def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/portal", "ConditionalPortal")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/portal", "ConditionalPortal.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/portal", "ConditionalPortal.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/portal", "ConditionalPortal.propTypes.portal")
      @js.native
      def portal: js.Any = js.native
      
      @JSImport("@react-md/portal", "ConditionalPortal.propTypes.portalInto")
      @js.native
      def portalInto: js.Any = js.native
      
      @JSImport("@react-md/portal", "ConditionalPortal.propTypes.portalIntoId")
      @js.native
      def portalIntoId: js.Any = js.native
      @scala.inline
      def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
    }
  }
  
  object Portal {
    
    @scala.inline
    def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasIntoIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@react-md/portal", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/portal", "Portal.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/portal", "Portal.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/portal", "Portal.propTypes.into")
      @js.native
      def into: js.Any = js.native
      
      @JSImport("@react-md/portal", "Portal.propTypes.intoId")
      @js.native
      def intoId: js.Any = js.native
      @scala.inline
      def intoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intoId")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def into_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("into")(x.asInstanceOf[js.Any])
    }
  }
}
