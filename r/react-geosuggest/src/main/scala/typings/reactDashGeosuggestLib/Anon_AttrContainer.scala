package typings
package reactDashGeosuggestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrContainer extends js.Object {
  var Autocomplete: org.scalablytyped.runtime.Instantiable1[
    /* inputField */ stdLib.HTMLInputElement, 
    googlemapsLib.googleNs.mapsNs.placesNs.Autocomplete
  ]
  var AutocompleteService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.placesNs.AutocompleteService]
  var AutocompleteSessionToken: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.placesNs.AutocompleteSessionToken]
  var PlacesService: org.scalablytyped.runtime.Instantiable1[
    /* attrContainer */ stdLib.HTMLDivElement, 
    googlemapsLib.googleNs.mapsNs.placesNs.PlacesService
  ]
  var SearchBox: org.scalablytyped.runtime.Instantiable1[
    /* inputField */ stdLib.HTMLInputElement, 
    googlemapsLib.googleNs.mapsNs.placesNs.SearchBox
  ]
}

object Anon_AttrContainer {
  @scala.inline
  def apply(
    Autocomplete: org.scalablytyped.runtime.Instantiable1[
      /* inputField */ stdLib.HTMLInputElement, 
      googlemapsLib.googleNs.mapsNs.placesNs.Autocomplete
    ],
    AutocompleteService: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.placesNs.AutocompleteService],
    AutocompleteSessionToken: org.scalablytyped.runtime.Instantiable0[googlemapsLib.googleNs.mapsNs.placesNs.AutocompleteSessionToken],
    PlacesService: org.scalablytyped.runtime.Instantiable1[
      /* attrContainer */ stdLib.HTMLDivElement, 
      googlemapsLib.googleNs.mapsNs.placesNs.PlacesService
    ],
    SearchBox: org.scalablytyped.runtime.Instantiable1[
      /* inputField */ stdLib.HTMLInputElement, 
      googlemapsLib.googleNs.mapsNs.placesNs.SearchBox
    ]
  ): Anon_AttrContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Autocomplete")(Autocomplete)
    __obj.updateDynamic("AutocompleteService")(AutocompleteService)
    __obj.updateDynamic("AutocompleteSessionToken")(AutocompleteSessionToken)
    __obj.updateDynamic("PlacesService")(PlacesService)
    __obj.updateDynamic("SearchBox")(SearchBox)
    __obj.asInstanceOf[Anon_AttrContainer]
  }
}

