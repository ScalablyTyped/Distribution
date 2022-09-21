package typings.regexpToAst.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexp-to-ast", "BaseRegExpVisitor")
@js.native
open class BaseRegExpVisitor () extends StObject {
  
  /**
    * The entry point visitor method.
    * This will dispatch to the specific visitor method.
    */
  def visit(node: IRegExpAST): Any = js.native
  
  def visitAlternative(node: Alternative): Any = js.native
  
  def visitCharacter(node: Character): Any = js.native
  
  /**
    * The entry point for visiting the children of a node.
    * Override this to filter the types of children visited
    * or to support new types of children in extended ASTs.
    */
  def visitChildren(node: IRegExpAST): Any = js.native
  
  def visitDisjunction(node: Disjunction): Any = js.native
  
  def visitEndAnchor(node: Assertion): Any = js.native
  
  def visitFlags(node: RegExpFlags): Any = js.native
  
  def visitGroup(Node: Group): Any = js.native
  
  def visitGroupBackReference(Node: GroupBackReference): Any = js.native
  
  def visitLookahead(node: Assertion): Any = js.native
  
  def visitNegativeLookahead(node: Assertion): Any = js.native
  
  def visitNonWordBoundary(node: Assertion): Any = js.native
  
  /**
    * The specific visitor methods
    * Override some of these of create custom visitors.
    */
  def visitPattern(node: RegExpPattern): Any = js.native
  
  def visitQuantifier(Node: Quantifier): Any = js.native
  
  def visitSet(node: Set): Any = js.native
  
  def visitStartAnchor(node: Assertion): Any = js.native
  
  def visitWordBoundary(node: Assertion): Any = js.native
}
