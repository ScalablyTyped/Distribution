package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusPriority extends StObject
@JSGlobal("StatusPriority")
@js.native
object StatusPriority extends StObject {
  
  @js.native
  sealed trait blue
    extends StObject
       with StatusPriority
  
  @js.native
  sealed trait green
    extends StObject
       with StatusPriority
  
  @js.native
  sealed trait red
    extends StObject
       with StatusPriority
  
  @js.native
  sealed trait yellow
    extends StObject
       with StatusPriority
}
