package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkOpts extends js.Object {
  
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var instance: js.UndefOr[Ractive[Ractive[_]]] = js.native
  
  /**
  	 * The keypath to use for the link when handling a shuffle. For instance foo.1.bar will not shuffle with foo, but .bar will.
  	 */
  var keypath: js.UndefOr[String] = js.native
  
  /**
  	 * The ractive instance in which to find the source keypath.
  	 */
  var ractive: js.UndefOr[Ractive[Ractive[_]]] = js.native
}
object LinkOpts {
  
  @scala.inline
  def apply(): LinkOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkOpts]
  }
  
  @scala.inline
  implicit class LinkOptsOps[Self <: LinkOpts] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: Ractive[Ractive[_]]): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setKeypath(value: String): Self = this.set("keypath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeypath: Self = this.set("keypath", js.undefined)
    
    @scala.inline
    def setRactive(value: Ractive[Ractive[_]]): Self = this.set("ractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRactive: Self = this.set("ractive", js.undefined)
  }
}
