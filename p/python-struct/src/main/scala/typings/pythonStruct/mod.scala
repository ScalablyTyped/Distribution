package typings.pythonStruct

import typings.long.mod.Long
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("python-struct", "pack")
  @js.native
  def pack(format: String, data: DataType*): Buffer = js.native
  @JSImport("python-struct", "pack")
  @js.native
  def pack(format: String, data: js.Array[DataType]): Buffer = js.native
  
  @JSImport("python-struct", "sizeOf")
  @js.native
  def sizeOf(format: String): Double = js.native
  
  @JSImport("python-struct", "unpack")
  @js.native
  def unpack(format: String, data: Buffer): js.Array[DataType] = js.native
  @JSImport("python-struct", "unpack")
  @js.native
  def unpack(format: String, data: Buffer, checkBounds: Boolean): js.Array[DataType] = js.native
  
  @JSImport("python-struct", "unpackFrom")
  @js.native
  def unpackFrom(format: String, data: Buffer, checkBounds: js.UndefOr[scala.Nothing], position: Double): DataType = js.native
  @JSImport("python-struct", "unpackFrom")
  @js.native
  def unpackFrom(format: String, data: Buffer, checkBounds: Boolean, position: Double): DataType = js.native
  
  type DataType = Double | Long | String | Boolean
}
