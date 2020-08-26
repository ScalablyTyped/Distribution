package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sod extends js.Object {
  var depkeys: js.UndefOr[js.Array[String]] = js.native
  var key: String = js.native
  var loaded: Boolean = js.native
  var qfn: js.UndefOr[js.Array[_]] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var state: Sods = js.native
  var url: String = js.native
}

object Sod {
  @scala.inline
  def apply(key: String, loaded: Boolean, state: Sods, url: String): Sod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sod]
  }
  @scala.inline
  implicit class SodOps[Self <: Sod] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Sods): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepkeysVarargs(value: String*): Self = this.set("depkeys", js.Array(value :_*))
    @scala.inline
    def setDepkeys(value: js.Array[String]): Self = this.set("depkeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepkeys: Self = this.set("depkeys", js.undefined)
    @scala.inline
    def setQfnVarargs(value: js.Any*): Self = this.set("qfn", js.Array(value :_*))
    @scala.inline
    def setQfn(value: js.Array[_]): Self = this.set("qfn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQfn: Self = this.set("qfn", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
  }
  
}

