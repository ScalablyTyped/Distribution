package typings.roads

import typings.roads.responseMod.default
import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiedSinceMod {
  
  @JSImport("roads/types/middleware/modifiedSince", "middleware")
  @js.native
  val middleware: Middleware[ModifiedSinceContext] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ @js.native
  trait ModifiedSinceContext extends StObject {
    
    def buildNotModifiedResponse(): default = js.native
    
    def shouldReturnNotModifiedResponse(lastModifiedTime: String): Boolean = js.native
    def shouldReturnNotModifiedResponse(lastModifiedTime: js.Date): Boolean = js.native
  }
}
