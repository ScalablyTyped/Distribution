package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictparameterName
  extends /* key */ StringDictionary[js.Any] {
  var filename: String = js.native
  var options: Dictkey = js.native
}

object DictparameterName {
  @scala.inline
  def apply(filename: String, options: Dictkey): DictparameterName = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictparameterName]
  }
  @scala.inline
  implicit class DictparameterNameOps[Self <: DictparameterName] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Dictkey): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

