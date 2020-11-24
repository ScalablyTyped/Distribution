package typings.stringifyAuthor

import typings.parseAuthor.mod.Author
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stringify-author", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Converts an `author` to a human-readable string.
    *
    * @param author
    * The author to stringify.
    *
    * @returns
    * A string representing the `author`.
    */
  def apply(author: Author): String = js.native
}
