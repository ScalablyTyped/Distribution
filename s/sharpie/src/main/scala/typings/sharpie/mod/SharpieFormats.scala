package typings.sharpie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sharpie.sharpieBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharpieFormats extends js.Object {
  
  var dst: StringDictionary[`true`] = js.native
  
  var src: StringDictionary[`true`] = js.native
}
object SharpieFormats {
  
  @scala.inline
  def apply(dst: StringDictionary[`true`], src: StringDictionary[`true`]): SharpieFormats = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharpieFormats]
  }
  
  @scala.inline
  implicit class SharpieFormatsOps[Self <: SharpieFormats] (val x: Self) extends AnyVal {
    
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
    def setDst(value: StringDictionary[`true`]): Self = this.set("dst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: StringDictionary[`true`]): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
