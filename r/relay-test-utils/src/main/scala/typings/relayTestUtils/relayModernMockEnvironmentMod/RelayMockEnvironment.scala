package typings.relayTestUtils.relayModernMockEnvironmentMod

import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.OptimisticUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayMockEnvironment
  extends MockEnvironment
     with Environment {
  
  var configName: js.UndefOr[String | Null] = js.native
  
  def replaceUpdate(update: OptimisticUpdate, newUpdate: OptimisticUpdate): Unit = js.native
  
  def revertUpdate(update: OptimisticUpdate): Unit = js.native
}
