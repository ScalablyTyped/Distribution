package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutationObserverInit extends js.Object {
  /**
    * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
    */
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
    */
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
    */
  var attributes: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
    */
  var characterData: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
    */
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to target's children are to be observed.
    */
  var childList: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set to true if mutations to not just target, but also target's descendants are to be observed.
    */
  var subtree: js.UndefOr[scala.Boolean] = js.native
}

object MutationObserverInit {
  @scala.inline
  def apply(): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverInit]
  }
  @scala.inline
  implicit class MutationObserverInitOps[Self <: MutationObserverInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributeFilterVarargs(value: java.lang.String*): Self = this.set("attributeFilter", js.Array(value :_*))
    @scala.inline
    def setAttributeFilter(value: js.Array[java.lang.String]): Self = this.set("attributeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeFilter: Self = this.set("attributeFilter", js.undefined)
    @scala.inline
    def setAttributeOldValue(value: scala.Boolean): Self = this.set("attributeOldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeOldValue: Self = this.set("attributeOldValue", js.undefined)
    @scala.inline
    def setAttributes(value: scala.Boolean): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCharacterData(value: scala.Boolean): Self = this.set("characterData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterData: Self = this.set("characterData", js.undefined)
    @scala.inline
    def setCharacterDataOldValue(value: scala.Boolean): Self = this.set("characterDataOldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterDataOldValue: Self = this.set("characterDataOldValue", js.undefined)
    @scala.inline
    def setChildList(value: scala.Boolean): Self = this.set("childList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildList: Self = this.set("childList", js.undefined)
    @scala.inline
    def setSubtree(value: scala.Boolean): Self = this.set("subtree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtree: Self = this.set("subtree", js.undefined)
  }
  
}

