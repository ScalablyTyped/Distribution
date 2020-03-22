package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.SelectSource
import typings.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typings.rcTreeSelect.useKeyValueMappingMod._SkipType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTreeSelectStrings {
  @js.native
  sealed trait SHOW_ALL extends CheckedStrategy
  
  @js.native
  sealed trait SHOW_CHILD extends CheckedStrategy
  
  @js.native
  sealed trait SHOW_PARENT extends CheckedStrategy
  
  @js.native
  sealed trait checkbox extends _SkipType
  
  @js.native
  sealed trait clear extends SelectSource
  
  @js.native
  sealed trait input extends SelectSource
  
  @js.native
  sealed trait option extends SelectSource
  
  @js.native
  sealed trait select extends _SkipType
  
  @js.native
  sealed trait selection extends SelectSource
  
  @scala.inline
  def SHOW_ALL: SHOW_ALL = "SHOW_ALL".asInstanceOf[SHOW_ALL]
  @scala.inline
  def SHOW_CHILD: SHOW_CHILD = "SHOW_CHILD".asInstanceOf[SHOW_CHILD]
  @scala.inline
  def SHOW_PARENT: SHOW_PARENT = "SHOW_PARENT".asInstanceOf[SHOW_PARENT]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
}

