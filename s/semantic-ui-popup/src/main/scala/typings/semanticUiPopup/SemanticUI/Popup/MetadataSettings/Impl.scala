package typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * @default 'content'
    */
  var content: String
  /**
    * @default 'html'
    */
  var html: String
  /**
    * @default 'offset'
    */
  var offset: String
  /**
    * @default 'position'
    */
  var position: String
  /**
    * @default 'title'
    */
  var title: String
  /**
    * @default 'variation'
    */
  var variation: String
}

object Impl {
  @scala.inline
  def apply(content: String, html: String, offset: String, position: String, title: String, variation: String): Impl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

