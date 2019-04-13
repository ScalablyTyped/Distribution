package typings
package shotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shotMod {
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type Listener = js.Function2[/* req */ SimulatedRequestObject, /* res */ SimulatedResponseObject, scala.Unit]
  type SimulatedRequestObject = nodeLib.streamMod.Readable
  type SimulatedResponseObject = nodeLib.httpMod.ServerResponse
}
