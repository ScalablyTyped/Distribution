package typings.reactBootstrapTable.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  var comparator: CSSProperties = js.native
  
  var number: CSSProperties = js.native
}
object Number {
  
  @scala.inline
  def apply(comparator: CSSProperties, number: CSSProperties): Number = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
  
  @scala.inline
  implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: CSSProperties): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: CSSProperties): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
