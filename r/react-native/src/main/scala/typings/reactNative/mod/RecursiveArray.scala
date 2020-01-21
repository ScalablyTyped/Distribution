package typings.reactNative.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveArray[T]
  extends Array[T | js.Array[T] | RecursiveArray[T]]

