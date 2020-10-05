package typings.reactNativeVectorIcons.anon

import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`0`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`1`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`2`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Brand extends js.Object {
  var brand: `3` = js.native
  var light: `1` = js.native
  var regular: `0` = js.native
  var solid: `2` = js.native
}

object Brand {
  @scala.inline
  def apply(brand: `3`, light: `1`, regular: `0`, solid: `2`): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  @scala.inline
  implicit class BrandOps[Self <: Brand] (val x: Self) extends AnyVal {
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
    def setBrand(value: `3`): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def setLight(value: `1`): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegular(value: `0`): Self = this.set("regular", value.asInstanceOf[js.Any])
    @scala.inline
    def setSolid(value: `2`): Self = this.set("solid", value.asInstanceOf[js.Any])
  }
  
}

