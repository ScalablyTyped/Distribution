package typings.std.global

import typings.std.StorageEstimate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("StorageManager")
@js.native
class StorageManager ()
  extends StObject
     with typings.std.StorageManager {
  
  /* CompleteClass */
  override def estimate(): js.Promise[StorageEstimate] = js.native
  
  /* CompleteClass */
  override def persist(): js.Promise[scala.Boolean] = js.native
  
  /* CompleteClass */
  override def persisted(): js.Promise[scala.Boolean] = js.native
}
