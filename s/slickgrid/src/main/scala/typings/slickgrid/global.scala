package typings.slickgrid

import typings.jquery.JQuery
import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.Controls.SlickColumnPickerOptions
import typings.slickgrid.Slick.Data.DataViewOptions
import typings.slickgrid.Slick.DataProvider
import typings.slickgrid.Slick.Editors.EditorOptions
import typings.slickgrid.Slick.Formatter
import typings.slickgrid.Slick.GridOptions
import typings.slickgrid.Slick.PluginOptions
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.SlickGridAutoTooltipsOption
import typings.slickgrid.Slick.SlickGridCheckBoxSelectColumnOptions
import typings.slickgrid.anon.SelectActiveRow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Slick {
    
    @JSGlobal("Slick")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Slick.AutoTooltips")
    @js.native
    class AutoTooltips ()
      extends typings.slickgrid.Slick.Plugin[SlickData] {
      def this(option: SlickGridAutoTooltipsOption) = this()
    }
    
    @JSGlobal("Slick.CheckboxSelectColumn")
    @js.native
    class CheckboxSelectColumn[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.CheckboxSelectColumn[T] {
      def this(options: SlickGridCheckBoxSelectColumnOptions) = this()
    }
    
    object Controls {
      
      @JSGlobal("Slick.Controls.ColumnPicker")
      @js.native
      class ColumnPicker[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Controls.ColumnPicker[T] {
        def this(
          columns: js.Array[Column[T]],
          grid: typings.slickgrid.Slick.Grid[T],
          options: SlickColumnPickerOptions
        ) = this()
      }
    }
    
    object Data {
      
      object Aggregators {
        
        @JSGlobal("Slick.Data.Aggregators.Aggregator")
        @js.native
        class Aggregator[T /* <: SlickData */] ()
          extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
        
        @JSGlobal("Slick.Data.Aggregators.Avg")
        @js.native
        class Avg[T] ()
          extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
        
        @JSGlobal("Slick.Data.Aggregators.Max")
        @js.native
        class Max[T] ()
          extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
        
        @JSGlobal("Slick.Data.Aggregators.Min")
        @js.native
        class Min[T] ()
          extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
        
        @JSGlobal("Slick.Data.Aggregators.Sum")
        @js.native
        class Sum[T] ()
          extends typings.slickgrid.Slick.Data.Aggregators.Aggregator[T]
      }
      
      @JSGlobal("Slick.Data.DataView")
      @js.native
      class DataView[T /* <: SlickData */] ()
        extends typings.slickgrid.Slick.Data.DataView[T] {
        def this(options: DataViewOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Data.GroupItemMetadataProvider")
      @js.native
      class GroupItemMetadataProvider[T /* <: SlickData */] ()
        extends typings.slickgrid.Slick.Data.GroupItemMetadataProvider[T]
    }
    
    @JSGlobal("Slick.EditorLock")
    @js.native
    class EditorLock[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.EditorLock[T]
    
    object Editors {
      
      @JSGlobal("Slick.Editors.Checkbox")
      @js.native
      class Checkbox[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.Checkbox[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.Date")
      @js.native
      class Date[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.Date[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.Editor")
      @js.native
      class Editor[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.Editor[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.Integer")
      @js.native
      class Integer[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.Integer[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.LongText")
      @js.native
      class LongText[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.LongText[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.PercentComplete")
      @js.native
      class PercentComplete[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.PercentComplete[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.Text")
      @js.native
      class Text[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.Text[T] {
        def this(args: EditorOptions[T]) = this()
      }
      
      @JSGlobal("Slick.Editors.YesNoSelect")
      @js.native
      class YesNoSelect[T /* <: SlickData */] protected ()
        extends typings.slickgrid.Slick.Editors.YesNoSelect[T] {
        def this(args: EditorOptions[T]) = this()
      }
    }
    
    @JSGlobal("Slick.Event")
    @js.native
    class Event[T] ()
      extends typings.slickgrid.Slick.Event[T]
    
    @JSGlobal("Slick.EventData")
    @js.native
    class EventData ()
      extends typings.slickgrid.Slick.EventData
    
    @JSGlobal("Slick.EventHandler")
    @js.native
    class EventHandler[T] ()
      extends typings.slickgrid.Slick.EventHandler[T]
    
    object Formatters {
      
      @JSGlobal("Slick.Formatters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Slick.Formatters.Checkmark")
      @js.native
      def Checkmark: Formatter[SlickData] = js.native
      @scala.inline
      def Checkmark_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Checkmark")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Slick.Formatters.PercentComplete")
      @js.native
      def PercentComplete: Formatter[SlickData] = js.native
      
      @JSGlobal("Slick.Formatters.PercentCompleteBar")
      @js.native
      def PercentCompleteBar: Formatter[SlickData] = js.native
      @scala.inline
      def PercentCompleteBar_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PercentCompleteBar")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def PercentComplete_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PercentComplete")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Slick.Formatters.YesNo")
      @js.native
      def YesNo: Formatter[SlickData] = js.native
      @scala.inline
      def YesNo_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YesNo")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Slick.GlobalEditorLock")
    @js.native
    def GlobalEditorLock: typings.slickgrid.Slick.EditorLock[SlickData] = js.native
    @scala.inline
    def GlobalEditorLock_=(x: typings.slickgrid.Slick.EditorLock[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalEditorLock")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Slick.Grid")
    @js.native
    class Grid[T /* <: SlickData */] protected ()
      extends typings.slickgrid.Slick.Grid[T] {
      /**
        * Create an instance of the grid.
        * @param container Container node to create the grid in. This can be a DOM Element, a jQuery node, or a jQuery selector.
        * @param data Databinding source. This can either be a regular JavaScript array or a custom object exposing getItem(index) and getLength() functions.
        * @param columns An array of column definition objects. See Column Options for a list of options that can be included on each column definition object.
        * @param options Additional options.  See Grid Options for a list of options that can be included.
        **/
      def this(container: String, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
      def this(container: String, data: DataProvider[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
      def this(
        container: JQuery[HTMLElement],
        data: js.Array[T],
        columns: js.Array[Column[T]],
        options: GridOptions[T]
      ) = this()
      def this(
        container: JQuery[HTMLElement],
        data: DataProvider[T],
        columns: js.Array[Column[T]],
        options: GridOptions[T]
      ) = this()
      def this(container: HTMLElement, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
      def this(
        container: HTMLElement,
        data: DataProvider[T],
        columns: js.Array[Column[T]],
        options: GridOptions[T]
      ) = this()
    }
    
    @JSGlobal("Slick.Group")
    @js.native
    class Group[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.Group[T]
    
    @JSGlobal("Slick.GroupTotals")
    @js.native
    class GroupTotals[T] ()
      extends typings.slickgrid.Slick.GroupTotals[T]
    
    @JSGlobal("Slick.NonDataRow")
    @js.native
    class NonDataRow ()
      extends typings.slickgrid.Slick.NonDataRow
    
    @JSGlobal("Slick.Plugin")
    @js.native
    class Plugin[T /* <: SlickData */] ()
      extends typings.slickgrid.Slick.Plugin[T] {
      def this(options: PluginOptions) = this()
    }
    
    object Plugins {
      
      @JSGlobal("Slick.Plugins.HeaderButtons")
      @js.native
      class HeaderButtons[T /* <: SlickData */] ()
        extends typings.slickgrid.Slick.Plugins.HeaderButtons[T]
    }
    
    @JSGlobal("Slick.Range")
    @js.native
    class Range protected ()
      extends typings.slickgrid.Slick.Range {
      /**
        * A structure containing a range of cells.
        * @constructor
        * @param fromRow {Integer} Starting row.
        * @param fromCell {Integer} Starting cell.
        * @param toRow {Integer} Optional. Ending row. Defaults to <code>fromRow</code>.
        * @param toCell {Integer} Optional. Ending cell. Defaults to <code>fromCell</code>.
        **/
      def this(fromRow: Double, fromCell: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: js.UndefOr[scala.Nothing], toCell: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: Double, toCell: Double) = this()
    }
    
    @JSGlobal("Slick.RowSelectionModel")
    @js.native
    class RowSelectionModel[T /* <: SlickData */, E] ()
      extends typings.slickgrid.Slick.RowSelectionModel[T, E] {
      def this(options: SelectActiveRow) = this()
    }
    
    @JSGlobal("Slick.SelectionModel")
    @js.native
    class SelectionModel[T /* <: SlickData */, E] ()
      extends typings.slickgrid.Slick.SelectionModel[T, E]
  }
}
