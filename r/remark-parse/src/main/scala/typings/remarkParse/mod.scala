package typings.remarkParse

import org.scalablytyped.runtime.Shortcut
import typings.mdastUtilFromMarkdown.mod.Options
import typings.unified.mod.Plugin
import typings.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-parse", JSImport.Namespace)
  @js.native
  val ^ : Parse = js.native
  
  type Parse = Plugin[js.Array[js.UndefOr[RemarkParseOptions]], Settings]
  
  type RemarkParseOptions = Options
  
  type _To = Parse
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parse = ^
}
