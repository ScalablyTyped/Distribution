package typings.protobufjsFloat

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@protobufjs/float", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def readDoubleBE(buf: Uint8Array, pos: Double): Double = js.native
  
  def readDoubleLE(buf: Uint8Array, pos: Double): Double = js.native
  
  def readFloatBE(buf: Uint8Array, pos: Double): Double = js.native
  
  def readFloatLE(buf: Uint8Array, pos: Double): Double = js.native
  
  def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  
  def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  
  def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
  
  def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = js.native
}
