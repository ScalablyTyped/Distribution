package typings.atReachRect.atReachRectMod

import typings.react.reactMod.FC
import typings.react.reactMod.Ref
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/rect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: FC[RectProps] = js.native
  def useRect(ref: Ref[_]): DOMRect = js.native
  def useRect(ref: Ref[_], isSelected: Boolean): DOMRect = js.native
}

