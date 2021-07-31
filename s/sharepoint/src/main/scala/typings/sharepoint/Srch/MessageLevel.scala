package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageLevel extends StObject
@JSGlobal("Srch.MessageLevel")
@js.native
object MessageLevel extends StObject {
  
  @js.native
  sealed trait error
    extends StObject
       with MessageLevel
  
  @js.native
  sealed trait information
    extends StObject
       with MessageLevel
  
  @js.native
  sealed trait warning
    extends StObject
       with MessageLevel
}
