package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderedModule extends StObject {
  
  var originalLength: Double
  
  var removedExports: js.Array[String]
  
  var renderedExports: js.Array[String]
  
  var renderedLength: Double
}
object RenderedModule {
  
  inline def apply(
    originalLength: Double,
    removedExports: js.Array[String],
    renderedExports: js.Array[String],
    renderedLength: Double
  ): RenderedModule = {
    val __obj = js.Dynamic.literal(originalLength = originalLength.asInstanceOf[js.Any], removedExports = removedExports.asInstanceOf[js.Any], renderedExports = renderedExports.asInstanceOf[js.Any], renderedLength = renderedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedModule]
  }
  
  extension [Self <: RenderedModule](x: Self) {
    
    inline def setOriginalLength(value: Double): Self = StObject.set(x, "originalLength", value.asInstanceOf[js.Any])
    
    inline def setRemovedExports(value: js.Array[String]): Self = StObject.set(x, "removedExports", value.asInstanceOf[js.Any])
    
    inline def setRemovedExportsVarargs(value: String*): Self = StObject.set(x, "removedExports", js.Array(value :_*))
    
    inline def setRenderedExports(value: js.Array[String]): Self = StObject.set(x, "renderedExports", value.asInstanceOf[js.Any])
    
    inline def setRenderedExportsVarargs(value: String*): Self = StObject.set(x, "renderedExports", js.Array(value :_*))
    
    inline def setRenderedLength(value: Double): Self = StObject.set(x, "renderedLength", value.asInstanceOf[js.Any])
  }
}
