package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The base class for specialized Texture providers. Can be accessed through Texture.control. */
trait TextureProvider
  extends StObject
     with ScriptObject {
  
  /** Returns the texture’s aspect ratio, which is calculated as width / height. */
  def getAspect(): Double
  
  /** Returns the height of the texture in pixels. */
  def getHeight(): Double
  
  /** Returns the width of the texture in pixels. */
  def getWidth(): Double
}
object TextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean
  ): TextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextureProvider] (val x: Self) extends AnyVal {
    
    inline def setGetAspect(value: () => Double): Self = StObject.set(x, "getAspect", js.Any.fromFunction0(value))
    
    inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
  }
}
