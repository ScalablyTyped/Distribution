package typings.snapchatLensStudio

import typings.snapchatLensStudio.MachineLearning.OutputMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds OutputPlaceholders for MLComponent. */
trait OutputBuilder
  extends StObject
     with ScriptObject {
  
  /** Builds and returns a new OutputPlaceholder. */
  def build(): OutputPlaceholder
  
  /** Sets the name of the OutputPlaceholder to be built. */
  def setName(name: String): OutputBuilder
  
  /** Sets the OutputMode of the OutputPlaceholder to be built. */
  def setOutputMode(outputMode: OutputMode): OutputBuilder
  
  /** Sets the shape of the OutputPlaceholder to be built. */
  def setShape(shape: vec3): OutputBuilder
  
  /** Sets the Transformer of the OutputPlaceholder to be built. */
  def setTransformer(transformer: Transformer): OutputBuilder
}
object OutputBuilder {
  
  inline def apply(
    build: () => OutputPlaceholder,
    getTypeName: () => String,
    isOfType: String => Boolean,
    setName: String => OutputBuilder,
    setOutputMode: OutputMode => OutputBuilder,
    setShape: vec3 => OutputBuilder,
    setTransformer: Transformer => OutputBuilder
  ): OutputBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), setName = js.Any.fromFunction1(setName), setOutputMode = js.Any.fromFunction1(setOutputMode), setShape = js.Any.fromFunction1(setShape), setTransformer = js.Any.fromFunction1(setTransformer))
    __obj.asInstanceOf[OutputBuilder]
  }
  
  extension [Self <: OutputBuilder](x: Self) {
    
    inline def setBuild(value: () => OutputPlaceholder): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetName(value: String => OutputBuilder): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetOutputMode(value: OutputMode => OutputBuilder): Self = StObject.set(x, "setOutputMode", js.Any.fromFunction1(value))
    
    inline def setSetShape(value: vec3 => OutputBuilder): Self = StObject.set(x, "setShape", js.Any.fromFunction1(value))
    
    inline def setSetTransformer(value: Transformer => OutputBuilder): Self = StObject.set(x, "setTransformer", js.Any.fromFunction1(value))
  }
}
