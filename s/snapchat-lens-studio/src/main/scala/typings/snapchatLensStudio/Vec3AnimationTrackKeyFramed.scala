package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using vec3 value keyframes. */
trait Vec3AnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a keyframe value value at time time. */
  def addKey(time: Double, value: vec3): Unit
  
  /** Removes all keyframes. */
  def removeAllKeys(): Unit
  
  /** Removes the keyframe at index. */
  def removeKeyAt(index: Double): Unit
}
object Vec3AnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, vec3) => Unit,
    getTypeName: () => String,
    isOfType: String => Boolean,
    removeAllKeys: () => Unit,
    removeKeyAt: Double => Unit
  ): Vec3AnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2(addKey), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = js.Any.fromFunction0(removeAllKeys), removeKeyAt = js.Any.fromFunction1(removeKeyAt))
    __obj.asInstanceOf[Vec3AnimationTrackKeyFramed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vec3AnimationTrackKeyFramed] (val x: Self) extends AnyVal {
    
    inline def setAddKey(value: (Double, vec3) => Unit): Self = StObject.set(x, "addKey", js.Any.fromFunction2(value))
    
    inline def setRemoveAllKeys(value: () => Unit): Self = StObject.set(x, "removeAllKeys", js.Any.fromFunction0(value))
    
    inline def setRemoveKeyAt(value: Double => Unit): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1(value))
  }
}
