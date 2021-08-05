package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectEntry...
  */
trait IGenericObjectEntry extends StObject {
  
  /**
    * Information about the children of the generic object.
    */
  var qChildren: js.Array[IGenericObjectEntry]
  
  /**
    * Reference to a bookmark/snapshot that is embedded in the generic object.
    */
  var qEmbeddedSnapshotRef: IGenericBookmarkEntry
  
  /**
    * Information about the generic object properties.
    */
  var qProperty: IGenericObjectProperties
}
object IGenericObjectEntry {
  
  inline def apply(
    qChildren: js.Array[IGenericObjectEntry],
    qEmbeddedSnapshotRef: IGenericBookmarkEntry,
    qProperty: IGenericObjectProperties
  ): IGenericObjectEntry = {
    val __obj = js.Dynamic.literal(qChildren = qChildren.asInstanceOf[js.Any], qEmbeddedSnapshotRef = qEmbeddedSnapshotRef.asInstanceOf[js.Any], qProperty = qProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectEntry]
  }
  
  extension [Self <: IGenericObjectEntry](x: Self) {
    
    inline def setQChildren(value: js.Array[IGenericObjectEntry]): Self = StObject.set(x, "qChildren", value.asInstanceOf[js.Any])
    
    inline def setQChildrenVarargs(value: IGenericObjectEntry*): Self = StObject.set(x, "qChildren", js.Array(value :_*))
    
    inline def setQEmbeddedSnapshotRef(value: IGenericBookmarkEntry): Self = StObject.set(x, "qEmbeddedSnapshotRef", value.asInstanceOf[js.Any])
    
    inline def setQProperty(value: IGenericObjectProperties): Self = StObject.set(x, "qProperty", value.asInstanceOf[js.Any])
  }
}
