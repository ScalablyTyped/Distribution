package typings.reactDashMosaicDashComponent

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var zeroStateView: Element
  def onChange(): js.UndefOr[scala.Nothing]
}

object Anon_ClassName {
  @scala.inline
  def apply(className: String, onChange: () => js.UndefOr[scala.Nothing], zeroStateView: Element): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className, onChange = js.Any.fromFunction0(onChange), zeroStateView = zeroStateView)
  
    __obj.asInstanceOf[Anon_ClassName]
  }
}

