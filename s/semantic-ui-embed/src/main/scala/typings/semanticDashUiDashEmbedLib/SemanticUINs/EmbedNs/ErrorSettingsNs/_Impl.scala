package typings
package semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: java.lang.String
  /**
    * @default 'No URL specified'
    */
  var noURL: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(method: java.lang.String, noURL: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal(method = method, noURL = noURL)
  
    __obj.asInstanceOf[_Impl]
  }
}

