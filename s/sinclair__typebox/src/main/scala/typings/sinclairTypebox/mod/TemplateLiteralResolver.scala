package typings.sinclairTypebox.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemplateLiteralResolver {
  
  @JSImport("@sinclair/typebox", "TemplateLiteralResolver")
  @js.native
  val ^ : js.Any = js.native
  
  /** Resolves a template literal as a TUnion */
  inline def Resolve(template: TTemplateLiteral[js.Array[TTemplateLiteralKind]]): TString | TUnion[js.Array[TSchema]] | TLiteral[TLiteralValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("Resolve")(template.asInstanceOf[js.Any]).asInstanceOf[TString | TUnion[js.Array[TSchema]] | TLiteral[TLiteralValue]]
}
