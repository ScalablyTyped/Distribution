package typings.removeMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remove-markdown", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Strip Markdown formatting from text
    * @param markdown Markdown text
    */
  def apply(markdown: String): String = js.native
  def apply(markdown: String, options: AnonGfm): String = js.native
}

