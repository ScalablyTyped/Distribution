package typings.rotJs.mod

import typings.rotJs.eventqueueMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js", "EventQueue")
@js.native
/**
  * @class Generic event queue: stores events and retrieves them based on their time
  */
class EventQueue[T] () extends default[T]
