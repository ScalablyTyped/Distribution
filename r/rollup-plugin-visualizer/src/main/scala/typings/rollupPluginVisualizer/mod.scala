package typings.rollupPluginVisualizer

import typings.rollup.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rollup-plugin-visualizer", JSImport.Namespace)
  @js.native
  def apply(): Plugin = js.native
  @JSImport("rollup-plugin-visualizer", JSImport.Namespace)
  @js.native
  def apply(options: PluginVisualizerOptions): Plugin = js.native
  
  @js.native
  trait PluginVisualizerOptions extends StObject {
    
    var bundlesRelative: js.UndefOr[Boolean] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var sourcemap: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object PluginVisualizerOptions {
    
    @scala.inline
    def apply(): PluginVisualizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginVisualizerOptions]
    }
    
    @scala.inline
    implicit class PluginVisualizerOptionsMutableBuilder[Self <: PluginVisualizerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundlesRelative(value: Boolean): Self = StObject.set(x, "bundlesRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundlesRelativeUndefined: Self = StObject.set(x, "bundlesRelative", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setSourcemap(value: Boolean): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcemapUndefined: Self = StObject.set(x, "sourcemap", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
