package typings.reactDndHtml5Backend.nativeTypesConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeItemConfig extends js.Object {
  var exposeProperties: NativeItemConfigExposePropreties = js.native
  var matchesTypes: js.Array[String] = js.native
}

object NativeItemConfig {
  @scala.inline
  def apply(exposeProperties: NativeItemConfigExposePropreties, matchesTypes: js.Array[String]): NativeItemConfig = {
    val __obj = js.Dynamic.literal(exposeProperties = exposeProperties.asInstanceOf[js.Any], matchesTypes = matchesTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeItemConfig]
  }
  @scala.inline
  implicit class NativeItemConfigOps[Self <: NativeItemConfig] (val x: Self) extends AnyVal {
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
    def setExposeProperties(value: NativeItemConfigExposePropreties): Self = this.set("exposeProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchesTypesVarargs(value: String*): Self = this.set("matchesTypes", js.Array(value :_*))
    @scala.inline
    def setMatchesTypes(value: js.Array[String]): Self = this.set("matchesTypes", value.asInstanceOf[js.Any])
  }
  
}

