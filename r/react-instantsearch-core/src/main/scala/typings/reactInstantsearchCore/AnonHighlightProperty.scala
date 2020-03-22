package typings.reactInstantsearchCore

import typings.reactInstantsearchCore.mod.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlightProperty[TDoc] extends js.Object {
  var attribute: String
  var highlightProperty: String
  var hit: Hit[TDoc]
  var postTag: js.UndefOr[String] = js.undefined
  var preTag: js.UndefOr[String] = js.undefined
}

object AnonHighlightProperty {
  @scala.inline
  def apply[TDoc](
    attribute: String,
    highlightProperty: String,
    hit: Hit[TDoc],
    postTag: String = null,
    preTag: String = null
  ): AnonHighlightProperty[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlightProperty = highlightProperty.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    if (postTag != null) __obj.updateDynamic("postTag")(postTag.asInstanceOf[js.Any])
    if (preTag != null) __obj.updateDynamic("preTag")(preTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightProperty[TDoc]]
  }
}

