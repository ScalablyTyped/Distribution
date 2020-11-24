package typings.reactVis.anon

import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HORIZONTAL_ extends js.Object {
  
  var HORIZONTAL: horizontal = js.native
  
  var VERTICAL: vertical = js.native
}
object HORIZONTAL_ {
  
  @scala.inline
  def apply(HORIZONTAL: horizontal, VERTICAL: vertical): HORIZONTAL_ = {
    val __obj = js.Dynamic.literal(HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HORIZONTAL_]
  }
  
  @scala.inline
  implicit class HORIZONTAL_Ops[Self <: HORIZONTAL_] (val x: Self) extends AnyVal {
    
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
    def setHORIZONTAL(value: horizontal): Self = this.set("HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERTICAL(value: vertical): Self = this.set("VERTICAL", value.asInstanceOf[js.Any])
  }
}
