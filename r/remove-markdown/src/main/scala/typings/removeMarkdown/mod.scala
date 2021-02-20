package typings.removeMarkdown

import typings.removeMarkdown.anon.Gfm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Strip Markdown formatting from text
    * @param markdown Markdown text
    */
  @JSImport("remove-markdown", JSImport.Namespace)
  @js.native
  def apply(markdown: String): String = js.native
  @JSImport("remove-markdown", JSImport.Namespace)
  @js.native
  def apply(markdown: String, options: Gfm): String = js.native
}
