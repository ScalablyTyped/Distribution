package typings.storybookAddonNotes.sharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownParameter extends _Parameters {
  var markdown: String
}

object MarkdownParameter {
  @scala.inline
  def apply(markdown: String): MarkdownParameter = {
    val __obj = js.Dynamic.literal(markdown = markdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MarkdownParameter]
  }
}

