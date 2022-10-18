package typings.storybookMdx2Csf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/mdx2-csf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/mdx2-csf", "SEPARATOR")
  @js.native
  val SEPARATOR: /* "// =========" */ String = js.native
  
  inline def compileSync(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compileSync")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mdxSync(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mdxSync")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def plugin(store: Any): js.Function1[/* root */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(store.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* root */ Any, Any]]
  
  inline def postprocess(code: String, extractedExports: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("postprocess")(code.asInstanceOf[js.Any], extractedExports.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@storybook/mdx2-csf", "wrapperJs")
  @js.native
  val wrapperJs: String = js.native
}
