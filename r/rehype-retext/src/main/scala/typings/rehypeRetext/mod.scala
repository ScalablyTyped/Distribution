package typings.rehypeRetext

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.Root
import typings.unified.mod.Plugin
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Plugin to bridge or mutate to retext.
    *
    * If a destination processor is given, runs the destination with the new nlcst
    * tree (bridge-mode).
    * If a parser is given, returns the nlcst tree: further plugins run on that
    * tree (mutate-mode).
    *
    * @param options
    *   Either a processor (`unified().use(retextEnglish)…`) or a parser.
    */
  @JSImport("rehype-retext", JSImport.Default)
  @js.native
  val default: (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[typings.rehypeRetext.libMod.Parser], Root, Node[Data]]) = js.native
  
  type Parser = typings.rehypeRetext.libMod.Parser
  
  type Processor = typings.rehypeRetext.libMod.Processor
  
  type _To = (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[typings.rehypeRetext.libMod.Parser], Root, Node[Data]])
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[typings.rehypeRetext.libMod.Parser], Root, Node[Data]]) = default
}
