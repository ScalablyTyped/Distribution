package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an animation track using vec3 animation tracks. */
trait Vec3AnimationTrackXYZ
  extends StObject
     with ScriptObject {
  
  /** Returns the child track at index index */
  def getChildTrackByIndex(index: Double): AnimationTrack
  
  /** Sets the child track at index index to track */
  def setChildTrackByIndex(index: Double, track: AnimationTrack): Unit
}
object Vec3AnimationTrackXYZ {
  
  inline def apply(
    getChildTrackByIndex: Double => AnimationTrack,
    getTypeName: () => String,
    isOfType: String => Boolean,
    setChildTrackByIndex: (Double, AnimationTrack) => Unit
  ): Vec3AnimationTrackXYZ = {
    val __obj = js.Dynamic.literal(getChildTrackByIndex = js.Any.fromFunction1(getChildTrackByIndex), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), setChildTrackByIndex = js.Any.fromFunction2(setChildTrackByIndex))
    __obj.asInstanceOf[Vec3AnimationTrackXYZ]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vec3AnimationTrackXYZ] (val x: Self) extends AnyVal {
    
    inline def setGetChildTrackByIndex(value: Double => AnimationTrack): Self = StObject.set(x, "getChildTrackByIndex", js.Any.fromFunction1(value))
    
    inline def setSetChildTrackByIndex(value: (Double, AnimationTrack) => Unit): Self = StObject.set(x, "setChildTrackByIndex", js.Any.fromFunction2(value))
  }
}
