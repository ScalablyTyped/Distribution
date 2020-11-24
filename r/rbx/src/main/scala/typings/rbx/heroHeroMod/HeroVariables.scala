package typings.rbx.heroHeroMod

import typings.rbx.rbxStrings.`fullheight-with-navbar`
import typings.rbx.rbxStrings.fullheight
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/layout/hero/hero.HeroVariablesOverrides, rbx.rbx/layout/hero/hero.HeroVariablesDefaults> */
@js.native
trait HeroVariables extends js.Object {
  
  var sizes: small | medium | large | fullheight | `fullheight-with-navbar` = js.native
}
object HeroVariables {
  
  @scala.inline
  def apply(sizes: small | medium | large | fullheight | `fullheight-with-navbar`): HeroVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroVariables]
  }
  
  @scala.inline
  implicit class HeroVariablesOps[Self <: HeroVariables] (val x: Self) extends AnyVal {
    
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
    def setSizes(value: small | medium | large | fullheight | `fullheight-with-navbar`): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
