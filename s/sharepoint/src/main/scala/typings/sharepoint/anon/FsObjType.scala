package typings.sharepoint.anon

import typings.sharepoint.SP.FileSystemObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsObjType extends StObject {
  
  var fsObjType: FileSystemObjectType
  
  var id: Double
}
object FsObjType {
  
  inline def apply(fsObjType: FileSystemObjectType, id: Double): FsObjType = {
    val __obj = js.Dynamic.literal(fsObjType = fsObjType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsObjType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FsObjType] (val x: Self) extends AnyVal {
    
    inline def setFsObjType(value: FileSystemObjectType): Self = StObject.set(x, "fsObjType", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
