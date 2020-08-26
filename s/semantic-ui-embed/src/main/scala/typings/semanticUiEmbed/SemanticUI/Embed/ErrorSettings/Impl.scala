package typings.semanticUiEmbed.SemanticUI.Embed.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: String = js.native
  /**
    * @default 'No URL specified'
    */
  var noURL: String = js.native
}

object Impl {
  @scala.inline
  def apply(method: String, noURL: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noURL = noURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoURL(value: String): Self = this.set("noURL", value.asInstanceOf[js.Any])
  }
  
}

