package typings.slate.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins[T /* <: Controller */] extends Array[Plugin[T] | Plugins[T]]

