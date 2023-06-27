package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverSize) */
trait ResizeObserverSize extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverSize/blockSize) */
  /* standard dom */
  val blockSize: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ResizeObserverSize/inlineSize) */
  /* standard dom */
  val inlineSize: Double
}
object ResizeObserverSize {
  
  inline def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeObserverSize] (val x: Self) extends AnyVal {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setInlineSize(value: Double): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
  }
}
