package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The address expressed as a byte offset from the start of the addressable region.
    */
  var absoluteAddress: js.UndefOr[Double] = js.native
  /**
    * A human-readable fully qualified name that is associated with the address.
    */
  var fullyQualifiedName: js.UndefOr[String] = js.native
  /**
    * The index within run.addresses of the cached object for this address.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * An open-ended string that identifies the address kind. 'data', 'function', 'header','instruction', 'module',
    * 'page', 'section', 'segment', 'stack', 'stackFrame', 'table' are well-known values.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of bytes in this range of addresses.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * A name that is associated with the address, e.g., '.text'.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The byte offset of this address from the absolute or relative address of the parent object.
    */
  var offsetFromParent: js.UndefOr[Double] = js.native
  /**
    * The index within run.addresses of the parent object.
    */
  var parentIndex: js.UndefOr[Double] = js.native
  /**
    * Key/value pairs that provide additional information about the address.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * The address expressed as a byte offset from the absolute address of the top-most parent object.
    */
  var relativeAddress: js.UndefOr[Double] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAbsoluteAddress(value: Double): Self = this.set("absoluteAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsoluteAddress: Self = this.set("absoluteAddress", js.undefined)
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOffsetFromParent(value: Double): Self = this.set("offsetFromParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetFromParent: Self = this.set("offsetFromParent", js.undefined)
    @scala.inline
    def setParentIndex(value: Double): Self = this.set("parentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentIndex: Self = this.set("parentIndex", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRelativeAddress(value: Double): Self = this.set("relativeAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeAddress: Self = this.set("relativeAddress", js.undefined)
  }
  
}

