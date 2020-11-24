package typings.reactBase16Styling.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.base16.mod.Base16Theme
import typings.reactBase16Styling.anon.PartialStyling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylingConfig extends /* name */ StringDictionary[StylingValue | String | Base16Theme] {
  
  var extend: js.UndefOr[String | Base16Theme | StylingValue] = js.native
}
object StylingConfig {
  
  @scala.inline
  def apply(): StylingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylingConfig]
  }
  
  @scala.inline
  implicit class StylingConfigOps[Self <: StylingConfig] (val x: Self) extends AnyVal {
    
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
    def setExtendFunction2(value: (/* styling */ Styling, /* repeated */ js.Any) => PartialStyling): Self = this.set("extend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtend(value: String | Base16Theme | StylingValue): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
  }
}
