package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientControlMode extends js.Object

@JSGlobal("SPClientTemplates.ClientControlMode")
@js.native
object ClientControlMode extends js.Object {
  @js.native
  sealed trait DisplayForm extends ClientControlMode
  
  @js.native
  sealed trait EditForm extends ClientControlMode
  
  @js.native
  sealed trait Invalid extends ClientControlMode
  
  @js.native
  sealed trait NewForm extends ClientControlMode
  
  @js.native
  sealed trait View extends ClientControlMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientControlMode with Double] = js.native
  /* 1 */ @js.native
  object DisplayForm extends TopLevel[DisplayForm with Double]
  
  /* 2 */ @js.native
  object EditForm extends TopLevel[EditForm with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 3 */ @js.native
  object NewForm extends TopLevel[NewForm with Double]
  
  /* 4 */ @js.native
  object View extends TopLevel[View with Double]
  
}

