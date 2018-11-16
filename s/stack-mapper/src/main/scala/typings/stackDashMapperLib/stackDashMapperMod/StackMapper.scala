package typings
package stackDashMapperLib.stackDashMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-mapper", "StackMapper")
@js.native
class StackMapper ()
  extends stackDashMapperLib.stackDashMapperMod.stackMapperNs.StackMapper {
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
  /* CompleteClass */
  override def map(stack: js.Array[stackDashMapperLib.stackDashMapperMod.stackMapperNs.Callsite]): js.Array[stackDashMapperLib.stackDashMapperMod.stackMapperNs.Callsite] = js.native
}

