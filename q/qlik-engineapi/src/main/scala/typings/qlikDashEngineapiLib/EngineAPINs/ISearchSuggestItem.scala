package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * SearchSuggestItem...
     */

trait ISearchSuggestItem extends js.Object {
  /**
           * Index of the suggestion value.
           * The indexing starts from 0 and from the left.
           */
  var qTerm: scala.Double
  /**
           * Value of the suggestion.
           */
  var qValue: java.lang.String
}

