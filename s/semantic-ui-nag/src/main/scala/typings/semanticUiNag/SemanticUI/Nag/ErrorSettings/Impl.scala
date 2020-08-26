package typings.semanticUiNag.SemanticUI.Nag.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default '$.cookie is not included. A storage solution is required.'
    */
  var noCookieStorage: String = js.native
  /**
    * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
    */
  var noStorage: String = js.native
}

object Impl {
  @scala.inline
  def apply(method: String, noCookieStorage: String, noStorage: String): Impl = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noCookieStorage = noCookieStorage.asInstanceOf[js.Any], noStorage = noStorage.asInstanceOf[js.Any])
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
    def setNoCookieStorage(value: String): Self = this.set("noCookieStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoStorage(value: String): Self = this.set("noStorage", value.asInstanceOf[js.Any])
  }
  
}

