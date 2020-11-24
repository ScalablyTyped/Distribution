package typings.sidewayAddress.mod.domain

import typings.sidewayAddress.mod.domain.Tlds.Allow
import typings.sidewayAddress.mod.domain.Tlds.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Determines whether Unicode characters are allowed.
    * 
    * @default true
    */
  val allowUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
    * 
    * @default 2
    */
  val minDomainSegments: js.UndefOr[Double] = js.native
  
  /**
    * Top-level-domain options
    * 
    * @default true
    */
  val tlds: js.UndefOr[Allow | Deny | Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowUnicode(value: Boolean): Self = this.set("allowUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnicode: Self = this.set("allowUnicode", js.undefined)
    
    @scala.inline
    def setMinDomainSegments(value: Double): Self = this.set("minDomainSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDomainSegments: Self = this.set("minDomainSegments", js.undefined)
    
    @scala.inline
    def setTlds(value: Allow | Deny | Boolean): Self = this.set("tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlds: Self = this.set("tlds", js.undefined)
  }
}
