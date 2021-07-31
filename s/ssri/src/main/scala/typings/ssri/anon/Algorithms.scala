package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithms extends StObject {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Algorithms {
  
  @scala.inline
  def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  
  @scala.inline
  implicit class AlgorithmsMutableBuilder[Self <: Algorithms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    @scala.inline
    def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
