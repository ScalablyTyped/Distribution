package typings.protobufjsFloat

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/float", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def readDoubleBE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleBE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readDoubleLE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleLE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readFloatBE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readFloatBE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readFloatLE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readFloatLE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleBE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleLE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatBE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatLE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
