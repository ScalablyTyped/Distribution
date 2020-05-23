package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserCustomActionScope extends js.Object

@JSGlobal("SP.UserCustomActionScope")
@js.native
object UserCustomActionScope extends js.Object {
  @js.native
  sealed trait list extends UserCustomActionScope
  
  @js.native
  sealed trait site extends UserCustomActionScope
  
  @js.native
  sealed trait unknown extends UserCustomActionScope
  
  @js.native
  sealed trait web extends UserCustomActionScope
  
}

