package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataView extends StObject {
  
  /* standard es5 */
  val buffer: js.typedarray.ArrayBuffer = js.native
  
  /* standard es5 */
  val byteLength: Double = js.native
  
  /* standard es5 */
  val byteOffset: Double = js.native
  
  /**
    * Gets the BigInt64 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es2020.bigint */
  def getBigInt64(byteOffset: Double): js.BigInt = js.native
  def getBigInt64(byteOffset: Double, littleEndian: scala.Boolean): js.BigInt = js.native
  
  /**
    * Gets the BigUint64 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es2020.bigint */
  def getBigUint64(byteOffset: Double): js.BigInt = js.native
  def getBigUint64(byteOffset: Double, littleEndian: scala.Boolean): js.BigInt = js.native
  
  /**
    * Gets the Float32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getFloat32(byteOffset: Double): Double = js.native
  def getFloat32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Float64 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getFloat64(byteOffset: Double): Double = js.native
  def getFloat64(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int16 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getInt16(byteOffset: Double): Double = js.native
  def getInt16(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getInt32(byteOffset: Double): Double = js.native
  def getInt32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int8 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  /* standard es5 */
  def getInt8(byteOffset: Double): Double = js.native
  
  /**
    * Gets the Uint16 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getUint16(byteOffset: Double): Double = js.native
  def getUint16(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Uint32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    * @param littleEndian If false or undefined, a big-endian value should be read.
    */
  /* standard es5 */
  def getUint32(byteOffset: Double): Double = js.native
  def getUint32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Uint8 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  /* standard es5 */
  def getUint8(byteOffset: Double): Double = js.native
  
  /**
    * Stores a BigInt64 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es2020.bigint */
  def setBigInt64(byteOffset: Double, value: js.BigInt): Unit = js.native
  def setBigInt64(byteOffset: Double, value: js.BigInt, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores a BigUint64 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es2020.bigint */
  def setBigUint64(byteOffset: Double, value: js.BigInt): Unit = js.native
  def setBigUint64(byteOffset: Double, value: js.BigInt, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Float32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setFloat32(byteOffset: Double, value: Double): Unit = js.native
  def setFloat32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Float64 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setFloat64(byteOffset: Double, value: Double): Unit = js.native
  def setFloat64(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int16 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setInt16(byteOffset: Double, value: Double): Unit = js.native
  def setInt16(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setInt32(byteOffset: Double, value: Double): Unit = js.native
  def setInt32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int8 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    */
  /* standard es5 */
  def setInt8(byteOffset: Double, value: Double): Unit = js.native
  
  /**
    * Stores an Uint16 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setUint16(byteOffset: Double, value: Double): Unit = js.native
  def setUint16(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Uint32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written.
    */
  /* standard es5 */
  def setUint32(byteOffset: Double, value: Double): Unit = js.native
  def setUint32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Uint8 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    */
  /* standard es5 */
  def setUint8(byteOffset: Double, value: Double): Unit = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
}
