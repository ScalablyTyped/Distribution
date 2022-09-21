package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A StorageEvent is sent to a window when a storage area it has access to is changed within the context of another document. */
@js.native
trait StorageEvent
  extends StObject
     with Event {
  
  /* standard dom */
  def initStorageEvent(
    `type`: java.lang.String,
    bubbles: js.UndefOr[scala.Boolean],
    cancelable: js.UndefOr[scala.Boolean],
    key: js.UndefOr[java.lang.String | Null],
    oldValue: js.UndefOr[java.lang.String | Null],
    newValue: js.UndefOr[java.lang.String | Null],
    url: js.UndefOr[java.lang.String | URL],
    storageArea: js.UndefOr[Storage | Null]
  ): Unit = js.native
  
  /** Returns the key of the storage item being changed. */
  /* standard dom */
  val key: java.lang.String | Null = js.native
  
  /** Returns the new value of the key of the storage item whose value is being changed. */
  /* standard dom */
  val newValue: java.lang.String | Null = js.native
  
  /** Returns the old value of the key of the storage item whose value is being changed. */
  /* standard dom */
  val oldValue: java.lang.String | Null = js.native
  
  /** Returns the Storage object that was affected. */
  /* standard dom */
  val storageArea: Storage | Null = js.native
  
  /** Returns the URL of the document whose storage item changed. */
  /* standard dom */
  val url: java.lang.String = js.native
}
