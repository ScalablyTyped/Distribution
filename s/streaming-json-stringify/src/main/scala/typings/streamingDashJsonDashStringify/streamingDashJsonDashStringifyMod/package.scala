package typings.streamingDashJsonDashStringify

import typings.node.streamMod.TransformOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamingDashJsonDashStringifyMod {
  type Options = Partial[Instance] with TransformOptions
  type Replacer = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
