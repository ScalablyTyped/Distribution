package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BDD {
  
  /**
    */
  @js.native
  trait Expectation extends StObject {
    
    var not: Expectation = js.native
    
    def toBe(expectedValue: Any): Unit = js.native
    
    def toBeCloseTo(expectedValue: Double): Unit = js.native
    def toBeCloseTo(expectedValue: Double, precision: Double): Unit = js.native
    
    def toBeDefined(expectedValue: Any): Unit = js.native
    
    def toBeFalsy(expectedValue: Any): Unit = js.native
    
    def toBeGreaterThan(expectedValue: Any): Unit = js.native
    
    def toBeLessThan(expectedValue: Any): Unit = js.native
    
    def toBeNaN(expectedValue: Any): Unit = js.native
    
    def toBeNull(expectedValue: Any): Unit = js.native
    
    def toBeTruthy(expectedValue: Any): Unit = js.native
    
    def toBeUndefined(value: Any): Unit = js.native
    
    def toContain(element: Any): Unit = js.native
    
    def toEqual(expectedValue: Any): Unit = js.native
    
    def toMatch(regexp: js.RegExp): Unit = js.native
    
    def toThrow(): Unit = js.native
  }
}
