package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHighLevelNode
  extends StObject
     with IParseResult {
  
  def add(node: IAttribute): Any = js.native
  /**
    * Append child node
    */
  def add(node: IHighLevelNode): Any = js.native
  
  /**
    * Whether the node can appear as optional template property value
    */
  def allowsQuestion(): Boolean = js.native
  
  def associatedType(): INodeDefinition = js.native
  
  /**
    * Retrieve attribute by property name. For multivalue properties returns the first attribute.
    */
  def attr(n: String): IAttribute = js.native
  
  /**
    * Retrieve attribute by name or create it if it does not exist
    */
  def attrOrCreate(n: String): IAttribute = js.native
  
  /**
    * Retrieve attribute value by name
    */
  def attrValue(n: String): String = js.native
  
  /**
    * Retrieve attributes by property name. For multivalue properties returns
    * a complete list of attributes.
    */
  def attributes(n: String): js.Array[IAttribute] = js.native
  
  /**
    * List child attributes
    */
  def attrs(): js.Array[IAttribute] = js.native
  
  /**
    * Copy of the node having low level node and YAML node copies as underlying nodes
    */
  def copy(): IHighLevelNode = js.native
  
  /**
    * Convert typesystem error representation to parser error representation
    */
  def createIssue(
    error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify rTypes.IStatus */ Any
  ): ValidationIssue = js.native
  
  /**
    * RAML type of the node
    */
  def definition(): INodeDefinition = js.native
  
  /**
    * Dump the element to YAML string
    */
  def dump(flavor: String): String = js.native
  
  /**
    * Retrieve element by property name. For multivalue properties returns the first element.
    */
  def element(n: String): IHighLevelNode = js.native
  
  /**
    * List child elements
    */
  def elements(): js.Array[IHighLevelNode] = js.native
  
  /**
    * Retrieve elements by property name. For multivalue properties returns
    * a complete list of elements.
    */
  def elementsOfKind(n: String): js.Array[IHighLevelNode] = js.native
  
  def findById(id: String): Any = js.native
  
  /**
    * Retrieve the deepest element enclosing the position specified
    * @param offset text position
    */
  def findElementAtOffset(offset: Double): IHighLevelNode = js.native
  
  /**
    * List all the references to the RAML element decalred in the node
    */
  def findReferences(): js.Array[IParseResult] = js.native
  
  /**
    * Finds the slave counterpart of this node. If this slave has another slave in turn, recursivelly,
    * returns the last slave in the dependency sequence.
    */
  def getLastSlaveCounterPart(): IHighLevelNode = js.native
  
  /**
    * Returns node master or null for top-level nodes.
    */
  def getMaster(): IParseResult = js.native
  
  /**
    * Finds master counterpart of this node.
    * @returns {IHighLevelNode}
    */
  def getMasterCounterPart(): IHighLevelNode = js.native
  
  /**
    * Finds slave counterpart of this node.
    * @returns {IHighLevelNode}
    */
  def getSlaveCounterPart(): IHighLevelNode = js.native
  
  /**
    * Gets whether this node is auxilary.
    */
  def isAuxilary(): Boolean = js.native
  
  /**
    * Whether the AST has traits and resource types expanded
    */
  def isExpanded(): Boolean = js.native
  
  /**
    * For type nodes returns nominal representation of the type
    */
  def localType(): Any = js.native
  
  /**
    * A list of optional property names
    */
  def optionalProperties(): js.Array[String] = js.native
  
  /**
    * For type nodes returns runtime representation of the type
    */
  def parsedType(): Any = js.native
  
  /**
    * All possible properties of the element
    */
  def propertiesAllowedToUse(): js.Array[IProperty] = js.native
  
  def remove(node: IAttribute): Any = js.native
  /**
    * Remove child node
    */
  def remove(node: IHighLevelNode): Any = js.native
  
  /**
    * Clean the list of cached child nodes
    */
  def resetChildren(): Unit = js.native
  
  /**
    * Returns reused node if any
    */
  def reusedNode(): IHighLevelNode = js.native
  
  /**
    * Override top level owner node
    */
  def setWrapperNode(node: BasicNode): Any = js.native
  
  /**
    * Turns high level model node into an object.
    * @param options serialization options
    * @return Stringifyable object representation of the node.
    **/
  def toJSON(options: typings.raml1Parser.distUtilJsonSerializerHLMod.SerializeOptions): Any = js.native
  
  /**
    * Relevant types collection
    */
  def types(): Any = js.native
  
  /**
    * Scalar value representing the element value, if possible
    */
  def value(): Any = js.native
  
  /**
    * Retrieve top level owner node
    */
  def wrapperNode(): BasicNode = js.native
}
