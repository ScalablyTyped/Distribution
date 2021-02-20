package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalLocation extends StObject {
  
  /**
    * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler
    * that encodes calling convention, return type and other details along with the function name.
    */
  var decoratedName: js.UndefOr[String] = js.native
  
  /**
    * The human-readable fully qualified name of the logical location.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.native
  
  /**
    * The index within the logical locations array.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * The type of construct this logical location component refers to. Should be one of 'function', 'member',
    * 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property',
    * 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of
    * those accurately describe the construct.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Identifies the construct in which the result occurred. For example, this property might contain the name of a
    * class or a method.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Identifies the index of the immediate parent of the construct in which the result was detected. For example,
    * this property might point to a logical location that represents the namespace that holds a type.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  
  /**
    * Key/value pairs that provide additional information about the logical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}
object LogicalLocation {
  
  @scala.inline
  def apply(): LogicalLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogicalLocation]
  }
  
  @scala.inline
  implicit class LogicalLocationMutableBuilder[Self <: LogicalLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecoratedName(value: String): Self = StObject.set(x, "decoratedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratedNameUndefined: Self = StObject.set(x, "decoratedName", js.undefined)
    
    @scala.inline
    def setFullyQualifiedName(value: String): Self = StObject.set(x, "fullyQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyQualifiedNameUndefined: Self = StObject.set(x, "fullyQualifiedName", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentIndex(value: Double): Self = StObject.set(x, "parentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndexUndefined: Self = StObject.set(x, "parentIndex", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
