package typings.serialport

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.Transform
import typings.serialport.anon.Cts
import typings.serialport.anon.Encoding
import typings.serialport.anon.Length
import typings.serialport.anon.Vmin
import typings.serialport.anon.`0`
import typings.serialport.serialportInts.`110`
import typings.serialport.serialportInts.`115200`
import typings.serialport.serialportInts.`1200`
import typings.serialport.serialportInts.`134`
import typings.serialport.serialportInts.`150`
import typings.serialport.serialportInts.`1800`
import typings.serialport.serialportInts.`19200`
import typings.serialport.serialportInts.`1`
import typings.serialport.serialportInts.`200`
import typings.serialport.serialportInts.`2400`
import typings.serialport.serialportInts.`2`
import typings.serialport.serialportInts.`300`
import typings.serialport.serialportInts.`38400`
import typings.serialport.serialportInts.`4800`
import typings.serialport.serialportInts.`50`
import typings.serialport.serialportInts.`57600`
import typings.serialport.serialportInts.`5`
import typings.serialport.serialportInts.`600`
import typings.serialport.serialportInts.`6`
import typings.serialport.serialportInts.`75`
import typings.serialport.serialportInts.`7`
import typings.serialport.serialportInts.`8`
import typings.serialport.serialportInts.`9600`
import typings.serialport.serialportStrings.ascii
import typings.serialport.serialportStrings.base64
import typings.serialport.serialportStrings.binary
import typings.serialport.serialportStrings.even
import typings.serialport.serialportStrings.hex
import typings.serialport.serialportStrings.mark
import typings.serialport.serialportStrings.none
import typings.serialport.serialportStrings.odd
import typings.serialport.serialportStrings.space
import typings.serialport.serialportStrings.ucs2
import typings.serialport.serialportStrings.utf16le
import typings.serialport.serialportStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("serialport", JSImport.Namespace)
  @js.native
  open class ^ protected () extends SerialPort {
    def this(path: String) = this()
    def this(path: String, callback: ErrorCallback) = this()
    def this(path: String, options: OpenOptions) = this()
    def this(path: String, options: Unit, callback: ErrorCallback) = this()
    def this(path: String, options: OpenOptions, callback: ErrorCallback) = this()
  }
  @JSImport("serialport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Binding Type Def
  @JSImport("serialport", "BaseBinding")
  @js.native
  open class BaseBinding protected () extends StObject {
    def this(options: Any) = this()
    
    def close(): js.Promise[Any] = js.native
    
    def drain(): js.Promise[Any] = js.native
    
    def flush(): js.Promise[Any] = js.native
    
    def get(): js.Promise[Any] = js.native
    
    def open(path: String, options: OpenOptions): js.Promise[Any] = js.native
    
    def read(data: Buffer, offset: Double, length: Double): js.Promise[Any] = js.native
    
    def set(): js.Promise[Any] = js.native
    def set(options: SetOptions): js.Promise[Any] = js.native
    
    def update(): js.Promise[Any] = js.native
    def update(options: UpdateOptions): js.Promise[Any] = js.native
    
    def write(data: Buffer): js.Promise[Any] = js.native
  }
  object BaseBinding {
    
    @JSImport("serialport", "BaseBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def list(): js.Promise[js.Array[PortInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[PortInfo]]]
  }
  
  /* static member */
  @JSImport("serialport", "Binding")
  @js.native
  def Binding: BaseBinding = js.native
  inline def Binding_=(x: BaseBinding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binding")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def list(): js.Promise[js.Array[PortInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[PortInfo]]]
  
  object parsers {
    
    @JSImport("serialport", "parsers.ByteLength")
    @js.native
    open class ByteLength protected () extends Transform {
      def this(options: Length) = this()
    }
    
    @JSImport("serialport", "parsers.CCTalk")
    @js.native
    open class CCTalk () extends Transform
    
    @JSImport("serialport", "parsers.Delimiter")
    @js.native
    open class Delimiter protected () extends Transform {
      def this(options: typings.serialport.anon.Delimiter) = this()
    }
    
    @JSImport("serialport", "parsers.Readline")
    @js.native
    open class Readline protected () extends Delimiter {
      def this(options: Encoding) = this()
    }
    
    @JSImport("serialport", "parsers.Ready")
    @js.native
    open class Ready protected () extends Transform {
      def this(options: `0`) = this()
    }
    
    @JSImport("serialport", "parsers.Regex")
    @js.native
    open class Regex protected () extends Transform {
      def this(options: typings.serialport.anon.Regex) = this()
    }
  }
  
  // Callbacks Type Defs
  type ErrorCallback = js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]
  
  type ModemBitsCallback = js.Function2[/* error */ js.UndefOr[js.Error | Null], /* status */ Cts, Unit]
  
  // Options Type Defs
  trait OpenOptions extends StObject {
    
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.undefined
    
    var binding: js.UndefOr[BaseBinding] = js.undefined
    
    var bindingOptions: js.UndefOr[Vmin] = js.undefined
    
    var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var lock: js.UndefOr[Boolean] = js.undefined
    
    var parity: js.UndefOr[none | even | mark | odd | space] = js.undefined
    
    var rtscts: js.UndefOr[Boolean] = js.undefined
    
    var stopBits: js.UndefOr[`1` | `2`] = js.undefined
    
    var xany: js.UndefOr[Boolean] = js.undefined
    
    var xoff: js.UndefOr[Boolean] = js.undefined
    
    var xon: js.UndefOr[Boolean] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      inline def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      inline def setBinding(value: BaseBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setBindingOptions(value: Vmin): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
      
      inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
      
      inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
      
      inline def setDataBits(value: `8` | `7` | `6` | `5`): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      inline def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      inline def setParity(value: none | even | mark | odd | space): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      inline def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      inline def setRtscts(value: Boolean): Self = StObject.set(x, "rtscts", value.asInstanceOf[js.Any])
      
      inline def setRtsctsUndefined: Self = StObject.set(x, "rtscts", js.undefined)
      
      inline def setStopBits(value: `1` | `2`): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      inline def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
      
      inline def setXany(value: Boolean): Self = StObject.set(x, "xany", value.asInstanceOf[js.Any])
      
      inline def setXanyUndefined: Self = StObject.set(x, "xany", js.undefined)
      
      inline def setXoff(value: Boolean): Self = StObject.set(x, "xoff", value.asInstanceOf[js.Any])
      
      inline def setXoffUndefined: Self = StObject.set(x, "xoff", js.undefined)
      
      inline def setXon(value: Boolean): Self = StObject.set(x, "xon", value.asInstanceOf[js.Any])
      
      inline def setXonUndefined: Self = StObject.set(x, "xon", js.undefined)
    }
  }
  
  trait PortInfo extends StObject {
    
    var locationId: js.UndefOr[String] = js.undefined
    
    var manufacturer: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var pnpId: js.UndefOr[String] = js.undefined
    
    var productId: js.UndefOr[String] = js.undefined
    
    var serialNumber: js.UndefOr[String] = js.undefined
    
    var vendorId: js.UndefOr[String] = js.undefined
  }
  object PortInfo {
    
    inline def apply(path: String): PortInfo = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortInfo]
    }
    
    extension [Self <: PortInfo](x: Self) {
      
      inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPnpId(value: String): Self = StObject.set(x, "pnpId", value.asInstanceOf[js.Any])
      
      inline def setPnpIdUndefined: Self = StObject.set(x, "pnpId", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
      
      inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
    }
  }
  
  @js.native
  trait SerialPort extends Duplex {
    
    val baudRate: Double = js.native
    
    val binding: BaseBinding = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    def drain(): Unit = js.native
    def drain(callback: ErrorCallback): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(callback: ErrorCallback): Unit = js.native
    
    def get(): Unit = js.native
    def get(callback: ModemBitsCallback): Unit = js.native
    
    val isOpen: Boolean = js.native
    
    def on(event: String, callback: js.Function1[/* data */ js.UndefOr[Any], Unit]): this.type = js.native
    
    def open(): Unit = js.native
    def open(callback: ErrorCallback): Unit = js.native
    
    val path: String = js.native
    
    def pause(): this.type = js.native
    
    def read(): String | Buffer | Null = js.native
    def read(size: Double): String | Buffer | Null = js.native
    
    def resume(): this.type = js.native
    
    def set(options: SetOptions): Unit = js.native
    def set(options: SetOptions, callback: ErrorCallback): Unit = js.native
    
    def update(options: UpdateOptions): Unit = js.native
    def update(options: UpdateOptions, callback: ErrorCallback): Unit = js.native
    
    def write(buffer: String, encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Boolean = js.native
    def write(
      buffer: String,
      encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(
      buffer: String,
      encoding: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(buffer: js.Array[Double], encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Boolean = js.native
    def write(
      buffer: js.Array[Double],
      encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(
      buffer: js.Array[Double],
      encoding: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(buffer: Buffer, encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex): Boolean = js.native
    def write(
      buffer: Buffer,
      encoding: ascii | utf8 | utf16le | ucs2 | base64 | binary | hex,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(
      buffer: Buffer,
      encoding: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: String): Boolean = js.native
    def write(
      data: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: js.Array[Double]): Boolean = js.native
    def write(
      data: js.Array[Double],
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
    def write(data: Buffer): Boolean = js.native
    def write(
      data: Buffer,
      callback: js.Function2[/* error */ js.UndefOr[js.Error | Null], /* bytesWritten */ Double, Unit]
    ): Boolean = js.native
  }
  
  trait SetOptions extends StObject {
    
    var brk: js.UndefOr[Boolean] = js.undefined
    
    var cts: js.UndefOr[Boolean] = js.undefined
    
    var dsr: js.UndefOr[Boolean] = js.undefined
    
    var dtr: js.UndefOr[Boolean] = js.undefined
    
    var rts: js.UndefOr[Boolean] = js.undefined
  }
  object SetOptions {
    
    inline def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    extension [Self <: SetOptions](x: Self) {
      
      inline def setBrk(value: Boolean): Self = StObject.set(x, "brk", value.asInstanceOf[js.Any])
      
      inline def setBrkUndefined: Self = StObject.set(x, "brk", js.undefined)
      
      inline def setCts(value: Boolean): Self = StObject.set(x, "cts", value.asInstanceOf[js.Any])
      
      inline def setCtsUndefined: Self = StObject.set(x, "cts", js.undefined)
      
      inline def setDsr(value: Boolean): Self = StObject.set(x, "dsr", value.asInstanceOf[js.Any])
      
      inline def setDsrUndefined: Self = StObject.set(x, "dsr", js.undefined)
      
      inline def setDtr(value: Boolean): Self = StObject.set(x, "dtr", value.asInstanceOf[js.Any])
      
      inline def setDtrUndefined: Self = StObject.set(x, "dtr", js.undefined)
      
      inline def setRts(value: Boolean): Self = StObject.set(x, "rts", value.asInstanceOf[js.Any])
      
      inline def setRtsUndefined: Self = StObject.set(x, "rts", js.undefined)
    }
  }
  
  trait UpdateOptions extends StObject {
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.undefined
  }
  object UpdateOptions {
    
    inline def apply(): UpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateOptions]
    }
    
    extension [Self <: UpdateOptions](x: Self) {
      
      inline def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      inline def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
    }
  }
  
  type darwinBinding = BaseBinding
  
  type linuxBinding = BaseBinding
  
  // Binding Type Defs
  type win32Binding = BaseBinding
}
