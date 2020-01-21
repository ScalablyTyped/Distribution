package typings.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  /**
    * `end - start`
    */
  var duration: Double
  /**
    * `Date.now()` after the compilation.
    */
  var end: Double
  /**
    * The path to the scss file, or `data` if the source was not a file.
    */
  var entry: String
  /**
    * Absolute paths to all related files in no particular order.
    */
  var includedFiles: js.Array[String]
  /**
    * `Date.now()` before the compilation.
    */
  var start: Double
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], includedFiles = includedFiles.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

