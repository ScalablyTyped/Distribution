package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.reactNativeFirebase.mod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firestore extends StObject {
  
  val app: App = js.native
  
  def batch(): WriteBatch = js.native
  
  def collection(collectionPath: String): CollectionReference = js.native
  
  def disableNetwork(): js.Promise[Unit] = js.native
  
  def doc(documentPath: String): DocumentReference = js.native
  
  def enableNetwork(): js.Promise[Unit] = js.native
  
  def enablePersistence(enabled: Boolean): js.Promise[Unit] = js.native
  
  def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[_]]): js.Promise[_] = js.native
  
  def settings(settings: Settings): js.Promise[Unit] = js.native
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
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], batch = js.Any.fromFunction0(batch), collection = js.Any.fromFunction1(collection), disableNetwork = js.Any.fromFunction0(disableNetwork), doc = js.Any.fromFunction1(doc), enableNetwork = js.Any.fromFunction0(enableNetwork), enablePersistence = js.Any.fromFunction1(enablePersistence), runTransaction = js.Any.fromFunction1(runTransaction), settings = js.Any.fromFunction1(settings))
    __obj.asInstanceOf[Firestore]
  }
  
  @scala.inline
  implicit class FirestoreMutableBuilder[Self <: Firestore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatch(value: () => WriteBatch): Self = StObject.set(x, "batch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCollection(value: String => CollectionReference): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableNetwork(value: () => js.Promise[Unit]): Self = StObject.set(x, "disableNetwork", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDoc(value: String => DocumentReference): Self = StObject.set(x, "doc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnableNetwork(value: () => js.Promise[Unit]): Self = StObject.set(x, "enableNetwork", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnablePersistence(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "enablePersistence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunTransaction(value: js.Function1[/* transaction */ Transaction, js.Promise[_]] => js.Promise[_]): Self = StObject.set(x, "runTransaction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSettings(value: Settings => js.Promise[Unit]): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
  }
}
