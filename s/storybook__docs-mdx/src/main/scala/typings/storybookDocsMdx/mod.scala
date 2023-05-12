package typings.storybookDocsMdx

import typings.babelTypes.mod.File_
import typings.std.Record
import typings.storybookDocsMdx.anon.Imports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/docs-mdx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyze(code: String): Imports = ^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(code.asInstanceOf[js.Any]).asInstanceOf[Imports]
  
  inline def extractImports(root: File_): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractImports")(root.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def plugin(store: Any): js.Function1[/* root */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(store.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* root */ Any, Any]]
}
