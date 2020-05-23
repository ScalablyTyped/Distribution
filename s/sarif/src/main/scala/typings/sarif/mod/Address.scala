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
    absoluteAddress: js.UndefOr[Double] = js.undefined,
    fullyQualifiedName: String = null,
    index: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    length: js.UndefOr[Double] = js.undefined,
    name: String = null,
    offsetFromParent: js.UndefOr[Double] = js.undefined,
    parentIndex: js.UndefOr[Double] = js.undefined,
    properties: PropertyBag = null,
    relativeAddress: js.UndefOr[Double] = js.undefined
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(absoluteAddress)) __obj.updateDynamic("absoluteAddress")(absoluteAddress.get.asInstanceOf[js.Any])
    if (fullyQualifiedName != null) __obj.updateDynamic("fullyQualifiedName")(fullyQualifiedName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetFromParent)) __obj.updateDynamic("offsetFromParent")(offsetFromParent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parentIndex)) __obj.updateDynamic("parentIndex")(parentIndex.get.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeAddress)) __obj.updateDynamic("relativeAddress")(relativeAddress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

