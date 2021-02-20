package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalizationStream
  extends NormalizationSelectableNode
     with NormalizationSelection {
  
  val `if`: String | Null = js.native
  
  val kind: String = js.native
  
  // 'Stream';
  val label: String = js.native
  
  val metadata: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
  
  val selections: js.Array[NormalizationSelection] = js.native
}
object NormalizationStream {
  
  @scala.inline
  def apply(kind: String, label: String, selections: js.Array[NormalizationSelection]): NormalizationStream = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationStream]
  }
  
  @scala.inline
  implicit class NormalizationStreamMutableBuilder[Self <: NormalizationStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIf(value: String): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNull: Self = StObject.set(x, "if", null)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
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
