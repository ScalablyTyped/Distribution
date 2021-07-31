package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractiveButtonCallType extends StObject
@JSImport("slack-mock", "InteractiveButtonCallType")
@js.native
object InteractiveButtonCallType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InteractiveButtonCallType & String] = js.native
  
  @js.native
  sealed trait response
    extends StObject
       with InteractiveButtonCallType
  /* "response" */ val response: typings.slackMock.mod.InteractiveButtonCallType.response & String = js.native
  
  @js.native
  sealed trait response_url
    extends StObject
       with InteractiveButtonCallType
  /* "response_url" */ val response_url: typings.slackMock.mod.InteractiveButtonCallType.response_url & String = js.native
}
