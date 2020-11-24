package typings.reactRelay.entryPointTypesMod

import typings.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnvironmentProvider[TOptions] extends js.Object {
  
  def getEnvironment(): Environment = js.native
  def getEnvironment(options: TOptions): Environment = js.native
}
