package typings.reactDashBootstrap.libFormControlStaticMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormControlStaticProps extends HTMLProps[FormControlStatic] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object FormControlStaticProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[FormControlStatic] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): FormControlStaticProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormControlStaticProps]
  }
}

