package typings.reactInfiniteCalendar.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EVENT_TYPE extends js.Object
@JSImport("react-infinite-calendar", "EVENT_TYPE")
@js.native
object EVENT_TYPE extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EVENT_TYPE with Double] = js.native
  
  @js.native
  sealed trait END extends EVENT_TYPE
  /* 1 */ @js.native
  object END extends TopLevel[END with Double]
  
  @js.native
  sealed trait HOVER extends EVENT_TYPE
  /* 0 */ @js.native
  object HOVER extends TopLevel[HOVER with Double]
  
  @js.native
  sealed trait START extends EVENT_TYPE
  /* 1 */ @js.native
  object START extends TopLevel[START with Double]
}
