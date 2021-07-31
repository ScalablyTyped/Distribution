package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A key range can be a single value or a range with upper and lower bounds or endpoints. If the key range has both upper and lower bounds, then it is bounded; if it has no bounds, it is unbounded. A bounded key range can either be open (the endpoints are excluded) or closed (the endpoints are included). To retrieve all keys within a certain range, you can use the following code constructs: */
trait IDBKeyRange extends StObject {
  
  /**
    * Returns true if key is included in the range, and false otherwise.
    */
  def includes(key: js.Any): scala.Boolean
  
  /**
    * Returns lower bound, or undefined if none.
    */
  val lower: js.Any
  
  /**
    * Returns true if the lower open flag is set, and false otherwise.
    */
  val lowerOpen: scala.Boolean
  
  /**
    * Returns upper bound, or undefined if none.
    */
  val upper: js.Any
  
  /**
    * Returns true if the upper open flag is set, and false otherwise.
    */
  val upperOpen: scala.Boolean
}
object IDBKeyRange {
  
  @scala.inline
  def apply(
    includes: js.Any => scala.Boolean,
    lower: js.Any,
    lowerOpen: scala.Boolean,
    upper: js.Any,
    upperOpen: scala.Boolean
  ): IDBKeyRange = {
    val __obj = js.Dynamic.literal(includes = js.Any.fromFunction1(includes), lower = lower.asInstanceOf[js.Any], lowerOpen = lowerOpen.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], upperOpen = upperOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBKeyRange]
  }
  
  @scala.inline
  implicit class IDBKeyRangeMutableBuilder[Self <: IDBKeyRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludes(value: js.Any => scala.Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLower(value: js.Any): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowerOpen(value: scala.Boolean): Self = StObject.set(x, "lowerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: js.Any): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpperOpen(value: scala.Boolean): Self = StObject.set(x, "upperOpen", value.asInstanceOf[js.Any])
  }
}
