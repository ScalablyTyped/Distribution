package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows data to be stored and retrieved between Lens sessions. In other words, data can be saved on device and loaded back in the next time the Lens is opened. Can be accessed with global.
  * persistentStorageSystem.
  */
trait PersistentStorageSystem
  extends StObject
     with ScriptObject {
  
  /** The GeneralDataStore object used to store and retrieve data. */
  var store: GeneralDataStore
}
object PersistentStorageSystem {
  
  inline def apply(getTypeName: () => String, isOfType: String => Boolean, store: GeneralDataStore): PersistentStorageSystem = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentStorageSystem]
  }
  
  extension [Self <: PersistentStorageSystem](x: Self) {
    
    inline def setStore(value: GeneralDataStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
