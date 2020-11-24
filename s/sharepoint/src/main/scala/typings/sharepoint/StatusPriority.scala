package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusPriority extends js.Object
@JSGlobal("StatusPriority")
@js.native
object StatusPriority extends js.Object {
  
  @js.native
  sealed trait blue extends StatusPriority
  
  @js.native
  sealed trait green extends StatusPriority
  
  @js.native
  sealed trait red extends StatusPriority
  
  @js.native
  sealed trait yellow extends StatusPriority
}
