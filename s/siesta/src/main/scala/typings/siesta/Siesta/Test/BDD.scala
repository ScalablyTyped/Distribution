package typings.siesta.Siesta.Test

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Siesta.Test.BDD")
@js.native
object BDD extends js.Object {
  
  /**
    @class
    */
  @js.native
  trait Expectation extends js.Object {
    
    var not: Expectation = js.native
    
    def toBe(expectedValue: js.Any): Unit = js.native
    
    def toBeCloseTo(expectedValue: Double): Unit = js.native
    def toBeCloseTo(expectedValue: Double, precision: Double): Unit = js.native
    
    def toBeDefined(expectedValue: js.Any): Unit = js.native
    
    def toBeFalsy(expectedValue: js.Any): Unit = js.native
    
    def toBeGreaterThan(expectedValue: js.Any): Unit = js.native
    
    def toBeLessThan(expectedValue: js.Any): Unit = js.native
    
    def toBeNaN(expectedValue: js.Any): Unit = js.native
    
    def toBeNull(expectedValue: js.Any): Unit = js.native
    
    def toBeTruthy(expectedValue: js.Any): Unit = js.native
    
    def toBeUndefined(value: js.Any): Unit = js.native
    
    def toContain(element: js.Any): Unit = js.native
    
    def toEqual(expectedValue: js.Any): Unit = js.native
    
    def toMatch(regexp: RegExp): Unit = js.native
    
    def toThrow(): Unit = js.native
  }
}
