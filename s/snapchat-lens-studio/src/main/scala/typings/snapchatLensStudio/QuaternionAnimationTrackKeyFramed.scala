package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using quaternion value keyframes. */
trait QuaternionAnimationTrackKeyFramed
  extends StObject
     with ScriptObject {
  
  /** Adds a key with value value at time time. */
  def addKey(time: Double, value: quat): Unit
  
  /** Removes all keys. */
  def removeAllKeys(): Unit
  
  /** Removes key at index index. */
  def removeKeyAt(index: Double): Unit
}
object QuaternionAnimationTrackKeyFramed {
  
  inline def apply(
    addKey: (Double, quat) => Unit,
    getTypeName: () => String,
    isOfType: String => Boolean,
    removeAllKeys: () => Unit,
    removeKeyAt: Double => Unit
  ): QuaternionAnimationTrackKeyFramed = {
    val __obj = js.Dynamic.literal(addKey = js.Any.fromFunction2(addKey), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), removeAllKeys = js.Any.fromFunction0(removeAllKeys), removeKeyAt = js.Any.fromFunction1(removeKeyAt))
    __obj.asInstanceOf[QuaternionAnimationTrackKeyFramed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuaternionAnimationTrackKeyFramed] (val x: Self) extends AnyVal {
    
    inline def setAddKey(value: (Double, quat) => Unit): Self = StObject.set(x, "addKey", js.Any.fromFunction2(value))
    
    inline def setRemoveAllKeys(value: () => Unit): Self = StObject.set(x, "removeAllKeys", js.Any.fromFunction0(value))
    
    inline def setRemoveKeyAt(value: Double => Unit): Self = StObject.set(x, "removeKeyAt", js.Any.fromFunction1(value))
  }
}
