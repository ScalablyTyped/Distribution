package typings.steam.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EChatEntryType extends js.Object
@JSImport("steam", "EChatEntryType")
@js.native
object EChatEntryType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatEntryType with Double] = js.native
  
  @js.native
  sealed trait ChatMsg extends EChatEntryType
  /* 0 */ @js.native
  object ChatMsg extends TopLevel[ChatMsg with Double]
}
