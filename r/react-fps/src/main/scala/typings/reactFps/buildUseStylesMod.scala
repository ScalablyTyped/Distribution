package typings.reactFps

import typings.reactFps.anon.BarStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUseStylesMod {
  
  @JSImport("react-fps/build/useStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    width: Double,
    height: Double,
    top: CssProp,
    right: CssProp,
    bottom: CssProp,
    left: CssProp,
    fpsLength: Double
  ): BarStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any], fpsLength.asInstanceOf[js.Any])).asInstanceOf[BarStyle]
  
  type CssProp = Double | String
}
