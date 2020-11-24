package typings.senchaTouch.Ext.device.filesystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTML5 extends IAbstract {
  
  /** [Method] Requests a Ext device filesystem FileSystem instance
    * @param config Object The object which contains the following config options:
    */
  var requestFileSystem: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}
object IHTML5 {
  
  @scala.inline
  def apply(): IHTML5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTML5]
  }
  
  @scala.inline
  implicit class IHTML5Ops[Self <: IHTML5] (val x: Self) extends AnyVal {
    
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
    def setRequestFileSystem(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("requestFileSystem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestFileSystem: Self = this.set("requestFileSystem", js.undefined)
  }
}
