package typings.prettier

import typings.prettier.anon.Markdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMarkdownMod {
  
  @JSImport("prettier/parser-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prettier/parser-markdown", "parsers")
  @js.native
  def parsers: Markdown = js.native
  inline def parsers_=(x: Markdown): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsers")(x.asInstanceOf[js.Any])
}
