package typings.ramda

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ramda.toolsMod.KeyValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/fromPairs", JSImport.Namespace)
@js.native
object srcFromPairsMod extends js.Object {
  def default[V](pairs: js.Array[KeyValuePair[String, V]]): StringDictionary[V] = js.native
  @JSName("default")
  def default_V_NumberDictionary[V](pairs: js.Array[KeyValuePair[Double, V]]): NumberDictionary[V] = js.native
}

