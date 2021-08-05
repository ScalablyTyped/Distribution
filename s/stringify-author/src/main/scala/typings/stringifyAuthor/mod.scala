package typings.stringifyAuthor

import typings.parseAuthor.mod.Author
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts an `author` to a human-readable string.
    *
    * @param author
    * The author to stringify.
    *
    * @returns
    * A string representing the `author`.
    */
  inline def apply(author: Author): String = ^.asInstanceOf[js.Dynamic].apply(author.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("stringify-author", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
