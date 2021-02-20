package typings.stackMapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a Stackmapper that will use the given source map to map error trace locations.
    *
    * @name stackMapper
    * @function
    * @param {Object} sourcemap source map for the generated file
    * @return {StackMapper} stack mapper for the particular source map
    */
  @JSImport("stack-mapper", JSImport.Namespace)
  @js.native
  def apply(sourcemap: js.Any): StackMapper = js.native
  
  @JSImport("stack-mapper", "StackMapper")
  @js.native
  class StackMapper () extends StObject {
    
    /**
      * Maps the trace statements of the given error stack and replaces locations
      * referencing code in the generated file with the locations inside the original files.
      *
      * @name map
      * @function
      * @param {Array} array of callsite objects (see readme for details about Callsite object)
      * @return {Array.<Object>} info about the error stack with adapted locations, each with the following properties
      *    - filename: original filename
      *    - line: origial line in that filename of the trace
      *    - column: origial column on that line of the trace
      */
    def map(stack: js.Array[Callsite]): js.Array[Callsite] = js.native
  }
  
  @js.native
  trait Callsite extends StObject {
    
    var column: Double = js.native
    
    var filename: String = js.native
    
    var line: Double = js.native
  }
  object Callsite {
    
    @scala.inline
    def apply(column: Double, filename: String, line: Double): Callsite = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callsite]
    }
    
    @scala.inline
    implicit class CallsiteMutableBuilder[Self <: Callsite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
