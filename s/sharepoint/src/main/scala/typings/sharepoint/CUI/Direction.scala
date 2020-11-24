package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends js.Object
@JSGlobal("CUI.Direction")
@js.native
object Direction extends js.Object {
  
  @js.native
  sealed trait LTR extends Direction
  
  @js.native
  sealed trait RTL extends Direction
}
