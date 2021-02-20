package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Results[T] extends StObject {
  
  var results: T = js.native
}
object Results {
  
  @scala.inline
  def apply[T](results: T): Results[T] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[T]]
  }
  
  @scala.inline
  implicit class ResultsMutableBuilder[Self <: Results[_], T] (val x: Self with Results[T]) extends AnyVal {
    
    @scala.inline
    def setResults(value: T): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
