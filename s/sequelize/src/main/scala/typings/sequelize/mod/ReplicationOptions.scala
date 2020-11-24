package typings.sequelize.mod

import typings.sequelize.anon.Database
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
@js.native
trait ReplicationOptions extends js.Object {
  
  var read: js.UndefOr[js.Array[Database]] = js.native
  
  var write: js.UndefOr[Database] = js.native
}
object ReplicationOptions {
  
  @scala.inline
  def apply(): ReplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationOptions]
  }
  
  @scala.inline
  implicit class ReplicationOptionsOps[Self <: ReplicationOptions] (val x: Self) extends AnyVal {
    
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
    def setReadVarargs(value: Database*): Self = this.set("read", js.Array(value :_*))
    
    @scala.inline
    def setRead(value: js.Array[Database]): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    
    @scala.inline
    def setWrite(value: Database): Self = this.set("write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
