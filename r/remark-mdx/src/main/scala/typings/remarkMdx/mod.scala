package typings.remarkMdx

import typings.mdastUtilMdx.mod.FromMarkdownExtension
import typings.mdastUtilMdx.mod.ToMarkdownExtension
import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-mdx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  inline def default(options: Options): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  
  @js.native
  trait DoNotTouchAsThisImportItIncludesMdxInTree extends StObject {
    
    def mdxFromMarkdown(): js.Array[FromMarkdownExtension] = js.native
    
    def mdxToMarkdown(): ToMarkdownExtension = js.native
    def mdxToMarkdown(options: typings.mdastUtilMdxJsx.libMod.ToMarkdownOptions): ToMarkdownExtension = js.native
  }
  
  type MicromarkOptions = typings.micromarkExtensionMdxjs.mod.Options
  
  trait Options
    extends StObject
       with typings.micromarkExtensionMdxExpression.devLibSyntaxMod.Options
       with typings.mdastUtilMdxJsx.libMod.ToMarkdownOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Root = typings.mdast.mod.Root
  
  type ToMarkdownOptions = typings.mdastUtilMdx.mod.ToMarkdownOptions
}
