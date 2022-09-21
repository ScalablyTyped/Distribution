package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxElement
  extends StObject
     with PrimaryExpression
     with JsxAttributeValue
     with JsxChild {
  
  val children: NodeArray[JsxChild] = js.native
  
  val closingElement: JsxClosingElement = js.native
  
  @JSName("kind")
  val kind_JsxElement: typings.schematicsAngular.typescriptMod.SyntaxKind.JsxElement = js.native
  
  val openingElement: JsxOpeningElement = js.native
}
