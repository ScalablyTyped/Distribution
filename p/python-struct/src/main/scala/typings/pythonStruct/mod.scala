package typings.pythonStruct

import typings.long.mod.Long
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("python-struct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pack(format: String, data: DataType*): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def pack(format: String, data: js.Array[DataType]): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def sizeOf(format: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOf")(format.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def unpack(format: String, data: Buffer): js.Array[DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataType]]
  @scala.inline
  def unpack(format: String, data: Buffer, checkBounds: Boolean): js.Array[DataType] = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any], checkBounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataType]]
  
  @scala.inline
  def unpackFrom(format: String, data: Buffer, checkBounds: Boolean, position: Double): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackFrom")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any], checkBounds.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[DataType]
  @scala.inline
  def unpackFrom(format: String, data: Buffer, checkBounds: Unit, position: Double): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("unpackFrom")(format.asInstanceOf[js.Any], data.asInstanceOf[js.Any], checkBounds.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  type DataType = Double | Long | String | Boolean
}
