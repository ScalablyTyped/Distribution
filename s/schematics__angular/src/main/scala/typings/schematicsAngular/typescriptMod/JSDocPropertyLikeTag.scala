package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocPropertyLikeTag
  extends StObject
     with JSDocTag
     with Declaration {
  
  val isBracketed: Boolean = js.native
  
  /** Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like */
  val isNameFirst: Boolean = js.native
  
  val name: EntityName = js.native
  
  @JSName("parent")
  val parent_JSDocPropertyLikeTag: JSDoc = js.native
  
  val typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}
