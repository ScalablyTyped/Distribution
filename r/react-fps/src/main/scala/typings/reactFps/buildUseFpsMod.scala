package typings.reactFps

import typings.reactFps.anon.AvgFps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUseFpsMod {
  
  @JSImport("react-fps/build/useFps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(windowWidth: Double): AvgFps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(windowWidth.asInstanceOf[js.Any]).asInstanceOf[AvgFps]
}
