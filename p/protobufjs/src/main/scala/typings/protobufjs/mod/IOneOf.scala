package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOneOf extends js.Object {
  /** Oneof field names */
  var oneof: js.Array[String] = js.native
  /** Oneof options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object IOneOf {
  @scala.inline
  def apply(oneof: js.Array[String]): IOneOf = {
    val __obj = js.Dynamic.literal(oneof = oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneOf]
  }
  @scala.inline
  implicit class IOneOfOps[Self <: IOneOf] (val x: Self) extends AnyVal {
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
    def setOneofVarargs(value: String*): Self = this.set("oneof", js.Array(value :_*))
    @scala.inline
    def setOneof(value: js.Array[String]): Self = this.set("oneof", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

