package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedTemplate extends js.Object {
  /** If csp mode was used to parse, the map of expression string -> expression functions. */
  var e: js.UndefOr[StringDictionary[js.Function]] = js.native
  /** If the template includes any partials, the map of partial name -> template nodes. */
  var p: js.UndefOr[StringDictionary[js.Array[_]]] = js.native
  /** The array of template nodes. */
  var t: js.Array[_] = js.native
  /** The version of the template spec that produced this template. */
  var v: Double = js.native
}

object ParsedTemplate {
  @scala.inline
  def apply(t: js.Array[_], v: Double): ParsedTemplate = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTemplate]
  }
  @scala.inline
  implicit class ParsedTemplateOps[Self <: ParsedTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTVarargs(value: js.Any*): Self = this.set("t", js.Array(value :_*))
    @scala.inline
    def setT(value: js.Array[_]): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: StringDictionary[js.Function]): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setP(value: StringDictionary[js.Array[_]]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
  }
  
}

