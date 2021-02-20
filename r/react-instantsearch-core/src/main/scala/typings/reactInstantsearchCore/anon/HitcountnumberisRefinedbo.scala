package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-instantsearch-core.react-instantsearch-core.Hit<{  count :number,   isRefined :boolean,   label :string,   value :std.Array<string>}> */
@js.native
trait HitcountnumberisRefinedbo extends StObject {
  
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[Value] = js.native
  
  var count: Double = js.native
  
  var isRefined: Boolean = js.native
  
  var label: String = js.native
  
  var objectID: String = js.native
  
  var value: js.Array[String] = js.native
}
object HitcountnumberisRefinedbo {
  
  @scala.inline
  def apply(
    _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[Value],
    count: Double,
    isRefined: Boolean,
    label: String,
    objectID: String,
    value: js.Array[String]
  ): HitcountnumberisRefinedbo = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitcountnumberisRefinedbo]
  }
  
  @scala.inline
  implicit class HitcountnumberisRefinedboMutableBuilder[Self <: HitcountnumberisRefinedbo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    
    @scala.inline
    def set_highlightResult(value: typings.reactInstantsearchCore.mod.HighlightResult[Value]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
  }
}
