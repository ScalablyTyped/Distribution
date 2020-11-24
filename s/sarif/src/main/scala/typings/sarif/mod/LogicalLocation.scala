package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalLocation extends js.Object {
  
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
  implicit class LogicalLocationOps[Self <: LogicalLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecoratedName(value: String): Self = this.set("decoratedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecoratedName: Self = this.set("decoratedName", js.undefined)
    
    @scala.inline
    def setFullyQualifiedName(value: String): Self = this.set("fullyQualifiedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyQualifiedName: Self = this.set("fullyQualifiedName", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentIndex(value: Double): Self = this.set("parentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIndex: Self = this.set("parentIndex", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
