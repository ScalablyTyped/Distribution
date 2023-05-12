package typings.slickgrid

import typings.jquery.JQuery
import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.ColumnMetadata
import typings.slickgrid.Slick.Controls.SlickColumnPickerOptions
import typings.slickgrid.Slick.Data.DataViewOptions
import typings.slickgrid.Slick.DataProvider
import typings.slickgrid.Slick.Editors.Editor
import typings.slickgrid.Slick.Editors.EditorOptions
import typings.slickgrid.Slick.Formatter
import typings.slickgrid.Slick.GridOptions
import typings.slickgrid.Slick.OnCommandEventArgs
import typings.slickgrid.Slick.PluginOptions
import typings.slickgrid.Slick.Position
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.SlickGridAutoTooltipsOption
import typings.slickgrid.Slick.SlickGridCheckBoxSelectColumnOptions
import typings.slickgrid.Slick.ValidateResults
import typings.slickgrid.anon.SelectActiveRow
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Slick {
    
    @JSGlobal("Slick")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Slick.AutoTooltips")
    @js.native
    open class AutoTooltips ()
      extends StObject
         with typings.slickgrid.Slick.Plugin[SlickData] {
      def this(option: SlickGridAutoTooltipsOption) = this()
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      override def init(grid: typings.slickgrid.Slick.Grid[SlickData]): Unit = js.native
    }
    
    @JSGlobal("Slick.CheckboxSelectColumn")
    @js.native
    open class CheckboxSelectColumn[T /* <: SlickData */] ()
      extends StObject
         with typings.slickgrid.Slick.CheckboxSelectColumn[T] {
      def this(options: SlickGridCheckBoxSelectColumnOptions) = this()
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      override def getColumnDefinition(): ColumnMetadata[T] = js.native
      
      /* CompleteClass */
      override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
    }
    
    object Controls {
      
      @JSGlobal("Slick.Controls.ColumnPicker")
      @js.native
      open class ColumnPicker[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Controls.ColumnPicker[T] {
        def this(
          columns: js.Array[Column[T]],
          grid: typings.slickgrid.Slick.Grid[T],
          options: SlickColumnPickerOptions
        ) = this()
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def getAllColumns(): js.Array[Column[T]] = js.native
      }
    }
    
    object Data {
      
      object Aggregators {
        
        @JSGlobal("Slick.Data.Aggregators.Aggregator")
        @js.native
        open class Aggregator[T /* <: SlickData */] ()
          extends StObject
             with typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
          
          /* CompleteClass */
          override def accumulate(item: T): Unit = js.native
          
          /* CompleteClass */
          var field: String = js.native
          
          /* CompleteClass */
          override def init(): Unit = js.native
          
          /* CompleteClass */
          override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
        }
        
        @JSGlobal("Slick.Data.Aggregators.Avg")
        @js.native
        open class Avg[T /* <: SlickData */] ()
          extends StObject
             with typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
          
          /* CompleteClass */
          override def accumulate(item: T): Unit = js.native
          
          /* CompleteClass */
          var field: String = js.native
          
          /* CompleteClass */
          override def init(): Unit = js.native
          
          /* CompleteClass */
          override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
        }
        
        @JSGlobal("Slick.Data.Aggregators.Max")
        @js.native
        open class Max[T /* <: SlickData */] ()
          extends StObject
             with typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
          
          /* CompleteClass */
          override def accumulate(item: T): Unit = js.native
          
          /* CompleteClass */
          var field: String = js.native
          
          /* CompleteClass */
          override def init(): Unit = js.native
          
          /* CompleteClass */
          override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
        }
        
        @JSGlobal("Slick.Data.Aggregators.Min")
        @js.native
        open class Min[T /* <: SlickData */] ()
          extends StObject
             with typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
          
          /* CompleteClass */
          override def accumulate(item: T): Unit = js.native
          
          /* CompleteClass */
          var field: String = js.native
          
          /* CompleteClass */
          override def init(): Unit = js.native
          
          /* CompleteClass */
          override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
        }
        
        @JSGlobal("Slick.Data.Aggregators.Sum")
        @js.native
        open class Sum[T /* <: SlickData */] ()
          extends StObject
             with typings.slickgrid.Slick.Data.Aggregators.Aggregator[T] {
          
          /* CompleteClass */
          override def accumulate(item: T): Unit = js.native
          
          /* CompleteClass */
          var field: String = js.native
          
          /* CompleteClass */
          override def init(): Unit = js.native
          
          /* CompleteClass */
          override def storeResult(groupTotals: typings.slickgrid.Slick.GroupTotals[T]): Unit = js.native
        }
      }
      
      @JSGlobal("Slick.Data.DataView")
      @js.native
      open class DataView[T /* <: SlickData */] ()
        extends StObject
           with typings.slickgrid.Slick.Data.DataView[T] {
        def this(options: DataViewOptions[T]) = this()
        
        /**
          * Returns the item at a given index.
          * @param index
          */
        /* CompleteClass */
        override def getItem(index: Double): T = js.native
        
        /**
          * Returns the number of data items in the set.
          */
        /* CompleteClass */
        override def getLength(): Double = js.native
      }
      
      @JSGlobal("Slick.Data.GroupItemMetadataProvider")
      @js.native
      open class GroupItemMetadataProvider[T /* <: SlickData */] ()
        extends StObject
           with typings.slickgrid.Slick.Data.GroupItemMetadataProvider[T]
    }
    
    @JSGlobal("Slick.EditorLock")
    @js.native
    open class EditorLock[T /* <: SlickData */] ()
      extends StObject
         with typings.slickgrid.Slick.EditorLock[T] {
      
      /***
        * Sets the specified edit controller as the active edit controller (acquire edit lock).
        * If another edit controller is already active, and exception will be thrown.
        * @method activate
        * @param editController {EditController} edit controller acquiring the lock
        */
      /* CompleteClass */
      override def activate(editController: Editor[T]): Unit = js.native
      
      /***
        * Attempts to cancel the current edit by calling "cancelCurrentEdit" method on the active edit
        * controller and returns whether the edit was successfully cancelled.  If no edit controller is
        * active, returns true.
        * @method cancelCurrentEdit
        * @return {Boolean}
        */
      /* CompleteClass */
      override def cancelCurrentEdit(): Boolean = js.native
      
      /***
        * Attempts to commit the current edit by calling "commitCurrentEdit" method on the active edit
        * controller and returns whether the commit attempt was successful (commit may fail due to validation
        * errors, etc.).  Edit controller's "commitCurrentEdit" must return true if the commit has succeeded
        * and false otherwise.  If no edit controller is active, returns true.
        * @method commitCurrentEdit
        * @return {Boolean}
        */
      /* CompleteClass */
      override def commitCurrentEdit(): Boolean = js.native
      
      /***
        * Unsets the specified edit controller as the active edit controller (release edit lock).
        * If the specified edit controller is not the active one, an exception will be thrown.
        * @method deactivate
        * @param editController {EditController} edit controller releasing the lock
        */
      /* CompleteClass */
      override def deactivate(editController: Editor[T]): Unit = js.native
      
      /***
        * Returns true if a specified edit controller is active (has the edit lock).
        * If the parameter is not specified, returns true if any edit controller is active.
        * @method isActive
        * @param editController {EditController}
        * @return {Boolean}
        */
      /* CompleteClass */
      override def isActive(editController: Editor[T]): Boolean = js.native
    }
    
    object Editors {
      
      @JSGlobal("Slick.Editors.Checkbox")
      @js.native
      open class Checkbox[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.Checkbox[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.Date")
      @js.native
      open class Date[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.Date[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def position(position: Position): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.Editor")
      @js.native
      open class Editor[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.Editor[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.Integer")
      @js.native
      open class Integer[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.Integer[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.LongText")
      @js.native
      open class LongText[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.LongText[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def cancel(): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def handleKeyDown(e: DOMEvent): Unit = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def position(position: Position): Unit = js.native
        
        /* CompleteClass */
        override def save(): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.PercentComplete")
      @js.native
      open class PercentComplete[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.PercentComplete[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.Text")
      @js.native
      open class Text[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.Text[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def getValue(): String = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def setValue(`val`: String): Unit = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
      
      @JSGlobal("Slick.Editors.YesNoSelect")
      @js.native
      open class YesNoSelect[T /* <: SlickData */] protected ()
        extends StObject
           with typings.slickgrid.Slick.Editors.YesNoSelect[T] {
        def this(args: EditorOptions[T]) = this()
        
        /* CompleteClass */
        override def applyValue(item: T, state: String): Unit = js.native
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def focus(): Unit = js.native
        
        /* CompleteClass */
        override def init(): Unit = js.native
        
        /* CompleteClass */
        override def isValueChanged(): Boolean = js.native
        
        /* CompleteClass */
        override def loadValue(item: T): Unit = js.native
        
        /* CompleteClass */
        override def serializeValue(): Any = js.native
        
        /* CompleteClass */
        override def validate(): ValidateResults = js.native
      }
    }
    
    @JSGlobal("Slick.Event")
    @js.native
    open class Event[T] ()
      extends StObject
         with typings.slickgrid.Slick.Event[T]
    
    @JSGlobal("Slick.EventData")
    @js.native
    open class EventData ()
      extends StObject
         with typings.slickgrid.Slick.EventData {
      
      /***
        * Returns whether stopImmediatePropagation was called on this event object.\
        * @method isImmediatePropagationStopped
        * @return {Boolean}
        */
      /* CompleteClass */
      override def isImmediatePropagationStopped(): Boolean = js.native
      
      /***
        * Returns whether stopPropagation was called on this event object.
        * @method isPropagationStopped
        * @return {Boolean}
        */
      /* CompleteClass */
      override def isPropagationStopped(): Boolean = js.native
      
      /***
        * Prevents the rest of the handlers from being executed.
        * @method stopImmediatePropagation
        */
      /* CompleteClass */
      override def stopImmediatePropagation(): Unit = js.native
      
      /***
        * Stops event from propagating up the DOM tree.
        * @method stopPropagation
        */
      /* CompleteClass */
      override def stopPropagation(): Unit = js.native
    }
    
    @JSGlobal("Slick.EventHandler")
    @js.native
    open class EventHandler[T] ()
      extends StObject
         with typings.slickgrid.Slick.EventHandler[T] {
      
      /* CompleteClass */
      override def subscribe(
        event: typings.slickgrid.Slick.Event[T],
        handler: js.Function2[/* e */ typings.slickgrid.Slick.EventData, T, Unit]
      ): typings.slickgrid.Slick.EventHandler[Any] = js.native
      
      /* CompleteClass */
      override def unsubscribe(
        event: typings.slickgrid.Slick.Event[T],
        handler: js.Function2[/* e */ typings.slickgrid.Slick.EventData, T, Unit]
      ): typings.slickgrid.Slick.EventHandler[Any] = js.native
      
      /* CompleteClass */
      override def unsubscribeAll(): typings.slickgrid.Slick.EventHandler[Any] = js.native
    }
    
    object Formatters {
      
      @JSGlobal("Slick.Formatters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Slick.Formatters.Checkmark")
      @js.native
      def Checkmark: Formatter[SlickData] = js.native
      inline def Checkmark_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Checkmark")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Slick.Formatters.PercentComplete")
      @js.native
      def PercentComplete: Formatter[SlickData] = js.native
      
      @JSGlobal("Slick.Formatters.PercentCompleteBar")
      @js.native
      def PercentCompleteBar: Formatter[SlickData] = js.native
      inline def PercentCompleteBar_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PercentCompleteBar")(x.asInstanceOf[js.Any])
      
      inline def PercentComplete_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PercentComplete")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Slick.Formatters.YesNo")
      @js.native
      def YesNo: Formatter[SlickData] = js.native
      inline def YesNo_=(x: Formatter[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YesNo")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Slick.GlobalEditorLock")
    @js.native
    def GlobalEditorLock: typings.slickgrid.Slick.EditorLock[SlickData] = js.native
    inline def GlobalEditorLock_=(x: typings.slickgrid.Slick.EditorLock[SlickData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlobalEditorLock")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Slick.Grid")
    @js.native
    open class Grid[T /* <: SlickData */] protected ()
      extends StObject
         with typings.slickgrid.Slick.Grid[T] {
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
    open class Group[T /* <: SlickData */] ()
      extends StObject
         with typings.slickgrid.Slick.Group[T] {
      
      /***
        * Whether a group is collapsed.
        * @property collapsed
        * @type {Boolean}
        */
      /* CompleteClass */
      var collapsed: Boolean = js.native
      
      /***
        * Number of rows in the group.
        * @property count
        * @type {Integer}
        */
      /* CompleteClass */
      var count: Double = js.native
      
      /***
        * Compares two Group instances.
        * @method equals
        * @return {Boolean}
        * @param group {Group} Group instance to compare to.
        * todo: this is on the prototype (NonDataRow()) instance, not Group, maybe doesn't matter?
        */
      /* CompleteClass */
      override def equals(group: typings.slickgrid.Slick.Group[T]): Boolean = js.native
      
      /**
        * A unique key used to identify the group.  This key can be used in calls to DataView
        * collapseGroup() or expandGroup().
        */
      /* CompleteClass */
      var groupingKey: Any = js.native
      
      /**
        * Sub-groups that are part of the group.
        */
      /* CompleteClass */
      var groups: js.Array[typings.slickgrid.Slick.Group[T]] = js.native
      
      /**
        * Grouping level, starting with 0.
        */
      /* CompleteClass */
      var level: Double = js.native
      
      /**
        * Rows that are part of the group.
        */
      /* CompleteClass */
      var rows: js.Array[T] = js.native
      
      /***
        * Formatted display value of the group.
        * @property title
        * @type {String}
        */
      /* CompleteClass */
      var title: String = js.native
      
      /***
        * GroupTotals, if any.
        * @property totals
        * @type {GroupTotals}
        */
      /* CompleteClass */
      var totals: typings.slickgrid.Slick.GroupTotals[T] = js.native
      
      /***
        * Grouping value.
        * @property value
        * @type {Object}
        */
      /* CompleteClass */
      var value: Any = js.native
    }
    
    @JSGlobal("Slick.GroupTotals")
    @js.native
    open class GroupTotals[T /* <: SlickData */] ()
      extends StObject
         with typings.slickgrid.Slick.GroupTotals[T] {
      
      /***
        * Parent Group.
        * @param group
        * @type {Group}
        */
      /* CompleteClass */
      var group: typings.slickgrid.Slick.Group[T] = js.native
    }
    
    @JSGlobal("Slick.NonDataRow")
    @js.native
    open class NonDataRow ()
      extends StObject
         with typings.slickgrid.Slick.NonDataRow
    
    @JSGlobal("Slick.Plugin")
    @js.native
    open class Plugin[T /* <: SlickData */] ()
      extends StObject
         with typings.slickgrid.Slick.Plugin[T] {
      def this(options: PluginOptions) = this()
      
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
    }
    
    object Plugins {
      
      @JSGlobal("Slick.Plugins.HeaderButtons")
      @js.native
      open class HeaderButtons[T /* <: SlickData */] ()
        extends StObject
           with typings.slickgrid.Slick.Plugins.HeaderButtons[T] {
        
        /* CompleteClass */
        override def destroy(): Unit = js.native
        
        /* CompleteClass */
        override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
        
        /* CompleteClass */
        var onCommand: typings.slickgrid.Slick.Event[OnCommandEventArgs[T]] = js.native
      }
    }
    
    @JSGlobal("Slick.Range")
    @js.native
    open class Range protected ()
      extends StObject
         with typings.slickgrid.Slick.Range {
      /**
        * A structure containing a range of cells.
        * @param fromRow {Integer} Starting row.
        * @param fromCell {Integer} Starting cell.
        * @param toRow {Integer} Optional. Ending row. Defaults to <code>fromRow</code>.
        * @param toCell {Integer} Optional. Ending cell. Defaults to <code>fromCell</code>.
        **/
      def this(fromRow: Double, fromCell: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: Double, toCell: Double) = this()
      def this(fromRow: Double, fromCell: Double, toRow: Unit, toCell: Double) = this()
      
      /***
        * Returns whether a range contains a given cell.
        * @method contains
        * @param row {Integer}
        * @param cell {Integer}
        * @return {Boolean}
        */
      /* CompleteClass */
      override def contains(row: Double, cell: Double): Boolean = js.native
      
      /***
        * @property fromCell
        * @type {Integer}
        */
      /* CompleteClass */
      var fromCell: Double = js.native
      
      /***
        * @property fromRow
        * @type {Integer}
        */
      /* CompleteClass */
      var fromRow: Double = js.native
      
      /***
        * Returns whether a range represents a single cell.
        * @method isSingleCell
        * @return {Boolean}
        */
      /* CompleteClass */
      override def isSingleCell(): Boolean = js.native
      
      /***
        * Returns whether a range represents a single row.
        * @method isSingleRow
        * @return {Boolean}
        */
      /* CompleteClass */
      override def isSingleRow(): Boolean = js.native
      
      /***
        * @property toCell
        * @type {Integer}
        */
      /* CompleteClass */
      var toCell: Double = js.native
      
      /***
        * @property toRow
        * @type {Integer}
        */
      /* CompleteClass */
      var toRow: Double = js.native
    }
    
    @JSGlobal("Slick.RowSelectionModel")
    @js.native
    open class RowSelectionModel[T /* <: SlickData */, E] ()
      extends StObject
         with typings.slickgrid.Slick.RowSelectionModel[T, E] {
      def this(options: SelectActiveRow) = this()
      
      /**
        * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
        **/
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /* CompleteClass */
      override def getSelectedRanges(): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def getSelectedRows(): js.Array[Double] = js.native
      
      /**
        * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
        **/
      /* CompleteClass */
      override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
      
      /* CompleteClass */
      var onSelectedRangesChanged: typings.slickgrid.Slick.Event[E] = js.native
      
      /* CompleteClass */
      override def setSelectedRanges(ranges: js.Array[Double]): Unit = js.native
      
      /* CompleteClass */
      override def setSelectedRows(rows: js.Array[Double]): Unit = js.native
    }
    
    @JSGlobal("Slick.SelectionModel")
    @js.native
    open class SelectionModel[T /* <: SlickData */, E] ()
      extends StObject
         with typings.slickgrid.Slick.SelectionModel[T, E] {
      
      /**
        * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
        **/
      /* CompleteClass */
      override def destroy(): Unit = js.native
      
      /**
        * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
        **/
      /* CompleteClass */
      override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
      
      /* CompleteClass */
      var onSelectedRangesChanged: typings.slickgrid.Slick.Event[E] = js.native
    }
  }
}
