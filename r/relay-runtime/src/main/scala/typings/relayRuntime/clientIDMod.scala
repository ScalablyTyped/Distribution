package typings.relayRuntime

import typings.relayRuntime.relayRuntimeTypesMod.DataID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientIDMod {
  
  @JSImport("relay-runtime/lib/store/ClientID", "generateClientID")
  @js.native
  def generateClientID(id: DataID, storageKey: String): DataID = js.native
  @JSImport("relay-runtime/lib/store/ClientID", "generateClientID")
  @js.native
  def generateClientID(id: DataID, storageKey: String, index: Double): DataID = js.native
  
  @JSImport("relay-runtime/lib/store/ClientID", "generateUniqueClientID")
  @js.native
  def generateUniqueClientID(): DataID = js.native
  
  @JSImport("relay-runtime/lib/store/ClientID", "isClientID")
  @js.native
  def isClientID(id: DataID): Boolean = js.native
}
