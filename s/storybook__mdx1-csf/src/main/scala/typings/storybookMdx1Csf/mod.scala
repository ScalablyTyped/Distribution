package typings.storybookMdx1Csf

import typings.storybookMdx1Csf.distTsSbMdxPluginMod.CompilerOptions
import typings.storybookMdx1Csf.distTsSbMdxPluginMod.MdxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/mdx1-csf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(code: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def compile(code: String, options: MdxOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def compileSync(code: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compileSync")(code.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def compileSync(code: String, options: MdxOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createCompiler(mdxOptions: MdxOptions): js.Function1[/* options */ js.UndefOr[CompilerOptions], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompiler")(mdxOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* options */ js.UndefOr[CompilerOptions], Unit]]
  
  @JSImport("@storybook/mdx1-csf", "wrapperJs")
  @js.native
  val wrapperJs: String = js.native
}
