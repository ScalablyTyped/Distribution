package typings.qlik.mod

import typings.qlik.qlikStrings.NX_FREQUENCY_NONE
import typings.qlik.qlikStrings.NX_FREQUENCY_PERCENT
import typings.qlik.qlikStrings.NX_FREQUENCY_RELATIVE
import typings.qlik.qlikStrings.NX_FREQUENCY_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListobjectDef extends StObject {
  
  var qAutoSortByState: NxAutoSortByStateDef = js.native
  
  var qDef: NxInlineDimensionDef = js.native
  
  var qExpressions: js.Array[NxListobjectExpressionDef] = js.native
  
  var qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE = js.native
  
  var qInitialDataFetch: js.Array[NxPage] = js.native
  
  var qLibraryId: String = js.native
  
  var qShowAlternatives: Boolean = js.native
  
  var qStateName: String = js.native
}
object ListobjectDef {
  
  @scala.inline
  def apply(
    qAutoSortByState: NxAutoSortByStateDef,
    qDef: NxInlineDimensionDef,
    qExpressions: js.Array[NxListobjectExpressionDef],
    qFrequencyMode: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE,
    qInitialDataFetch: js.Array[NxPage],
    qLibraryId: String,
    qShowAlternatives: Boolean,
    qStateName: String
  ): ListobjectDef = {
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qExpressions = qExpressions.asInstanceOf[js.Any], qFrequencyMode = qFrequencyMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qShowAlternatives = qShowAlternatives.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListobjectDef]
  }
  
  @scala.inline
  implicit class ListobjectDefMutableBuilder[Self <: ListobjectDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAutoSortByState(value: NxAutoSortByStateDef): Self = StObject.set(x, "qAutoSortByState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: NxInlineDimensionDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressions(value: js.Array[NxListobjectExpressionDef]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsVarargs(value: NxListobjectExpressionDef*): Self = StObject.set(x, "qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQFrequencyMode(value: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE): Self = StObject.set(x, "qFrequencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetch(value: js.Array[NxPage]): Self = StObject.set(x, "qInitialDataFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetchVarargs(value: NxPage*): Self = StObject.set(x, "qInitialDataFetch", js.Array(value :_*))
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowAlternatives(value: Boolean): Self = StObject.set(x, "qShowAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
