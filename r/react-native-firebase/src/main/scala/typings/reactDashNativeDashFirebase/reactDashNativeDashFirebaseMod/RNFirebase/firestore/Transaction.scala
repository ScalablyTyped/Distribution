package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.SetOptions
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types.UpdateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def delete(docRef: DocumentReference): WriteBatch = js.native
  def get(documentRef: DocumentReference): js.Promise[DocumentSnapshot] = js.native
  def set(documentRef: DocumentReference, data: js.Object): Transaction = js.native
  def set(documentRef: DocumentReference, data: js.Object, options: SetOptions): Transaction = js.native
  def update(docRef: DocumentReference, key1: UpdateKey, val1: js.Any): WriteBatch = js.native
  def update(docRef: DocumentReference, key1: UpdateKey, val1: js.Any, key2: UpdateKey, val2: js.Any): WriteBatch = js.native
  def update(
    docRef: DocumentReference,
    key1: UpdateKey,
    val1: js.Any,
    key2: UpdateKey,
    val2: js.Any,
    key3: UpdateKey,
    val3: js.Any
  ): WriteBatch = js.native
  def update(
    docRef: DocumentReference,
    key1: UpdateKey,
    val1: js.Any,
    key2: UpdateKey,
    val2: js.Any,
    key3: UpdateKey,
    val3: js.Any,
    key4: UpdateKey,
    val4: js.Any
  ): WriteBatch = js.native
  def update(
    docRef: DocumentReference,
    key1: UpdateKey,
    val1: js.Any,
    key2: UpdateKey,
    val2: js.Any,
    key3: UpdateKey,
    val3: js.Any,
    key4: UpdateKey,
    val4: js.Any,
    key5: UpdateKey,
    val5: js.Any
  ): WriteBatch = js.native
  // multiple overrides for update() to allow strong-typed var_args
  def update(docRef: DocumentReference, obj: js.Object): WriteBatch = js.native
}

