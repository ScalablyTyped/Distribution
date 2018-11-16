package typings
package shotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shotMod {
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, scala.Unit]
  type SimulatedRequestObject = nodeLib.streamMod.Readable
  type SimulatedResponseObject = nodeLib.httpMod.ServerResponse
}
