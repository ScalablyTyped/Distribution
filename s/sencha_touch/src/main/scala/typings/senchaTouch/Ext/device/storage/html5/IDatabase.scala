package typings.senchaTouch.Ext.device.storage.html5

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatabase extends IBase {
  
  /** [Method]
    * @param sql String/String[]/Object/Object[]/SQLStatement/SQLStatement[] SQL Command to run with optional arguments and callbacks
    * @param success Function callback for successful transaction
    * @param failure Function callback for failed transaction
    */
  var transaction: js.UndefOr[
    js.Function3[
      /* sql */ js.UndefOr[js.Any], 
      /* success */ js.UndefOr[js.Any], 
      /* failure */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IDatabase {
  
  @scala.inline
  def apply(): IDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatabase]
  }
  
  @scala.inline
  implicit class IDatabaseOps[Self <: IDatabase] (val x: Self) extends AnyVal {
    
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
    def setTransaction(
      value: (/* sql */ js.UndefOr[js.Any], /* success */ js.UndefOr[js.Any], /* failure */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("transaction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
