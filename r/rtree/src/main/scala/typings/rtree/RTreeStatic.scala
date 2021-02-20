package typings.rtree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTreeStatic extends StObject {
  
  def bbox(arg1: js.Any): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.UndefOr[scala.Nothing], arg3: js.UndefOr[scala.Nothing], arg4: Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.UndefOr[scala.Nothing], arg3: Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.UndefOr[scala.Nothing], arg3: Double, arg4: Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: js.UndefOr[scala.Nothing], arg4: Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: Double): js.Array[_] = js.native
  def bbox(arg1: js.Any, arg2: js.Any, arg3: Double, arg4: Double): js.Array[_] = js.native
  
  def geoJSON(geoJSON: js.Any): Unit = js.native
  
  def insert(bounds: Rectangle, element: js.Object): Boolean = js.native
  
  def remove(area: Rectangle): js.Array[_] = js.native
  def remove(area: Rectangle, element: js.Object): js.Array[_] = js.native
  
  def search(area: Rectangle): js.Array[_] = js.native
  def search(area: Rectangle, return_node: js.UndefOr[scala.Nothing], return_array: js.Array[_]): js.Array[_] = js.native
  def search(area: Rectangle, return_node: Boolean): js.Array[_] = js.native
  def search(area: Rectangle, return_node: Boolean, return_array: js.Array[_]): js.Array[_] = js.native
}
