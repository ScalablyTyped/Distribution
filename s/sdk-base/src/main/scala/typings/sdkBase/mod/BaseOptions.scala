package typings.sdkBase.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOptions
  extends /* key */ StringDictionary[js.Any] {
  var initMethod: js.UndefOr[String] = js.native
}

object BaseOptions {
  @scala.inline
  def apply(): BaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions]
  }
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
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
    def setInitMethod(value: String): Self = this.set("initMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitMethod: Self = this.set("initMethod", js.undefined)
  }
  
}

