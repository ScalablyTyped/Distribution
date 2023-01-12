package typings.reactNativePaper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelYOffset extends StObject {
  
  var affixHeight: Double
  
  var height: Double
  
  var labelYOffset: Double
}
object LabelYOffset {
  
  inline def apply(affixHeight: Double, height: Double, labelYOffset: Double): LabelYOffset = {
    val __obj = js.Dynamic.literal(affixHeight = affixHeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], labelYOffset = labelYOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelYOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelYOffset] (val x: Self) extends AnyVal {
    
    inline def setAffixHeight(value: Double): Self = StObject.set(x, "affixHeight", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLabelYOffset(value: Double): Self = StObject.set(x, "labelYOffset", value.asInstanceOf[js.Any])
  }
}
