package typings.semanticDashUiDashReact.distCommonjsViewsItemItemMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.StatelessComponent
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemContentMod.ItemContentProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemDescriptionMod.ItemDescriptionProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemExtraMod.ItemExtraProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemGroupMod.ItemGroupProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemHeaderMod.ItemHeaderProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemImageMod.ItemImageProps
import typings.semanticDashUiDashReact.distCommonjsViewsItemItemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemComponent extends FunctionComponent[ItemProps] {
  var Content: ComponentClass[ItemContentProps, ComponentState] = js.native
  var Description: StatelessComponent[ItemDescriptionProps] = js.native
  var Extra: StatelessComponent[ItemExtraProps] = js.native
  var Group: StatelessComponent[ItemGroupProps] = js.native
  var Header: StatelessComponent[ItemHeaderProps] = js.native
  var Image: StatelessComponent[ItemImageProps] = js.native
  var Meta: StatelessComponent[ItemMetaProps] = js.native
}

