package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collator extends StObject {
  
  /* standard es5 */
  def compare(x: String, y: String): Double
  
  /* standard es5 */
  def resolvedOptions(): ResolvedCollatorOptions
}
object Collator {
  
  inline def apply(compare: (String, String) => Double, resolvedOptions: () => ResolvedCollatorOptions): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[Collator]
  }
  
  extension [Self <: Collator](x: Self) {
    
    inline def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setResolvedOptions(value: () => ResolvedCollatorOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
  }
}
