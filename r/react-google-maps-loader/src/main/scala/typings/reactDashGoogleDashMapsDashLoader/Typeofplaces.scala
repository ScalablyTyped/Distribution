package typings.reactDashGoogleDashMapsDashLoader

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.googlemaps.google.maps.places.Autocomplete
import typings.googlemaps.google.maps.places.AutocompleteService
import typings.googlemaps.google.maps.places.AutocompleteSessionToken
import typings.googlemaps.google.maps.places.PlacesService
import typings.googlemaps.google.maps.places.SearchBox
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofplaces extends js.Object {
  var Autocomplete: Instantiable1[
    /* inputField */ HTMLInputElement, 
    typings.googlemaps.google.maps.places.Autocomplete
  ]
  var AutocompleteService: Instantiable0[typings.googlemaps.google.maps.places.AutocompleteService]
  var AutocompleteSessionToken: Instantiable0[typings.googlemaps.google.maps.places.AutocompleteSessionToken]
  var PlacesService: Instantiable1[
    /* attrContainer */ HTMLDivElement, 
    typings.googlemaps.google.maps.places.PlacesService
  ]
  var SearchBox: Instantiable1[/* inputField */ HTMLInputElement, typings.googlemaps.google.maps.places.SearchBox]
}

object Typeofplaces {
  @scala.inline
  def apply(
    Autocomplete: Instantiable1[/* inputField */ HTMLInputElement, Autocomplete],
    AutocompleteService: Instantiable0[AutocompleteService],
    AutocompleteSessionToken: Instantiable0[AutocompleteSessionToken],
    PlacesService: Instantiable1[/* attrContainer */ HTMLDivElement, PlacesService],
    SearchBox: Instantiable1[/* inputField */ HTMLInputElement, SearchBox]
  ): Typeofplaces = {
    val __obj = js.Dynamic.literal(Autocomplete = Autocomplete, AutocompleteService = AutocompleteService, AutocompleteSessionToken = AutocompleteSessionToken, PlacesService = PlacesService, SearchBox = SearchBox)
  
    __obj.asInstanceOf[Typeofplaces]
  }
}

