package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstrainDOMStringParameters extends StObject {
  
  var exact: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  
  var ideal: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}
object ConstrainDOMStringParameters {
  
  @scala.inline
  def apply(): ConstrainDOMStringParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstrainDOMStringParameters]
  }
  
  @scala.inline
  implicit class ConstrainDOMStringParametersMutableBuilder[Self <: ConstrainDOMStringParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setExactVarargs(value: java.lang.String*): Self = StObject.set(x, "exact", js.Array(value :_*))
    
    @scala.inline
    def setIdeal(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdealUndefined: Self = StObject.set(x, "ideal", js.undefined)
    
    @scala.inline
    def setIdealVarargs(value: java.lang.String*): Self = StObject.set(x, "ideal", js.Array(value :_*))
  }
}
