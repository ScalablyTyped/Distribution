package typings.reactDashBootstrap.libHelpBlockMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelpBlockProps
  extends AllHTMLAttributes[HelpBlock]
     with ClassAttributes[HelpBlock] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object HelpBlockProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HelpBlock] = null,
    ClassAttributes: ClassAttributes[HelpBlock] = null,
    bsClass: String = null
  ): HelpBlockProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[HelpBlockProps]
  }
}

