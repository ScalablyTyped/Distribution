package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /**
    * A base address rendered as an integer value.
    */
  var baseAddress: js.UndefOr[scala.Double] = js.undefined
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An index into run.addresses used to retrieve a cached instance to represent the address.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * An open-ended string that identifies the address kind. 'section', 'segment' and 'module' are well-known values.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * an offset from the base address, if present, rendered as an integer value.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * An index into run.addresses to retrieve a parent address. The parent can provide a base address (from which the
    * current offset value is relevant) and other details.
    */
  var parentIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    baseAddress: scala.Int | scala.Double = null,
    fullyQualifiedName: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    parentIndex: scala.Int | scala.Double = null,
    properties: PropertyBag = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (baseAddress != null) __obj.updateDynamic("baseAddress")(baseAddress.asInstanceOf[js.Any])
    if (fullyQualifiedName != null) __obj.updateDynamic("fullyQualifiedName")(fullyQualifiedName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (parentIndex != null) __obj.updateDynamic("parentIndex")(parentIndex.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[Address]
  }
}

