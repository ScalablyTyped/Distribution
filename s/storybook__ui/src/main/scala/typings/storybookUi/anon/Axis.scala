package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  var axis: typings.storybookUi.draggersMod.Axis
  
  var isDragging: Boolean
}
object Axis {
  
  inline def apply(axis: typings.storybookUi.draggersMod.Axis, isDragging: Boolean): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setAxis(value: typings.storybookUi.draggersMod.Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
  }
}
