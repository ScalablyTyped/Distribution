package typings.rtree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTreeStatic extends StObject {
  
  def bbox(arg1: js.Any): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: js.Any): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: Double): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: Double, arg4: Double): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: Unit, arg4: Double): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: Unit, arg3: Double): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: Unit, arg3: Double, arg4: Double): js.Array[js.Any] = js.native
  def bbox(arg1: js.Any, arg2: Unit, arg3: Unit, arg4: Double): js.Array[js.Any] = js.native
  
  def geoJSON(geoJSON: js.Any): Unit = js.native
  
  def insert(bounds: Rectangle, element: js.Object): Boolean = js.native
  
  def remove(area: Rectangle): js.Array[js.Any] = js.native
  def remove(area: Rectangle, element: js.Object): js.Array[js.Any] = js.native
  
  def search(area: Rectangle): js.Array[js.Any] = js.native
  def search(area: Rectangle, return_node: Boolean): js.Array[js.Any] = js.native
  def search(area: Rectangle, return_node: Boolean, return_array: js.Array[js.Any]): js.Array[js.Any] = js.native
  def search(area: Rectangle, return_node: Unit, return_array: js.Array[js.Any]): js.Array[js.Any] = js.native
}
