package typings.rcTooltip

import org.scalablytyped.runtime.Shortcut
import typings.rcTrigger.interfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placementsMod extends Shortcut {
  
  @JSImport("rc-tooltip/es/placements", JSImport.Default)
  @js.native
  val default: BuildInPlacements = js.native
  
  @JSImport("rc-tooltip/es/placements", "placements")
  @js.native
  val placements: BuildInPlacements = js.native
  
  type _To = BuildInPlacements
  
  /* This means you don't have to write `default`, but can instead just say `placementsMod.foo` */
  override def _to: BuildInPlacements = default
}
