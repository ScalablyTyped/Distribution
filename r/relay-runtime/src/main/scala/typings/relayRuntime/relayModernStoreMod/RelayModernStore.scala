package typings.relayRuntime.relayModernStoreMod

import typings.relayRuntime.relayStoreTypesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelayModernStore extends Store {
  
  def scheduleGC(): Unit = js.native
  
  def toJSON(): js.Any = js.native
}
