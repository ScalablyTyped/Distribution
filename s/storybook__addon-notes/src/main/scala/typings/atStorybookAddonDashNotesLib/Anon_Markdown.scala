package typings
package atStorybookAddonDashNotesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Markdown
  extends atStorybookAddonDashNotesLib.atStorybookAddonDashNotesMod._WithNotesOptions {
  var markdown: java.lang.String
  var markdownOptions: js.UndefOr[markedLib.markedMod.markedNs.MarkedOptions] = js.undefined
}

object Anon_Markdown {
  @scala.inline
  def apply(markdown: java.lang.String, markdownOptions: markedLib.markedMod.markedNs.MarkedOptions = null): Anon_Markdown = {
    val __obj = js.Dynamic.literal(markdown = markdown)
    if (markdownOptions != null) __obj.updateDynamic("markdownOptions")(markdownOptions)
    __obj.asInstanceOf[Anon_Markdown]
  }
}

