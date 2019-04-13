package typings
package reactDashBootstrapLib.libHelpBlockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelpBlockProps
  extends reactLib.reactMod.HTMLProps[HelpBlock] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object HelpBlockProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[HelpBlock] = null, bsClass: java.lang.String = null): HelpBlockProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[HelpBlockProps]
  }
}

