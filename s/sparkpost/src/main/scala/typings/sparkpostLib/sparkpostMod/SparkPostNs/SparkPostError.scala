package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparkPostError
  extends nodeLib.Error {
  var errors: js.Array[ErrorWithDescription] | js.Array[ErrorWithParam]
  var name: sparkpostLib.sparkpostLibStrings.SparkPostError
  var statusCode: scala.Double
}

