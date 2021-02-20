package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserCustomActionScope extends StObject
@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends StObject {
  
  @js.native
  sealed trait list extends UserCustomActionScope
  
  @js.native
  sealed trait site extends UserCustomActionScope
  
  @js.native
  sealed trait unknown extends UserCustomActionScope
  
  @js.native
  sealed trait web extends UserCustomActionScope
}
