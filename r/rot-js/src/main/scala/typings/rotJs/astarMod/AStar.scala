package typings.rotJs.astarMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AStar
  extends typings.rotJs.pathPathMod.default {
  
  def _add(x: Double, y: Double): Unit = js.native
  def _add(x: Double, y: Double, prev: Item): Unit = js.native
  
  def _distance(x: Double, y: Double): Double = js.native
  
  var _done: StringDictionary[Item] = js.native
  
  var _fromX: Double = js.native
  
  var _fromY: Double = js.native
  
  var _todo: js.Array[Item] = js.native
}
