package typings.rehypeRetext

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.Root
import typings.unified.mod.Plugin
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod extends Shortcut {
  
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
  @JSImport("rehype-retext/lib", JSImport.Default)
  @js.native
  val default: (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typings.unist.mod.Node[Data]]) = js.native
  
  type HastRoot = Root
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parser = typings.unified.mod.Parser[Any]
  
  type ParserConstructor = typings.hastUtilToNlcst.libMod.ParserConstructor
  
  type ParserInstance = typings.hastUtilToNlcst.libMod.ParserInstance
  
  type Processor = typings.unified.mod.Processor[Any, Any, Any, Any]
  
  type _To = (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typings.unist.mod.Node[Data]])
  
  /* This means you don't have to write `default`, but can instead just say `libMod.foo` */
  override def _to: (Plugin[js.Array[typings.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typings.unist.mod.Node[Data]]) = default
}
