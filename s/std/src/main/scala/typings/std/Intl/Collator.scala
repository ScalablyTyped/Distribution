package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collator extends StObject {
  
  def compare(x: String, y: String): Double
  
  def resolvedOptions(): ResolvedCollatorOptions
}
object Collator {
  
  @scala.inline
  def apply(compare: (String, String) => Double, resolvedOptions: () => ResolvedCollatorOptions): Collator = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[Collator]
  }
  
  @scala.inline
  implicit class CollatorMutableBuilder[Self <: Collator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompare(value: (String, String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolvedOptions(value: () => ResolvedCollatorOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
  }
}
