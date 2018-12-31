package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupItemOptions...
  */
trait ISearchGroupItemOptions extends js.Object {
  /**
    * Maximum number of matches per item (in qItemMatches[ ]).
    * The default value is -1: all values are returned.
    */
  var qCount: scala.Double
  /**
    * Type of the group item. Can be
    *
    * - GenericObject: the type of the search group item is a generic object.
    *   Group items have this type when you are calling SearchObjects.
    *
    * - Field: the type of the search group item is a field.
    *   Group items have this type when you are calling SearchResults.
    */
  var qGroupItemType: IGenericObject
  /**
    * Position starting from 0.
    * The default value is 0.
    */
  var qOffset: scala.Double
}

