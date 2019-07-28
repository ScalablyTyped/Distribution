package typings.reactstrap.libFormFeedbackMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFeedbackProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
  var valid: js.UndefOr[Boolean] = js.undefined
}

object FormFeedbackProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    tag: String = null,
    valid: js.UndefOr[Boolean] = js.undefined
  ): FormFeedbackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (!js.isUndefined(valid)) __obj.updateDynamic("valid")(valid)
    __obj.asInstanceOf[FormFeedbackProps]
  }
}

