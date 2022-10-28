package typings.rollupPluginVisualizer

import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginCompressMod {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/compress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBrotliSizeGetter(options: BrotliOptions): SizeGetter = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrotliSizeGetter")(options.asInstanceOf[js.Any]).asInstanceOf[SizeGetter]
  
  inline def createGzipSizeGetter(options: ZlibOptions): SizeGetter = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzipSizeGetter")(options.asInstanceOf[js.Any]).asInstanceOf[SizeGetter]
  
  type SizeGetter = js.Function1[/* code */ String, js.Promise[Double]]
}
