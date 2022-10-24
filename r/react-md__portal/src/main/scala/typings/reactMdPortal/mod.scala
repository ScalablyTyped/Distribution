package typings.reactMdPortal

import typings.react.mod.ReactElement
import typings.reactMdPortal.typesConditionalPortalMod.ConditionalPortalProps
import typings.reactMdPortal.typesPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConditionalPortal(param0: ConditionalPortalProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalPortal")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Portal(param0: PortalProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
}
