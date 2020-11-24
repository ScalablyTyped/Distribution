package typings.reactWidgets.multiselectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiselectMessages extends js.Object {
  
  /**
    * The text label for creating new tags.
    * @default "(create new tag)"
    */
  var createNew: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var createOption: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  /**
    * Text to display when the the current filter does not return any results.
    * @default "The filter returned no results"
    */
  var emptyFilter: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  /**
    * Text to display when the data prop array is empty.
    * @default "There are no items in this list"
    */
  var emptyList: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var noneSelected: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var open: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var removeLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var selectedItems: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
  
  var tagsLabel: js.UndefOr[String | (js.Function1[/* props */ MultiselectProps, String])] = js.native
}
object MultiselectMessages {
  
  @scala.inline
  def apply(): MultiselectMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiselectMessages]
  }
  
  @scala.inline
  implicit class MultiselectMessagesOps[Self <: MultiselectMessages] (val x: Self) extends AnyVal {
    
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
    def setCreateNewFunction1(value: /* props */ MultiselectProps => String): Self = this.set("createNew", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNew(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("createNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateNew: Self = this.set("createNew", js.undefined)
    
    @scala.inline
    def setCreateOptionFunction1(value: /* props */ MultiselectProps => String): Self = this.set("createOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateOption(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("createOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateOption: Self = this.set("createOption", js.undefined)
    
    @scala.inline
    def setEmptyFilterFunction1(value: /* props */ MultiselectProps => String): Self = this.set("emptyFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmptyFilter(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("emptyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyFilter: Self = this.set("emptyFilter", js.undefined)
    
    @scala.inline
    def setEmptyListFunction1(value: /* props */ MultiselectProps => String): Self = this.set("emptyList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmptyList(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("emptyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyList: Self = this.set("emptyList", js.undefined)
    
    @scala.inline
    def setNoneSelectedFunction1(value: /* props */ MultiselectProps => String): Self = this.set("noneSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoneSelected(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("noneSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoneSelected: Self = this.set("noneSelected", js.undefined)
    
    @scala.inline
    def setOpenFunction1(value: /* props */ MultiselectProps => String): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setRemoveLabelFunction1(value: /* props */ MultiselectProps => String): Self = this.set("removeLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("removeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveLabel: Self = this.set("removeLabel", js.undefined)
    
    @scala.inline
    def setSelectedItemsFunction1(value: /* props */ MultiselectProps => String): Self = this.set("selectedItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedItems(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    
    @scala.inline
    def setTagsLabelFunction1(value: /* props */ MultiselectProps => String): Self = this.set("tagsLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTagsLabel(value: String | (js.Function1[/* props */ MultiselectProps, String])): Self = this.set("tagsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsLabel: Self = this.set("tagsLabel", js.undefined)
  }
}
