package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalLocation extends js.Object {
  /**
    * The machine-readable name for the logical location, such as a mangled function name provided by a C++ compiler
    * that encodes calling convention, return type and other details along with the function name.
    */
  var decoratedName: js.UndefOr[String] = js.undefined
  /**
    * The human-readable fully qualified name of the logical location.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  /**
    * The index within the logical locations array.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * The type of construct this logical location component refers to. Should be one of 'function', 'member',
    * 'module', 'namespace', 'parameter', 'resource', 'returnType', 'type', 'variable', 'object', 'array', 'property',
    * 'value', 'element', 'text', 'attribute', 'comment', 'declaration', 'dtd' or 'processingInstruction', if any of
    * those accurately describe the construct.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Identifies the construct in which the result occurred. For example, this property might contain the name of a
    * class or a method.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Identifies the index of the immediate parent of the construct in which the result was detected. For example,
    * this property might point to a logical location that represents the namespace that holds a type.
    */
  var parentIndex: js.UndefOr[Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the logical location.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object LogicalLocation {
  @scala.inline
  def apply(
    decoratedName: String = null,
    fullyQualifiedName: String = null,
    index: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    name: String = null,
    parentIndex: js.UndefOr[Double] = js.undefined,
    properties: PropertyBag = null
  ): LogicalLocation = {
    val __obj = js.Dynamic.literal()
    if (decoratedName != null) __obj.updateDynamic("decoratedName")(decoratedName.asInstanceOf[js.Any])
    if (fullyQualifiedName != null) __obj.updateDynamic("fullyQualifiedName")(fullyQualifiedName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(parentIndex)) __obj.updateDynamic("parentIndex")(parentIndex.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalLocation]
  }
}

