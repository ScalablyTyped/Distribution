package typings.sinonChrome.mod

import typings.sinonChrome.mod.events.Event
import typings.sinonChrome.mod.types.StubbedChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-chrome", "proxy")
@js.native
object proxy extends js.Object {
  
  var onProxyError: Event = js.native
  
  var settings: StubbedChromeSetting = js.native
}
