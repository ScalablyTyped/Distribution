package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsHelpMarkdownRendererMod {
  
  @JSImport("snyk/dist/cli/commands/help/markdown-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderMarkdown(markdown: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMarkdown")(markdown.asInstanceOf[js.Any]).asInstanceOf[String]
}
