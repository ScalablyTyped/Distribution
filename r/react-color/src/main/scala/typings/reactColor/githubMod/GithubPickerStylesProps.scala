package typings.reactColor.githubMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubPickerStylesProps extends js.Object {
  var card: CSSProperties
  var triangle: CSSProperties
  var triangleShadow: CSSProperties
}

object GithubPickerStylesProps {
  @scala.inline
  def apply(card: CSSProperties, triangle: CSSProperties, triangleShadow: CSSProperties): GithubPickerStylesProps = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GithubPickerStylesProps]
  }
}

