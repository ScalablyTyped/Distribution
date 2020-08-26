package typings.pulumiPulumi.configMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringConfigOptions[K /* <: String */] extends js.Object {
  /**
    * The legal enum values. If it does not match, a ConfigEnumError is thrown.
    */
  var allowedValues: js.UndefOr[js.Array[K]] = js.native
  /**
    * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
    */
  var minLength: js.UndefOr[Double] = js.native
  /**
    * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
    */
  var pattern: js.UndefOr[String | RegExp] = js.native
}

object StringConfigOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ K](): StringConfigOptions[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringConfigOptions[K]]
  }
  @scala.inline
  implicit class StringConfigOptionsOps[Self <: StringConfigOptions[_], /* <: java.lang.String */ K] (val x: Self with StringConfigOptions[K]) extends AnyVal {
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
    def setAllowedValuesVarargs(value: K*): Self = this.set("allowedValues", js.Array(value :_*))
    @scala.inline
    def setAllowedValues(value: js.Array[K]): Self = this.set("allowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValues: Self = this.set("allowedValues", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setPattern(value: String | RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
  }
  
}

