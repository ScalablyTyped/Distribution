package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonArrayMatcher
  extends StObject
     with SinonMatcher {
  
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[js.Any]): SinonMatcher
  
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[js.Any]): SinonMatcher
  
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[js.Any]): SinonMatcher
  
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[js.Any]): SinonMatcher
}
object SinonArrayMatcher {
  
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: js.Array[js.Any] => SinonMatcher,
    deepEquals: js.Array[js.Any] => SinonMatcher,
    endsWith: js.Array[js.Any] => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    startsWith: js.Array[js.Any] => SinonMatcher,
    test: js.Any => Boolean
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), endsWith = js.Any.fromFunction1(endsWith), or = js.Any.fromFunction1(or), startsWith = js.Any.fromFunction1(startsWith), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonArrayMatcher]
  }
  
  @scala.inline
  implicit class SinonArrayMatcherMutableBuilder[Self <: SinonArrayMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: js.Array[js.Any] => SinonMatcher): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeepEquals(value: js.Array[js.Any] => SinonMatcher): Self = StObject.set(x, "deepEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndsWith(value: js.Array[js.Any] => SinonMatcher): Self = StObject.set(x, "endsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartsWith(value: js.Array[js.Any] => SinonMatcher): Self = StObject.set(x, "startsWith", js.Any.fromFunction1(value))
  }
}
