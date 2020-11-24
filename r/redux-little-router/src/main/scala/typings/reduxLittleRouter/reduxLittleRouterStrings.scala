package typings.reduxLittleRouter

import typings.reduxLittleRouter.mod.HistoryAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduxLittleRouterStrings {
  
  @scala.inline
  def POP: POP = "POP".asInstanceOf[POP]
  
  @scala.inline
  def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  
  @scala.inline
  def REPLACE: REPLACE = "REPLACE".asInstanceOf[REPLACE]
  
  @js.native
  sealed trait POP extends HistoryAction
  
  @js.native
  sealed trait PUSH extends HistoryAction
  
  @js.native
  sealed trait REPLACE extends HistoryAction
}
