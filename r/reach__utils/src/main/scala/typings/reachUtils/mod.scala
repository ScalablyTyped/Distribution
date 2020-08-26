package typings.reachUtils

import typings.react.mod.ReactEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def assignRef(): Unit = js.native
  def assignRef(ref: js.UndefOr[Ref[_]], value: ReactNode): Unit = js.native
  def assignRef(ref: Ref[_]): Unit = js.native
  def checkStyles(pkg: String): js.Function0[Unit] = js.native
  def wrapEvent(handler: js.UndefOr[scala.Nothing], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
  def wrapEvent(handler: ReactEventHandler[Element], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
}

