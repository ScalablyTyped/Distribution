package typings
package pumpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pumpMod {
  type Callback = js.Function1[/* err */ stdLib.Error, js.Any]
  type Stream = nodeLib.NodeJSNs.ReadableStream | nodeLib.NodeJSNs.WritableStream
}
