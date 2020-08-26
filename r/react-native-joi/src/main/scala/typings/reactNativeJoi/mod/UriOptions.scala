package typings.reactNativeJoi.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriOptions extends js.Object {
  /**
    * Allow relative URIs. Defaults to `false`.
    */
  var allowRelative: js.UndefOr[Boolean] = js.native
  /**
    * Restrict only relative URIs. Defaults to `false`.
    */
  var relativeOnly: js.UndefOr[Boolean] = js.native
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
}

object UriOptions {
  @scala.inline
  def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  @scala.inline
  implicit class UriOptionsOps[Self <: UriOptions] (val x: Self) extends AnyVal {
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
    def setAllowRelative(value: Boolean): Self = this.set("allowRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRelative: Self = this.set("allowRelative", js.undefined)
    @scala.inline
    def setRelativeOnly(value: Boolean): Self = this.set("relativeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeOnly: Self = this.set("relativeOnly", js.undefined)
    @scala.inline
    def setSchemeVarargs(value: (String | RegExp)*): Self = this.set("scheme", js.Array(value :_*))
    @scala.inline
    def setScheme(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

