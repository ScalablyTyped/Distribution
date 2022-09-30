package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides basic information about a transformation. See also: DeviceTracking */
trait BasicTransform
  extends StObject
     with ScriptObject {
  
  /** Returns the inverted world matrix of the BasicTransform. */
  def getInvertedMatrix(): mat4
  
  /** Returns the world matrix of the BasicTransform. */
  def getMatrix(): mat4
  
  /** Returns the world position of the BasicTransform. */
  def getPosition(): vec3
  
  /** Returns the world rotation of the BasicTransform. */
  def getRotation(): quat
  
  /** Returns the world scale of the BasicTransform. */
  def getScale(): vec3
}
object BasicTransform {
  
  inline def apply(
    getInvertedMatrix: () => mat4,
    getMatrix: () => mat4,
    getPosition: () => vec3,
    getRotation: () => quat,
    getScale: () => vec3,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): BasicTransform = {
    val __obj = js.Dynamic.literal(getInvertedMatrix = js.Any.fromFunction0(getInvertedMatrix), getMatrix = js.Any.fromFunction0(getMatrix), getPosition = js.Any.fromFunction0(getPosition), getRotation = js.Any.fromFunction0(getRotation), getScale = js.Any.fromFunction0(getScale), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[BasicTransform]
  }
  
  extension [Self <: BasicTransform](x: Self) {
    
    inline def setGetInvertedMatrix(value: () => mat4): Self = StObject.set(x, "getInvertedMatrix", js.Any.fromFunction0(value))
    
    inline def setGetMatrix(value: () => mat4): Self = StObject.set(x, "getMatrix", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => vec3): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetRotation(value: () => quat): Self = StObject.set(x, "getRotation", js.Any.fromFunction0(value))
    
    inline def setGetScale(value: () => vec3): Self = StObject.set(x, "getScale", js.Any.fromFunction0(value))
  }
}
