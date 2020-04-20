package typings.storybookUi

import typings.react.mod.ComponentType
import typings.storybookUi.mod.default
import typings.storybookUi.sidebarSearchMod
import typings.storybookUi.sidebarStoriesMod.default.component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookUiComponents extends storybookUiProps {
  @scala.inline
  def Link: ComponentType[LinkProps] = typings.storybookUi.sidebarSidebarStoriesMod.Link.asInstanceOf[ComponentType[LinkProps]]
  @scala.inline
  def ListItemIcon: ComponentType[ListItemIconProps] = default.asInstanceOf[ComponentType[ListItemIconProps]]
  @scala.inline
  def PureSidebarSearch: ComponentType[PureSidebarSearchProps] = sidebarSearchMod.asInstanceOf[js.Dynamic].selectDynamic("PureSidebarSearch").asInstanceOf[ComponentType[PureSidebarSearchProps]]
  @scala.inline
  def Sidebar: ComponentType[SidebarProps] = typings.storybookUi.sidebarMod.default.asInstanceOf[ComponentType[SidebarProps]]
  @scala.inline
  def SidebarDotstoriesComponent: ComponentType[SidebarDotstoriesComponentProps] = component.asInstanceOf[ComponentType[SidebarDotstoriesComponentProps]]
  @scala.inline
  def SidebarHeading: ComponentType[SidebarHeadingProps] = typings.storybookUi.sidebarHeadingMod.default.asInstanceOf[ComponentType[SidebarHeadingProps]]
  @scala.inline
  def SidebarStories: ComponentType[SidebarStoriesProps] = typings.storybookUi.sidebarSidebarStoriesMod.default.asInstanceOf[ComponentType[SidebarStoriesProps]]
  @scala.inline
  def SidebarStoriesDotstoriesComponent: ComponentType[SidebarStoriesDotstoriesComponentProps] = typings.storybookUi.sidebarStoriesStoriesMod.default.component.asInstanceOf[ComponentType[SidebarStoriesDotstoriesComponentProps]]
}

