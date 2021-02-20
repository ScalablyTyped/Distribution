package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInitialProperties extends StObject {
  
  // IListObjectDef;
  var fixed: js.UndefOr[Boolean] = js.native
  
  var percent: js.UndefOr[Boolean] = js.native
  
  var qHyperCubeDef: js.UndefOr[js.Any] = js.native
  
  // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[js.Any] = js.native
  
  var selectionMode: js.UndefOr[SelectionModeType] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object IInitialProperties {
  
  @scala.inline
  def apply(): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitialProperties]
  }
  
  @scala.inline
  implicit class IInitialPropertiesMutableBuilder[Self <: IInitialProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    @scala.inline
    def setQHyperCubeDef(value: js.Any): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHyperCubeDefUndefined: Self = StObject.set(x, "qHyperCubeDef", js.undefined)
    
    @scala.inline
    def setQListObjectDef(value: js.Any): Self = StObject.set(x, "qListObjectDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQListObjectDefUndefined: Self = StObject.set(x, "qListObjectDef", js.undefined)
    
    @scala.inline
    def setSelectionMode(value: SelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
