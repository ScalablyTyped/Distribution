package typings.rangeParser

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(size: Double, str: String): Result | Ranges = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Result | Ranges]
  inline def apply(size: Double, str: String, options: Options): Result | Ranges = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result | Ranges]
  
  @JSImport("range-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The "combine" option can be set to `true` and overlapping & adjacent ranges
      * will be combined into a single range.
      */
    var combine: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCombine(value: Boolean): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
      
      inline def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Range {
    
    inline def apply(end: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ranges
    extends StObject
       with Array[Range] {
    
    var `type`: String = js.native
  }
  
  type Result = ResultUnsatisfiable | ResultInvalid
  
  type ResultInvalid = -2
  
  type ResultUnsatisfiable = -1
}
