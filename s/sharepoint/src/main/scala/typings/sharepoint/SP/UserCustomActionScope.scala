package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserCustomActionScope extends StObject
@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends StObject {
  
  @js.native
  sealed trait list
    extends StObject
       with UserCustomActionScope
  
  @js.native
  sealed trait site
    extends StObject
       with UserCustomActionScope
  
  @js.native
  sealed trait unknown
    extends StObject
       with UserCustomActionScope
  
  @js.native
  sealed trait web
    extends StObject
       with UserCustomActionScope
}
