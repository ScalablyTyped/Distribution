package typings.reactInputMask.mod

import typings.std.Record
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskOptions extends js.Object {
  
  var alwaysShowMask: Boolean = js.native
  
  var formatChars: Record[String, String] = js.native
  
  var mask: String | (js.Array[String | RegExp]) = js.native
  
  var maskChar: String = js.native
  
  var permanents: js.Array[Double] = js.native
}
object MaskOptions {
  
  @scala.inline
  def apply(
    alwaysShowMask: Boolean,
    formatChars: Record[String, String],
    mask: String | (js.Array[String | RegExp]),
    maskChar: String,
    permanents: js.Array[Double]
  ): MaskOptions = {
    val __obj = js.Dynamic.literal(alwaysShowMask = alwaysShowMask.asInstanceOf[js.Any], formatChars = formatChars.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskChar = maskChar.asInstanceOf[js.Any], permanents = permanents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskOptions]
  }
  
  @scala.inline
  implicit class MaskOptionsOps[Self <: MaskOptions] (val x: Self) extends AnyVal {
    
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
    def setAlwaysShowMask(value: Boolean): Self = this.set("alwaysShowMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatChars(value: Record[String, String]): Self = this.set("formatChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskVarargs(value: (String | RegExp)*): Self = this.set("mask", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: String | (js.Array[String | RegExp])): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskChar(value: String): Self = this.set("maskChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentsVarargs(value: Double*): Self = this.set("permanents", js.Array(value :_*))
    
    @scala.inline
    def setPermanents(value: js.Array[Double]): Self = this.set("permanents", value.asInstanceOf[js.Any])
  }
}
