package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAppearance extends StObject {
  
  var items: js.Any
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var uses: settings
}
object IAppearance {
  
  @scala.inline
  def apply(items: js.Any): IAppearance = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], uses = "settings")
    __obj.asInstanceOf[IAppearance]
  }
  
  @scala.inline
  implicit class IAppearanceMutableBuilder[Self <: IAppearance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setUses(value: settings): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
