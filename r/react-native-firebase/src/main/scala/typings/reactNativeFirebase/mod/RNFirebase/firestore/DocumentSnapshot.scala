package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SnapshotMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentSnapshot extends StObject {
  
  def data(): js.Object | Unit = js.native
  
  val exists: Boolean = js.native
  
  def get(fieldPath: String): js.UndefOr[js.Any] = js.native
  def get(fieldPath: FieldPath): js.UndefOr[js.Any] = js.native
  
  val id: String = js.native
  
  val metadata: SnapshotMetadata = js.native
  
  val ref: DocumentReference = js.native
}
