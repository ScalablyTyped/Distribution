package typings.rotJs.eventqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rot-js/lib/eventqueue", JSImport.Default)
@js.native
/**
  * @class Generic event queue: stores events and retrieves them based on their time
  */
class default[T] () extends EventQueue[T]
