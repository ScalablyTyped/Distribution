package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using float value keyframes. */
trait FloatAnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a key with value value at time time. */
  def addKey(time: Double, value: Double): Unit
  
  /** Removes all keys. */
  def removeAllKeys(): Unit
  
  /** Removes key at index index. */
  def removeKeyAt(index: Double): Unit
}
object FloatAnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, Double) => Unit,
    getTypeName: () => String,
    isOfType: String => Boolean,
    removeAllKeys: () => Unit,
    removeKeyAt: Double => Unit
  ): FloatAnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2(addKey), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = js.Any.fromFunction0(removeAllKeys), removeKeyAt = js.Any.fromFunction1(removeKeyAt))
    __obj.asInstanceOf[FloatAnimationTrackKeyFramed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FloatAnimationTrackKeyFramed] (val x: Self) extends AnyVal {
    
    inline def setAddKey(value: (Double, Double) => Unit): Self = StObject.set(x, "addKey", js.Any.fromFunction2(value))
    
    inline def setRemoveAllKeys(value: () => Unit): Self = StObject.set(x, "removeAllKeys", js.Any.fromFunction0(value))
    
    inline def setRemoveKeyAt(value: Double => Unit): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1(value))
  }
}
