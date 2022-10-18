package typings.raml1Parser.distParserHighLevelASTMod

import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParseResult extends StObject {
  
  /**
    * @return this for attribute nodes, and null otherwise
    */
  def asAttr(): IAttribute = js.native
  
  /**
    * @return this for element nodes, and null otherwise
    */
  def asElement(): IHighLevelNode = js.native
  
  /**
    * Child nodes obtained
    * 1. from AST directly
    * 2. by applying overlays and extensions if any
    */
  def children(): js.Array[IParseResult] = js.native
  
  def computedValue(name: String): Any = js.native
  
  /**
    * Child nodes obtained from AST directly
    */
  def directChildren(): js.Array[IParseResult] = js.native
  
  /**
    * retrieve errors if any
    */
  def errors(): js.Array[ValidationIssue] = js.native
  
  def fullLocalId(): String = js.native
  
  def getJSON(): Any = js.native
  
  def getKind(): NodeKind = js.native
  
  /**
    * End position of the underlying low level AST node
    */
  def getLowLevelEnd(): Any = js.native
  
  /**
    * Start position of the underlying low level AST node
    */
  def getLowLevelStart(): Any = js.native
  
  def hashkey(): String = js.native
  
  def id(): String = js.native
  
  /**
    * Whether the node is not the AST root
    */
  def isAttached(): Boolean = js.native
  
  /**
    * Whether the node is an attribute
    */
  def isAttr(): Boolean = js.native
  
  /**
    * Whether the node is an element
    */
  def isElement(): Boolean = js.native
  
  def isImplicit(): Boolean = js.native
  
  /**
    * Whether the nodes have the same underlying YAML node
    */
  def isSameNode(n: IParseResult): Boolean = js.native
  
  /**
    * Whether the node is unknown, i.e. can not justified by RAML syntax
    */
  def isUnknown(): Boolean = js.native
  
  def localId(): String = js.native
  
  /**
    * The underlaying node of the low level AST
    */
  def lowLevel(): ILowLevelASTNode = js.native
  
  def name(): String = js.native
  
  /**
    * Whether the element is an optional sibling of trait or resource type
    **/
  def optional(): Boolean = js.native
  
  /**
    * Parent AST node
    */
  def parent(): IHighLevelNode = js.native
  
  /**
    * Some text representation of the node
    */
  def printDetails(): String = js.native
  def printDetails(indent: String): String = js.native
  
  /**
    * Each non root AST node appears to be a value of some RAML element property
    * The property is returned gor non root nodes. Null is returned for root.
    */
  def property(): IProperty = js.native
  
  /**
    * Returns AST root node
    */
  def root(): IHighLevelNode = js.native
  
  def setJSON(`val`: Any): Any = js.native
  
  /**
    * Specify parent AST node
    */
  def setParent(node: IParseResult): Any = js.native
  
  /**
    * Apply validation using the input validation acceptor
    */
  def validate(acceptor: ValidationAcceptor): Unit = js.native
  
  /**
    * RAML version
    */
  def version(): Any = js.native
}
