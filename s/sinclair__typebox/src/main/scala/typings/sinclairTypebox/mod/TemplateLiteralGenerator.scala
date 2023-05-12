package typings.sinclairTypebox.mod

import typings.sinclairTypebox.mod.TemplateLiteralParser.Expression
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateLiteralGenerator {
  
  @JSImport("@sinclair/typebox", "TemplateLiteralGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Generate(expression: Expression): IterableIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("Generate")(expression.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[String]]
}
