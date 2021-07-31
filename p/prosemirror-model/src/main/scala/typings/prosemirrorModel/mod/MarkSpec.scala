package typings.prosemirrorModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkSpec
  extends StObject
     with /**
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
  var toDOM: js.UndefOr[
    (js.Function2[/* mark */ Mark[js.Any], /* inline */ Boolean, DOMOutputSpec]) | Null
  ] = js.undefined
}
object MarkSpec {
  
  @scala.inline
  def apply(): MarkSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSpec]
  }
  
  @scala.inline
  implicit class MarkSpecMutableBuilder[Self <: MarkSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: StringDictionary[AttributeSpec]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsNull: Self = StObject.set(x, "attrs", null)
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setExcludes(value: String): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesNull: Self = StObject.set(x, "excludes", null)
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = StObject.set(x, "group", null)
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setInclusive(value: Boolean): Self = StObject.set(x, "inclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusiveNull: Self = StObject.set(x, "inclusive", null)
    
    @scala.inline
    def setInclusiveUndefined: Self = StObject.set(x, "inclusive", js.undefined)
    
    @scala.inline
    def setParseDOM(value: js.Array[ParseRule]): Self = StObject.set(x, "parseDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseDOMNull: Self = StObject.set(x, "parseDOM", null)
    
    @scala.inline
    def setParseDOMUndefined: Self = StObject.set(x, "parseDOM", js.undefined)
    
    @scala.inline
    def setParseDOMVarargs(value: ParseRule*): Self = StObject.set(x, "parseDOM", js.Array(value :_*))
    
    @scala.inline
    def setSpanning(value: Boolean): Self = StObject.set(x, "spanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpanningNull: Self = StObject.set(x, "spanning", null)
    
    @scala.inline
    def setSpanningUndefined: Self = StObject.set(x, "spanning", js.undefined)
    
    @scala.inline
    def setToDOM(value: (/* mark */ Mark[js.Any], /* inline */ Boolean) => DOMOutputSpec): Self = StObject.set(x, "toDOM", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToDOMNull: Self = StObject.set(x, "toDOM", null)
    
    @scala.inline
    def setToDOMUndefined: Self = StObject.set(x, "toDOM", js.undefined)
  }
}
