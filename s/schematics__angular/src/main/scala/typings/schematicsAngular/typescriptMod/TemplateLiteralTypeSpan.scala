package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateLiteralTypeSpan
  extends StObject
     with TypeNode {
  
  @JSName("kind")
  val kind_TemplateLiteralTypeSpan: typings.schematicsAngular.typescriptMod.SyntaxKind.TemplateLiteralTypeSpan = js.native
  
  val literal: TemplateMiddle | TemplateTail = js.native
  
  @JSName("parent")
  val parent_TemplateLiteralTypeSpan: TemplateLiteralTypeNode = js.native
  
  val `type`: TypeNode = js.native
}
