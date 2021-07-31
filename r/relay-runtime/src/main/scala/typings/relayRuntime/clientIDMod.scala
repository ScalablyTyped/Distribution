package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientIDMod {
  
  @JSImport("relay-runtime/lib/store/ClientID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateClientID(id: DataID, storageKey: String): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("generateClientID")(id.asInstanceOf[js.Any], storageKey.asInstanceOf[js.Any])).asInstanceOf[DataID]
  @scala.inline
  def generateClientID(id: DataID, storageKey: String, index: Double): DataID = (^.asInstanceOf[js.Dynamic].applyDynamic("generateClientID")(id.asInstanceOf[js.Any], storageKey.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[DataID]
  
  @scala.inline
  def generateUniqueClientID(): DataID = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUniqueClientID")().asInstanceOf[DataID]
  
  @scala.inline
  def isClientID(id: DataID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClientID")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
