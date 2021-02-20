package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.addons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddOns extends StObject {
  
  var uses: addons = js.native
}
object IAddOns {
  
  @scala.inline
  def apply(uses: addons): IAddOns = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOns]
  }
  
  @scala.inline
  implicit class IAddOnsMutableBuilder[Self <: IAddOns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUses(value: addons): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
