package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotMeta
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  
  var ctime: Double = js.native
  
  var mtime: Double = js.native
}
object SnapshotMeta {
  
  @scala.inline
  def apply(ctime: Double, mtime: Double): SnapshotMeta = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotMeta]
  }
  
  @scala.inline
  implicit class SnapshotMetaMutableBuilder[Self <: SnapshotMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
  }
}
