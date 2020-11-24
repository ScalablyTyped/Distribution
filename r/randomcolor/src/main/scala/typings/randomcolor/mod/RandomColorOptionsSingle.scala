package typings.randomcolor.mod

import typings.randomcolor.randomcolorStrings.bright
import typings.randomcolor.randomcolorStrings.dark
import typings.randomcolor.randomcolorStrings.hex
import typings.randomcolor.randomcolorStrings.hsl
import typings.randomcolor.randomcolorStrings.hslArray
import typings.randomcolor.randomcolorStrings.hsla
import typings.randomcolor.randomcolorStrings.hsvArray
import typings.randomcolor.randomcolorStrings.light
import typings.randomcolor.randomcolorStrings.random
import typings.randomcolor.randomcolorStrings.rgb
import typings.randomcolor.randomcolorStrings.rgbArray
import typings.randomcolor.randomcolorStrings.rgba
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RandomColorOptionsSingle extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.native
  
  var hue: js.UndefOr[Double | String] = js.native
  
  var luminosity: js.UndefOr[bright | light | dark | random] = js.native
  
  var seed: js.UndefOr[Double | String] = js.native
}
object RandomColorOptionsSingle {
  
  @scala.inline
  def apply(): RandomColorOptionsSingle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomColorOptionsSingle]
  }
  
  @scala.inline
  implicit class RandomColorOptionsSingleOps[Self <: RandomColorOptionsSingle] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setFormat(value: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHue(value: Double | String): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setLuminosity(value: bright | light | dark | random): Self = this.set("luminosity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLuminosity: Self = this.set("luminosity", js.undefined)
    
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
}
