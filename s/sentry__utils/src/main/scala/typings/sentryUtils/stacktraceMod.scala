package typings.sentryUtils

import typings.sentryTypes.stackframeMod.StackFrame
import typings.sentryTypes.stacktraceMod.StackLineParser
import typings.sentryTypes.stacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stacktraceMod {
  
  @JSImport("@sentry/utils/types/stacktrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStackParser(parsers: StackLineParser*): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("createStackParser")(parsers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StackParser]
  
  inline def getFunctionName(fn: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nodeStackLineParser(): StackLineParser = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStackLineParser")().asInstanceOf[StackLineParser]
  inline def nodeStackLineParser(getModule: GetModuleFn): StackLineParser = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStackLineParser")(getModule.asInstanceOf[js.Any]).asInstanceOf[StackLineParser]
  
  inline def stackParserFromStackParserOptions(stackParser: js.Array[StackLineParser]): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("stackParserFromStackParserOptions")(stackParser.asInstanceOf[js.Any]).asInstanceOf[StackParser]
  inline def stackParserFromStackParserOptions(stackParser: StackParser): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("stackParserFromStackParserOptions")(stackParser.asInstanceOf[js.Any]).asInstanceOf[StackParser]
  
  inline def stripSentryFramesAndReverse(stack: js.Array[StackFrame]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripSentryFramesAndReverse")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  type GetModuleFn = js.Function1[/* filename */ js.UndefOr[String], js.UndefOr[String]]
}
