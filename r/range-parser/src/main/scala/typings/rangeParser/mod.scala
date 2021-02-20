package typings.rangeParser

import typings.rangeParser.rangeParserNumbers.`-1`
import typings.rangeParser.rangeParserNumbers.`-2`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("range-parser", JSImport.Namespace)
  @js.native
  def apply(size: Double, str: String): Result | Ranges = js.native
  @JSImport("range-parser", JSImport.Namespace)
  @js.native
  def apply(size: Double, str: String, options: Options): Result | Ranges = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The "combine" option can be set to `true` and overlapping & adjacent ranges
      * will be combined into a single range.
      */
    var combine: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCombine(value: Boolean): Self = StObject.set(x, "combine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombineUndefined: Self = StObject.set(x, "combine", js.undefined)
    }
  }
  
  @js.native
  trait Range extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object Range {
    
    @scala.inline
    def apply(end: Double, start: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ranges extends Array[Range] {
    
    var `type`: String = js.native
  }
  
  type Result = ResultUnsatisfiable | ResultInvalid
  
  type ResultInvalid = `-2`
  
  type ResultUnsatisfiable = `-1`
}
