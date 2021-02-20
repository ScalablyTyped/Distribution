package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.storybookUi.anon.Height
import typings.storybookUi.anon.PickAppPropsviewModepanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/app", JSImport.Default)
  @js.native
  val default: ComponentType[PickAppPropsviewModepanel] = js.native
  
  @js.native
  trait AppProps extends StObject {
    
    var docsOnly: Boolean = js.native
    
    var layout: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any = js.native
    
    var panelCount: Double = js.native
    
    var size: Height = js.native
    
    var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
  }
  object AppProps {
    
    @scala.inline
    def apply(
      docsOnly: Boolean,
      layout: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any,
      panelCount: Double,
      size: Height,
      viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): AppProps = {
      val __obj = js.Dynamic.literal(docsOnly = docsOnly.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppProps]
    }
    
    @scala.inline
    implicit class AppPropsMutableBuilder[Self <: AppProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayout(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['layout'] */ js.Any
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelCount(value: Double): Self = StObject.set(x, "panelCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
      ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickAppPropsviewModepanel]
  
  /* This means you don't have to write `default`, but can instead just say `appMod.foo` */
  override def _to: ComponentType[PickAppPropsviewModepanel] = default
}
