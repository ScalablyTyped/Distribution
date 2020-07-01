package typings.reactVis.anon

import typings.reactVis.reactVisStrings.auto
import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.bottomEdge
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.leftEdge
import typings.reactVis.reactVisStrings.right
import typings.reactVis.reactVisStrings.rightEdge
import typings.reactVis.reactVisStrings.top
import typings.reactVis.reactVisStrings.topEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertical extends js.Object {
  var horizontal: js.UndefOr[auto | left | right | leftEdge | rightEdge] = js.undefined
  var vertical: js.UndefOr[auto | bottom | top | bottomEdge | topEdge] = js.undefined
}

object Vertical {
  @scala.inline
  def apply(
    horizontal: auto | left | right | leftEdge | rightEdge = null,
    vertical: auto | bottom | top | bottomEdge | topEdge = null
  ): Vertical = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertical]
  }
}

