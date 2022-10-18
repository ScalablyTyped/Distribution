package typings.sentryBrowser

import typings.sentryTypes.typesStacktraceMod.StackLineParser
import typings.sentryTypes.typesStacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStackParsersMod {
  
  @JSImport("@sentry/browser/types/stack-parsers", "chromeStackLineParser")
  @js.native
  val chromeStackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "defaultStackLineParsers")
  @js.native
  val defaultStackLineParsers: js.Array[StackLineParser] = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "geckoStackLineParser")
  @js.native
  val geckoStackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "opera10StackLineParser")
  @js.native
  val opera10StackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "opera11StackLineParser")
  @js.native
  val opera11StackLineParser: StackLineParser = js.native
  
  @JSImport("@sentry/browser/types/stack-parsers", "winjsStackLineParser")
  @js.native
  val winjsStackLineParser: StackLineParser = js.native
}
