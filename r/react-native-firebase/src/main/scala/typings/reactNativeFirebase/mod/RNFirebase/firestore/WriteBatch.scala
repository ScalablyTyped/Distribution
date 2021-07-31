package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.SetOptions
import typings.reactNativeFirebase.mod.RNFirebase.firestore.Types.UpdateKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteBatch extends StObject {
  
  def commit(): js.Promise[Unit] = js.native
  
  def delete(docRef: DocumentReference): WriteBatch = js.native
  
  def set(docRef: DocumentReference, data: js.Object): WriteBatch = js.native
  def set(docRef: DocumentReference, data: js.Object, options: SetOptions): WriteBatch = js.native
  
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
