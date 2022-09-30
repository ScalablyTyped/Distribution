package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builds Transformer objects for MLComponent. */
trait TransformerBuilder
  extends StObject
     with ScriptObject {
  
  /** Builds and returns a Transformer object based on the current settings. */
  def build(): Transformer
  
  /** Sets the fill value used. */
  def setFillColor(color: vec4): TransformerBuilder
  
  /** Enables or disables horizontal flipping. */
  def setFlipX(value: Boolean): TransformerBuilder
  
  /** Enables or disables vertical flipping. */
  def setFlipY(value: Boolean): TransformerBuilder
  
  /** Sets the horizontal alignment type used. */
  def setHorizontalAlignment(mode: HorizontalAlignment): TransformerBuilder
  
  /** Sets the rotation type used. */
  def setRotation(mode: TransformerRotation): TransformerBuilder
  
  /** Sets the stretching type used. */
  def setStretch(value: Boolean): TransformerBuilder
  
  /** Sets the vertical alignment type used. */
  def setVerticalAlignment(mode: VerticalAlignment): TransformerBuilder
}
object TransformerBuilder {
  
  inline def apply(
    build: () => Transformer,
    getTypeName: () => String,
    isOfType: String => Boolean,
    setFillColor: vec4 => TransformerBuilder,
    setFlipX: Boolean => TransformerBuilder,
    setFlipY: Boolean => TransformerBuilder,
    setHorizontalAlignment: HorizontalAlignment => TransformerBuilder,
    setRotation: TransformerRotation => TransformerBuilder,
    setStretch: Boolean => TransformerBuilder,
    setVerticalAlignment: VerticalAlignment => TransformerBuilder
  ): TransformerBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), setFillColor = js.Any.fromFunction1(setFillColor), setFlipX = js.Any.fromFunction1(setFlipX), setFlipY = js.Any.fromFunction1(setFlipY), setHorizontalAlignment = js.Any.fromFunction1(setHorizontalAlignment), setRotation = js.Any.fromFunction1(setRotation), setStretch = js.Any.fromFunction1(setStretch), setVerticalAlignment = js.Any.fromFunction1(setVerticalAlignment))
    __obj.asInstanceOf[TransformerBuilder]
  }
  
  extension [Self <: TransformerBuilder](x: Self) {
    
    inline def setBuild(value: () => Transformer): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setSetFillColor(value: vec4 => TransformerBuilder): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1(value))
    
    inline def setSetFlipX(value: Boolean => TransformerBuilder): Self = StObject.set(x, "setFlipX", js.Any.fromFunction1(value))
    
    inline def setSetFlipY(value: Boolean => TransformerBuilder): Self = StObject.set(x, "setFlipY", js.Any.fromFunction1(value))
    
    inline def setSetHorizontalAlignment(value: HorizontalAlignment => TransformerBuilder): Self = StObject.set(x, "setHorizontalAlignment", js.Any.fromFunction1(value))
    
    inline def setSetRotation(value: TransformerRotation => TransformerBuilder): Self = StObject.set(x, "setRotation", js.Any.fromFunction1(value))
    
    inline def setSetStretch(value: Boolean => TransformerBuilder): Self = StObject.set(x, "setStretch", js.Any.fromFunction1(value))
    
    inline def setSetVerticalAlignment(value: VerticalAlignment => TransformerBuilder): Self = StObject.set(x, "setVerticalAlignment", js.Any.fromFunction1(value))
  }
}
