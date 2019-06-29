package typings
package atReachUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/utils", JSImport.Namespace)
@js.native
object atReachUtilsMod extends js.Object {
  def assignRef(): scala.Unit = js.native
  def assignRef(ref: reactLib.reactMod.Ref[_]): scala.Unit = js.native
  def assignRef(ref: reactLib.reactMod.Ref[_], value: reactLib.reactMod.ReactNode): scala.Unit = js.native
  def checkStyles(pkg: java.lang.String): js.Function0[scala.Unit] = js.native
  def wrapEvent(handler: js.UndefOr[scala.Nothing], cb: reactLib.reactMod.ReactEventHandler[reactLib.Element]): reactLib.reactMod.ReactEventHandler[reactLib.Element] = js.native
  def wrapEvent(
    handler: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    cb: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  ): reactLib.reactMod.ReactEventHandler[reactLib.Element] = js.native
}

