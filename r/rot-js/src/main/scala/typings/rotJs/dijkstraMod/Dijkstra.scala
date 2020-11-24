package typings.rotJs.dijkstraMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dijkstra
  extends typings.rotJs.pathPathMod.default {
  
  def _add(x: Double, y: Double): Unit = js.native
  def _add(x: Double, y: Double, prev: Item): Unit = js.native
  
  /**
    * Compute a non-cached value
    */
  def _compute(fromX: Double, fromY: Double): Unit = js.native
  
  var _computed: StringDictionary[Item] = js.native
  
  var _todo: js.Array[Item] = js.native
}
