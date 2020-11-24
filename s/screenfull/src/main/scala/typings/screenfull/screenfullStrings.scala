package typings.screenfull

import typings.screenfull.mod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenfullStrings {
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait change extends EventName
  
  @js.native
  sealed trait error extends EventName
}
