package typings.remarkFrontmatter

import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-frontmatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  inline def default(options: typings.micromarkExtensionFrontmatter.mattersMod.Options): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  
  type Options = typings.micromarkExtensionFrontmatter.mod.Options
  
  type Root = typings.mdast.mod.Root
}
