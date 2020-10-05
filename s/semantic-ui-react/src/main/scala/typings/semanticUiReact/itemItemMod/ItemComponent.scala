package typings.semanticUiReact.itemItemMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.itemContentMod.ItemContentProps
import typings.semanticUiReact.itemDescriptionMod.ItemDescriptionProps
import typings.semanticUiReact.itemExtraMod.ItemExtraProps
import typings.semanticUiReact.itemGroupMod.ItemGroupProps
import typings.semanticUiReact.itemHeaderMod.ItemHeaderProps
import typings.semanticUiReact.itemImageMod.ItemImageProps
import typings.semanticUiReact.itemMetaMod.ItemMetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

