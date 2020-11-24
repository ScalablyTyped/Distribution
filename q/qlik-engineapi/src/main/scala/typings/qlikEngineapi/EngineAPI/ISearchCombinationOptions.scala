package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.Utf16
import typings.qlikEngineapi.qlikEngineapiStrings.Utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchCombinationOptions...
  */
@js.native
trait ISearchCombinationOptions extends js.Object {
  
  /**
    * For SearchSuggest method, this array is empty.
    * For SearchResults method, this array is empty,
    * or contains qNum and/or qElemNum.
    * It allows the user to request details in the outputted SearchGroupItemMatch.
    * For more information, see SearchGroupItemMatch
    */
  var qAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Encoding used to compute qRanges of type SearchCharRange.
    * Possible values: Utf8 (default), Utf16
    */
  var qCharEncoding: Utf8 | Utf16 = js.native
  
  /**
    * Search context.
    * The default value is LockedFieldsOnly.
    * One of:
    *
    * - Cleared: In this mode, the first step is to clear any current selections in the app.
    *   The second step is to search for one or more terms in the values of the app.
    *
    * - LockedFieldsOnly: In this mode, the search applies only to the values associated with
    *   the selections made in locked fields, ignoring selections in any unlocked field. If no locked fields,
    *   the behavior is identical to the Cleared context. You cannot make any new selections in a locked field.
    *   You can get search hits for the associated values of a locked field but you cannot get the search hits
    *   for the non associative values.
    *
    * - CurrentSelections: In this mode, the current selections are kept (if any). Search for one or more terms
    *   in the values of the app. New selections are made on top of the current selections. If no selections were
    *   made before the search, this mode is identical to the Cleared context.
    */
  var qContext: ContextType = js.native
  
  /**
    * List of the search fields.
    * If empty, the search is performed in all fields of the app.
    */
  var qSearchFields: js.Array[String] = js.native
}
object ISearchCombinationOptions {
  
  @scala.inline
  def apply(qCharEncoding: Utf8 | Utf16, qContext: ContextType, qSearchFields: js.Array[String]): ISearchCombinationOptions = {
    val __obj = js.Dynamic.literal(qCharEncoding = qCharEncoding.asInstanceOf[js.Any], qContext = qContext.asInstanceOf[js.Any], qSearchFields = qSearchFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCombinationOptions]
  }
  
  @scala.inline
  implicit class ISearchCombinationOptionsOps[Self <: ISearchCombinationOptions] (val x: Self) extends AnyVal {
    
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
    def setQCharEncoding(value: Utf8 | Utf16): Self = this.set("qCharEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQContext(value: ContextType): Self = this.set("qContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSearchFieldsVarargs(value: String*): Self = this.set("qSearchFields", js.Array(value :_*))
    
    @scala.inline
    def setQSearchFields(value: js.Array[String]): Self = this.set("qSearchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributesVarargs(value: String*): Self = this.set("qAttributes", js.Array(value :_*))
    
    @scala.inline
    def setQAttributes(value: js.Array[String]): Self = this.set("qAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQAttributes: Self = this.set("qAttributes", js.undefined)
  }
}
