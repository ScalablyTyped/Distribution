package typings.qlikDashEngineapi.EngineAPI

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
  var qCount: Double
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
  var qOffset: Double
}

object ISearchGroupItemOptions {
  @scala.inline
  def apply(qCount: Double, qGroupItemType: IGenericObject, qOffset: Double): ISearchGroupItemOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemType = qGroupItemType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchGroupItemOptions]
  }
}

