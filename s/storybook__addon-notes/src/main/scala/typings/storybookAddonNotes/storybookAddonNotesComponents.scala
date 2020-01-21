package typings.storybookAddonNotes

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonNotesComponents extends storybookAddonNotesProps {
  @scala.inline
  def Giphy: ComponentType[GiphyProps] = js.constructorOf[typings.storybookAddonNotes.giphyMod.default].asInstanceOf[typings.react.mod.ComponentType[GiphyProps]]
  @scala.inline
  def NotesLink: ComponentType[NotesLinkProps] = typings.storybookAddonNotes.panelMod.NotesLink.asInstanceOf[typings.react.mod.ComponentType[NotesLinkProps]]
  @scala.inline
  def Panel: ComponentType[PanelProps] = typings.storybookAddonNotes.panelMod.default.asInstanceOf[typings.react.mod.ComponentType[PanelProps]]
  @scala.inline
  def SyntaxHighlighter: ComponentType[SyntaxHighlighterProps] = typings.storybookAddonNotes.panelMod.SyntaxHighlighter.asInstanceOf[typings.react.mod.ComponentType[SyntaxHighlighterProps]]
}

