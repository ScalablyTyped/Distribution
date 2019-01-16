package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Worklet extends js.Object {
  def addModule(moduleURL: java.lang.String): Promise[scala.Unit] = js.native
  def addModule(moduleURL: java.lang.String, options: WorkletOptions): Promise[scala.Unit] = js.native
}

@JSGlobal("Worklet")
@js.native
object Worklet
  extends org.scalablytyped.runtime.Instantiable0[Worklet]

