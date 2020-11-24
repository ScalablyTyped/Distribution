package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actcaller extends js.Object {
  
  // Trace action caller and place in args.caller$.
  var act_caller: js.UndefOr[Boolean] = js.native
  
  // Record and log callpoints (calling code locations).
  var callpoint: js.UndefOr[Boolean] = js.native
  
  // Throw (some) errors from seneca.act.
  var fragile: js.UndefOr[Boolean] = js.native
  
  // Print debug info to console
  var print: js.UndefOr[Options] = js.native
  
  // Shorten all identifiers to 2 characters.
  var short_logs: js.UndefOr[Boolean] = js.native
  
  // Fatal errors ... aren't fatal. Not for production!
  var undead: js.UndefOr[Boolean] = js.native
}
object Actcaller {
  
  @scala.inline
  def apply(): Actcaller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actcaller]
  }
  
  @scala.inline
  implicit class ActcallerOps[Self <: Actcaller] (val x: Self) extends AnyVal {
    
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
    def setAct_caller(value: Boolean): Self = this.set("act_caller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAct_caller: Self = this.set("act_caller", js.undefined)
    
    @scala.inline
    def setCallpoint(value: Boolean): Self = this.set("callpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallpoint: Self = this.set("callpoint", js.undefined)
    
    @scala.inline
    def setFragile(value: Boolean): Self = this.set("fragile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragile: Self = this.set("fragile", js.undefined)
    
    @scala.inline
    def setPrint(value: Options): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    
    @scala.inline
    def setShort_logs(value: Boolean): Self = this.set("short_logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_logs: Self = this.set("short_logs", js.undefined)
    
    @scala.inline
    def setUndead(value: Boolean): Self = this.set("undead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndead: Self = this.set("undead", js.undefined)
  }
}
