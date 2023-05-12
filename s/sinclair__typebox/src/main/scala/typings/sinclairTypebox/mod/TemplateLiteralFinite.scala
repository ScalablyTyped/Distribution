package typings.sinclairTypebox.mod

import typings.sinclairTypebox.mod.TemplateLiteralParser.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateLiteralFinite {
  
  @JSImport("@sinclair/typebox", "TemplateLiteralFinite")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Check(expression: Expression): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Check")(expression.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
