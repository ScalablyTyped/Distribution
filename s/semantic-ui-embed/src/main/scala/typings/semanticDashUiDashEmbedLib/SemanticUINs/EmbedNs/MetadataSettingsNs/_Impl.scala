package typings
package semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.MetadataSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'icon'
    */
  var icon: java.lang.String
  /**
    * @default 'id'
    */
  var id: java.lang.String
  /**
    * @default 'placeholder'
    */
  var placeholder: java.lang.String
  /**
    * @default 'source'
    */
  var source: java.lang.String
  /**
    * @default 'url'
    */
  var url: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    icon: java.lang.String,
    id: java.lang.String,
    placeholder: java.lang.String,
    source: java.lang.String,
    url: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("placeholder")(placeholder)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[_Impl]
  }
}

