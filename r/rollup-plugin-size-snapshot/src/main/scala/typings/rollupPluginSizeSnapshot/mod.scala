package typings.rollupPluginSizeSnapshot

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-size-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sizeSnapshot(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeSnapshot")().asInstanceOf[Plugin]
  inline def sizeSnapshot(options: PluginSizeSnapshotOptions): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeSnapshot")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin]
  
  trait PluginSizeSnapshotOptions extends StObject {
    
    var matchSnapshot: js.UndefOr[Boolean] = js.undefined
    
    var printInfo: js.UndefOr[Boolean] = js.undefined
    
    var snapshotPath: js.UndefOr[String] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PluginSizeSnapshotOptions {
    
    inline def apply(): PluginSizeSnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginSizeSnapshotOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginSizeSnapshotOptions] (val x: Self) extends AnyVal {
      
      inline def setMatchSnapshot(value: Boolean): Self = StObject.set(x, "matchSnapshot", value.asInstanceOf[js.Any])
      
      inline def setMatchSnapshotUndefined: Self = StObject.set(x, "matchSnapshot", js.undefined)
      
      inline def setPrintInfo(value: Boolean): Self = StObject.set(x, "printInfo", value.asInstanceOf[js.Any])
      
      inline def setPrintInfoUndefined: Self = StObject.set(x, "printInfo", js.undefined)
      
      inline def setSnapshotPath(value: String): Self = StObject.set(x, "snapshotPath", value.asInstanceOf[js.Any])
      
      inline def setSnapshotPathUndefined: Self = StObject.set(x, "snapshotPath", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
