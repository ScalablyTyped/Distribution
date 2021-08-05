package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotMeta
  extends StObject
     with // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  
  var ctime: Double
  
  var mtime: Double
}
object SnapshotMeta {
  
  inline def apply(ctime: Double, mtime: Double): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMeta]
  }
  
  extension [Self <: SnapshotMeta](x: Self) {
    
    inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
  }
}
