package typings.reactMdAlert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object messageQueueContextMod {
  
  type AddMessage[M /* <: typings.reactMdAlert.messageQueueContextMod.Message */] = js.Function1[/* message */ M, scala.Unit]
  
  type HideMessage = js.Function0[scala.Unit]
  
  type PopMessage = js.Function0[scala.Unit]
  
  type ResetQueue[M /* <: typings.reactMdAlert.messageQueueContextMod.Message */] = js.Function0[js.Array[M]]
  
  type RestartVisibilityTimer = js.Function0[scala.Unit]
  
  type StartVisibilityTimer = js.Function0[scala.Unit]
  
  type StopVisibilityTimer = js.Function0[scala.Unit]
}
