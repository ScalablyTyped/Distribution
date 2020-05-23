package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventTarget {
  def readText(): js.Promise[java.lang.String] = js.native
  def writeText(data: java.lang.String): js.Promise[Unit] = js.native
}

