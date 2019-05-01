package typings
package atProtobufjsCodegenLib.atProtobufjsCodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/codegen", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
  var verbose: scala.Boolean = js.native
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(): Codegen = js.native
  def apply(functionName: java.lang.String): Codegen = js.native
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def apply(functionParams: js.Array[java.lang.String]): Codegen = js.native
  def apply(functionParams: js.Array[java.lang.String], functionName: java.lang.String): Codegen = js.native
}

