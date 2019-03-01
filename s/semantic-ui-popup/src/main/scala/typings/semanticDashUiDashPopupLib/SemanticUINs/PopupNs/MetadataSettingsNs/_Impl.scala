package typings
package semanticDashUiDashPopupLib.SemanticUINs.PopupNs.MetadataSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'content'
    */
  var content: java.lang.String
  /**
    * @default 'html'
    */
  var html: java.lang.String
  /**
    * @default 'offset'
    */
  var offset: java.lang.String
  /**
    * @default 'position'
    */
  var position: java.lang.String
  /**
    * @default 'title'
    */
  var title: java.lang.String
  /**
    * @default 'variation'
    */
  var variation: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    content: java.lang.String,
    html: java.lang.String,
    offset: java.lang.String,
    position: java.lang.String,
    title: java.lang.String,
    variation: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("variation")(variation)
    __obj.asInstanceOf[_Impl]
  }
}

