package typings.seen.mod

import typings.seen.anon.Smooth
import typings.seen.anon.`2`
import typings.seen.mod.Events.Dispatcher
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "Zoom")
@js.native
open class Zoom protected () extends StObject {
  def this(elementOrId: String) = this()
  def this(elementOrId: HTMLElement) = this()
  def this(elementOrId: String, options: `2`) = this()
  def this(elementOrId: HTMLElement, options: `2`) = this()
  
  var defaults: Smooth = js.native
  
  var dispatch: Dispatcher = js.native
  
  var el: HTMLElement = js.native
  
  var speed: Double = js.native
}
