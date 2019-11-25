package typings.reactDashBootstrap.libFormControlStaticMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlStaticProps
  extends AllHTMLAttributes[FormControlStatic]
     with ClassAttributes[FormControlStatic] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object FormControlStaticProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[FormControlStatic] = null,
    ClassAttributes: ClassAttributes[FormControlStatic] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): FormControlStaticProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlStaticProps]
  }
}

