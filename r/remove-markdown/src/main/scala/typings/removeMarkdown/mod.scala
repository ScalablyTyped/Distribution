package typings.removeMarkdown

import typings.removeMarkdown.anon.Gfm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Strip Markdown formatting from text
    * @param markdown Markdown text
    */
  @scala.inline
  def apply(markdown: String): String = ^.asInstanceOf[js.Dynamic].apply(markdown.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(markdown: String, options: Gfm): String = (^.asInstanceOf[js.Dynamic].apply(markdown.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("remove-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
