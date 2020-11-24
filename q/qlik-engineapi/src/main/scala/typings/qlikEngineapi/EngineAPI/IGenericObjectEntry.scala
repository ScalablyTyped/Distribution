package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericObjectEntry...
  */
@js.native
trait IGenericObjectEntry extends js.Object {
  
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
  implicit class IGenericObjectEntryOps[Self <: IGenericObjectEntry] (val x: Self) extends AnyVal {
    
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
    def setQChildrenVarargs(value: IGenericObjectEntry*): Self = this.set("qChildren", js.Array(value :_*))
    
    @scala.inline
    def setQChildren(value: js.Array[IGenericObjectEntry]): Self = this.set("qChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQEmbeddedSnapshotRef(value: IGenericBookmarkEntry): Self = this.set("qEmbeddedSnapshotRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQProperty(value: IGenericObjectProperties): Self = this.set("qProperty", value.asInstanceOf[js.Any])
  }
}
