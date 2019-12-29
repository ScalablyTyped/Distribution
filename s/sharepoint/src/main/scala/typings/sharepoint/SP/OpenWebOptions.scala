package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OpenWebOptions with Double] = js.native
  /* 1 */ @js.native
  object initNavigationCache extends TopLevel[initNavigationCache with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

