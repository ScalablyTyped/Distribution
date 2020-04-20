package typings.reactNativeSortableGrid

import typings.react.mod.ComponentType
import typings.reactNativeSortableGrid.mod.^.default
import typings.reactNativeSortableGrid.mod.defaultCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactNativeSortableGridComponents extends reactNativeSortableGridProps {
  @scala.inline
  def Default: ComponentType[DefaultProps] = js.constructorOf[defaultCls].asInstanceOf[ComponentType[DefaultProps]]
  @scala.inline
  def ReactNativeSortableGrid: ComponentType[ReactNativeSortableGridProps] = default.asInstanceOf[ComponentType[ReactNativeSortableGridProps]]
}

