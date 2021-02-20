package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectEntry...
  */
@js.native
trait IGenericObjectEntry extends StObject {
  
  /**
    * Information about the children of the generic object.
    */
  var qChildren: js.Array[IGenericObjectEntry] = js.native
  
  /**
    * Reference to a bookmark/snapshot that is embedded in the generic object.
    */
  var qEmbeddedSnapshotRef: IGenericBookmarkEntry = js.native
  
  /**
    * Information about the generic object properties.
    */
  var qProperty: IGenericObjectProperties = js.native
}
object IGenericObjectEntry {
  
  @scala.inline
  def apply(
    qChildren: js.Array[IGenericObjectEntry],
    qEmbeddedSnapshotRef: IGenericBookmarkEntry,
    qProperty: IGenericObjectProperties
  ): IGenericObjectEntry = {
    val __obj = js.Dynamic.literal(qChildren = qChildren.asInstanceOf[js.Any], qEmbeddedSnapshotRef = qEmbeddedSnapshotRef.asInstanceOf[js.Any], qProperty = qProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericObjectEntry]
  }
  
  @scala.inline
  implicit class IGenericObjectEntryMutableBuilder[Self <: IGenericObjectEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQChildren(value: js.Array[IGenericObjectEntry]): Self = StObject.set(x, "qChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQChildrenVarargs(value: IGenericObjectEntry*): Self = StObject.set(x, "qChildren", js.Array(value :_*))
    
    @scala.inline
    def setQEmbeddedSnapshotRef(value: IGenericBookmarkEntry): Self = StObject.set(x, "qEmbeddedSnapshotRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQProperty(value: IGenericObjectProperties): Self = StObject.set(x, "qProperty", value.asInstanceOf[js.Any])
  }
}
