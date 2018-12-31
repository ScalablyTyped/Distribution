package typings
package stringDashArgvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("string-argv", JSImport.Namespace)
@js.native
object stringDashArgvMod extends js.Object {
  /**
    * Parses a string into an argument array to mimic `process.argv`.
    * @param value - Arguments that you would normally pass to the command line.
    * @param [env] - Adds to the environment position in the argv array.
    * If ommitted then there is no need to call argv.split(2) to remove the environment/file values.
    * However if your cli.parse method expects a valid argv value then you should include this value.
    * @param [file] - File that called the arguments.
    * If omitted then there is no need to call argv.split(2) to remove the environment/file values.
    * However if your cli.parse method expects a valid argv value then you should include this value.
    */
  def apply(value: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(value: java.lang.String, env: java.lang.String): js.Array[java.lang.String] = js.native
  def apply(value: java.lang.String, env: java.lang.String, file: java.lang.String): js.Array[java.lang.String] = js.native
}

