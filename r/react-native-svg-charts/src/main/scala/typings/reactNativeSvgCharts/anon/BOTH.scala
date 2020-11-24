package typings.reactNativeSvgCharts.anon

import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL
import typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BOTH extends js.Object {
  
  var BOTH: typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH = js.native
  
  var HORIZONTAL: typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.HORIZONTAL = js.native
  
  var VERTICAL: typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.VERTICAL = js.native
}
object BOTH {
  
  @scala.inline
  def apply(
    BOTH: typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH,
    HORIZONTAL: HORIZONTAL,
    VERTICAL: VERTICAL
  ): BOTH = {
    val __obj = js.Dynamic.literal(BOTH = BOTH.asInstanceOf[js.Any], HORIZONTAL = HORIZONTAL.asInstanceOf[js.Any], VERTICAL = VERTICAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTH]
  }
  
  @scala.inline
  implicit class BOTHOps[Self <: BOTH] (val x: Self) extends AnyVal {
    
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
    def setBOTH(value: typings.reactNativeSvgCharts.reactNativeSvgChartsStrings.BOTH): Self = this.set("BOTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHORIZONTAL(value: HORIZONTAL): Self = this.set("HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVERTICAL(value: VERTICAL): Self = this.set("VERTICAL", value.asInstanceOf[js.Any])
  }
}
