package typings.rfc4648.codecMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var bits: Double = js.native
  
  var chars: String = js.native
  
  var codes: js.UndefOr[StringDictionary[Double]] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(bits: Double, chars: String): Encoding = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
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
    def setBits(value: Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChars(value: String): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodes(value: StringDictionary[Double]): Self = this.set("codes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodes: Self = this.set("codes", js.undefined)
  }
}
