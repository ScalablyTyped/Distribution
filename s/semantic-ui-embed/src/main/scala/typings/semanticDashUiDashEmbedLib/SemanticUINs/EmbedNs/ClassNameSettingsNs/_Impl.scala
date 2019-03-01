package typings
package semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: java.lang.String
  /**
    * @default 'embed'
    */
  var embed: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(active: java.lang.String, embed: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("embed")(embed)
    __obj.asInstanceOf[_Impl]
  }
}

