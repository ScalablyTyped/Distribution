package typings.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
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

object Anon_Duration {
  @scala.inline
  def apply(duration: Double, end: Double, entry: String, includedFiles: js.Array[String], start: Double): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration, end = end, entry = entry, includedFiles = includedFiles, start = start)
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

