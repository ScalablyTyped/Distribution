package typings.reactSketchapp.anon

import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.slideFromBottom
import typings.reactSketchapp.reactSketchappStrings.slideFromLeft
import typings.reactSketchapp.reactSketchappStrings.slideFromRight
import typings.reactSketchapp.reactSketchappStrings.slideFromTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var animationType: js.UndefOr[none | slideFromRight | slideFromLeft | slideFromBottom | slideFromTop] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var targetId: js.UndefOr[String] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
    
    inline def setAnimationType(value: none | slideFromRight | slideFromLeft | slideFromBottom | slideFromTop): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
