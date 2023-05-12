package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is a base interface for ObjectLiteralExpression and JSXAttributes to extend from. JSXAttributes is similar to
  * ObjectLiteralExpression in that it contains array of properties; however, JSXAttributes' properties can only be
  * JSXAttribute or JSXSpreadAttribute. ObjectLiteralExpression, on the other hand, can only have properties of type
  * ObjectLiteralElement (e.g. PropertyAssignment, ShorthandPropertyAssignment etc.)
  */
@js.native
trait ObjectLiteralExpressionBase[T /* <: ObjectLiteralElement */]
  extends StObject
     with PrimaryExpression
     with Declaration {
  
  val properties: NodeArray[T] = js.native
}
