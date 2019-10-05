package typings.snabbdom

import org.scalablytyped.runtime.StringDictionary
import typings.snabbdom.modulesModuleMod.Module
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom/modules/eventlisteners", JSImport.Namespace)
@js.native
object modulesEventlistenersMod extends js.Object {
  @js.native
  trait On extends /* event */ StringDictionary[EventListener]
  
  val default: Module = js.native
  val eventListenersModule: Module = js.native
}

