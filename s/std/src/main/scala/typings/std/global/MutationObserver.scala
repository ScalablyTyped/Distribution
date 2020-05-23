package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.MutationCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MutationObserver")
@js.native
class MutationObserver protected ()
  extends typings.std.MutationObserver {
  def this(callback: MutationCallback) = this()
}

@JSGlobal("MutationObserver")
@js.native
object MutationObserver
  extends Instantiable1[/* callback */ MutationCallback, typings.std.MutationObserver]

