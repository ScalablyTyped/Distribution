package typings
package sassLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  /**
    * `end - start`
    */
  var duration: scala.Double
  /**
    * `Date.now()` after the compilation.
    */
  var end: scala.Double
  /**
    * The path to the scss file, or `data` if the source was not a file.
    */
  var entry: java.lang.String
  /**
    * Absolute paths to all related files in no particular order.
    */
  var includedFiles: js.Array[java.lang.String]
  /**
    * `Date.now()` before the compilation.
    */
  var start: scala.Double
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: scala.Double,
    end: scala.Double,
    entry: java.lang.String,
    includedFiles: js.Array[java.lang.String],
    start: scala.Double
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, end = end, entry = entry, includedFiles = includedFiles, start = start)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

