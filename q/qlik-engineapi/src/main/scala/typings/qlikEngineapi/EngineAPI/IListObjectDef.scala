package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the properties of a list object.
  * For more information about the definition of a list object, see Generic objects.
  *
  * Note: Either qDef or qLibraryId should be set, but not both. If both parameters are set the engine uses qDef definition.
  * Note: If the dimension is set in the object itself and not in the library, this dimension cannot be shared with other objects.
  * Note: A dimension that is set in the library can be used by many objects.
  */
@js.native
trait IListObjectDef extends js.Object {
  /*
    * Defines the sorting by state.
    */
  var qAutoSortByState: INxAutoSortByStateDef = js.native
  /*
    * Refers to a dimension stored in the list object.
    */
  var qDef: INxInlineDimensionDef = js.native
  /*
    * Lists the expressions in the list object.
    * >> This parameter is optional.
    */
  var qExpressions: js.UndefOr[js.Array[INxListObjectExpressionDef]] = js.native
  /*
    * Defines the frequency mode. The frequency mode is used to calculate the frequency of a value in a list object.
    * >> This parameter is optional.
    * >> Default is NX_FREQUENCY_NONE.
    */
  var qFrequencyMode: js.UndefOr[FrequencyModeType] = js.native
  /*
    * Fetches an initial data set.
    */
  var qInitialDataFetch: js.Array[INxPage] = js.native
  /*
    * Refers to a dimension stored in the library.
    */
  var qLibraryId: String = js.native
  /*
    * If set to true, alternative values are allowed in qData.
    * This parameter is optional. The default value is false.
    * If set to false, no alternative values are displayed in qData. Values are excluded instead.
    * Note that on the contrary, the qStateCounts parameter counts the excluded values as alternative values.
    */
  var qShowAlternatives: js.UndefOr[Boolean] = js.native
  /*
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String = js.native
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
  implicit class IListObjectDefOps[Self <: IListObjectDef] (val x: Self) extends AnyVal {
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
    def setQAutoSortByState(value: INxAutoSortByStateDef): Self = this.set("qAutoSortByState", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDef(value: INxInlineDimensionDef): Self = this.set("qDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setQInitialDataFetchVarargs(value: INxPage*): Self = this.set("qInitialDataFetch", js.Array(value :_*))
    @scala.inline
    def setQInitialDataFetch(value: js.Array[INxPage]): Self = this.set("qInitialDataFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQExpressionsVarargs(value: INxListObjectExpressionDef*): Self = this.set("qExpressions", js.Array(value :_*))
    @scala.inline
    def setQExpressions(value: js.Array[INxListObjectExpressionDef]): Self = this.set("qExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQExpressions: Self = this.set("qExpressions", js.undefined)
    @scala.inline
    def setQFrequencyMode(value: FrequencyModeType): Self = this.set("qFrequencyMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQFrequencyMode: Self = this.set("qFrequencyMode", js.undefined)
    @scala.inline
    def setQShowAlternatives(value: Boolean): Self = this.set("qShowAlternatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQShowAlternatives: Self = this.set("qShowAlternatives", js.undefined)
  }
  
}

