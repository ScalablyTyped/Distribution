package typings.sentryUtils.instrumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstrumentHandler extends js.Object {
  
  def callback(data: js.Any): Unit = js.native
  @JSName("callback")
  var callback_Original: InstrumentHandlerCallback = js.native
  
  var `type`: InstrumentHandlerType = js.native
}
