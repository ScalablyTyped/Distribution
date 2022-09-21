package typings.retextEnglish

import org.scalablytyped.runtime.Shortcut
import typings.nlcst.mod.Root
import typings.unified.mod.ParserClass
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("retext-english", JSImport.Default)
  @js.native
  val default: Plugin[js.Array[Unit], String, Root] = js.native
  
  @JSImport("retext-english", "Parser")
  @js.native
  val Parser: ParserClass[Root] = js.native
  
  type _To = Plugin[js.Array[Unit], String, Root]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[Unit], String, Root] = default
}
