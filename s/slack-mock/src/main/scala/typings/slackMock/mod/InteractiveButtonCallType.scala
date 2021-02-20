package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractiveButtonCallType extends StObject
@JSImport("slack-mock", "InteractiveButtonCallType")
@js.native
object InteractiveButtonCallType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractiveButtonCallType with String] = js.native
  
  @js.native
  sealed trait response extends InteractiveButtonCallType
  /* "response" */ val response: typings.slackMock.mod.InteractiveButtonCallType.response with String = js.native
  
  @js.native
  sealed trait response_url extends InteractiveButtonCallType
  /* "response_url" */ val response_url: typings.slackMock.mod.InteractiveButtonCallType.response_url with String = js.native
}
