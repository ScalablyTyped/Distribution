package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BrowserFileHandling extends StObject
@JSGlobal("SP.BrowserFileHandling")
@js.native
object BrowserFileHandling extends StObject {
  
  @js.native
  sealed trait permissive
    extends StObject
       with BrowserFileHandling
  
  @js.native
  sealed trait strict
    extends StObject
       with BrowserFileHandling
}
