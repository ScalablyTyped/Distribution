package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InterceptResolutionAction extends StObject
@JSImport("puppeteer", "InterceptResolutionAction")
@js.native
object InterceptResolutionAction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InterceptResolutionAction & String] = js.native
  
  @js.native
  sealed trait Abort
    extends StObject
       with InterceptResolutionAction
  /* "abort" */ val Abort: typings.puppeteer.mod.InterceptResolutionAction.Abort & String = js.native
  
  @js.native
  sealed trait AlreadyHandled
    extends StObject
       with InterceptResolutionAction
  /* "already-handled" */ val AlreadyHandled: typings.puppeteer.mod.InterceptResolutionAction.AlreadyHandled & String = js.native
  
  @js.native
  sealed trait Continue
    extends StObject
       with InterceptResolutionAction
  /* "continue" */ val Continue: typings.puppeteer.mod.InterceptResolutionAction.Continue & String = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with InterceptResolutionAction
  /* "disabled" */ val Disabled: typings.puppeteer.mod.InterceptResolutionAction.Disabled & String = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with InterceptResolutionAction
  /* "none" */ val None: typings.puppeteer.mod.InterceptResolutionAction.None & String = js.native
  
  @js.native
  sealed trait Respond
    extends StObject
       with InterceptResolutionAction
  /* "respond" */ val Respond: typings.puppeteer.mod.InterceptResolutionAction.Respond & String = js.native
}
