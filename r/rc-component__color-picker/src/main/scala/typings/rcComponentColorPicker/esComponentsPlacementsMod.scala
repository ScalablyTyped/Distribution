package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPlacementsMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/placements", JSImport.Default)
  @js.native
  val default: BuildInPlacements = js.native
  
  @JSImport("@rc-component/color-picker/es/components/placements", "placements")
  @js.native
  val placements: BuildInPlacements = js.native
  
  type _To = BuildInPlacements
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsPlacementsMod.foo` */
  override def _to: BuildInPlacements = default
}
