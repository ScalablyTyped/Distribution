package typings.reactDashUltimateDashPagination.reactDashUltimateDashPaginationMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUltimatePaginationOptions extends js.Object {
  /**
    * A React.js component that will be used as a wrapper for pagination items
    */
  var WrapperComponent: js.UndefOr[String | ComponentType[_]] = js.undefined
  /**
    * An object that is used as a map from the item type to the React.js component that will be used to render this item
    */
  var itemTypeToComponent: ItemTypeToComponent
}

object CreateUltimatePaginationOptions {
  @scala.inline
  def apply(itemTypeToComponent: ItemTypeToComponent, WrapperComponent: String | ComponentType[_] = null): CreateUltimatePaginationOptions = {
    val __obj = js.Dynamic.literal(itemTypeToComponent = itemTypeToComponent)
    if (WrapperComponent != null) __obj.updateDynamic("WrapperComponent")(WrapperComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUltimatePaginationOptions]
  }
}

