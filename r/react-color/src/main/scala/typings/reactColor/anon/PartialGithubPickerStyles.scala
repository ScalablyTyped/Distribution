package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/github/Github.GithubPickerStylesProps> */
trait PartialGithubPickerStyles extends js.Object {
  var card: js.UndefOr[CSSProperties] = js.undefined
  var triangle: js.UndefOr[CSSProperties] = js.undefined
  var triangleShadow: js.UndefOr[CSSProperties] = js.undefined
}

object PartialGithubPickerStyles {
  @scala.inline
  def apply(card: CSSProperties = null, triangle: CSSProperties = null, triangleShadow: CSSProperties = null): PartialGithubPickerStyles = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (triangleShadow != null) __obj.updateDynamic("triangleShadow")(triangleShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGithubPickerStyles]
  }
}

