package typings.railsUjs

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/ujs/features/disable", JSImport.Namespace)
@js.native
object disableMod extends js.Object {
  
  def disableElement(e: Element): Unit = js.native
  def disableElement(e: Event): Unit = js.native
  
  def enableElement(e: Element): Unit = js.native
  def enableElement(e: Event): Unit = js.native
  
  def handleDisabledElement(e: Event): Unit = js.native
}
