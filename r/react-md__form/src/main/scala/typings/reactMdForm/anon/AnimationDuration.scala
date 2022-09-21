package typings.reactMdForm.anon

import typings.react.mod.Ref
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationDuration extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLSpanElement | Null]] = js.undefined
  
  var thumb1Ref: js.UndefOr[Ref[HTMLSpanElement | Null]] = js.undefined
  
  var thumb2Ref: js.UndefOr[Ref[HTMLSpanElement | Null]] = js.undefined
}
object AnimationDuration {
  
  inline def apply(): AnimationDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationDuration]
  }
  
  extension [Self <: AnimationDuration](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setRef(value: Ref[HTMLSpanElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setThumb1Ref(value: Ref[HTMLSpanElement | Null]): Self = StObject.set(x, "thumb1Ref", value.asInstanceOf[js.Any])
    
    inline def setThumb1RefFunction1(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "thumb1Ref", js.Any.fromFunction1(value))
    
    inline def setThumb1RefNull: Self = StObject.set(x, "thumb1Ref", null)
    
    inline def setThumb1RefUndefined: Self = StObject.set(x, "thumb1Ref", js.undefined)
    
    inline def setThumb2Ref(value: Ref[HTMLSpanElement | Null]): Self = StObject.set(x, "thumb2Ref", value.asInstanceOf[js.Any])
    
    inline def setThumb2RefFunction1(value: /* instance */ (HTMLSpanElement | Null) | Null => Unit): Self = StObject.set(x, "thumb2Ref", js.Any.fromFunction1(value))
    
    inline def setThumb2RefNull: Self = StObject.set(x, "thumb2Ref", null)
    
    inline def setThumb2RefUndefined: Self = StObject.set(x, "thumb2Ref", js.undefined)
  }
}
