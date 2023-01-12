package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait StorageManager extends StObject {
  
  /* standard dom */
  def estimate(): js.Promise[StorageEstimate]
  
  /* standard dom */
  def getDirectory(): js.Promise[FileSystemDirectoryHandle]
  
  /* standard dom */
  def persist(): js.Promise[scala.Boolean]
  
  /* standard dom */
  def persisted(): js.Promise[scala.Boolean]
}
object StorageManager {
  
  inline def apply(
    estimate: () => js.Promise[StorageEstimate],
    getDirectory: () => js.Promise[FileSystemDirectoryHandle],
    persist: () => js.Promise[scala.Boolean],
    persisted: () => js.Promise[scala.Boolean]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = js.Any.fromFunction0(estimate), getDirectory = js.Any.fromFunction0(getDirectory), persist = js.Any.fromFunction0(persist), persisted = js.Any.fromFunction0(persisted))
    __obj.asInstanceOf[StorageManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageManager] (val x: Self) extends AnyVal {
    
    inline def setEstimate(value: () => js.Promise[StorageEstimate]): Self = StObject.set(x, "estimate", js.Any.fromFunction0(value))
    
    inline def setGetDirectory(value: () => js.Promise[FileSystemDirectoryHandle]): Self = StObject.set(x, "getDirectory", js.Any.fromFunction0(value))
    
    inline def setPersist(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    
    inline def setPersisted(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "persisted", js.Any.fromFunction0(value))
  }
}
