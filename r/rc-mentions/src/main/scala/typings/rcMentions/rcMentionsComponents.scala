package typings.rcMentions

import typings.rcMentions.dropdownMenuMod.default
import typings.rcMentions.mentionsContextMod.MentionsContextProps
import typings.rcMentions.mod.default.Option
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcMentionsComponents extends rcMentionsProps {
  @scala.inline
  def DropdownMenu: ComponentType[DropdownMenuProps] = js.constructorOf[default].asInstanceOf[ComponentType[DropdownMenuProps]]
  @scala.inline
  def KeywordTrigger: ComponentType[KeywordTriggerProps] = js.constructorOf[typings.rcMentions.keywordTriggerMod.default].asInstanceOf[ComponentType[KeywordTriggerProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcMentions.mod.default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def LibOption: ComponentType[LibOptionProps] = Option.asInstanceOf[ComponentType[LibOptionProps]]
  @scala.inline
  def Mentions: ComponentType[MentionsProps] = js.constructorOf[typings.rcMentions.mentionsMod.default].asInstanceOf[ComponentType[MentionsProps]]
  @scala.inline
  def MentionsContextConsumer: ComponentType[MentionsContextConsumerProps[MentionsContextProps]] = typings.rcMentions.mentionsContextMod.MentionsContextConsumer.asInstanceOf[ComponentType[MentionsContextConsumerProps[MentionsContextProps]]]
  @scala.inline
  def MentionsContextProvider: ComponentType[MentionsContextProviderProps[MentionsContextProps]] = typings.rcMentions.mentionsContextMod.MentionsContextProvider.asInstanceOf[ComponentType[MentionsContextProviderProps[MentionsContextProps]]]
  @scala.inline
  def Option: ComponentType[OptionProps] = typings.rcMentions.optionMod.default.asInstanceOf[ComponentType[OptionProps]]
}

