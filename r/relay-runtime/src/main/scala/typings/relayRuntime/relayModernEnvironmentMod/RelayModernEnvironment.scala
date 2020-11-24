package typings.relayRuntime.relayModernEnvironmentMod

import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdateFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayModernEnvironment extends Environment {
  
  var configName: js.UndefOr[String | Null] = js.native
  
  def isRequestActive(requestIdentifier: String): Boolean = js.native
  
  def isServer(): Boolean = js.native
  
  def replaceUpdate(update: OptimisticUpdateFunction, newUpdate: OptimisticUpdateFunction): Unit = js.native
  
  def revertUpdate(update: OptimisticUpdateFunction): Unit = js.native
}
