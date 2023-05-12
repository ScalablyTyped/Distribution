package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateLiteralDslParser {
  
  @JSImport("@sinclair/typebox", "TemplateLiteralDslParser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Parse(template_dsl: String): js.Array[TTemplateLiteralKind] = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(template_dsl.asInstanceOf[js.Any]).asInstanceOf[js.Array[TTemplateLiteralKind]]
}
