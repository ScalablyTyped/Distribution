package typings
package stackDashMapperLib.stackDashMapperMod.stackMapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackMapper extends js.Object {
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
  def map(stack: js.Array[Callsite]): js.Array[Callsite]
}

object StackMapper {
  @scala.inline
  def apply(map: js.Function1[js.Array[Callsite], js.Array[Callsite]]): StackMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[StackMapper]
  }
}

