package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.addons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddOns extends StObject {
  
  var uses: addons
}
object IAddOns {
  
  inline def apply(): IAddOns = {
    val __obj = js.Dynamic.literal(uses = "addons")
    __obj.asInstanceOf[IAddOns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAddOns] (val x: Self) extends AnyVal {
    
    inline def setUses(value: addons): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
