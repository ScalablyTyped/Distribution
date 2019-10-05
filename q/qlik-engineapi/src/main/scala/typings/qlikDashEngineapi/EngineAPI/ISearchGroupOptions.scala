package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupOptions...
  */
trait ISearchGroupOptions extends js.Object {
  /**
    * Maximum number of items per group (in qItems[ ]).
    * The default value is -1;
    * all values are returned.
    */
  var qCount: Double
  /**
    * Type of the group. Can be:
    * - GenericObjectType: the type of the search group item is a generic object.
    *   Groups have this type when you are calling SearchObjects.
    * - DatasetType: type of the search group item is a dataset association.
    *   Groups have this type when you are calling SearchResults.
    */
  var qGroupType: js.Any
  /**
    * Position starting from 0.
    * >> The default value is 0.
    */
  var qOffset: Double
}

object ISearchGroupOptions {
  @scala.inline
  def apply(qCount: Double, qGroupType: js.Any, qOffset: Double): ISearchGroupOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount, qGroupType = qGroupType, qOffset = qOffset)
  
    __obj.asInstanceOf[ISearchGroupOptions]
  }
}

