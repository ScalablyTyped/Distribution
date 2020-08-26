package typings.qiniuJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedInfo extends /* key */ StringDictionary[Type | Double | String] {
  var code: Double = js.native
  var error: String = js.native
}

object ExtendedInfo {
  @scala.inline
  def apply(code: Double, error: String): ExtendedInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedInfo]
  }
  @scala.inline
  implicit class ExtendedInfoOps[Self <: ExtendedInfo] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

