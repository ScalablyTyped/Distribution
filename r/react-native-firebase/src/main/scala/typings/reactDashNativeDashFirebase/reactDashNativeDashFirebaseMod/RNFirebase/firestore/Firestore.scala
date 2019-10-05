package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firestore extends js.Object {
  val app: App
  def batch(): WriteBatch
  def collection(collectionPath: String): CollectionReference
  def disableNetwork(): js.Promise[Unit]
  def doc(documentPath: String): DocumentReference
  def enableNetwork(): js.Promise[Unit]
  def enablePersistence(enabled: Boolean): js.Promise[Unit]
  def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[_]]): js.Promise[_]
  def settings(settings: Settings): js.Promise[Unit]
}

object Firestore {
  @scala.inline
  def apply(
    app: App,
    batch: () => WriteBatch,
    collection: String => CollectionReference,
    disableNetwork: () => js.Promise[Unit],
    doc: String => DocumentReference,
    enableNetwork: () => js.Promise[Unit],
    enablePersistence: Boolean => js.Promise[Unit],
    runTransaction: js.Function1[/* transaction */ Transaction, js.Promise[_]] => js.Promise[_],
    settings: Settings => js.Promise[Unit]
  ): Firestore = {
    val __obj = js.Dynamic.literal(app = app, batch = js.Any.fromFunction0(batch), collection = js.Any.fromFunction1(collection), disableNetwork = js.Any.fromFunction0(disableNetwork), doc = js.Any.fromFunction1(doc), enableNetwork = js.Any.fromFunction0(enableNetwork), enablePersistence = js.Any.fromFunction1(enablePersistence), runTransaction = js.Any.fromFunction1(runTransaction), settings = js.Any.fromFunction1(settings))
  
    __obj.asInstanceOf[Firestore]
  }
}

