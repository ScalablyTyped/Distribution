package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragEvent[T] extends MouseEvent[T, NativeDragEvent] {
  
  var dataTransfer: DataTransfer = js.native
}
