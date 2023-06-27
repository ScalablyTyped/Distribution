package typings.std.global

import typings.std.StorageEstimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StorageManager")
@js.native
/* standard dom */
open class StorageManager ()
  extends StObject
     with typings.std.StorageManager {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/estimate) */
  /* standard dom */
  /* CompleteClass */
  override def estimate(): js.Promise[StorageEstimate] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/getDirectory) */
  /* standard dom */
  /* CompleteClass */
  override def getDirectory(): js.Promise[typings.std.FileSystemDirectoryHandle] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persist) */
  /* standard dom */
  /* CompleteClass */
  override def persist(): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageManager/persisted) */
  /* standard dom */
  /* CompleteClass */
  override def persisted(): js.Promise[scala.Boolean] = js.native
}
