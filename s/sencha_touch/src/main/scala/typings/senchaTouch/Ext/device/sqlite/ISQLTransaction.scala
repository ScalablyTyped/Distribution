package typings.senchaTouch.Ext.device.sqlite

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISQLTransaction extends IBase {
  
  /** [Method] Executes an SQL statement
    * @param config Object The object which contains the following config options:
    */
  var executeSql: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISQLTransaction {
  
  @scala.inline
  def apply(): ISQLTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISQLTransaction]
  }
  
  @scala.inline
  implicit class ISQLTransactionOps[Self <: ISQLTransaction] (val x: Self) extends AnyVal {
    
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
    def setExecuteSql(value: /* config */ js.UndefOr[js.Any] => Unit): Self = this.set("executeSql", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecuteSql: Self = this.set("executeSql", js.undefined)
  }
}
