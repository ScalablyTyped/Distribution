package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using vec2 value keyframes. */
trait Vec2AnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a keyframe value value at time time. */
  def addKey(time: Double, value: vec2): Unit
  
  /** Removes all keyframes. */
  def removeAllKeys(): Unit
  
  /** Removes the keyframe at index. */
  def removeKeyAt(index: Double): Unit
}
object Vec2AnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, vec2) => Unit,
    getTypeName: () => String,
    isOfType: String => Boolean,
    removeAllKeys: () => Unit,
    removeKeyAt: Double => Unit
  ): Vec2AnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2(addKey), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = js.Any.fromFunction0(removeAllKeys), removeKeyAt = js.Any.fromFunction1(removeKeyAt))
    __obj.asInstanceOf[Vec2AnimationTrackKeyFramed]
  }
  
  extension [Self <: Vec2AnimationTrackKeyFramed](x: Self) {
    
    inline def setAddKey(value: (Double, vec2) => Unit): Self = StObject.set(x, "addKey", js.Any.fromFunction2(value))
    
    inline def setRemoveAllKeys(value: () => Unit): Self = StObject.set(x, "removeAllKeys", js.Any.fromFunction0(value))
    
    inline def setRemoveKeyAt(value: Double => Unit): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1(value))
  }
}
