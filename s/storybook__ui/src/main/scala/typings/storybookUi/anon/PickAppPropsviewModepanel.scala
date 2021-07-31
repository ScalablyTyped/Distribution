package typings.storybookUi.anon

import typings.reactSizeme.mod.WithSizeOnSizeCallback
import typings.storybookApi.modulesStoriesMod.ViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@storybook/ui.@storybook/ui/dist/app.AppProps, 'viewMode' | 'panelCount' | 'docsOnly' | 'layout'> & react-sizeme.react-sizeme.WithSizeProps */
trait PickAppPropsviewModepanel extends StObject {
  
  var docsOnly: Boolean
  
  var layout: typings.storybookApi.layoutMod.Layout
  
  var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.undefined
  
  var panelCount: Double
  
  var viewMode: ViewMode & js.UndefOr[String]
}
object PickAppPropsviewModepanel {
  
  @scala.inline
  def apply(
    docsOnly: Boolean,
    layout: typings.storybookApi.layoutMod.Layout,
    panelCount: Double,
    viewMode: ViewMode & js.UndefOr[String]
  ): PickAppPropsviewModepanel = {
    val __obj = js.Dynamic.literal(docsOnly = docsOnly.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAppPropsviewModepanel]
  }
  
  @scala.inline
  implicit class PickAppPropsviewModepanelMutableBuilder[Self <: PickAppPropsviewModepanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: typings.storybookApi.layoutMod.Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSize(value: /* size */ typings.reactSizeme.anon.Height => Unit): Self = StObject.set(x, "onSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSizeUndefined: Self = StObject.set(x, "onSize", js.undefined)
    
    @scala.inline
    def setPanelCount(value: Double): Self = StObject.set(x, "panelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
