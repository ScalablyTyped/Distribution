package typings.readlineSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicOptions extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var cancel: js.UndefOr[js.Any] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var cd: js.UndefOr[Boolean] = js.native
  var charlist: js.UndefOr[String] = js.native
  var confirmMessage: js.UndefOr[js.Any] = js.native
  var create: js.UndefOr[Boolean] = js.native
  var defaultInput: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var exists: js.UndefOr[js.Any] = js.native
  var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var guide: js.UndefOr[Boolean] = js.native
  var hideEchoBack: js.UndefOr[Boolean] = js.native
  var history: js.UndefOr[Boolean] = js.native
  var isDirectory: js.UndefOr[Boolean] = js.native
  var isFile: js.UndefOr[Boolean] = js.native
  var keepWhitespace: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var limitMessage: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var print: js.UndefOr[js.Function2[/* display */ String, /* encoding */ String, Unit]] = js.native
  var prompt: js.UndefOr[js.Any] = js.native
  var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var unmatchMessage: js.UndefOr[js.Any] = js.native
  var validate: js.UndefOr[js.Function1[/* path */ String, Boolean | String]] = js.native
}

object BasicOptions {
  @scala.inline
  def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  @scala.inline
  implicit class BasicOptionsOps[Self <: BasicOptions] (val x: Self) extends AnyVal {
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
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setCancel(value: js.Any): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setCd(value: Boolean): Self = this.set("cd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCd: Self = this.set("cd", js.undefined)
    @scala.inline
    def setCharlist(value: String): Self = this.set("charlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharlist: Self = this.set("charlist", js.undefined)
    @scala.inline
    def setConfirmMessage(value: js.Any): Self = this.set("confirmMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmMessage: Self = this.set("confirmMessage", js.undefined)
    @scala.inline
    def setCreate(value: Boolean): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDefaultInput(value: String): Self = this.set("defaultInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultInput: Self = this.set("defaultInput", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setExists(value: js.Any): Self = this.set("exists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExists: Self = this.set("exists", js.undefined)
    @scala.inline
    def setFalseValueVarargs(value: OptionType*): Self = this.set("falseValue", js.Array(value :_*))
    @scala.inline
    def setFalseValueFunction1(value: /* input */ String => Boolean): Self = this.set("falseValue", js.Any.fromFunction1(value))
    @scala.inline
    def setFalseValue(value: OptionType | js.Array[OptionType]): Self = this.set("falseValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseValue: Self = this.set("falseValue", js.undefined)
    @scala.inline
    def setGuide(value: Boolean): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    @scala.inline
    def setHideEchoBack(value: Boolean): Self = this.set("hideEchoBack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideEchoBack: Self = this.set("hideEchoBack", js.undefined)
    @scala.inline
    def setHistory(value: Boolean): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setIsDirectory(value: Boolean): Self = this.set("isDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDirectory: Self = this.set("isDirectory", js.undefined)
    @scala.inline
    def setIsFile(value: Boolean): Self = this.set("isFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFile: Self = this.set("isFile", js.undefined)
    @scala.inline
    def setKeepWhitespace(value: Boolean): Self = this.set("keepWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepWhitespace: Self = this.set("keepWhitespace", js.undefined)
    @scala.inline
    def setLimitVarargs(value: OptionType*): Self = this.set("limit", js.Array(value :_*))
    @scala.inline
    def setLimitFunction1(value: /* input */ String => Boolean): Self = this.set("limit", js.Any.fromFunction1(value))
    @scala.inline
    def setLimit(value: OptionType | js.Array[OptionType]): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLimitMessage(value: String): Self = this.set("limitMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitMessage: Self = this.set("limitMessage", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMax(value: js.Any): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: js.Any): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setPrint(value: (/* display */ String, /* encoding */ String) => Unit): Self = this.set("print", js.Any.fromFunction2(value))
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setPrompt(value: js.Any): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setTrueValueVarargs(value: OptionType*): Self = this.set("trueValue", js.Array(value :_*))
    @scala.inline
    def setTrueValueFunction1(value: /* input */ String => Boolean): Self = this.set("trueValue", js.Any.fromFunction1(value))
    @scala.inline
    def setTrueValue(value: OptionType | js.Array[OptionType]): Self = this.set("trueValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueValue: Self = this.set("trueValue", js.undefined)
    @scala.inline
    def setUnmatchMessage(value: js.Any): Self = this.set("unmatchMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmatchMessage: Self = this.set("unmatchMessage", js.undefined)
    @scala.inline
    def setValidate(value: /* path */ String => Boolean | String): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

