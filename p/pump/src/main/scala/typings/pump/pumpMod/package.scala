package typings.pump

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pumpMod {
  import typings.node.NodeJSNs.ReadableStream
  import typings.node.NodeJSNs.WritableStream
  import typings.std.Error

  type Callback = js.Function1[/* err */ Error, js.Any]
  type Stream = ReadableStream | WritableStream
}
