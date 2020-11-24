package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonArrayMatcher extends SinonMatcher {
  
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): SinonMatcher = js.native
  
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): SinonMatcher = js.native
  
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): SinonMatcher = js.native
  
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): SinonMatcher = js.native
}
object SinonArrayMatcher {
  
  @scala.inline
  def apply(
    and: SinonMatcher => SinonMatcher,
    contains: js.Array[_] => SinonMatcher,
    deepEquals: js.Array[_] => SinonMatcher,
    endsWith: js.Array[_] => SinonMatcher,
    or: SinonMatcher => SinonMatcher,
    startsWith: js.Array[_] => SinonMatcher,
    test: js.Any => Boolean
  ): SinonArrayMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), endsWith = js.Any.fromFunction1(endsWith), or = js.Any.fromFunction1(or), startsWith = js.Any.fromFunction1(startsWith), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[SinonArrayMatcher]
  }
  
  @scala.inline
  implicit class SinonArrayMatcherOps[Self <: SinonArrayMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContains(value: js.Array[_] => SinonMatcher): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeepEquals(value: js.Array[_] => SinonMatcher): Self = this.set("deepEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndsWith(value: js.Array[_] => SinonMatcher): Self = this.set("endsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartsWith(value: js.Array[_] => SinonMatcher): Self = this.set("startsWith", js.Any.fromFunction1(value))
  }
}
