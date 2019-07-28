package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clipboard extends EventTarget {
  def readText(): js.Promise[java.lang.String] = js.native
  def writeText(data: java.lang.String): js.Promise[Unit] = js.native
}

@JSGlobal("Clipboard")
@js.native
class ClipboardCls () extends Clipboard

@JSGlobal("Clipboard")
@js.native
object Clipboard extends Instantiable0[Clipboard]

