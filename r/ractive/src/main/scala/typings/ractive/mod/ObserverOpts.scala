package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObserverOpts extends ObserverBaseOpts {
  
  /**
  	 * Whether or not to follow any links when observing.
  	 */
  var links: js.UndefOr[Boolean] = js.native
  
  /**
  	 * The function called to get an old value for the observer. This can be used to do things like freeze the initial value as the old value for all future callbacks.
  	 */
  var old: js.UndefOr[ObserverCallback[Ractive[Ractive[_]]]] = js.native
  
  /**
  	 * Whether or not to use strict equality when checking to see if a value has changed. Defaults to false.
  	 */
  var strict: js.UndefOr[Boolean] = js.native
}
object ObserverOpts {
  
  @scala.inline
  def apply(): ObserverOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverOpts]
  }
  
  @scala.inline
  implicit class ObserverOptsOps[Self <: ObserverOpts] (val x: Self) extends AnyVal {
    
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
    def setLinks(value: Boolean): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setOld(value: ObserverCallback[Ractive[Ractive[_]]]): Self = this.set("old", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
