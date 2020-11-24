package typings.scrivito.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DumpLoaded extends js.Object {
  
  var dumpLoaded: Boolean = js.native
}
object DumpLoaded {
  
  @scala.inline
  def apply(dumpLoaded: Boolean): DumpLoaded = {
    val __obj = js.Dynamic.literal(dumpLoaded = dumpLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[DumpLoaded]
  }
  
  @scala.inline
  implicit class DumpLoadedOps[Self <: DumpLoaded] (val x: Self) extends AnyVal {
    
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
    def setDumpLoaded(value: Boolean): Self = this.set("dumpLoaded", value.asInstanceOf[js.Any])
  }
}
