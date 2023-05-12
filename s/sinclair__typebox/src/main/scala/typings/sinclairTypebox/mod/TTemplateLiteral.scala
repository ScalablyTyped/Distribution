package typings.sinclairTypebox.mod

import typings.sinclairTypebox.sinclairTypeboxStrings._empty
import typings.sinclairTypebox.sinclairTypeboxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TTemplateLiteral[T /* <: js.Array[TTemplateLiteralKind] */]
  extends StObject
     with TSchema {
  
  var pattern: String = js.native
  
  @JSName("static")
  var static_TTemplateLiteral: TTemplateLiteralUnion[T, _empty] = js.native
  
  var `type`: string = js.native
}
