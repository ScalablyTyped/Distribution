package typings.atReachRouter

import typings.atReachRouter.atReachRouterMod.HistoryActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atReachRouterStrings {
  @js.native
  sealed trait POP extends HistoryActionType
  
  @js.native
  sealed trait PUSH extends HistoryActionType
  
  @js.native
  sealed trait href extends js.Object
  
  @scala.inline
  def POP: POP = "POP".asInstanceOf[POP]
  @scala.inline
  def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  @scala.inline
  def href: href = "href".asInstanceOf[href]
}

