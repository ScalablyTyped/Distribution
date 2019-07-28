package typings.refDashNapi.refDashNapiMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref-napi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var NULL: Buffer = js.native
  var NULL_POINTER: Buffer = js.native
  var endianness: String = js.native
  def _attach(buffer: Buffer, `object`: js.Object): Unit = js.native
  def _reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  def _reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  def _writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  def _writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  def address(buffer: Buffer): Double = js.native
  def alloc(`type`: String): Buffer = js.native
  def alloc(`type`: String, value: js.Any): Buffer = js.native
  def alloc(`type`: Type): Buffer = js.native
  def alloc(`type`: Type, value: js.Any): Buffer = js.native
  def allocCString(string: String): Buffer = js.native
  def allocCString(string: String, encoding: String): Buffer = js.native
  def coerceType(`type`: String): Type = js.native
  def coerceType(`type`: Type): Type = js.native
  def deref(buffer: Buffer): js.Any = js.native
  def derefType(`type`: String): Type = js.native
  def derefType(`type`: Type): Type = js.native
  def get(buffer: Buffer): js.Any = js.native
  def get(buffer: Buffer, offset: Double): js.Any = js.native
  def get(buffer: Buffer, offset: Double, `type`: String): js.Any = js.native
  def get(buffer: Buffer, offset: Double, `type`: Type): js.Any = js.native
  def getType(buffer: Buffer): Type = js.native
  def isNull(buffer: Buffer): Boolean = js.native
  def readCString(buffer: Buffer): String = js.native
  def readCString(buffer: Buffer, offset: Double): String = js.native
  def readInt64BE(buffer: Buffer): js.Any = js.native
  def readInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  def readInt64LE(buffer: Buffer): js.Any = js.native
  def readInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  def readObject(buffer: Buffer): js.Object = js.native
  def readObject(buffer: Buffer, offset: Double): js.Object = js.native
  def readPointer(buffer: Buffer): Buffer = js.native
  def readPointer(buffer: Buffer, offset: Double): Buffer = js.native
  def readPointer(buffer: Buffer, offset: Double, length: Double): Buffer = js.native
  def readUInt64BE(buffer: Buffer): js.Any = js.native
  def readUInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  def readUInt64LE(buffer: Buffer): js.Any = js.native
  def readUInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  def ref(buffer: Buffer): Buffer = js.native
  def refType(`type`: String): Type = js.native
  def refType(`type`: Type): Type = js.native
  def reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  def reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: String): Unit = js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: Type): Unit = js.native
  def writeCString(buffer: Buffer, offset: Double, string: String): Unit = js.native
  def writeCString(buffer: Buffer, offset: Double, string: String, encoding: String): Unit = js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  def writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  def writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
}

