package typings.rxjs.internalCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "Immediate")
@js.native
object Immediate extends js.Object {
  
  def clearImmediate(handle: Double): Unit = js.native
  
  def setImmediate(cb: js.Function0[Unit]): Double = js.native
}
