package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `112` extends js.Object {
  
  var `1`: Boolean = js.native
  
  var `1-11`: Boolean = js.native
  
  var `1-12`: Boolean = js.native
  
  var `1-12-121`: Boolean = js.native
  
  var `1-12-122`: Boolean = js.native
  
  var `2`: Boolean = js.native
  
  var `2-21`: Boolean = js.native
  
  var `2-22`: Boolean = js.native
}
object `112` {
  
  @scala.inline
  def apply(
    `1`: Boolean,
    `1-11`: Boolean,
    `1-12`: Boolean,
    `1-12-121`: Boolean,
    `1-12-122`: Boolean,
    `2`: Boolean,
    `2-21`: Boolean,
    `2-22`: Boolean
  ): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("1-11")(`1-11`.asInstanceOf[js.Any])
    __obj.updateDynamic("1-12")(`1-12`.asInstanceOf[js.Any])
    __obj.updateDynamic("1-12-121")(`1-12-121`.asInstanceOf[js.Any])
    __obj.updateDynamic("1-12-122")(`1-12-122`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("2-21")(`2-21`.asInstanceOf[js.Any])
    __obj.updateDynamic("2-22")(`2-22`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit class `112Ops`[Self <: `112`] (val x: Self) extends AnyVal {
    
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
    def set1(value: Boolean): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set1-11`(value: Boolean): Self = this.set("1-11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set1-12`(value: Boolean): Self = this.set("1-12", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set1-12-121`(value: Boolean): Self = this.set("1-12-121", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set1-12-122`(value: Boolean): Self = this.set("1-12-122", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: Boolean): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set2-21`(value: Boolean): Self = this.set("2-21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set2-22`(value: Boolean): Self = this.set("2-22", value.asInstanceOf[js.Any])
  }
}
