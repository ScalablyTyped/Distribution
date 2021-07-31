package typings.screenfull

import typings.screenfull.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenfullStrings {
  
  @js.native
  sealed trait change
    extends StObject
       with EventName
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait error
    extends StObject
       with EventName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}
