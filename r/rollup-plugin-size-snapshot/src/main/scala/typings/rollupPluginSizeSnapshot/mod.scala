package typings.rollupPluginSizeSnapshot

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-size-snapshot", "sizeSnapshot")
  @js.native
  def sizeSnapshot(): Plugin = js.native
  @JSImport("rollup-plugin-size-snapshot", "sizeSnapshot")
  @js.native
  def sizeSnapshot(options: PluginSizeSnapshotOptions): Plugin = js.native
  
  @js.native
  trait PluginSizeSnapshotOptions extends StObject {
    
    var matchSnapshot: js.UndefOr[Boolean] = js.native
    
    var printInfo: js.UndefOr[Boolean] = js.native
    
    var snapshotPath: js.UndefOr[String] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object PluginSizeSnapshotOptions {
    
    @scala.inline
    def apply(): PluginSizeSnapshotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginSizeSnapshotOptions]
    }
    
    @scala.inline
    implicit class PluginSizeSnapshotOptionsMutableBuilder[Self <: PluginSizeSnapshotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchSnapshot(value: Boolean): Self = StObject.set(x, "matchSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchSnapshotUndefined: Self = StObject.set(x, "matchSnapshot", js.undefined)
      
      @scala.inline
      def setPrintInfo(value: Boolean): Self = StObject.set(x, "printInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintInfoUndefined: Self = StObject.set(x, "printInfo", js.undefined)
      
      @scala.inline
      def setSnapshotPath(value: String): Self = StObject.set(x, "snapshotPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotPathUndefined: Self = StObject.set(x, "snapshotPath", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
