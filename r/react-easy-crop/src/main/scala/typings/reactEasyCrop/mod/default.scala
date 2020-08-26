package typings.reactEasyCrop.mod

import typings.react.mod.Touch
import typings.reactEasyCrop.anon.Aspect
import typings.reactEasyCrop.anon.X
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-easy-crop", JSImport.Default)
@js.native
class default () extends Cropper

/* static members */
@JSImport("react-easy-crop", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Aspect = js.native
  def getMousePoint(e: typings.react.mod.MouseEvent[Element, MouseEvent]): X = js.native
  def getMousePoint(e: MouseEvent): X = js.native
  def getTouchPoint(touch: Touch): X = js.native
  def getTouchPoint(touch: typings.std.Touch): X = js.native
}

