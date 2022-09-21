package typings.sse4Crc32

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.ReadStream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sse4_crc32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sse4_crc32", "Crc32CStream")
  @js.native
  open class Crc32CStream () extends Writable {
    def this(crc: Double) = this()
  }
  
  inline def calculate(buf: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculate(buf: String, initial: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def calculate(buf: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculate(buf: Buffer, initial: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(buf.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromStream(stream: ReadStream): Crc32CStream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Crc32CStream]
  inline def fromStream(stream: ReadStream, crc: Double): Crc32CStream = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], crc.asInstanceOf[js.Any])).asInstanceOf[Crc32CStream]
  
  @JSImport("sse4_crc32", "hardware_support")
  @js.native
  val hardwareSupport: js.UndefOr[Boolean] = js.native
  
  @JSImport("sse4_crc32", "sse42_crc")
  @js.native
  val sse42Crc: js.UndefOr[
    js.Function2[/* buf */ Buffer | String, /* initial */ js.UndefOr[Double], Double]
  ] = js.native
  
  @JSImport("sse4_crc32", "table_crc")
  @js.native
  val tableCrc: js.UndefOr[
    js.Function2[/* buf */ Buffer | String, /* initial */ js.UndefOr[Double], Double]
  ] = js.native
}
