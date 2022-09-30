package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for Input and Output Placeholders used by MLComponent. */
trait BasePlaceholder
  extends StObject
     with ScriptObject {
  
  /** The name of the Placeholder. */
  var name: String
  
  /** The shape of the Placeholder’s data. */
  var shape: vec3
  
  /** Transformer object for applying transformations on the PlaceHolder’s data. */
  var transformer: Transformer
}
object BasePlaceholder {
  
  inline def apply(
    getTypeName: () => String,
    isOfType: String => Boolean,
    name: String,
    shape: vec3,
    transformer: Transformer
  ): BasePlaceholder = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePlaceholder]
  }
  
  extension [Self <: BasePlaceholder](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShape(value: vec3): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: Transformer): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
  }
}
