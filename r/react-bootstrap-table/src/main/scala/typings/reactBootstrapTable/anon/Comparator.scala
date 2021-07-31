package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comparator extends StObject {
  
  /**
    * Comparator value.
    */
  var comparator: FilterComparator
  
  /**
    * Number value.
    */
  var number: Double
}
object Comparator {
  
  @scala.inline
  def apply(comparator: FilterComparator, number: Double): Comparator = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comparator]
  }
  
  @scala.inline
  implicit class ComparatorMutableBuilder[Self <: Comparator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparator(value: FilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
