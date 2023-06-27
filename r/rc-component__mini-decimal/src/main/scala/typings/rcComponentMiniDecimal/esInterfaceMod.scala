package typings.rcComponentMiniDecimal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait DecimalClass extends StObject {
    
    def add(value: ValueType): DecimalClass = js.native
    
    def equals(target: DecimalClass): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isInvalidate(): Boolean = js.native
    
    def isNaN(): Boolean = js.native
    
    def lessEquals(target: DecimalClass): Boolean = js.native
    
    def multi(value: ValueType): DecimalClass = js.native
    
    def negate(): DecimalClass = js.native
    
    def toNumber(): Double = js.native
    
    def toString(safe: Boolean): String = js.native
  }
  
  type ValueType = String | Double
}
