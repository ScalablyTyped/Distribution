package typings
package semanticDashUiDashEmbedLib.SemanticUINs.EmbedNs.TemplatesSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * returns html for iframe
    */
  def iframe(url: java.lang.String, parameters: java.lang.String): java.lang.String
  /**
    * returns html for placeholder element
    */
  def placeholder(image: java.lang.String, icon: java.lang.String): java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    iframe: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    placeholder: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): _Impl = {
    val __obj = js.Dynamic.literal(iframe = iframe, placeholder = placeholder)
  
    __obj.asInstanceOf[_Impl]
  }
}

