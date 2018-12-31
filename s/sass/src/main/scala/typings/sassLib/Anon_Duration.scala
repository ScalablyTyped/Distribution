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

