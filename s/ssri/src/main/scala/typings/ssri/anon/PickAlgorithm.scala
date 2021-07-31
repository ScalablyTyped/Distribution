package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickAlgorithm extends StObject {
  
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object PickAlgorithm {
  
  @scala.inline
  def apply(): PickAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAlgorithm]
  }
  
  @scala.inline
  implicit class PickAlgorithmMutableBuilder[Self <: PickAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPickAlgorithm(value: (/* algo1 */ String, /* algo2 */ String) => String): Self = StObject.set(x, "pickAlgorithm", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPickAlgorithmUndefined: Self = StObject.set(x, "pickAlgorithm", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
