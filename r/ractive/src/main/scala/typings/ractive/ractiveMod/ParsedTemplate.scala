package typings.ractive.ractiveMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedTemplate extends js.Object {
  /** If csp mode was used to parse, the map of expression string -> expression functions. */
  var e: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  /** If the template includes any partials, the map of partial name -> template nodes. */
  var p: js.UndefOr[StringDictionary[js.Array[_]]] = js.undefined
  /** The array of template nodes. */
  var t: js.Array[_]
  /** The version of the template spec that produced this template. */
  var v: Double
}

object ParsedTemplate {
  @scala.inline
  def apply(
    t: js.Array[_],
    v: Double,
    e: StringDictionary[js.Function] = null,
    p: StringDictionary[js.Array[_]] = null
  ): ParsedTemplate = {
    val __obj = js.Dynamic.literal(t = t, v = v)
    if (e != null) __obj.updateDynamic("e")(e)
    if (p != null) __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ParsedTemplate]
  }
}

