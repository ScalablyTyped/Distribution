package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aniamtion extends StObject {
  
  var aniamtion: Boolean
  
  var defaultIndex: Double
  
  var groupIndex: Double
  
  var height: Double
  
  var indicatorHeight: Double
  
  var indicatorTop: Double
  
  var itemHeight: Double
  
  var mapKeys: Label
}
object Aniamtion {
  
  inline def apply(
    aniamtion: Boolean,
    defaultIndex: Double,
    groupIndex: Double,
    height: Double,
    indicatorHeight: Double,
    indicatorTop: Double,
    itemHeight: Double,
    mapKeys: Label
  ): Aniamtion = {
    val __obj = js.Dynamic.literal(aniamtion = aniamtion.asInstanceOf[js.Any], defaultIndex = defaultIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicatorHeight = indicatorHeight.asInstanceOf[js.Any], indicatorTop = indicatorTop.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], mapKeys = mapKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aniamtion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aniamtion] (val x: Self) extends AnyVal {
    
    inline def setAniamtion(value: Boolean): Self = StObject.set(x, "aniamtion", value.asInstanceOf[js.Any])
    
    inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndicatorHeight(value: Double): Self = StObject.set(x, "indicatorHeight", value.asInstanceOf[js.Any])
    
    inline def setIndicatorTop(value: Double): Self = StObject.set(x, "indicatorTop", value.asInstanceOf[js.Any])
    
    inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setMapKeys(value: Label): Self = StObject.set(x, "mapKeys", value.asInstanceOf[js.Any])
  }
}
