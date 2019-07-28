package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worklet extends js.Object {
  def addModule(moduleURL: java.lang.String): js.Promise[Unit] = js.native
  def addModule(moduleURL: java.lang.String, options: WorkletOptions): js.Promise[Unit] = js.native
}

@JSGlobal("Worklet")
@js.native
class WorkletCls () extends Worklet

@JSGlobal("Worklet")
@js.native
object Worklet extends Instantiable0[Worklet]

