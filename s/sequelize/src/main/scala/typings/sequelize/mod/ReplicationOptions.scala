package typings.sequelize.mod

import typings.sequelize.anon.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for replication Options in the sequelize constructor
  *
  * @see Options
  */
trait ReplicationOptions extends StObject {
  
  var read: js.UndefOr[js.Array[Database]] = js.undefined
  
  var write: js.UndefOr[Database] = js.undefined
}
object ReplicationOptions {
  
  inline def apply(): ReplicationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationOptions]
  }
  
  extension [Self <: ReplicationOptions](x: Self) {
    
    inline def setRead(value: js.Array[Database]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setReadVarargs(value: Database*): Self = StObject.set(x, "read", js.Array(value*))
    
    inline def setWrite(value: Database): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
