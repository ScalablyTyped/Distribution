package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextDecoderCommon extends js.Object {
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  val ignoreBOM: scala.Boolean = js.native
}

object TextDecoderCommon {
  @scala.inline
  def apply(encoding: java.lang.String, fatal: scala.Boolean, ignoreBOM: scala.Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
  @scala.inline
  implicit class TextDecoderCommonOps[Self <: TextDecoderCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoding(value: java.lang.String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFatal(value: scala.Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreBOM(value: scala.Boolean): Self = this.set("ignoreBOM", value.asInstanceOf[js.Any])
  }
  
}

