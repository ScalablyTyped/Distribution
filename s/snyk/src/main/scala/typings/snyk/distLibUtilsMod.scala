package typings.snyk

import typings.snyk.distCliArgsMod.ArgsOptions
import typings.snyk.distCliArgsMod.MethodArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMod {
  
  @JSImport("snyk/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countPathsToGraphRoot(
    graph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countPathsToGraphRoot")(graph.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def obfuscateArgs(args: ArgsOptions): ArgsOptions | MethodArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("obfuscateArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ArgsOptions | MethodArgs]
  inline def obfuscateArgs(args: MethodArgs): ArgsOptions | MethodArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("obfuscateArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ArgsOptions | MethodArgs]
}
