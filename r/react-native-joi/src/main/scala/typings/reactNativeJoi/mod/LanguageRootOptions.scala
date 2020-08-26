package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeJoi.anon.WrapArrays
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  root :string | undefined,   key :string | undefined,   messages :{  wrapArrays :boolean | undefined} | undefined, [key: string] : react-native-joi.react-native-joi.LanguageOptions} & std.Partial<std.Record<react-native-joi.react-native-joi.Types, react-native-joi.react-native-joi.LanguageOptions>> */
@js.native
trait LanguageRootOptions extends /* key */ StringDictionary[LanguageOptions] {
  var alternatives: js.UndefOr[LanguageOptions] = js.native
  var any: js.UndefOr[LanguageOptions] = js.native
  var array: js.UndefOr[LanguageOptions] = js.native
  var binary: js.UndefOr[LanguageOptions] = js.native
  var boolean: js.UndefOr[LanguageOptions] = js.native
  var date: js.UndefOr[LanguageOptions] = js.native
  var function: js.UndefOr[LanguageOptions] = js.native
  var key: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[LanguageOptions] = js.native
  var messages: js.UndefOr[WrapArrays] = js.native
  var number: js.UndefOr[LanguageOptions] = js.native
  var `object`: js.UndefOr[LanguageOptions] = js.native
  var root: js.UndefOr[String] = js.native
  var string: js.UndefOr[LanguageOptions] = js.native
}

object LanguageRootOptions {
  @scala.inline
  def apply(): LanguageRootOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageRootOptions]
  }
  @scala.inline
  implicit class LanguageRootOptionsOps[Self <: LanguageRootOptions] (val x: Self) extends AnyVal {
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
    def setAlternatives(value: LanguageOptions): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    @scala.inline
    def setAlternativesNull: Self = this.set("alternatives", null)
    @scala.inline
    def setAny(value: LanguageOptions): Self = this.set("any", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAny: Self = this.set("any", js.undefined)
    @scala.inline
    def setAnyNull: Self = this.set("any", null)
    @scala.inline
    def setArray(value: LanguageOptions): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    @scala.inline
    def setArrayNull: Self = this.set("array", null)
    @scala.inline
    def setBinary(value: LanguageOptions): Self = this.set("binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    @scala.inline
    def setBinaryNull: Self = this.set("binary", null)
    @scala.inline
    def setBoolean(value: LanguageOptions): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setBooleanNull: Self = this.set("boolean", null)
    @scala.inline
    def setDate(value: LanguageOptions): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDateNull: Self = this.set("date", null)
    @scala.inline
    def setFunction(value: LanguageOptions): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    @scala.inline
    def setFunctionNull: Self = this.set("function", null)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLazy(value: LanguageOptions): Self = this.set("lazy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazy: Self = this.set("lazy", js.undefined)
    @scala.inline
    def setLazyNull: Self = this.set("lazy", null)
    @scala.inline
    def setMessages(value: WrapArrays): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setNumber(value: LanguageOptions): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setNumberNull: Self = this.set("number", null)
    @scala.inline
    def setObject(value: LanguageOptions): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    @scala.inline
    def setObjectNull: Self = this.set("object", null)
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setString(value: LanguageOptions): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setStringNull: Self = this.set("string", null)
  }
  
}

