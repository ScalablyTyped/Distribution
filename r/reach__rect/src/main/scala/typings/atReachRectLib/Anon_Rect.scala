package typings
package atReachRectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rect extends js.Object {
  var rect: stdLib.DOMRect
  var ref: reactLib.reactMod.Ref[_]
}

object Anon_Rect {
  @scala.inline
  def apply(rect: stdLib.DOMRect, ref: reactLib.reactMod.Ref[_]): Anon_Rect = {
    val __obj = js.Dynamic.literal(rect = rect, ref = ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Rect]
  }
}

