package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
trait StyleSheet extends js.Object {
  var disabled: scala.Boolean
  val href: java.lang.String | Null
  val media: MediaList
  val ownerNode: Element | ProcessingInstruction | Null
  val parentStyleSheet: CSSStyleSheet | Null
  val title: java.lang.String | Null
  val `type`: java.lang.String
}

object StyleSheet {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    media: MediaList,
    `type`: java.lang.String,
    href: java.lang.String = null,
    ownerNode: Element | ProcessingInstruction = null,
    parentStyleSheet: CSSStyleSheet = null,
    title: java.lang.String = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], ownerNode = ownerNode.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
}

