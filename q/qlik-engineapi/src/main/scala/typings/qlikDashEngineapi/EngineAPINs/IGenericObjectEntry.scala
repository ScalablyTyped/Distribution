package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericObjectEntry...
  */
trait IGenericObjectEntry extends js.Object {
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
  @scala.inline
  def apply(
    qChildren: js.Array[IGenericObjectEntry],
    qEmbeddedSnapshotRef: IGenericBookmarkEntry,
    qProperty: IGenericObjectProperties
  ): IGenericObjectEntry = {
    val __obj = js.Dynamic.literal(qChildren = qChildren, qEmbeddedSnapshotRef = qEmbeddedSnapshotRef, qProperty = qProperty)
  
    __obj.asInstanceOf[IGenericObjectEntry]
  }
}

