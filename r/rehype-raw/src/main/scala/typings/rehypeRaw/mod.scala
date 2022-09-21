package typings.rehypeRaw

import typings.hastUtilRaw.libMod.Node
import typings.hastUtilRaw.libMod.VFile
import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rehype-raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root])]
  inline def default(options: typings.hastUtilRaw.libMod.Options): Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.hast.mod.Root, typings.hast.mod.Root])]
  
  @js.native
  trait DoNotTouchAsThisImportIncludesRawInTree extends StObject {
    
    def raw(tree: Node): Node = js.native
    def raw(tree: Node, file: Unit, options: typings.hastUtilRaw.libMod.Options): Node = js.native
    def raw(tree: Node, file: VFile): Node = js.native
    def raw(tree: Node, file: VFile, options: typings.hastUtilRaw.libMod.Options): Node = js.native
    def raw(tree: Node, options: typings.hastUtilRaw.libMod.Options): Node = js.native
  }
  
  type Options = typings.hastUtilRaw.mod.Options
  
  type Root = typings.hast.mod.Root
}
