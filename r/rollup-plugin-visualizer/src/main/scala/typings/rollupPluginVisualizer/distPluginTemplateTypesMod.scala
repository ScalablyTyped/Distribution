package typings.rollupPluginVisualizer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginTemplateTypesMod extends Shortcut {
  
  @JSImport("rollup-plugin-visualizer/dist/plugin/template-types", JSImport.Default)
  @js.native
  val default: js.Array[TemplateType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.sunburst
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.treemap
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.network
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.`raw-data`
    - typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.list
  */
  trait TemplateType extends StObject
  object TemplateType {
    
    inline def list: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.list = "list".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.list]
    
    inline def network: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.network = "network".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.network]
    
    inline def `raw-data`: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.`raw-data` = "raw-data".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.`raw-data`]
    
    inline def sunburst: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.sunburst = "sunburst".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.sunburst]
    
    inline def treemap: typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.treemap = "treemap".asInstanceOf[typings.rollupPluginVisualizer.rollupPluginVisualizerStrings.treemap]
  }
  
  type _To = js.Array[TemplateType]
  
  /* This means you don't have to write `default`, but can instead just say `distPluginTemplateTypesMod.foo` */
  override def _to: js.Array[TemplateType] = default
}
