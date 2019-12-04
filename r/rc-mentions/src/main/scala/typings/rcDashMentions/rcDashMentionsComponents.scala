package typings.rcDashMentions

import typings.rcDashMentions.libMentionsContextMod.MentionsContextProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDashMentionsComponents extends rcDashMentionsProps {
  @scala.inline
  def DropdownMenu: ComponentType[DropdownMenuProps] = js.constructorOf[typings.rcDashMentions.libDropdownMenuMod.default].asInstanceOf[typings.react.reactMod.ComponentType[DropdownMenuProps]]
  @scala.inline
  def KeywordTrigger: ComponentType[KeywordTriggerProps] = js.constructorOf[typings.rcDashMentions.libKeywordTriggerMod.default].asInstanceOf[typings.react.reactMod.ComponentType[KeywordTriggerProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcDashMentions.libMod.default].asInstanceOf[typings.react.reactMod.ComponentType[LibProps]]
  @scala.inline
  def LibOption: ComponentType[LibOptionProps] = typings.rcDashMentions.libMod.default.Option.asInstanceOf[typings.react.reactMod.ComponentType[LibOptionProps]]
  @scala.inline
  def Mentions: ComponentType[MentionsProps] = js.constructorOf[typings.rcDashMentions.libMentionsMod.default].asInstanceOf[typings.react.reactMod.ComponentType[MentionsProps]]
  @scala.inline
  def MentionsContextConsumer: ComponentType[MentionsContextConsumerProps[MentionsContextProps]] = js.constructorOf[typings.rcDashMentions.libMentionsContextMod.MentionsContextConsumer].asInstanceOf[typings.react.reactMod.ComponentType[
  MentionsContextConsumerProps[typings.rcDashMentions.libMentionsContextMod.MentionsContextProps]]]
  @scala.inline
  def MentionsContextProvider: ComponentType[MentionsContextProviderProps[MentionsContextProps]] = js.constructorOf[typings.rcDashMentions.libMentionsContextMod.MentionsContextProvider].asInstanceOf[typings.react.reactMod.ComponentType[
  MentionsContextProviderProps[typings.rcDashMentions.libMentionsContextMod.MentionsContextProps]]]
  @scala.inline
  def Option: ComponentType[OptionProps] = typings.rcDashMentions.libOptionMod.default.asInstanceOf[typings.react.reactMod.ComponentType[OptionProps]]
}

