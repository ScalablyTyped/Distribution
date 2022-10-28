package typings.rollupPluginVisualizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginUidMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUid(alphabit: String, size: Double): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(alphabit.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
  inline def getUid(alphabit: js.Array[String], size: Double): js.Function0[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(alphabit.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Function0[String]]
}
