package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkSpec
  extends /**
  * Allow specifying arbitrary fields on a NodeSpec.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The attributes that marks of this type get.
    */
  var attrs: js.UndefOr[StringDictionary[AttributeSpec] | Null] = js.native
  /**
    * Determines which other marks this mark can coexist with. Should
    * be a space-separated strings naming other marks or groups of marks.
    * When a mark is [added](#model.Mark.addToSet) to a set, all marks
    * that it excludes are removed in the process. If the set contains
    * any mark that excludes the new mark but is not, itself, excluded
    * by the new mark, the mark can not be added an the set. You can
    * use the value `"_"` to indicate that the mark excludes all
    * marks in the schema.
    *
    * Defaults to only being exclusive with marks of the same type. You
    * can set it to an empty string (or any string not containing the
    * mark's own name) to allow multiple marks of a given type to
    * coexist (as long as they have different attributes).
    */
  var excludes: js.UndefOr[String | Null] = js.native
  /**
    * The group or space-separated groups to which this mark belongs.
    */
  var group: js.UndefOr[String | Null] = js.native
  /**
    * Whether this mark should be active when the cursor is positioned
    * at its end (or at its start when that is also the start of the
    * parent node). Defaults to true.
    */
  var inclusive: js.UndefOr[Boolean | Null] = js.native
  /**
    * Associates DOM parser information with this mark (see the
    * corresponding [node spec field](#model.NodeSpec.parseDOM)). The
    * `mark` field in the rules is implied.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | Null] = js.native
  /**
    * Determines whether marks of this type can span multiple adjacent
    * nodes when serialized to DOM/HTML. Defaults to true.
    */
  var spanning: js.UndefOr[Boolean | Null] = js.native
  /**
    * Defines the default way marks of this type should be serialized
    * to DOM/HTML.
    */
  var toDOM: js.UndefOr[(js.Function2[/* mark */ Mark[_], /* inline */ Boolean, DOMOutputSpec]) | Null] = js.native
}

object MarkSpec {
  @scala.inline
  def apply(): MarkSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSpec]
  }
  @scala.inline
  implicit class MarkSpecOps[Self <: MarkSpec] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[AttributeSpec]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttrs: Self = this.set("attrs", js.undefined)
    @scala.inline
    def setAttrsNull: Self = this.set("attrs", null)
    @scala.inline
    def setExcludes(value: String): Self = this.set("excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    @scala.inline
    def setExcludesNull: Self = this.set("excludes", null)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    @scala.inline
    def setInclusive(value: Boolean): Self = this.set("inclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusive: Self = this.set("inclusive", js.undefined)
    @scala.inline
    def setInclusiveNull: Self = this.set("inclusive", null)
    @scala.inline
    def setParseDOMVarargs(value: ParseRule*): Self = this.set("parseDOM", js.Array(value :_*))
    @scala.inline
    def setParseDOM(value: js.Array[ParseRule]): Self = this.set("parseDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseDOM: Self = this.set("parseDOM", js.undefined)
    @scala.inline
    def setParseDOMNull: Self = this.set("parseDOM", null)
    @scala.inline
    def setSpanning(value: Boolean): Self = this.set("spanning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpanning: Self = this.set("spanning", js.undefined)
    @scala.inline
    def setSpanningNull: Self = this.set("spanning", null)
    @scala.inline
    def setToDOM(value: (/* mark */ Mark[_], /* inline */ Boolean) => DOMOutputSpec): Self = this.set("toDOM", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToDOM: Self = this.set("toDOM", js.undefined)
    @scala.inline
    def setToDOMNull: Self = this.set("toDOM", null)
  }
  
}

