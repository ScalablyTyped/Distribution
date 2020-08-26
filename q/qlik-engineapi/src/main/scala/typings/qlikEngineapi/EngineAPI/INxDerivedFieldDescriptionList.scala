package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxDerivedFieldDescriptionList
  */
@js.native
trait INxDerivedFieldDescriptionList extends js.Object {
  /**
    * Information about the derived fields.
    */
  var qDerivedFieldLists: js.Array[INxDerivedFieldsData] = js.native
}

object INxDerivedFieldDescriptionList {
  @scala.inline
  def apply(qDerivedFieldLists: js.Array[INxDerivedFieldsData]): INxDerivedFieldDescriptionList = {
    val __obj = js.Dynamic.literal(qDerivedFieldLists = qDerivedFieldLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxDerivedFieldDescriptionList]
  }
  @scala.inline
  implicit class INxDerivedFieldDescriptionListOps[Self <: INxDerivedFieldDescriptionList] (val x: Self) extends AnyVal {
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
    def setQDerivedFieldListsVarargs(value: INxDerivedFieldsData*): Self = this.set("qDerivedFieldLists", js.Array(value :_*))
    @scala.inline
    def setQDerivedFieldLists(value: js.Array[INxDerivedFieldsData]): Self = this.set("qDerivedFieldLists", value.asInstanceOf[js.Any])
  }
  
}

