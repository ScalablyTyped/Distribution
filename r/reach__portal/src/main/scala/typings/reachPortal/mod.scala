package typings.reachPortal

import org.scalablytyped.runtime.Shortcut
import typings.reachPortal.srcMod.PortalProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@reach/portal", JSImport.Default)
  @js.native
  val default: FC[PortalProps] = js.native
  
  @JSImport("@reach/portal", "Portal")
  @js.native
  val Portal: FC[PortalProps] = js.native
  
  type _To = FC[PortalProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[PortalProps] = default
}
