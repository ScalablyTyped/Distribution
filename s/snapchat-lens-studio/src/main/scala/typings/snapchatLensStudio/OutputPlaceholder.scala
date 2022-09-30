package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import typings.snapchatLensStudio.MachineLearning.OutputMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides output data from the neural network used by an MLComponent. For more information, see the MLComponent Scripting guide. */
trait OutputPlaceholder
  extends StObject
     with BasePlaceholder {
  
  /** Output as a Float32Array. Usable when mode is set to MachineLearning.OutputMode.Data. */
  var data: js.typedarray.Float32Array
  
  /** Which type of data the output is provided as. For example, Texture or Data. */
  var mode: OutputMode
  
  /** Output as a Texture. Usable when mode is set to MachineLearning.OutputMode.Texture. */
  var texture: Texture
}
object OutputPlaceholder {
  
  inline def apply(
    data: js.typedarray.Float32Array,
    getTypeName: () => String,
    isOfType: String => Boolean,
    mode: OutputMode,
    name: String,
    shape: vec3,
    texture: Texture,
    transformer: Transformer
  ): OutputPlaceholder = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPlaceholder]
  }
  
  extension [Self <: OutputPlaceholder](x: Self) {
    
    inline def setData(value: js.typedarray.Float32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMode(value: OutputMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
