package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ?Das selbe wie Appearance?
trait ISettings extends StObject {
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var uses: settings
}
object ISettings {
  
  inline def apply(): ISettings = {
    val __obj = js.Dynamic.literal(uses = "settings")
    __obj.asInstanceOf[ISettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setUses(value: settings): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
