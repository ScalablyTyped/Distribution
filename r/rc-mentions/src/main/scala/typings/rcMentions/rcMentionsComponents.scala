package typings.rcMentions

import typings.rcMentions.mentionsContextMod.MentionsContextProps
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcMentionsComponents extends rcMentionsProps {
  @scala.inline
  def DropdownMenu: ComponentType[DropdownMenuProps] = js.constructorOf[typings.rcMentions.dropdownMenuMod.default].asInstanceOf[typings.react.mod.ComponentType[DropdownMenuProps]]
  @scala.inline
  def KeywordTrigger: ComponentType[KeywordTriggerProps] = js.constructorOf[typings.rcMentions.keywordTriggerMod.default].asInstanceOf[typings.react.mod.ComponentType[KeywordTriggerProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcMentions.mod.default].asInstanceOf[typings.react.mod.ComponentType[LibProps]]
  @scala.inline
  def LibOption: ComponentType[LibOptionProps] = typings.rcMentions.mod.default.Option.asInstanceOf[typings.react.mod.ComponentType[LibOptionProps]]
  @scala.inline
  def Mentions: ComponentType[MentionsProps] = js.constructorOf[typings.rcMentions.mentionsMod.default].asInstanceOf[typings.react.mod.ComponentType[MentionsProps]]
  @scala.inline
  def MentionsContextConsumer: ComponentType[MentionsContextConsumerProps[MentionsContextProps]] = js.constructorOf[typings.rcMentions.mentionsContextMod.MentionsContextConsumer].asInstanceOf[typings.react.mod.ComponentType[
  MentionsContextConsumerProps[typings.rcMentions.mentionsContextMod.MentionsContextProps]]]
  @scala.inline
  def MentionsContextProvider: ComponentType[MentionsContextProviderProps[MentionsContextProps]] = js.constructorOf[typings.rcMentions.mentionsContextMod.MentionsContextProvider].asInstanceOf[typings.react.mod.ComponentType[
  MentionsContextProviderProps[typings.rcMentions.mentionsContextMod.MentionsContextProps]]]
  @scala.inline
  def Option: ComponentType[OptionProps] = typings.rcMentions.optionMod.default.asInstanceOf[typings.react.mod.ComponentType[OptionProps]]
}

