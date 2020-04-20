package typings.reactTypist

import typings.react.mod.ComponentType
import typings.reactTypist.mod.Typist.Backspace
import typings.reactTypist.mod.Typist.Delay
import typings.reactTypist.mod.Typist_
import typings.reactTypist.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTypistComponents extends reactTypistProps {
  @scala.inline
  def Backspace: ComponentType[BackspaceProps] = js.constructorOf[typings.reactTypist.mod.default.Backspace].asInstanceOf[ComponentType[BackspaceProps]]
  @scala.inline
  def Delay: ComponentType[DelayProps] = js.constructorOf[typings.reactTypist.mod.default.Delay].asInstanceOf[ComponentType[DelayProps]]
  @scala.inline
  def ReactTypist: ComponentType[ReactTypistProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactTypistProps]]
  @scala.inline
  def Typist: ComponentType[TypistProps] = js.constructorOf[Typist_].asInstanceOf[ComponentType[TypistProps]]
  @scala.inline
  def TypistBackspace: ComponentType[TypistBackspaceProps] = js.constructorOf[Backspace].asInstanceOf[ComponentType[TypistBackspaceProps]]
  @scala.inline
  def TypistDelay: ComponentType[TypistDelayProps] = js.constructorOf[Delay].asInstanceOf[ComponentType[TypistDelayProps]]
}

