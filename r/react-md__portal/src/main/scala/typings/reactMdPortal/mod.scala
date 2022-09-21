package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.ConditionalPortalProps
import typings.reactMdPortal.portalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConditionalPortal(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalPortal")(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Portal(hasIntoIntoIdChildren: PortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasIntoIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
}
