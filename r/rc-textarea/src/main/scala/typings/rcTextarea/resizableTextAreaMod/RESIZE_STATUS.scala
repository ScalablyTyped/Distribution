package typings.rcTextarea.resizableTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RESIZE_STATUS extends js.Object

@JSImport("rc-textarea/es/ResizableTextArea", "RESIZE_STATUS")
@js.native
object RESIZE_STATUS extends js.Object {
  @js.native
  sealed trait NONE extends RESIZE_STATUS
  
  @js.native
  sealed trait RESIZED extends RESIZE_STATUS
  
  @js.native
  sealed trait RESIZING extends RESIZE_STATUS
  
}

