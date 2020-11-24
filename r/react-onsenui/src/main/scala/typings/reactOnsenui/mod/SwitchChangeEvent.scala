package typings.reactOnsenui.mod

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchChangeEvent extends Event {
  
  var isInteractive: Boolean = js.native
  
  var switch: HTMLElement = js.native
  
  var value: Boolean = js.native
}
