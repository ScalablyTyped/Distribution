package typings.reactSketchapp.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationType extends StObject {
  
  var animationType: Requireable[String]
  
  var target: Requireable[String]
  
  var targetId: Requireable[String]
}
object AnimationType {
  
  inline def apply(animationType: Requireable[String], target: Requireable[String], targetId: Requireable[String]): AnimationType = {
    val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationType] (val x: Self) extends AnyVal {
    
    inline def setAnimationType(value: Requireable[String]): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Requireable[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: Requireable[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
