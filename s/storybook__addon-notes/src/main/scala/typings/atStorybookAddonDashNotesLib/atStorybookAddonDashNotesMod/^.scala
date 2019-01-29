package typings
package atStorybookAddonDashNotesLib.atStorybookAddonDashNotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-notes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def withMarkdownNotes(markdown: java.lang.String): atStorybookReactLib.atStorybookReactMod.StoryDecorator = js.native
  def withMarkdownNotes(markdown: java.lang.String, options: markedLib.markedMod.markedNs.MarkedOptions): atStorybookReactLib.atStorybookReactMod.StoryDecorator = js.native
  def withNotes(): atStorybookReactLib.atStorybookReactMod.StoryDecorator = js.native
  def withNotes(options: atStorybookAddonDashNotesLib.atStorybookAddonDashNotesMod.WithNotesOptions): atStorybookReactLib.atStorybookReactMod.StoryDecorator = js.native
  def withNotes(
    story: atStorybookReactLib.atStorybookReactMod.RenderFunction,
    context: atStorybookAddonDashNotesLib.Anon_Kind
  ): stdLib.ReturnType[atStorybookReactLib.atStorybookReactMod.StoryDecorator] = js.native
}

