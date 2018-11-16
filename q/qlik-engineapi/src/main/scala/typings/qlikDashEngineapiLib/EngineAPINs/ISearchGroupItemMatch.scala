package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * SearchGroupItemMatch...
     */

trait ISearchGroupItemMatch extends js.Object {
  /**
           * Property of the search group item.
           * For example, if the user requests SearchObjects with SearchObjectOptions.qAttributes = [],
           * then the outputted qAttributes will be empty.
           *
           * Otherwise, if SearchObjectOptions.qAttributes = [qProperty],
           * SearchGroupItemMatch.qAttributes = [qProperty, qMetaDef/title]
           * if the match has been found in the title of the item.
           *
           * For dimension values, the returned qProperty will be *.
           */
  var qAttributes: js.Array[ISearchAttribute]
  /**
           * List of ranges.
           * For example, if the search terms are Price and Make, and the search group item value is Make by Price vs Mileage,
           * then there are two ranges: one for Price and one for Make.
           */
  var qRanges: js.Array[ISearchCharRange]
  /**
           * Search match value.
           * Value of the search group item.
           * If the match is found in a field, it corresponds to the value of the field.
           * If the match is found in a generic object property, it corresponds to the property value.
           */
  var qText: java.lang.String
}

