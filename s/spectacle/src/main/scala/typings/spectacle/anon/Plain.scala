package typings.spectacle.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plain extends js.Object {
  
  var plain: Record[String, String] = js.native
  
  var styles: js.Array[Style] = js.native
}
object Plain {
  
  @scala.inline
  def apply(plain: Record[String, String], styles: js.Array[Style]): Plain = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plain]
  }
  
  @scala.inline
  implicit class PlainOps[Self <: Plain] (val x: Self) extends AnyVal {
    
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
    def setPlain(value: Record[String, String]): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: Style*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[Style]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
