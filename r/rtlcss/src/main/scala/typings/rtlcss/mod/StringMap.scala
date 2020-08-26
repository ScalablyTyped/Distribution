package typings.rtlcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringMap extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var options: MapOptions = js.native
  var priority: Double = js.native
  var replace: String | js.Array[String] = js.native
  var search: String | js.Array[String] = js.native
}

object StringMap {
  @scala.inline
  def apply(
    name: String,
    options: MapOptions,
    priority: Double,
    replace: String | js.Array[String],
    search: String | js.Array[String]
  ): StringMap = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringMap]
  }
  @scala.inline
  implicit class StringMapOps[Self <: StringMap] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: MapOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceVarargs(value: String*): Self = this.set("replace", js.Array(value :_*))
    @scala.inline
    def setReplace(value: String | js.Array[String]): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchVarargs(value: String*): Self = this.set("search", js.Array(value :_*))
    @scala.inline
    def setSearch(value: String | js.Array[String]): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
  }
  
}

