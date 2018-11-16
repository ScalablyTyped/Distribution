package typings
package refLib.refMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ref", JSImport.Namespace)
@js.native
object refModMembers extends js.Object {
  var NULL: nodeLib.Buffer = js.native
  var NULL_POINTER: nodeLib.Buffer = js.native
  var endianness: java.lang.String = js.native
  var types: refLib.Anon_Uint16 = js.native
  def _attach(buffer: nodeLib.Buffer, `object`: js.Object): scala.Unit = js.native
  def _reinterpret(buffer: nodeLib.Buffer, size: scala.Double): nodeLib.Buffer = js.native
  def _reinterpret(buffer: nodeLib.Buffer, size: scala.Double, offset: scala.Double): nodeLib.Buffer = js.native
  def _reinterpretUntilZeros(buffer: nodeLib.Buffer, size: scala.Double): nodeLib.Buffer = js.native
  def _reinterpretUntilZeros(buffer: nodeLib.Buffer, size: scala.Double, offset: scala.Double): nodeLib.Buffer = js.native
  def _writeObject(buffer: nodeLib.Buffer, offset: scala.Double, `object`: js.Object): scala.Unit = js.native
  def _writePointer(buffer: nodeLib.Buffer, offset: scala.Double, pointer: nodeLib.Buffer): scala.Unit = js.native
  def address(buffer: nodeLib.Buffer): scala.Double = js.native
  def alloc(`type`: java.lang.String): nodeLib.Buffer = js.native
  def alloc(`type`: java.lang.String, value: js.Any): nodeLib.Buffer = js.native
  def alloc(`type`: Type): nodeLib.Buffer = js.native
  def alloc(`type`: Type, value: js.Any): nodeLib.Buffer = js.native
  def allocCString(string: java.lang.String): nodeLib.Buffer = js.native
  def allocCString(string: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  def coerceType(`type`: java.lang.String): Type = js.native
  def coerceType(`type`: Type): Type = js.native
  def deref(buffer: nodeLib.Buffer): js.Any = js.native
  def derefType(`type`: java.lang.String): Type = js.native
  def derefType(`type`: Type): Type = js.native
  def get(buffer: nodeLib.Buffer): js.Any = js.native
  def get(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  def get(buffer: nodeLib.Buffer, offset: scala.Double, `type`: java.lang.String): js.Any = js.native
  def get(buffer: nodeLib.Buffer, offset: scala.Double, `type`: Type): js.Any = js.native
  def getType(buffer: nodeLib.Buffer): Type = js.native
  def isNull(buffer: nodeLib.Buffer): scala.Boolean = js.native
  def readCString(buffer: nodeLib.Buffer): java.lang.String = js.native
  def readCString(buffer: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
  def readInt64BE(buffer: nodeLib.Buffer): js.Any = js.native
  def readInt64BE(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  def readInt64LE(buffer: nodeLib.Buffer): js.Any = js.native
  def readInt64LE(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  def readObject(buffer: nodeLib.Buffer): js.Object = js.native
  def readObject(buffer: nodeLib.Buffer, offset: scala.Double): js.Object = js.native
  def readPointer(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def readPointer(buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def readPointer(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  def readUInt64BE(buffer: nodeLib.Buffer): js.Any = js.native
  def readUInt64BE(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  def readUInt64LE(buffer: nodeLib.Buffer): js.Any = js.native
  def readUInt64LE(buffer: nodeLib.Buffer, offset: scala.Double): js.Any = js.native
  def ref(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def refType(`type`: java.lang.String): Type = js.native
  def refType(`type`: Type): Type = js.native
  def reinterpret(buffer: nodeLib.Buffer, size: scala.Double): nodeLib.Buffer = js.native
  def reinterpret(buffer: nodeLib.Buffer, size: scala.Double, offset: scala.Double): nodeLib.Buffer = js.native
  def reinterpretUntilZeros(buffer: nodeLib.Buffer, size: scala.Double): nodeLib.Buffer = js.native
  def reinterpretUntilZeros(buffer: nodeLib.Buffer, size: scala.Double, offset: scala.Double): nodeLib.Buffer = js.native
  def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any): scala.Unit = js.native
  def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def set(buffer: nodeLib.Buffer, offset: scala.Double, value: js.Any, `type`: Type): scala.Unit = js.native
  def writeCString(buffer: nodeLib.Buffer, offset: scala.Double, string: java.lang.String): scala.Unit = js.native
  def writeCString(buffer: nodeLib.Buffer, offset: scala.Double, string: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def writeInt64BE(buffer: nodeLib.Buffer, offset: scala.Double, input: java.lang.String): scala.Unit = js.native
  def writeInt64BE(buffer: nodeLib.Buffer, offset: scala.Double, input: scala.Double): scala.Unit = js.native
  def writeInt64LE(buffer: nodeLib.Buffer, offset: scala.Double, input: java.lang.String): scala.Unit = js.native
  def writeInt64LE(buffer: nodeLib.Buffer, offset: scala.Double, input: scala.Double): scala.Unit = js.native
  def writeObject(buffer: nodeLib.Buffer, offset: scala.Double, `object`: js.Object): scala.Unit = js.native
  def writePointer(buffer: nodeLib.Buffer, offset: scala.Double, pointer: nodeLib.Buffer): scala.Unit = js.native
  def writeUInt64BE(buffer: nodeLib.Buffer, offset: scala.Double, input: java.lang.String): scala.Unit = js.native
  def writeUInt64BE(buffer: nodeLib.Buffer, offset: scala.Double, input: scala.Double): scala.Unit = js.native
}

