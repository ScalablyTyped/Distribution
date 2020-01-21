package typings.reactDataGrid

import typings.reactDataGrid.AdazzleReactDataGrid.GridProps
import typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait reactDataGridProps {
  @scala.inline
  def AutoCompleteProps: AutoCompleteEditorProps.type = typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteEditorProps
  type AutoCompleteProps = AutoCompleteEditorProps
  @scala.inline
  def AutoCompleteTokensEditorProps: typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps.type = typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
  type AutoCompleteTokensEditorProps = typings.reactDataGrid.AdazzleReactDataGridPlugins.AutoCompleteTokensEditorProps
  @scala.inline
  def DropDownEditorProps: typings.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps.type = typings.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
  type DropDownEditorProps = typings.reactDataGrid.AdazzleReactDataGridPlugins.DropDownEditorProps
  @scala.inline
  def ReactDataGridProps: GridProps.type = typings.reactDataGrid.AdazzleReactDataGrid.GridProps
  type ReactDataGridProps[T] = GridProps[T]
}

