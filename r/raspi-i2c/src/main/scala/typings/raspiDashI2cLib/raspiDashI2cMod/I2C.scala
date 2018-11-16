package typings
package raspiDashI2cLib.raspiDashI2cMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-i2c", "I2C")
@js.native
class I2C ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  var _devices: js.Any = js.native
  /* private */ def _getDevice(address: js.Any): js.Any = js.native
  def read(address: scala.Double, length: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def read(address: scala.Double, register: scala.Double, length: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def readByte(address: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def readByte(address: scala.Double, register: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def readByteSync(address: scala.Double): scala.Double = js.native
  def readByteSync(address: scala.Double, register: scala.Double): scala.Double = js.native
  def readSync(address: scala.Double): nodeLib.Buffer = js.native
  def readSync(address: scala.Double, registerOrLength: js.UndefOr[scala.Nothing], length: scala.Double): nodeLib.Buffer = js.native
  def readSync(address: scala.Double, registerOrLength: scala.Double): nodeLib.Buffer = js.native
  def readSync(address: scala.Double, registerOrLength: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  def readWord(address: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def readWord(address: scala.Double, register: scala.Double, cb: ReadCallback): scala.Unit = js.native
  def readWordSync(address: scala.Double): scala.Double = js.native
  def readWordSync(address: scala.Double, register: scala.Double): scala.Double = js.native
  def write(address: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  def write(address: scala.Double, buffer: nodeLib.Buffer, cb: WriteCallback): scala.Unit = js.native
  def write(address: scala.Double, register: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  def write(address: scala.Double, register: scala.Double, buffer: nodeLib.Buffer, cb: WriteCallback): scala.Unit = js.native
  def writeByte(address: scala.Double, byte: scala.Double): scala.Unit = js.native
  def writeByte(address: scala.Double, byte: scala.Double, cb: WriteCallback): scala.Unit = js.native
  def writeByte(address: scala.Double, register: scala.Double, byte: scala.Double): scala.Unit = js.native
  def writeByte(address: scala.Double, register: scala.Double, byte: scala.Double, cb: WriteCallback): scala.Unit = js.native
  def writeByteSync(address: scala.Double, registerOrByte: scala.Double): scala.Unit = js.native
  def writeByteSync(address: scala.Double, registerOrByte: scala.Double, byte: scala.Double): scala.Unit = js.native
  def writeSync(address: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  def writeSync(address: scala.Double, register: scala.Double, buffer: nodeLib.Buffer): scala.Unit = js.native
  def writeWord(address: scala.Double, register: scala.Double, word: scala.Double): scala.Unit = js.native
  def writeWord(address: scala.Double, register: scala.Double, word: scala.Double, cb: WriteCallback): scala.Unit = js.native
  def writeWord(address: scala.Double, word: scala.Double): scala.Unit = js.native
  def writeWord(address: scala.Double, word: scala.Double, cb: WriteCallback): scala.Unit = js.native
  def writeWordSync(address: scala.Double, registerOrWord: scala.Double): scala.Unit = js.native
  def writeWordSync(address: scala.Double, registerOrWord: scala.Double, word: scala.Double): scala.Unit = js.native
}

