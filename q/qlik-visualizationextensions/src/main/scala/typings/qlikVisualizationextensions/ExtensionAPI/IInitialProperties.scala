package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInitialProperties extends StObject {
  
  // IListObjectDef;
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var percent: js.UndefOr[Boolean] = js.undefined
  
  var qHyperCubeDef: js.UndefOr[Any] = js.undefined
  
  // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[Any] = js.undefined
  
  var selectionMode: js.UndefOr[SelectionModeType] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object IInitialProperties {
  
  inline def apply(): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInitialProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInitialProperties] (val x: Self) extends AnyVal {
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setPercent(value: Boolean): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setQHyperCubeDef(value: Any): Self = StObject.set(x, "qHyperCubeDef", value.asInstanceOf[js.Any])
    
    inline def setQHyperCubeDefUndefined: Self = StObject.set(x, "qHyperCubeDef", js.undefined)
    
    inline def setQListObjectDef(value: Any): Self = StObject.set(x, "qListObjectDef", value.asInstanceOf[js.Any])
    
    inline def setQListObjectDefUndefined: Self = StObject.set(x, "qListObjectDef", js.undefined)
    
    inline def setSelectionMode(value: SelectionModeType): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
