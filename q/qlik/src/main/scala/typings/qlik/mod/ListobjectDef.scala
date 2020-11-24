package typings.qlik.mod

import typings.qlik.qlikStrings.NX_FREQUENCY_NONE
import typings.qlik.qlikStrings.NX_FREQUENCY_PERCENT
import typings.qlik.qlikStrings.NX_FREQUENCY_RELATIVE
import typings.qlik.qlikStrings.NX_FREQUENCY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListobjectDef extends js.Object {
  
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
  implicit class ListobjectDefOps[Self <: ListobjectDef] (val x: Self) extends AnyVal {
    
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
    def setQAutoSortByState(value: NxAutoSortByStateDef): Self = this.set("qAutoSortByState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: NxInlineDimensionDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsVarargs(value: NxListobjectExpressionDef*): Self = this.set("qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQExpressions(value: js.Array[NxListobjectExpressionDef]): Self = this.set("qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFrequencyMode(value: NX_FREQUENCY_NONE | NX_FREQUENCY_VALUE | NX_FREQUENCY_PERCENT | NX_FREQUENCY_RELATIVE): Self = this.set("qFrequencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetchVarargs(value: NxPage*): Self = this.set("qInitialDataFetch", js.Array(value :_*))
    
    @scala.inline
    def setQInitialDataFetch(value: js.Array[NxPage]): Self = this.set("qInitialDataFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowAlternatives(value: Boolean): Self = this.set("qShowAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
  }
}
