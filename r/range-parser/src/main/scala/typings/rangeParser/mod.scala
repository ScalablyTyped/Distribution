package typings.rangeParser

import typings.rangeParser.rangeParserNumbers.`-1`
import typings.rangeParser.rangeParserNumbers.`-2`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(size: Double, str: String): Result | Ranges = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Result | Ranges]
  @scala.inline
  def apply(size: Double, str: String, options: Options): Result | Ranges = (^.asInstanceOf[js.Dynamic].apply(size.asInstanceOf[js.Any], str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result | Ranges]
  
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
  
  trait Range extends StObject {
    
    var end: Double
    
    var start: Double
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
  trait Ranges
    extends StObject
       with Array[Range] {
    
    var `type`: String = js.native
  }
  
  type Result = ResultUnsatisfiable | ResultInvalid
  
  type ResultInvalid = `-2`
  
  type ResultUnsatisfiable = `-1`
}
