package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneComputed extends StObject {
  
  def indexedPanes(): SplitpaneIndexedType | Null
  
  def panesCount(): Double
}
object SplitpaneComputed {
  
  inline def apply(indexedPanes: () => SplitpaneIndexedType | Null, panesCount: () => Double): SplitpaneComputed = {
    val __obj = js.Dynamic.literal(indexedPanes = js.Any.fromFunction0(indexedPanes), panesCount = js.Any.fromFunction0(panesCount))
    __obj.asInstanceOf[SplitpaneComputed]
  }
  
  extension [Self <: SplitpaneComputed](x: Self) {
    
    inline def setIndexedPanes(value: () => SplitpaneIndexedType | Null): Self = StObject.set(x, "indexedPanes", js.Any.fromFunction0(value))
    
    inline def setPanesCount(value: () => Double): Self = StObject.set(x, "panesCount", js.Any.fromFunction0(value))
  }
}
