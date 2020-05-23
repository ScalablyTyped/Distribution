package typings.raspiI2c

import typings.node.Buffer
import typings.raspiPeripheral.mod.Peripheral
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-i2c", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class I2C () extends Peripheral {
    var _devices: js.Any = js.native
    /* private */ def _getDevice(address: js.Any): js.Any = js.native
    def read(address: Double, length: Double, cb: ReadCallback): Unit = js.native
    def read(address: Double, register: Double, length: Double, cb: ReadCallback): Unit = js.native
    def readByte(address: Double, cb: ReadCallback): Unit = js.native
    def readByte(address: Double, register: Double, cb: ReadCallback): Unit = js.native
    def readByteSync(address: Double): Double = js.native
    def readByteSync(address: Double, register: Double): Double = js.native
    def readSync(address: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: Double, length: Double): Buffer = js.native
    def readWord(address: Double, cb: ReadCallback): Unit = js.native
    def readWord(address: Double, register: Double, cb: ReadCallback): Unit = js.native
    def readWordSync(address: Double): Double = js.native
    def readWordSync(address: Double, register: Double): Double = js.native
    def write(address: Double, buffer: Buffer): Unit = js.native
    def write(address: Double, buffer: Buffer, cb: WriteCallback): Unit = js.native
    def write(address: Double, register: Double, buffer: Buffer): Unit = js.native
    def write(address: Double, register: Double, buffer: Buffer, cb: WriteCallback): Unit = js.native
    def writeByte(address: Double, byte: Double): Unit = js.native
    def writeByte(address: Double, byte: Double, cb: WriteCallback): Unit = js.native
    def writeByte(address: Double, register: Double, byte: Double): Unit = js.native
    def writeByte(address: Double, register: Double, byte: Double, cb: WriteCallback): Unit = js.native
    def writeByteSync(address: Double, registerOrByte: Double): Unit = js.native
    def writeByteSync(address: Double, registerOrByte: Double, byte: Double): Unit = js.native
    def writeSync(address: Double, buffer: Buffer): Unit = js.native
    def writeSync(address: Double, register: Double, buffer: Buffer): Unit = js.native
    def writeWord(address: Double, register: Double, word: Double): Unit = js.native
    def writeWord(address: Double, register: Double, word: Double, cb: WriteCallback): Unit = js.native
    def writeWord(address: Double, word: Double): Unit = js.native
    def writeWord(address: Double, word: Double, cb: WriteCallback): Unit = js.native
    def writeWordSync(address: Double, registerOrWord: Double): Unit = js.native
    def writeWordSync(address: Double, registerOrWord: Double, word: Double): Unit = js.native
  }
  
  type ReadCallback = js.Function2[/* err */ Null | Error | String, /* data */ Null | Buffer | Double, Unit]
  type WriteCallback = js.Function1[/* err */ Null | Error | String, Unit]
}

