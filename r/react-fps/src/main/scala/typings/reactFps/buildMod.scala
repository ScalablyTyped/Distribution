package typings.reactFps

import typings.react.mod.FC
import typings.reactFps.anon.AvgFps
import typings.reactFps.buildFpsViewMod.ComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("react-fps/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fps/build", "FpsView")
  @js.native
  val FpsView: FC[ComponentProps] = js.native
  
  inline def useFps(windowWidth: Double): AvgFps = ^.asInstanceOf[js.Dynamic].applyDynamic("useFps")(windowWidth.asInstanceOf[js.Any]).asInstanceOf[AvgFps]
}
