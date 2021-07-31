package typings.seen.mod

import typings.seen.mod.Events.Dispatcher
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "MouseEvents")
@js.native
class MouseEvents protected () extends StObject {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: MouseEventOptions) = this()
  def this(elementOrId: HTMLElement, options: MouseEventOptions) = this()
  
  def attach(): Unit = js.native
  
  def detach(): Unit = js.native
  
  var dispatch: Dispatcher = js.native
  
  var el: HTMLElement = js.native
}
