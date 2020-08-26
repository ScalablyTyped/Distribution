package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupItemOptions...
  */
@js.native
trait ISearchGroupItemOptions extends js.Object {
  /**
    * Maximum number of matches per item (in qItemMatches[ ]).
    * The default value is -1: all values are returned.
    */
  var qCount: Double = js.native
  /**
    * Type of the group item. Can be
    *
    * - GenericObject: the type of the search group item is a generic object.
    *   Group items have this type when you are calling SearchObjects.
    *
    * - Field: the type of the search group item is a field.
    *   Group items have this type when you are calling SearchResults.
    */
  var qGroupItemType: IGenericObject = js.native
  /**
    * Position starting from 0.
    * The default value is 0.
    */
  var qOffset: Double = js.native
}

object ISearchGroupItemOptions {
  @scala.inline
  def apply(qCount: Double, qGroupItemType: IGenericObject, qOffset: Double): ISearchGroupItemOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemType = qGroupItemType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupItemOptions]
  }
  @scala.inline
  implicit class ISearchGroupItemOptionsOps[Self <: ISearchGroupItemOptions] (val x: Self) extends AnyVal {
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
    def setQGroupItemType(value: IGenericObject): Self = this.set("qGroupItemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOffset(value: Double): Self = this.set("qOffset", value.asInstanceOf[js.Any])
  }
  
}

