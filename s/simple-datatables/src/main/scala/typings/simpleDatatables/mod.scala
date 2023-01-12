package typings.simpleDatatables

import typings.simpleDatatables.simpleDatatablesStrings.csv
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotinit
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotpage
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotperpage
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotrefresh
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotsearch
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotsort
import typings.simpleDatatables.simpleDatatablesStrings.datatableDotupdate
import typings.simpleDatatables.simpleDatatablesStrings.json
import typings.simpleDatatables.simpleDatatablesStrings.sql
import typings.simpleDatatables.simpleDatatablesStrings.txt
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLCollection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableRowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-datatables", "DataTable")
  @js.native
  open class DataTable protected () extends StObject {
    def this(table: String) = this()
    def this(table: Element) = this()
    def this(table: String, options: DataTableOptions) = this()
    def this(table: Element, options: DataTableOptions) = this()
    
    var activeRows: js.Array[Any] = js.native
    
    var body: HTMLElement = js.native
    
    def columns(): DataTableColumns = js.native
    
    var container: HTMLDivElement = js.native
    
    var currentPage: Double = js.native
    
    var data: js.Array[DataTableRow] = js.native
    
    var dataIndex: Double = js.native
    
    def destroy(): Unit = js.native
    
    def `export`(options: DataTableExportOptions): Boolean = js.native
    
    var foot: HTMLElement = js.native
    
    var hasHeadings: Boolean = js.native
    
    // TODO: array of what ?
    var hasRows: Boolean = js.native
    
    var head: HTMLElement = js.native
    
    // TODO: array of what ?
    var headings: HTMLCollection = js.native
    
    def `import`(options: DataTableImportOptions): Boolean = js.native
    
    def init(): Unit = js.native
    def init(options: DataTableOptions): Unit = js.native
    
    var initialized: Boolean = js.native
    
    def insert(data: Any): Unit = js.native
    
    def on(event: datatableDotinit | datatableDotrefresh | datatableDotupdate, callback: js.Function0[Unit]): Unit = js.native
    
    var onFirstPage: Boolean = js.native
    
    var onLastPage: Boolean = js.native
    
    @JSName("on")
    def on_datatablepage(event: datatableDotpage, callback: js.Function1[/* page */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_datatableperpage(event: datatableDotperpage, callback: js.Function1[/* perpage */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_datatablesearch(
      event: datatableDotsearch,
      callback: js.Function2[/* query */ String, /* matched */ js.Array[DataTableRow], Unit]
    ): Unit = js.native
    @JSName("on")
    def on_datatablesort(
      event: datatableDotsort,
      callback: js.Function2[/* column */ Double, /* direction */ DataTableOrderDirection, Unit]
    ): Unit = js.native
    
    // TODO: array of what ?
    var options: DataTableOptions = js.native
    
    def page(pageNumber: Double): Unit = js.native
    
    var pagers: js.Array[Any] = js.native
    
    // TODO: array of what ?
    var pages: js.Array[Any] = js.native
    
    /** @deprecated */
    def print(): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def rows(): DataTableRows = js.native
    
    var searchData: js.Array[DataTableRow] = js.native
    
    var searching: Boolean = js.native
    
    // TODO: define data
    def setMessage(message: String): Unit = js.native
    
    var table: HTMLTableElement = js.native
    
    var totalPages: Double = js.native
    
    var wrapper: HTMLDivElement = js.native
  }
  /* static members */
  object DataTable {
    
    @JSImport("simple-datatables", "DataTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(pluginName: String, callback: js.Function1[/* options */ DataTableOptions, DataTablePlugin]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(pluginName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("simple-datatables", "DataTableColumns")
  @js.native
  open class DataTableColumns () extends StObject {
    
    def add(data: DataTableColumn): Unit = js.native
    
    def hidden(select: js.Array[Double]): Unit = js.native
    /** @deprecated */
    def hidden(select: Double): Unit = js.native
    
    def hide(select: js.Array[Double]): Unit = js.native
    def hide(select: Double): Unit = js.native
    
    def order(indexes: js.Array[Double]): Unit = js.native
    
    def remove(select: js.Array[Double]): Unit = js.native
    def remove(select: Double): Unit = js.native
    
    def show(select: js.Array[Double]): Unit = js.native
    def show(select: Double): Unit = js.native
    
    def sort(column: Double, direction: DataTableOrderDirection): Unit = js.native
    
    def swap(indexes: js.Array[Double]): Unit = js.native
    
    def visible(): Boolean | js.Array[Boolean] = js.native
    def visible(select: js.Array[Double]): Unit = js.native
    def visible(select: Double): Unit = js.native
  }
  
  @JSImport("simple-datatables", "DataTablePlugin")
  @js.native
  open class DataTablePlugin () extends StObject {
    
    def init(): Unit = js.native
  }
  
  @JSImport("simple-datatables", "DataTableRow")
  @js.native
  open class DataTableRow ()
    extends StObject
       with HTMLTableRowElement {
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaAtomic: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaAutoComplete: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaBusy: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaChecked: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColIndexText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaColSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaCurrent: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaDisabled: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaExpanded: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHasPopup: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaInvalid: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaKeyShortcuts: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLabel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLevel: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaLive: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaModal: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiLine: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaMultiSelectable: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaOrientation: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPlaceholder: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPosInSet: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaPressed: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaReadOnly: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRequired: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRoleDescription: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowCount: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndex: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndexText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaRowSpan: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSelected: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSetSize: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaSort: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMax: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueMin: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueNow: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaValueText: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var contentEditable: String = js.native
    
    var dataIndex: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /** Returns the first following sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /** Returns the first preceding sibling that is an element, and null otherwise. */
    /* standard dom */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var role: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
  }
  
  @JSImport("simple-datatables", "DataTableRows")
  @js.native
  open class DataTableRows () extends StObject {
    
    def add(data: js.Array[js.Array[String] | String]): Unit = js.native
    
    def remove(select: js.Array[Double]): Unit = js.native
    def remove(select: Double): Unit = js.native
  }
  
  trait DataTableColumn extends StObject {
    
    var data: js.Array[String]
    
    var format: js.UndefOr[String] = js.undefined
    
    var heading: String
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[DataTableColumnType] = js.undefined
  }
  object DataTableColumn {
    
    inline def apply(data: js.Array[String], heading: String): DataTableColumn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableColumn] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setType(value: DataTableColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataTableColumnOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[
        js.Function3[/* data */ String, /* cell */ HTMLTableCellElement, /* row */ DataTableRow, String]
      ] = js.undefined
    
    var select: Double | js.Array[Double]
    
    var sort: js.UndefOr[DataTableOrderDirection] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[DataTableColumnType] = js.undefined
  }
  object DataTableColumnOptions {
    
    inline def apply(select: Double | js.Array[Double]): DataTableColumnOptions = {
      val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableColumnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableColumnOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setRender(value: (/* data */ String, /* cell */ HTMLTableCellElement, /* row */ DataTableRow) => String): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSelect(value: Double | js.Array[Double]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectVarargs(value: Double*): Self = StObject.set(x, "select", js.Array(value*))
      
      inline def setSort(value: DataTableOrderDirection): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setType(value: DataTableColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simpleDatatables.simpleDatatablesStrings.string
    - typings.simpleDatatables.simpleDatatablesStrings.number
    - typings.simpleDatatables.simpleDatatablesStrings.date
  */
  trait DataTableColumnType extends StObject
  object DataTableColumnType {
    
    inline def date: typings.simpleDatatables.simpleDatatablesStrings.date = "date".asInstanceOf[typings.simpleDatatables.simpleDatatablesStrings.date]
    
    inline def number: typings.simpleDatatables.simpleDatatablesStrings.number = "number".asInstanceOf[typings.simpleDatatables.simpleDatatablesStrings.number]
    
    inline def string: typings.simpleDatatables.simpleDatatablesStrings.string = "string".asInstanceOf[typings.simpleDatatables.simpleDatatablesStrings.string]
  }
  
  trait DataTableExportOptions extends StObject {
    
    var columnDelimiter: js.UndefOr[String] = js.undefined
    
    var download: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    // csv
    var lineDelimiter: js.UndefOr[String] = js.undefined
    
    // json
    var replacer: js.UndefOr[js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]] = js.undefined
    
    var selection: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var skipColumn: js.UndefOr[js.Array[Double]] = js.undefined
    
    var space: js.UndefOr[Double] = js.undefined
    
    // sql
    var tableName: js.UndefOr[String] = js.undefined
    
    var `type`: csv | txt | json | sql
  }
  object DataTableExportOptions {
    
    inline def apply(`type`: csv | txt | json | sql): DataTableExportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableExportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableExportOptions] (val x: Self) extends AnyVal {
      
      inline def setColumnDelimiter(value: String): Self = StObject.set(x, "columnDelimiter", value.asInstanceOf[js.Any])
      
      inline def setColumnDelimiterUndefined: Self = StObject.set(x, "columnDelimiter", js.undefined)
      
      inline def setDownload(value: Boolean): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLineDelimiter(value: String): Self = StObject.set(x, "lineDelimiter", value.asInstanceOf[js.Any])
      
      inline def setLineDelimiterUndefined: Self = StObject.set(x, "lineDelimiter", js.undefined)
      
      inline def setReplacer(value: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSelection(value: Double | js.Array[Double]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSelectionVarargs(value: Double*): Self = StObject.set(x, "selection", js.Array(value*))
      
      inline def setSkipColumn(value: js.Array[Double]): Self = StObject.set(x, "skipColumn", value.asInstanceOf[js.Any])
      
      inline def setSkipColumnUndefined: Self = StObject.set(x, "skipColumn", js.undefined)
      
      inline def setSkipColumnVarargs(value: Double*): Self = StObject.set(x, "skipColumn", js.Array(value*))
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setType(value: csv | txt | json | sql): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataTableImportOptions extends StObject {
    
    var columnDelimiter: js.UndefOr[String] = js.undefined
    
    var data: String
    
    // csv only
    var headings: js.UndefOr[Boolean] = js.undefined
    
    var lineDelimiter: js.UndefOr[String] = js.undefined
    
    var `type`: csv | json
  }
  object DataTableImportOptions {
    
    inline def apply(data: String, `type`: csv | json): DataTableImportOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableImportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableImportOptions] (val x: Self) extends AnyVal {
      
      inline def setColumnDelimiter(value: String): Self = StObject.set(x, "columnDelimiter", value.asInstanceOf[js.Any])
      
      inline def setColumnDelimiterUndefined: Self = StObject.set(x, "columnDelimiter", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeadings(value: Boolean): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
      
      inline def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
      
      inline def setLineDelimiter(value: String): Self = StObject.set(x, "lineDelimiter", value.asInstanceOf[js.Any])
      
      inline def setLineDelimiterUndefined: Self = StObject.set(x, "lineDelimiter", js.undefined)
      
      inline def setType(value: csv | json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataTableLabels extends StObject {
    
    var info: js.UndefOr[String] = js.undefined
    
    var noRows: js.UndefOr[String] = js.undefined
    
    var perPage: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object DataTableLabels {
    
    inline def apply(): DataTableLabels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableLabels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableLabels] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setNoRows(value: String): Self = StObject.set(x, "noRows", value.asInstanceOf[js.Any])
      
      inline def setNoRowsUndefined: Self = StObject.set(x, "noRows", js.undefined)
      
      inline def setPerPage(value: String): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait DataTableLayout extends StObject {
    
    var bottom: js.UndefOr[String] = js.undefined
    
    var top: js.UndefOr[String] = js.undefined
  }
  object DataTableLayout {
    
    inline def apply(): DataTableLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableLayout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableLayout] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait DataTableOptions extends StObject {
    
    var columns: js.UndefOr[js.Array[DataTableColumnOptions]] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    // TODO: define data
    var firstLast: js.UndefOr[Boolean] = js.undefined
    
    var firstText: js.UndefOr[String] = js.undefined
    
    var fixedColumns: js.UndefOr[Boolean] = js.undefined
    
    var fixedHeight: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[Boolean] = js.undefined
    
    var hiddenHeader: js.UndefOr[Boolean] = js.undefined
    
    var labels: js.UndefOr[DataTableLabels] = js.undefined
    
    var lastText: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[DataTableLayout] = js.undefined
    
    var nextPrev: js.UndefOr[Boolean] = js.undefined
    
    var nextText: js.UndefOr[String] = js.undefined
    
    var paging: js.UndefOr[Boolean] = js.undefined
    
    var perPage: js.UndefOr[Double] = js.undefined
    
    var perPageSelect: js.UndefOr[js.Array[Double]] = js.undefined
    
    var prevText: js.UndefOr[String] = js.undefined
    
    var scrollY: js.UndefOr[String] = js.undefined
    
    var searchable: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var truncatePager: js.UndefOr[Boolean] = js.undefined
  }
  object DataTableOptions {
    
    inline def apply(): DataTableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableOptions] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[DataTableColumnOptions]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: DataTableColumnOptions*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFirstLast(value: Boolean): Self = StObject.set(x, "firstLast", value.asInstanceOf[js.Any])
      
      inline def setFirstLastUndefined: Self = StObject.set(x, "firstLast", js.undefined)
      
      inline def setFirstText(value: String): Self = StObject.set(x, "firstText", value.asInstanceOf[js.Any])
      
      inline def setFirstTextUndefined: Self = StObject.set(x, "firstText", js.undefined)
      
      inline def setFixedColumns(value: Boolean): Self = StObject.set(x, "fixedColumns", value.asInstanceOf[js.Any])
      
      inline def setFixedColumnsUndefined: Self = StObject.set(x, "fixedColumns", js.undefined)
      
      inline def setFixedHeight(value: Boolean): Self = StObject.set(x, "fixedHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedHeightUndefined: Self = StObject.set(x, "fixedHeight", js.undefined)
      
      inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHiddenHeader(value: Boolean): Self = StObject.set(x, "hiddenHeader", value.asInstanceOf[js.Any])
      
      inline def setHiddenHeaderUndefined: Self = StObject.set(x, "hiddenHeader", js.undefined)
      
      inline def setLabels(value: DataTableLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLastText(value: String): Self = StObject.set(x, "lastText", value.asInstanceOf[js.Any])
      
      inline def setLastTextUndefined: Self = StObject.set(x, "lastText", js.undefined)
      
      inline def setLayout(value: DataTableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setNextPrev(value: Boolean): Self = StObject.set(x, "nextPrev", value.asInstanceOf[js.Any])
      
      inline def setNextPrevUndefined: Self = StObject.set(x, "nextPrev", js.undefined)
      
      inline def setNextText(value: String): Self = StObject.set(x, "nextText", value.asInstanceOf[js.Any])
      
      inline def setNextTextUndefined: Self = StObject.set(x, "nextText", js.undefined)
      
      inline def setPaging(value: Boolean): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
      
      inline def setPerPageSelect(value: js.Array[Double]): Self = StObject.set(x, "perPageSelect", value.asInstanceOf[js.Any])
      
      inline def setPerPageSelectUndefined: Self = StObject.set(x, "perPageSelect", js.undefined)
      
      inline def setPerPageSelectVarargs(value: Double*): Self = StObject.set(x, "perPageSelect", js.Array(value*))
      
      inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
      
      inline def setPrevText(value: String): Self = StObject.set(x, "prevText", value.asInstanceOf[js.Any])
      
      inline def setPrevTextUndefined: Self = StObject.set(x, "prevText", js.undefined)
      
      inline def setScrollY(value: String): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
      
      inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setTruncatePager(value: Boolean): Self = StObject.set(x, "truncatePager", value.asInstanceOf[js.Any])
      
      inline def setTruncatePagerUndefined: Self = StObject.set(x, "truncatePager", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simpleDatatables.simpleDatatablesStrings.asc
    - typings.simpleDatatables.simpleDatatablesStrings.desc
  */
  trait DataTableOrderDirection extends StObject
  object DataTableOrderDirection {
    
    inline def asc: typings.simpleDatatables.simpleDatatablesStrings.asc = "asc".asInstanceOf[typings.simpleDatatables.simpleDatatablesStrings.asc]
    
    inline def desc: typings.simpleDatatables.simpleDatatablesStrings.desc = "desc".asInstanceOf[typings.simpleDatatables.simpleDatatablesStrings.desc]
  }
}
