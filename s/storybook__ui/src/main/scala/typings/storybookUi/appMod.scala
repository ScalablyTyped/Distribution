package typings.storybookUi

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.storybookApi.layoutMod.Layout
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookUi.anon.Height
import typings.storybookUi.anon.PickAppPropsviewModepanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod extends Shortcut {
  
  @JSImport("@storybook/ui/dist/app", JSImport.Default)
  @js.native
  val default: ComponentType[PickAppPropsviewModepanel] = js.native
  
  trait AppProps extends StObject {
    
    var docsOnly: Boolean
    
    var layout: Layout
    
    var panelCount: Double
    
    var size: Height
    
    var viewMode: ViewMode & js.UndefOr[String]
  }
  object AppProps {
    
    inline def apply(
      docsOnly: Boolean,
      layout: Layout,
      panelCount: Double,
      size: Height,
      viewMode: ViewMode & js.UndefOr[String]
    ): AppProps = {
      val __obj = js.Dynamic.literal(docsOnly = docsOnly.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppProps]
    }
    
    extension [Self <: AppProps](x: Self) {
      
      inline def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setPanelCount(value: Double): Self = StObject.set(x, "panelCount", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickAppPropsviewModepanel]
  
  /* This means you don't have to write `default`, but can instead just say `appMod.foo` */
  override def _to: ComponentType[PickAppPropsviewModepanel] = default
}
