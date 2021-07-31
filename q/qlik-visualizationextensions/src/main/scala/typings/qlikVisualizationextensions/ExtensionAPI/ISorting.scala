package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.sorting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISorting extends StObject {
  
  var uses: sorting
}
object ISorting {
  
  @scala.inline
  def apply(): ISorting = {
    val __obj = js.Dynamic.literal(uses = "sorting")
    __obj.asInstanceOf[ISorting]
  }
  
  @scala.inline
  implicit class ISortingMutableBuilder[Self <: ISorting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUses(value: sorting): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
