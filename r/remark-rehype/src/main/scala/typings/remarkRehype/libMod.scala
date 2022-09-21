package typings.remarkRehype

import org.scalablytyped.runtime.Shortcut
import typings.hast.mod.ElementContent
import typings.mdast.mod.Parent
import typings.mdast.mod.Root
import typings.mdastUtilToHast.libMod.HastNode
import typings.mdastUtilToHast.traverseMod.H
import typings.mdastUtilToHast.traverseMod.MdastNode
import typings.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod extends Shortcut {
  
  /**
    * Plugin that turns markdown into HTML to support rehype.
    *
    * *   If a destination processor is given, that processor runs with a new HTML
    *     (hast) tree (bridge-mode).
    *     As the given processor runs with a hast tree, and rehype plugins support
    *     hast, that means rehype plugins can be used with the given processor.
    *     The hast tree is discarded in the end.
    *     It’s highly unlikely that you want to do this.
    * *   The common case is to not pass a destination processor, in which case the
    *     current processor continues running with a new HTML (hast) tree
    *     (mutate-mode).
    *     As the current processor continues with a hast tree, and rehype plugins
    *     support hast, that means rehype plugins can be used after
    *     `remark-rehype`.
    *     It’s likely that this is what you want to do.
    *
    * @param destination
    *   Optional unified processor.
    * @param options
    *   Options passed to `mdast-util-to-hast`.
    */
  @JSImport("remark-rehype/lib", JSImport.Default)
  @js.native
  val default: Plugin[
    (js.Tuple2[
      js.UndefOr[Null | (typings.unified.mod.Processor[Any, Any, Any, Any])], 
      js.UndefOr[typings.mdastUtilToHast.libMod.Options]
    ]) | (js.Array[Any | typings.mdastUtilToHast.libMod.Options]), 
    Root, 
    Root
  ] = js.native
  
  @js.native
  trait DoNotTouchAsThisImportIncludesRawInTree extends StObject {
    
    def all(h: H, parent: MdastNode): js.Array[ElementContent] = js.native
    
    def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = js.native
    def one(h: typings.mdastUtilToHast.libMod.H, node: MdastNode, parent: Parent): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = js.native
    
    def toHast(tree: typings.mdastUtilToHast.libMod.MdastNode): js.UndefOr[HastNode | Null] = js.native
    def toHast(tree: typings.mdastUtilToHast.libMod.MdastNode, options: typings.mdastUtilToHast.libMod.Options): js.UndefOr[HastNode | Null] = js.native
  }
  
  type HastRoot = typings.hast.mod.Root
  
  type MdastRoot = Root
  
  type Options = typings.mdastUtilToHast.mod.Options
  
  type Processor = typings.unified.mod.Processor[Any, Any, Any, Any]
  
  type _To = Plugin[
    (js.Tuple2[
      js.UndefOr[Null | (typings.unified.mod.Processor[Any, Any, Any, Any])], 
      js.UndefOr[typings.mdastUtilToHast.libMod.Options]
    ]) | (js.Array[Any | typings.mdastUtilToHast.libMod.Options]), 
    Root, 
    Root
  ]
  
  /* This means you don't have to write `default`, but can instead just say `libMod.foo` */
  override def _to: Plugin[
    (js.Tuple2[
      js.UndefOr[Null | (typings.unified.mod.Processor[Any, Any, Any, Any])], 
      js.UndefOr[typings.mdastUtilToHast.libMod.Options]
    ]) | (js.Array[Any | typings.mdastUtilToHast.libMod.Options]), 
    Root, 
    Root
  ] = default
}
