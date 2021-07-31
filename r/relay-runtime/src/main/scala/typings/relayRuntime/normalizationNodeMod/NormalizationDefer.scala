package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.relayRuntimeStrings.Defer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationDefer
  extends StObject
     with NormalizationSelectableNode
     with NormalizationSelection {
  
  val `if`: String | Null
  
  val kind: Defer
  
  val label: String
  
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  
  val selections: js.Array[NormalizationSelection]
}
object NormalizationDefer {
  
  @scala.inline
  def apply(label: String, selections: js.Array[NormalizationSelection]): NormalizationDefer = {
    val __obj = js.Dynamic.literal(kind = "Defer", label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("if")(null)
    __obj.asInstanceOf[NormalizationDefer]
  }
  
  @scala.inline
  implicit class NormalizationDeferMutableBuilder[Self <: NormalizationDefer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNull: Self = StObject.set(x, "if", null)
    
    @scala.inline
    def setKind(value: Defer): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSelections(value: js.Array[NormalizationSelection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: NormalizationSelection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
