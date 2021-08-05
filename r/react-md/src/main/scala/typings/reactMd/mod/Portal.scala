package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdPortal.portalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  inline def apply(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(hasIntoIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  @JSImport("react-md", "Portal")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "Portal.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "Portal.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "Portal.propTypes.into")
    @js.native
    def into: js.Any = js.native
    
    @JSImport("react-md", "Portal.propTypes.intoId")
    @js.native
    def intoId: js.Any = js.native
    inline def intoId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("intoId")(x.asInstanceOf[js.Any])
    
    inline def into_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("into")(x.asInstanceOf[js.Any])
  }
}
