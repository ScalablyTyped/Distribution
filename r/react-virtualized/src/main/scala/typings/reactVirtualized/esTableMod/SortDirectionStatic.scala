package typings.reactVirtualized.esTableMod

import typings.reactVirtualized.reactVirtualizedStrings.ASC
import typings.reactVirtualized.reactVirtualizedStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortDirectionStatic extends StObject {
  
  /**
    * Sort items in ascending order.
    * This means arranging from the lowest value to the highest (e.g. a-z, 0-9).
    */
  var ASC: typings.reactVirtualized.reactVirtualizedStrings.ASC
  
  /**
    * Sort items in descending order.
    * This means arranging from the highest value to the lowest (e.g. z-a, 9-0).
    */
  var DESC: typings.reactVirtualized.reactVirtualizedStrings.DESC
}
object SortDirectionStatic {
  
  inline def apply(): SortDirectionStatic = {
    val __obj = js.Dynamic.literal(ASC = "ASC", DESC = "DESC")
    __obj.asInstanceOf[SortDirectionStatic]
  }
  
  extension [Self <: SortDirectionStatic](x: Self) {
    
    inline def setASC(value: ASC): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
    
    inline def setDESC(value: DESC): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
  }
}
