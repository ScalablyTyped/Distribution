package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the properties of a list object.
  * For more information about the definition of a list object, see Generic objects.
  *
  * Note: Either qDef or qLibraryId should be set, but not both. If both parameters are set the engine uses qDef definition.
  * Note: If the dimension is set in the object itself and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
trait IListObjectDef extends StObject {
  
  /*
    * Defines the sorting by state.
    */
  var qAutoSortByState: INxAutoSortByStateDef
  
  /*
    * Refers to a dimension stored in the list object.
    */
  var qDef: INxInlineDimensionDef
  
  /*
    * Lists the expressions in the list object.
    * >> This parameter is optional.
    */
  var qExpressions: js.UndefOr[js.Array[INxListObjectExpressionDef]] = js.undefined
  
  /*
    * Defines the frequency mode. The frequency mode is used to calculate the frequency of a value in a list object.
    * >> This parameter is optional.
    * >> Default is NX_FREQUENCY_NONE.
    */
  var qFrequencyMode: js.UndefOr[FrequencyModeType] = js.undefined
  
  /*
    * Fetches an initial data set.
    */
  var qInitialDataFetch: js.Array[INxPage]
  
  /*
    * Refers to a dimension stored in the library.
    */
  var qLibraryId: String
  
  /*
    * If set to true, alternative values are allowed in qData.
    * This parameter is optional. The default value is false.
    * If set to false, no alternative values are displayed in qData. Values are excluded instead.
    * Note that on the contrary, the qStateCounts parameter counts the excluded values as alternative values.
    */
  var qShowAlternatives: js.UndefOr[Boolean] = js.undefined
  
  /*
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String
}
object IListObjectDef {
  
  @scala.inline
  def apply(
    qAutoSortByState: INxAutoSortByStateDef,
    qDef: INxInlineDimensionDef,
    qInitialDataFetch: js.Array[INxPage],
    qLibraryId: String,
    qStateName: String
  ): IListObjectDef = {
    val __obj = js.Dynamic.literal(qAutoSortByState = qAutoSortByState.asInstanceOf[js.Any], qDef = qDef.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListObjectDef]
  }
  
  @scala.inline
  implicit class IListObjectDefMutableBuilder[Self <: IListObjectDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAutoSortByState(value: INxAutoSortByStateDef): Self = StObject.set(x, "qAutoSortByState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDef(value: INxInlineDimensionDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressions(value: js.Array[INxListObjectExpressionDef]): Self = StObject.set(x, "qExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExpressionsUndefined: Self = StObject.set(x, "qExpressions", js.undefined)
    
    @scala.inline
    def setQExpressionsVarargs(value: INxListObjectExpressionDef*): Self = StObject.set(x, "qExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQFrequencyMode(value: FrequencyModeType): Self = StObject.set(x, "qFrequencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFrequencyModeUndefined: Self = StObject.set(x, "qFrequencyMode", js.undefined)
    
    @scala.inline
    def setQInitialDataFetch(value: js.Array[INxPage]): Self = StObject.set(x, "qInitialDataFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetchVarargs(value: INxPage*): Self = StObject.set(x, "qInitialDataFetch", js.Array(value :_*))
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowAlternatives(value: Boolean): Self = StObject.set(x, "qShowAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowAlternativesUndefined: Self = StObject.set(x, "qShowAlternatives", js.undefined)
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
