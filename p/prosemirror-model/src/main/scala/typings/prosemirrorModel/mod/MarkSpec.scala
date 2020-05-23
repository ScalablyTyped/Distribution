package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkSpec
  extends /**
  * Allow specifying arbitrary fields on a NodeSpec.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * The attributes that marks of this type get.
    */
  var attrs: js.UndefOr[StringDictionary[AttributeSpec] | Null] = js.undefined
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
  var excludes: js.UndefOr[String | Null] = js.undefined
  /**
    * The group or space-separated groups to which this mark belongs.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether this mark should be active when the cursor is positioned
    * at its end (or at its start when that is also the start of the
    * parent node). Defaults to true.
    */
  var inclusive: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Associates DOM parser information with this mark (see the
    * corresponding [node spec field](#model.NodeSpec.parseDOM)). The
    * `mark` field in the rules is implied.
    */
  var parseDOM: js.UndefOr[js.Array[ParseRule] | Null] = js.undefined
  /**
    * Determines whether marks of this type can span multiple adjacent
    * nodes when serialized to DOM/HTML. Defaults to true.
    */
  var spanning: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Defines the default way marks of this type should be serialized
    * to DOM/HTML.
    */
  var toDOM: js.UndefOr[(js.Function2[/* mark */ Mark[_], /* inline */ Boolean, DOMOutputSpec]) | Null] = js.undefined
}

object MarkSpec {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    attrs: js.UndefOr[Null | StringDictionary[AttributeSpec]] = js.undefined,
    excludes: js.UndefOr[Null | String] = js.undefined,
    group: js.UndefOr[Null | String] = js.undefined,
    inclusive: js.UndefOr[Null | Boolean] = js.undefined,
    parseDOM: js.UndefOr[Null | js.Array[ParseRule]] = js.undefined,
    spanning: js.UndefOr[Null | Boolean] = js.undefined,
    toDOM: js.UndefOr[Null | ((/* mark */ Mark[_], /* inline */ Boolean) => DOMOutputSpec)] = js.undefined
  ): MarkSpec = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(attrs)) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (!js.isUndefined(excludes)) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusive)) __obj.updateDynamic("inclusive")(inclusive.asInstanceOf[js.Any])
    if (!js.isUndefined(parseDOM)) __obj.updateDynamic("parseDOM")(parseDOM.asInstanceOf[js.Any])
    if (!js.isUndefined(spanning)) __obj.updateDynamic("spanning")(spanning.asInstanceOf[js.Any])
    if (!js.isUndefined(toDOM)) __obj.updateDynamic("toDOM")(if (toDOM != null) js.Any.fromFunction2(toDOM.asInstanceOf[(/* mark */ Mark[_], /* inline */ Boolean) => DOMOutputSpec]) else null)
    __obj.asInstanceOf[MarkSpec]
  }
}

