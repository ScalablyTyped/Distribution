package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenWebOptions extends js.Object

@JSGlobal("SP.OpenWebOptions")
@js.native
object OpenWebOptions extends js.Object {
  @js.native
  sealed trait initNavigationCache extends OpenWebOptions
  
  @js.native
  sealed trait none extends OpenWebOptions
  
  /* 1 */ val initNavigationCache: typings.sharepoint.SP.OpenWebOptions.initNavigationCache with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.OpenWebOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenWebOptions with Double] = js.native
}

