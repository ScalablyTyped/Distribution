package typings.storybookAddonNotes

import typings.react.mod.ComponentType
import typings.storybookAddonNotes.giphyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonNotesComponents extends storybookAddonNotesProps {
  @scala.inline
  def Giphy: ComponentType[GiphyProps] = js.constructorOf[default].asInstanceOf[ComponentType[GiphyProps]]
  @scala.inline
  def NotesLink: ComponentType[NotesLinkProps] = typings.storybookAddonNotes.panelMod.NotesLink.asInstanceOf[ComponentType[NotesLinkProps]]
  @scala.inline
  def Panel: ComponentType[PanelProps] = typings.storybookAddonNotes.panelMod.default.asInstanceOf[ComponentType[PanelProps]]
  @scala.inline
  def SyntaxHighlighter: ComponentType[SyntaxHighlighterProps] = typings.storybookAddonNotes.panelMod.SyntaxHighlighter.asInstanceOf[ComponentType[SyntaxHighlighterProps]]
}

