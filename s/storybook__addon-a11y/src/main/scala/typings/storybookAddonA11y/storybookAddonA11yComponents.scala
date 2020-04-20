package typings.storybookAddonA11y

import typings.react.mod.ComponentType
import typings.react.mod._Global_.JSX.LibraryManagedAttributes
import typings.storybookAddonA11y.highlightToggleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object storybookAddonA11yComponents extends storybookAddonA11yProps {
  @scala.inline
  def A11YPanel: ComponentType[A11YPanelProps] = js.constructorOf[typings.storybookAddonA11y.a11YPanelMod.A11YPanel].asInstanceOf[ComponentType[A11YPanelProps]]
  @scala.inline
  def ColorBlindness: ComponentType[js.Object] = typings.storybookAddonA11y.colorBlindnessMod.ColorBlindness.asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def Elements: ComponentType[ElementsProps] = typings.storybookAddonA11y.elementsMod.Elements.asInstanceOf[ComponentType[ElementsProps]]
  @scala.inline
  def HighlightToggle: ComponentType[HighlightToggleProps[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]]] = default.asInstanceOf[ComponentType[HighlightToggleProps[LibraryManagedAttributes[TypeofHighlightToggle, js.Any]]]]
  @scala.inline
  def Info: ComponentType[InfoProps] = typings.storybookAddonA11y.infoMod.Info.asInstanceOf[ComponentType[InfoProps]]
  @scala.inline
  def Item: ComponentType[ItemProps] = typings.storybookAddonA11y.itemMod.Item.asInstanceOf[ComponentType[ItemProps]]
  @scala.inline
  def Report: ComponentType[ReportProps] = typings.storybookAddonA11y.reportMod.Report.asInstanceOf[ComponentType[ReportProps]]
  @scala.inline
  def Rules: ComponentType[RulesProps] = typings.storybookAddonA11y.rulesMod.Rules.asInstanceOf[ComponentType[RulesProps]]
  @scala.inline
  def Tabs: ComponentType[TabsProps] = js.constructorOf[typings.storybookAddonA11y.tabsMod.Tabs].asInstanceOf[ComponentType[TabsProps]]
  @scala.inline
  def Tags: ComponentType[TagsProps] = typings.storybookAddonA11y.tagsMod.Tags.asInstanceOf[ComponentType[TagsProps]]
}

