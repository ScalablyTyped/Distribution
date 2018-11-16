package typings
package sparkpostLib.sparkpostMod.SparkPostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response[T]
  extends nodeLib.httpMod.IncomingMessage {
  var body: T = js.native
}

