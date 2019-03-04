package typings
package reactDashMosaicDashComponentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: java.lang.String
  var zeroStateView: reactLib.reactMod.Global.JSXNs.Element
  def onChange(): js.UndefOr[scala.Nothing]
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: java.lang.String,
    onChange: js.Function0[js.UndefOr[scala.Nothing]],
    zeroStateView: reactLib.reactMod.Global.JSXNs.Element
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, onChange = onChange, zeroStateView = zeroStateView)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

