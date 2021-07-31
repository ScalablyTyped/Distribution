package typings.relayRuntime.readerNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderInlineFragment
  extends StObject
     with ReaderSelection {
  
  val abstractKey: js.UndefOr[String | Null] = js.undefined
  
  val kind: String
  
  // 'InlineFragment';
  val selections: js.Array[ReaderSelection]
  
  val `type`: String
}
object ReaderInlineFragment {
  
  @scala.inline
  def apply(kind: String, selections: js.Array[ReaderSelection], `type`: String): ReaderInlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderInlineFragment]
  }
  
  @scala.inline
  implicit class ReaderInlineFragmentMutableBuilder[Self <: ReaderInlineFragment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractKeyNull: Self = StObject.set(x, "abstractKey", null)
    
    @scala.inline
    def setAbstractKeyUndefined: Self = StObject.set(x, "abstractKey", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
