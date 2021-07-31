package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliceArrayMod {
  
  @JSImport("random-js/dist/utils/sliceArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sliceArray(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")().asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def sliceArray(start: Double): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def sliceArray(start: Double, end: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def sliceArray(start: Unit, end: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceArray")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
