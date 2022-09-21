package typings.roll

import typings.roll.anon.Quantity
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roll", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Roll {
    def this(seed: js.Function0[Double]) = this()
  }
  
  trait InvalidInputError
    extends StObject
       with Error {
    
    @JSName("name")
    var name_InvalidInputError: typings.roll.rollStrings.InvalidInputError
  }
  object InvalidInputError {
    
    /* static member */
    @JSImport("roll", "InvalidInputError")
    @js.native
    val ^ : InvalidInputError = js.native
    
    extension [Self <: InvalidInputError](x: Self) {
      
      inline def setName(value: typings.roll.rollStrings.InvalidInputError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Roll extends StObject {
    
    /**
      * Parse a string into a roll object
      * @throws InvalidInputError
      */
    def parse(input: String): Quantity = js.native
    
    /**
      * Roll based on a string or roll object
      */
    def roll(input: String): RollOutput = js.native
    def roll(input: RollObject): RollOutput = js.native
    
    /**
      * Validate user input
      */
    def validate(input: String): Boolean = js.native
  }
  
  trait RollObject extends StObject {
    
    var quantity: Double
    
    var sides: Double
    
    var transformations: js.Array[RollTransformation]
  }
  object RollObject {
    
    inline def apply(quantity: Double, sides: Double, transformations: js.Array[RollTransformation]): RollObject = {
      val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], transformations = transformations.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollObject]
    }
    
    extension [Self <: RollObject](x: Self) {
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
      
      inline def setTransformations(value: js.Array[RollTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      inline def setTransformationsVarargs(value: RollTransformation*): Self = StObject.set(x, "transformations", js.Array(value*))
    }
  }
  
  trait RollOutput extends StObject {
    
    var calculations: js.Array[Double]
    
    var input: RollObject
    
    var result: Double
    
    var rolled: js.Array[Double]
  }
  object RollOutput {
    
    inline def apply(calculations: js.Array[Double], input: RollObject, result: Double, rolled: js.Array[Double]): RollOutput = {
      val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rolled = rolled.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollOutput]
    }
    
    extension [Self <: RollOutput](x: Self) {
      
      inline def setCalculations(value: js.Array[Double]): Self = StObject.set(x, "calculations", value.asInstanceOf[js.Any])
      
      inline def setCalculationsVarargs(value: Double*): Self = StObject.set(x, "calculations", js.Array(value*))
      
      inline def setInput(value: RollObject): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setRolled(value: js.Array[Double]): Self = StObject.set(x, "rolled", value.asInstanceOf[js.Any])
      
      inline def setRolledVarargs(value: Double*): Self = StObject.set(x, "rolled", js.Array(value*))
    }
  }
  
  type RollTransformation = RollTransformationKey | (js.Tuple2[RollTransformationKey, Double]) | (js.Function1[/* results */ js.Array[Double], js.Array[Double]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.roll.rollStrings.sum
    - typings.roll.rollStrings.add
    - typings.roll.rollStrings.subtract
    - typings.roll.rollStrings.multiply
    - typings.roll.rollStrings.divide
    - typings.roll.rollStrings.`best-of`
    - typings.roll.rollStrings.`worst-of`
  */
  trait RollTransformationKey extends StObject
  object RollTransformationKey {
    
    inline def add: typings.roll.rollStrings.add = "add".asInstanceOf[typings.roll.rollStrings.add]
    
    inline def `best-of`: typings.roll.rollStrings.`best-of` = "best-of".asInstanceOf[typings.roll.rollStrings.`best-of`]
    
    inline def divide: typings.roll.rollStrings.divide = "divide".asInstanceOf[typings.roll.rollStrings.divide]
    
    inline def multiply: typings.roll.rollStrings.multiply = "multiply".asInstanceOf[typings.roll.rollStrings.multiply]
    
    inline def subtract: typings.roll.rollStrings.subtract = "subtract".asInstanceOf[typings.roll.rollStrings.subtract]
    
    inline def sum: typings.roll.rollStrings.sum = "sum".asInstanceOf[typings.roll.rollStrings.sum]
    
    inline def `worst-of`: typings.roll.rollStrings.`worst-of` = "worst-of".asInstanceOf[typings.roll.rollStrings.`worst-of`]
  }
}
