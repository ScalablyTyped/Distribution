package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds InputPlaceHolders for MLComponent. */
trait InputBuilder
  extends StObject
     with ScriptObject {
  
  /** Builds and returns a new InputPlaceholder. */
  def build(): InputPlaceholder
  
  /** Sets the input texture of the InputPlaceholder to be built. */
  def setInputTexture(texture: Texture): InputBuilder
  
  /** Sets the name of the InputPlaceholder to be built. */
  def setName(name: String): InputBuilder
  
  /** Sets the shape of the InputPlaceholder to be built. */
  def setShape(shape: vec3): InputBuilder
  
  /** Sets the Transformer of the InputPlaceholder to be built. */
  def setTransformer(transformer: Transformer): InputBuilder
}
object InputBuilder {
  
  inline def apply(
    build: () => InputPlaceholder,
    getTypeName: () => String,
    isOfType: String => Boolean,
    setInputTexture: Texture => InputBuilder,
    setName: String => InputBuilder,
    setShape: vec3 => InputBuilder,
    setTransformer: Transformer => InputBuilder
  ): InputBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), setInputTexture = js.Any.fromFunction1(setInputTexture), setName = js.Any.fromFunction1(setName), setShape = js.Any.fromFunction1(setShape), setTransformer = js.Any.fromFunction1(setTransformer))
    __obj.asInstanceOf[InputBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputBuilder] (val x: Self) extends AnyVal {
    
    inline def setBuild(value: () => InputPlaceholder): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetInputTexture(value: Texture => InputBuilder): Self = StObject.set(x, "setInputTexture", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => InputBuilder): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetShape(value: vec3 => InputBuilder): Self = StObject.set(x, "setShape", js.Any.fromFunction1(value))
    
    inline def setSetTransformer(value: Transformer => InputBuilder): Self = StObject.set(x, "setTransformer", js.Any.fromFunction1(value))
  }
}
