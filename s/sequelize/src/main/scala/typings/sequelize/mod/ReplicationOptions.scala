package typings.sequelize.mod

import typings.sequelize.anon.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
@js.native
trait ReplicationOptions extends StObject {
  
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
  implicit class ReplicationOptionsMutableBuilder[Self <: ReplicationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: js.Array[Database]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setReadVarargs(value: Database*): Self = StObject.set(x, "read", js.Array(value :_*))
    
    @scala.inline
    def setWrite(value: Database): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
