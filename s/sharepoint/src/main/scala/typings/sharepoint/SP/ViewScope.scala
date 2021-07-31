package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewScope extends StObject
@JSGlobal("SP.ViewScope")
@js.native
object ViewScope extends StObject {
  
  @js.native
  sealed trait defaultValue
    extends StObject
       with ViewScope
  
  @js.native
  sealed trait filesOnly
    extends StObject
       with ViewScope
  
  @js.native
  sealed trait recursive
    extends StObject
       with ViewScope
  
  @js.native
  sealed trait recursiveAll
    extends StObject
       with ViewScope
}
