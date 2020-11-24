package typings.reactMdAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AutoCompleteData = java.lang.String | typings.reactMdForm.utilsMod.ListboxOptionProps
  
  type AutoCompleteFilterFunction[O /* <: js.Object */] = typings.reactMdAutocomplete.typesMod.PreconfiguredFilterFunction | typings.reactMdAutocomplete.typesMod.FilterFunction[O]
  
  type AutoCompleteHandler = js.Function1[/* result */ typings.reactMdAutocomplete.typesMod.AutoCompleteResult, scala.Unit]
  
  type FilterFunction[O /* <: js.Object */] = js.Function3[
    /* query */ java.lang.String, 
    /* data */ js.Array[typings.reactMdAutocomplete.typesMod.AutoCompleteData], 
    /* options */ typings.reactMdAutocomplete.typesMod.FilterFunctionOptions[O], 
    js.Array[typings.reactMdAutocomplete.typesMod.AutoCompleteData]
  ]
  
  type FilterFunctionOptions[O /* <: js.Object */] = O with typings.reactMdUtils.caseInsensitiveFilterMod.CaseInsensitiveOptions[typings.reactMdAutocomplete.typesMod.AutoCompleteData]
}
