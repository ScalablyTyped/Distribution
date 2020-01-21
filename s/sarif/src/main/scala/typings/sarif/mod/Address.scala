package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /**
    * The address expressed as a byte offset from the start of the addressable region.
    */
  var absoluteAddress: js.UndefOr[Double] = js.undefined
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.undefined
  /**
    * The index within run.addresses of the cached object for this address.
    */
  var index: js.UndefOr[Double] = js.undefined
  /**
    * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
    * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes in this range of addresses.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The byte offset of this address from the absolute or relative address of the parent object.
    */
  var offsetFromParent: js.UndefOr[Double] = js.undefined
  /**
    * The index within run.addresses of the parent object.
    */
  var parentIndex: js.UndefOr[Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The address expressed as a byte offset from the absolute address of the top-most parent object.
    */
  var relativeAddress: js.UndefOr[Double] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    absoluteAddress: Int | Double = null,
    fullyQualifiedName: String = null,
    index: Int | Double = null,
    kind: String = null,
    length: Int | Double = null,
    name: String = null,
    offsetFromParent: Int | Double = null,
    parentIndex: Int | Double = null,
    properties: PropertyBag = null,
    relativeAddress: Int | Double = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (absoluteAddress != null) __obj.updateDynamic("absoluteAddress")(absoluteAddress.asInstanceOf[js.Any])
    if (fullyQualifiedName != null) __obj.updateDynamic("fullyQualifiedName")(fullyQualifiedName.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (offsetFromParent != null) __obj.updateDynamic("offsetFromParent")(offsetFromParent.asInstanceOf[js.Any])
    if (parentIndex != null) __obj.updateDynamic("parentIndex")(parentIndex.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (relativeAddress != null) __obj.updateDynamic("relativeAddress")(relativeAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

