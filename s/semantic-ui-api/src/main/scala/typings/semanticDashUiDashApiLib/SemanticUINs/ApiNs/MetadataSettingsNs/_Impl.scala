package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiNs.MetadataSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'action'
    */
  var action: java.lang.String
  /**
    * @default 'url'
    */
  var url: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(action: java.lang.String, url: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[_Impl]
  }
}

