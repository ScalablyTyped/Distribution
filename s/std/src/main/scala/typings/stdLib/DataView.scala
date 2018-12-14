package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataView extends js.Object {
  val buffer: ArrayBuffer = js.native
  val byteLength: scala.Double = js.native
  val byteOffset: scala.Double = js.native
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  /**
        * Gets the BigInt64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getBigInt64(byteOffset: scala.Double): BigInt = js.native
  /**
        * Gets the BigInt64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getBigInt64(byteOffset: scala.Double, littleEndian: scala.Boolean): BigInt = js.native
  /**
        * Gets the BigUint64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getBigUint64(byteOffset: scala.Double): BigInt = js.native
  /**
        * Gets the BigUint64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getBigUint64(byteOffset: scala.Double, littleEndian: scala.Boolean): BigInt = js.native
  /**
        * Gets the Float32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getFloat32(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Float32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getFloat32(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Float64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getFloat64(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Float64 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getFloat64(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Int16 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getInt16(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Int16 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getInt16(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Int32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getInt32(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Int32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getInt32(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Int8 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getInt8(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Uint16 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getUint16(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Uint16 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getUint16(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Uint32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getUint32(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Gets the Uint32 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getUint32(byteOffset: scala.Double, littleEndian: scala.Boolean): scala.Double = js.native
  /**
        * Gets the Uint8 value at the specified byte offset from the start of the view. There is
        * no alignment constraint; multi-byte values may be fetched from any offset.
        * @param byteOffset The place in the buffer at which the value should be retrieved.
        */
  def getUint8(byteOffset: scala.Double): scala.Double = js.native
  /**
        * Stores a BigInt64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setBigInt64(byteOffset: scala.Double, value: BigInt): scala.Unit = js.native
  /**
        * Stores a BigInt64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setBigInt64(byteOffset: scala.Double, value: BigInt, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores a BigUint64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setBigUint64(byteOffset: scala.Double, value: BigInt): scala.Unit = js.native
  /**
        * Stores a BigUint64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setBigUint64(byteOffset: scala.Double, value: BigInt, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Float32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setFloat32(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Float32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setFloat32(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Float64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setFloat64(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Float64 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setFloat64(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Int16 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setInt16(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Int16 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setInt16(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Int32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setInt32(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Int32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setInt32(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Int8 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        */
  def setInt8(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Uint16 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setUint16(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Uint16 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setUint16(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Uint32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setUint32(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
        * Stores an Uint32 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        * @param littleEndian If false or undefined, a big-endian value should be written,
        * otherwise a little-endian value should be written.
        */
  def setUint32(byteOffset: scala.Double, value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  /**
        * Stores an Uint8 value at the specified byte offset from the start of the view.
        * @param byteOffset The place in the buffer at which the value should be set.
        * @param value The value to set.
        */
  def setUint8(byteOffset: scala.Double, value: scala.Double): scala.Unit = js.native
}

