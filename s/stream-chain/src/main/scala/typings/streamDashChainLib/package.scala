package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashChainLib {
  type Stream = js.Any
  type StreamItem = Stream | TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
