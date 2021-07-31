package typings.rcProgress

import org.scalablytyped.runtime.Shortcut
import typings.rcProgress.interfaceMod.ProgressProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod extends Shortcut {
  
  @JSImport("rc-progress/es/Line", JSImport.Default)
  @js.native
  val default: FC[ProgressProps] = js.native
  
  type _To = FC[ProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineMod.foo` */
  override def _to: FC[ProgressProps] = default
}
