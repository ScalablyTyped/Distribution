package typings.reduxPersist.typesMod

import typings.redux.mod.StoreEnhancer
import typings.redux.mod.StoreEnhancerStoreCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistorOptions extends js.Object {
  
  var enhancer: js.UndefOr[StoreEnhancer[_, js.Object]] = js.native
}
object PersistorOptions {
  
  @scala.inline
  def apply(): PersistorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistorOptions]
  }
  
  @scala.inline
  implicit class PersistorOptionsOps[Self <: PersistorOptions] (val x: Self) extends AnyVal {
    
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
    def setEnhancer(
      value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[_, js.Object]
    ): Self = this.set("enhancer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEnhancer: Self = this.set("enhancer", js.undefined)
  }
}
