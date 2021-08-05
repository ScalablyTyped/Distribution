package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConditionalPortal {
  
  inline def apply(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-md", "ConditionalPortal")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "ConditionalPortal.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "ConditionalPortal.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ConditionalPortal.propTypes.portal")
    @js.native
    def portal: js.Any = js.native
    
    @JSImport("react-md", "ConditionalPortal.propTypes.portalInto")
    @js.native
    def portalInto: js.Any = js.native
    
    @JSImport("react-md", "ConditionalPortal.propTypes.portalIntoId")
    @js.native
    def portalIntoId: js.Any = js.native
    inline def portalIntoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalIntoId")(x.asInstanceOf[js.Any])
    
    inline def portalInto_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portalInto")(x.asInstanceOf[js.Any])
    
    inline def portal_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("portal")(x.asInstanceOf[js.Any])
  }
}
