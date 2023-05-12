package typings.sentryUtils

import typings.sentryTypes.typesStacktraceMod.StackLineParserFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeStackTraceMod {
  
  @JSImport("@sentry/utils/types/node-stack-trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(): StackLineParserFn = ^.asInstanceOf[js.Dynamic].applyDynamic("node")().asInstanceOf[StackLineParserFn]
  inline def node(getModule: GetModuleFn): StackLineParserFn = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(getModule.asInstanceOf[js.Any]).asInstanceOf[StackLineParserFn]
  
  type GetModuleFn = js.Function1[/* filename */ js.UndefOr[String], js.UndefOr[String]]
}
