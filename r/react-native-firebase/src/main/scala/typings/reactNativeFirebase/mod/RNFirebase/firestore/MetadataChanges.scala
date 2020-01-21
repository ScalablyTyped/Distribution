package typings.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataChanges extends js.Object {
  var includeMetadataChanges: Boolean
}

object MetadataChanges {
  @scala.inline
  def apply(includeMetadataChanges: Boolean): MetadataChanges = {
    val __obj = js.Dynamic.literal(includeMetadataChanges = includeMetadataChanges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetadataChanges]
  }
}

