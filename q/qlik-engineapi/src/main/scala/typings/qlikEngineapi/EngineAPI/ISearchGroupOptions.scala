package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupOptions...
  */
@js.native
trait ISearchGroupOptions extends js.Object {
  /**
    * Maximum number of items per group (in qItems[ ]).
    * The default value is -1;
    * all values are returned.
    */
  var qCount: Double = js.native
  /**
    * Type of the group. Can be:
    * - GenericObjectType: the type of the search group item is a generic object.
    *   Groups have this type when you are calling SearchObjects.
    * - DatasetType: type of the search group item is a dataset association.
    *   Groups have this type when you are calling SearchResults.
    */
  var qGroupType: js.Any = js.native
  /**
    * Position starting from 0.
    * >> The default value is 0.
    */
  var qOffset: Double = js.native
}

object ISearchGroupOptions {
  @scala.inline
  def apply(qCount: Double, qGroupType: js.Any, qOffset: Double): ISearchGroupOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupType = qGroupType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupOptions]
  }
  @scala.inline
  implicit class ISearchGroupOptionsOps[Self <: ISearchGroupOptions] (val x: Self) extends AnyVal {
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
    def setQCount(value: Double): Self = this.set("qCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQGroupType(value: js.Any): Self = this.set("qGroupType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOffset(value: Double): Self = this.set("qOffset", value.asInstanceOf[js.Any])
  }
  
}

