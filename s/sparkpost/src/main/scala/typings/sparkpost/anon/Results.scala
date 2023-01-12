package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results[T] extends StObject {
  
  var results: T
}
object Results {
  
  inline def apply[T](results: T): Results[T] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Results[?], T] (val x: Self & Results[T]) extends AnyVal {
    
    inline def setResults(value: T): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
