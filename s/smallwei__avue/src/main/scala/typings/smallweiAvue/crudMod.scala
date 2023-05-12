package typings.smallweiAvue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.smallweiAvue.anon.Colspan
import typings.smallweiAvue.anon.Column
import typings.smallweiAvue.anon.ColumnAvueCrudColumn
import typings.smallweiAvue.anon.ColumnColumnIndex
import typings.smallweiAvue.anon.Data
import typings.smallweiAvue.anon.Dic
import typings.smallweiAvue.anon.Disabled
import typings.smallweiAvue.anon.Index
import typings.smallweiAvue.anon.Label
import typings.smallweiAvue.anon.Order
import typings.smallweiAvue.anon.Props
import typings.smallweiAvue.anon.Readonly
import typings.smallweiAvue.anon.Row
import typings.smallweiAvue.anon.RowIndex
import typings.smallweiAvue.anon.Search
import typings.smallweiAvue.anon.SizeSize
import typings.smallweiAvue.anon.Text
import typings.smallweiAvue.formMod.AvueFormColumn
import typings.smallweiAvue.formMod.AvueFormGroup
import typings.smallweiAvue.formMod.AvueFormOption
import typings.smallweiAvue.smallweiAvueStrings.ascsending
import typings.smallweiAvue.smallweiAvueStrings.btt
import typings.smallweiAvue.smallweiAvueStrings.custom
import typings.smallweiAvue.smallweiAvueStrings.descending
import typings.smallweiAvue.smallweiAvueStrings.dialog
import typings.smallweiAvue.smallweiAvueStrings.drawer
import typings.smallweiAvue.smallweiAvueStrings.left
import typings.smallweiAvue.smallweiAvueStrings.ltr
import typings.smallweiAvue.smallweiAvueStrings.right
import typings.smallweiAvue.smallweiAvueStrings.rtl
import typings.smallweiAvue.smallweiAvueStrings.ttb
import typings.std.Event
import typings.std.File
import typings.std.InstanceType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crudMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue/crud", "AvueCrud")
  @js.native
  open class AvueCrud ()
    extends StObject
       with Props {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueCrudProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueCrudSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue/crud", "AvueCrud")
  @js.native
  val AvueCrud: Instantiable0[Props] = js.native
  
  trait AvueCrudColumn[T]
    extends StObject
       with AvueFormColumn[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
        ] {
    
    /** 表单新增时是否为查看模式 */
    var addDetail: js.UndefOr[Boolean] = js.undefined
    
    /** 表单新增时是否禁止 */
    var addDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** 表单新增时是否可见 */
    var addDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** 表格内容对齐方式 */
    var align: js.UndefOr[Align] = js.undefined
    
    /** 开启行编辑模式 */
    var cell: js.UndefOr[Boolean] = js.undefined
    
    /** 表格打开表单的时候是否重新拉取字典 */
    var dicFlag: js.UndefOr[Boolean] = js.undefined
    
    /** 表单编辑时是否为查看模式 */
    var editDetail: js.UndefOr[Boolean] = js.undefined
    
    /** 表单编辑时是否禁止 */
    var editDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** 表单编辑时是否可见 */
    var editDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** 是否在动态搜索条件里面显示 */
    var filter: js.UndefOr[Boolean] = js.undefined
    
    /** 数据过滤使用的方法，如果是多选的筛选项，对每一条数据会执行多次，任意一次返回true就会显示 */
    var filterMethod: js.UndefOr[
        js.Function3[/* value */ Any, /* row */ T, /* column */ js.Array[AvueCrudColumn[T]], Boolean]
      ] = js.undefined
    
    /** 数据过滤的选项是否多选 */
    var filterMultiple: js.UndefOr[Boolean] = js.undefined
    
    /** 传入true开启默认数据过滤的选项，也可以传入自定义数组格式，数组中的元素需要有text和value属性 */
    var filters: js.UndefOr[Boolean | js.Array[Text]] = js.undefined
    
    /** 列是否固定在左侧或者右侧，true 表示固定在左侧 */
    var fixed: js.UndefOr[Boolean | left | right] = js.undefined
    
    /** 用来格式化内容 */
    var formatter: js.UndefOr[
        js.Function4[
          /* row */ T, 
          /* value */ Any, 
          /* label */ String, 
          /* column */ js.Array[AvueCrudColumn[T]], 
          String
        ]
      ] = js.undefined
    
    /** 表头对齐方式 */
    var headerAlign: js.UndefOr[Align] = js.undefined
    
    /** 隐藏列 */
    var hide: js.UndefOr[Boolean] = js.undefined
    
    /** 开启html转义 */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /** 对应列的最小宽度，与 width 的区别是 width 是固定的，minWidth 会把剩余宽度按比例分配给设置了 minWidth 的列 */
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    /** 当内容过长被隐藏时显示 tooltip */
    var overHidden: js.UndefOr[Boolean] = js.undefined
    
    /** 是否搜索 */
    var search: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索框的清除按钮 */
    var searchClearable: js.UndefOr[Boolean] = js.undefined
    
    /** 数据过滤使用的方法，如果是多选的筛选项，对每一条数据会执行多次，任意一次返回true就会显示。 */
    var searchFilterMethod: js.UndefOr[
        js.Function3[/* value */ Any, /* row */ T, /* column */ js.Array[AvueCrudColumn[T]], Boolean]
      ] = js.undefined
    
    /** 是否可以输入搜索。 */
    var searchFilterable: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索框的间距 */
    var searchGutter: js.UndefOr[Double] = js.undefined
    
    /** 搜索项标题位置 */
    var searchLabelPosition: js.UndefOr[LabelPosition] = js.undefined
    
    /** 搜索框的标题宽度 */
    var searchLabelWidth: js.UndefOr[Double | String] = js.undefined
    
    /** 搜索表单的是否多选 */
    var searchMultiple: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索字段位置排序(序号越大越靠前) */
    var searchOrder: js.UndefOr[Double] = js.undefined
    
    /** 搜索框辅助文字 */
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    /** 范围搜索 */
    var searchRange: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索框大小 */
    var searchSize: js.UndefOr[String] = js.undefined
    
    /** 搜索框栅列 */
    var searchSpan: js.UndefOr[Double] = js.undefined
    
    /** 多选时是否将选中值按文字的形式展示 */
    var searchTags: js.UndefOr[Boolean] = js.undefined
    
    /** 弹窗编辑文字提示 */
    var searchTip: js.UndefOr[String] = js.undefined
    
    /** 搜索框辅助文字提示展示方向 */
    var searchTipPlacement: js.UndefOr[String] = js.undefined
    
    /** 搜索框类型 */
    var searchType: js.UndefOr[String] = js.undefined
    
    /** 搜索表单的默认值 */
    var searchValue: js.UndefOr[Any] = js.undefined
    
    /** 是否加入动态现隐列 */
    var showColumn: js.UndefOr[Boolean] = js.undefined
    
    /** 对应列是否可以排序，如果设置为 'custom'，则代表用户希望远程排序，需要监听 Table 的 sort-change 事件 */
    var sortable: js.UndefOr[Boolean | custom] = js.undefined
    
    /** 表单查看时是否禁止 */
    var viewDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** viewDisplay */
    var viewDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** 对应列的宽度 */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object AvueCrudColumn {
    
    inline def apply[T](): AvueCrudColumn[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueCrudColumn[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueCrudColumn[?], T] (val x: Self & AvueCrudColumn[T]) extends AnyVal {
      
      inline def setAddDetail(value: Boolean): Self = StObject.set(x, "addDetail", value.asInstanceOf[js.Any])
      
      inline def setAddDetailUndefined: Self = StObject.set(x, "addDetail", js.undefined)
      
      inline def setAddDisabled(value: Boolean): Self = StObject.set(x, "addDisabled", value.asInstanceOf[js.Any])
      
      inline def setAddDisabledUndefined: Self = StObject.set(x, "addDisabled", js.undefined)
      
      inline def setAddDisplay(value: Boolean): Self = StObject.set(x, "addDisplay", value.asInstanceOf[js.Any])
      
      inline def setAddDisplayUndefined: Self = StObject.set(x, "addDisplay", js.undefined)
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setCell(value: Boolean): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setDicFlag(value: Boolean): Self = StObject.set(x, "dicFlag", value.asInstanceOf[js.Any])
      
      inline def setDicFlagUndefined: Self = StObject.set(x, "dicFlag", js.undefined)
      
      inline def setEditDetail(value: Boolean): Self = StObject.set(x, "editDetail", value.asInstanceOf[js.Any])
      
      inline def setEditDetailUndefined: Self = StObject.set(x, "editDetail", js.undefined)
      
      inline def setEditDisabled(value: Boolean): Self = StObject.set(x, "editDisabled", value.asInstanceOf[js.Any])
      
      inline def setEditDisabledUndefined: Self = StObject.set(x, "editDisabled", js.undefined)
      
      inline def setEditDisplay(value: Boolean): Self = StObject.set(x, "editDisplay", value.asInstanceOf[js.Any])
      
      inline def setEditDisplayUndefined: Self = StObject.set(x, "editDisplay", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterMethod(value: (/* value */ Any, /* row */ T, /* column */ js.Array[AvueCrudColumn[T]]) => Boolean): Self = StObject.set(x, "filterMethod", js.Any.fromFunction3(value))
      
      inline def setFilterMethodUndefined: Self = StObject.set(x, "filterMethod", js.undefined)
      
      inline def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      inline def setFilterMultipleUndefined: Self = StObject.set(x, "filterMultiple", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilters(value: Boolean | js.Array[Text]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Text*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFixed(value: Boolean | left | right): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFormatter(
        value: (/* row */ T, /* value */ Any, /* label */ String, /* column */ js.Array[AvueCrudColumn[T]]) => String
      ): Self = StObject.set(x, "formatter", js.Any.fromFunction4(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHeaderAlign(value: Align): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignUndefined: Self = StObject.set(x, "headerAlign", js.undefined)
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOverHidden(value: Boolean): Self = StObject.set(x, "overHidden", value.asInstanceOf[js.Any])
      
      inline def setOverHiddenUndefined: Self = StObject.set(x, "overHidden", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchClearable(value: Boolean): Self = StObject.set(x, "searchClearable", value.asInstanceOf[js.Any])
      
      inline def setSearchClearableUndefined: Self = StObject.set(x, "searchClearable", js.undefined)
      
      inline def setSearchFilterMethod(value: (/* value */ Any, /* row */ T, /* column */ js.Array[AvueCrudColumn[T]]) => Boolean): Self = StObject.set(x, "searchFilterMethod", js.Any.fromFunction3(value))
      
      inline def setSearchFilterMethodUndefined: Self = StObject.set(x, "searchFilterMethod", js.undefined)
      
      inline def setSearchFilterable(value: Boolean): Self = StObject.set(x, "searchFilterable", value.asInstanceOf[js.Any])
      
      inline def setSearchFilterableUndefined: Self = StObject.set(x, "searchFilterable", js.undefined)
      
      inline def setSearchGutter(value: Double): Self = StObject.set(x, "searchGutter", value.asInstanceOf[js.Any])
      
      inline def setSearchGutterUndefined: Self = StObject.set(x, "searchGutter", js.undefined)
      
      inline def setSearchLabelPosition(value: LabelPosition): Self = StObject.set(x, "searchLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelPositionUndefined: Self = StObject.set(x, "searchLabelPosition", js.undefined)
      
      inline def setSearchLabelWidth(value: Double | String): Self = StObject.set(x, "searchLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelWidthUndefined: Self = StObject.set(x, "searchLabelWidth", js.undefined)
      
      inline def setSearchMultiple(value: Boolean): Self = StObject.set(x, "searchMultiple", value.asInstanceOf[js.Any])
      
      inline def setSearchMultipleUndefined: Self = StObject.set(x, "searchMultiple", js.undefined)
      
      inline def setSearchOrder(value: Double): Self = StObject.set(x, "searchOrder", value.asInstanceOf[js.Any])
      
      inline def setSearchOrderUndefined: Self = StObject.set(x, "searchOrder", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSearchRange(value: Boolean): Self = StObject.set(x, "searchRange", value.asInstanceOf[js.Any])
      
      inline def setSearchRangeUndefined: Self = StObject.set(x, "searchRange", js.undefined)
      
      inline def setSearchSize(value: String): Self = StObject.set(x, "searchSize", value.asInstanceOf[js.Any])
      
      inline def setSearchSizeUndefined: Self = StObject.set(x, "searchSize", js.undefined)
      
      inline def setSearchSpan(value: Double): Self = StObject.set(x, "searchSpan", value.asInstanceOf[js.Any])
      
      inline def setSearchSpanUndefined: Self = StObject.set(x, "searchSpan", js.undefined)
      
      inline def setSearchTags(value: Boolean): Self = StObject.set(x, "searchTags", value.asInstanceOf[js.Any])
      
      inline def setSearchTagsUndefined: Self = StObject.set(x, "searchTags", js.undefined)
      
      inline def setSearchTip(value: String): Self = StObject.set(x, "searchTip", value.asInstanceOf[js.Any])
      
      inline def setSearchTipPlacement(value: String): Self = StObject.set(x, "searchTipPlacement", value.asInstanceOf[js.Any])
      
      inline def setSearchTipPlacementUndefined: Self = StObject.set(x, "searchTipPlacement", js.undefined)
      
      inline def setSearchTipUndefined: Self = StObject.set(x, "searchTip", js.undefined)
      
      inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
      
      inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSearchValue(value: Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      inline def setShowColumn(value: Boolean): Self = StObject.set(x, "showColumn", value.asInstanceOf[js.Any])
      
      inline def setShowColumnUndefined: Self = StObject.set(x, "showColumn", js.undefined)
      
      inline def setSortable(value: Boolean | custom): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setViewDisabled(value: Boolean): Self = StObject.set(x, "viewDisabled", value.asInstanceOf[js.Any])
      
      inline def setViewDisabledUndefined: Self = StObject.set(x, "viewDisabled", js.undefined)
      
      inline def setViewDisplay(value: Boolean): Self = StObject.set(x, "viewDisplay", value.asInstanceOf[js.Any])
      
      inline def setViewDisplayUndefined: Self = StObject.set(x, "viewDisplay", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type AvueCrudDefaults = Record[String, AvueCrudColumn[Any]]
  
  trait AvueCrudGroup[T]
    extends StObject
       with AvueFormGroup[T] {
    
    /** 表单新增时是否禁止 */
    var addDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** 表单新增时是否可见 */
    var addDisplay: js.UndefOr[Boolean] = js.undefined
    
    @JSName("column")
    var column_AvueCrudGroup: js.UndefOr[js.Array[AvueCrudColumn[T]]] = js.undefined
    
    /** 表单编辑时是否禁止 */
    var editDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** 表单编辑时是否可见 */
    var editDisplay: js.UndefOr[Boolean] = js.undefined
    
    /** 表单查看时是否禁止 */
    var viewDisabled: js.UndefOr[Boolean] = js.undefined
    
    /** viewDisplay */
    var viewDisplay: js.UndefOr[Boolean] = js.undefined
  }
  object AvueCrudGroup {
    
    inline def apply[T](): AvueCrudGroup[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueCrudGroup[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueCrudGroup[?], T] (val x: Self & AvueCrudGroup[T]) extends AnyVal {
      
      inline def setAddDisabled(value: Boolean): Self = StObject.set(x, "addDisabled", value.asInstanceOf[js.Any])
      
      inline def setAddDisabledUndefined: Self = StObject.set(x, "addDisabled", js.undefined)
      
      inline def setAddDisplay(value: Boolean): Self = StObject.set(x, "addDisplay", value.asInstanceOf[js.Any])
      
      inline def setAddDisplayUndefined: Self = StObject.set(x, "addDisplay", js.undefined)
      
      inline def setColumn(value: js.Array[AvueCrudColumn[T]]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumnVarargs(value: AvueCrudColumn[T]*): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setEditDisabled(value: Boolean): Self = StObject.set(x, "editDisabled", value.asInstanceOf[js.Any])
      
      inline def setEditDisabledUndefined: Self = StObject.set(x, "editDisabled", js.undefined)
      
      inline def setEditDisplay(value: Boolean): Self = StObject.set(x, "editDisplay", value.asInstanceOf[js.Any])
      
      inline def setEditDisplayUndefined: Self = StObject.set(x, "editDisplay", js.undefined)
      
      inline def setViewDisabled(value: Boolean): Self = StObject.set(x, "viewDisabled", value.asInstanceOf[js.Any])
      
      inline def setViewDisabledUndefined: Self = StObject.set(x, "viewDisabled", js.undefined)
      
      inline def setViewDisplay(value: Boolean): Self = StObject.set(x, "viewDisplay", value.asInstanceOf[js.Any])
      
      inline def setViewDisplayUndefined: Self = StObject.set(x, "viewDisplay", js.undefined)
    }
  }
  
  type AvueCrudInstance = InstanceType[Instantiable0[Props]] & AvueCrudMethods[Any]
  
  @js.native
  trait AvueCrudMethods[T] extends StObject {
    
    /** 不传入参数时用于清空所有过滤条件，数据会恢复成未过滤的状态，也可传入由columnKey组成的数组以清除指定列的过滤条件 */
    def clearFilter(): Unit = js.native
    def clearFilter(columnKeys: js.Array[String]): Unit = js.native
    
    /** 用于多选表格，清空用户的选择 */
    def clearSelection(): Unit = js.native
    
    /** 用于清空排序条件，数据会恢复成未排序的状态 */
    def clearSort(): Unit = js.native
    
    /** 移除表单项的校验结果。传入待移除的表单项的 prop 属性或者 prop 组成的数组，如不传则移除整个表单的校验结果 */
    def clearValidate(): Unit = js.native
    
    /** 重新初始化字典 */
    def dicInit(): Unit = js.native
    
    /** 对Crud进行重新布局。当 Table 或其祖先元素由隐藏切换为显示时，可能需要调用此方法 */
    def doLayout(): Unit = js.native
    
    /** 获取prop的ref对象 */
    def getPropRef(props: String): Unit = js.native
    
    /** 重新初始化 */
    def init(): Unit = js.native
    
    /** 进行重新初始化渲染 */
    def refreshTable(): Unit = js.native
    
    /** 对整个表单进行重置，将所有字段值重置为初始值并移除校验结果 */
    def resetFields(): Unit = js.native
    
    /** 打开表单新增窗口 */
    def rowAdd(): Unit = js.native
    
    /** 行编辑 */
    def rowCell(row: T): Unit = js.native
    def rowCell(row: T, index: Double): Unit = js.native
    
    /** 行新增 */
    def rowCellAdd(row: T): Unit = js.native
    
    /** 行删除 */
    def rowDel(row: T): Unit = js.native
    def rowDel(row: T, index: Double): Unit = js.native
    
    /** 打开表单编辑窗口 */
    def rowEdit(row: T): Unit = js.native
    def rowEdit(row: T, index: Double): Unit = js.native
    
    /** 导出表格 */
    def rowExcel(): Unit = js.native
    
    /** 打印表格 */
    def rowPrint(): Unit = js.native
    
    /** 表单保存调用 */
    def rowSave(row: T): Unit = js.native
    
    /** 表单更新调用 */
    def rowUpdate(row: T): Unit = js.native
    
    /** 打开表单查看窗口 */
    def rowView(row: T): Unit = js.native
    def rowView(row: T, index: Double): Unit = js.native
    
    /** 清空搜索栏目的值 */
    def searchReset(): Unit = js.native
    
    /** 用于多选表格，清空用户的选择 */
    def selectClear(): Unit = js.native
    
    /** 用于单选表格，设定某一行为选中行，如果调用时不加参数，则会取消目前高亮行的选中状态 */
    def setCurrentRow(): Unit = js.native
    def setCurrentRow(row: T): Unit = js.native
    
    /** 手动对 Table 进行排序。参数prop属性指定排序列，order指定排序顺序 */
    def sort(prop: String, order: ascsending | descending): Unit = js.native
    
    /** 用于多选表格，切换所有行的选中状态 */
    def toggleAllSelection(): Unit = js.native
    
    /** 用于可展开表格与树形表格，切换某一行的展开状态，如果使用了第二个参数，则是设置这一行展开与否（expanded 为 true 则展开） */
    def toggleRowExpansion(): Unit = js.native
    def toggleRowExpansion(row: T): Unit = js.native
    def toggleRowExpansion(row: T, expanded: Boolean): Unit = js.native
    def toggleRowExpansion(row: Unit, expanded: Boolean): Unit = js.native
    
    /** 用于多选表格，切换某一行的选中状态，如果使用了第二个参数，则可直接设置这一行选中与否 */
    def toggleRowSelection(): Unit = js.native
    def toggleRowSelection(rows: T): Unit = js.native
    def toggleRowSelection(rows: T, selected: Boolean): Unit = js.native
    def toggleRowSelection(rows: Unit, selected: Boolean): Unit = js.native
    
    /** 用于多选表格，切换某些行的选中状态，如果使用了第二个参数，则是设置这一行选中与否（selected 为 true 则选中） */
    def toggleSelection(): Unit = js.native
    def toggleSelection(rows: js.Array[T]): Unit = js.native
    def toggleSelection(rows: js.Array[T], selected: Boolean): Unit = js.native
    def toggleSelection(rows: Unit, selected: Boolean): Unit = js.native
    
    /** 更新字典 */
    def updateDic(prop: String): Unit = js.native
    
    /** 对整个表单进行校验的方法，参数为一个回调函数。该回调函数会在校验结束后被调用，并传入两个参数：是否校验成功和未通过校验的字段。若不传入回调函数，则会返回一个 promise */
    def validate(): js.Promise[Boolean] = js.native
    def validate(callback: js.Function3[/* valid */ Boolean, /* done */ js.Function0[Unit], /* msg */ String, Unit]): js.Promise[Boolean] = js.native
    
    /** 对部分表单字段进行校验的方法 */
    def validateField(props: js.Array[String]): Unit = js.native
  }
  
  trait AvueCrudOption[T]
    extends StObject
       with AvueFormOption[T] {
    
    /** 新增按钮 */
    var addBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 新增按钮图标 */
    var addBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 新增按钮文案 */
    var addBtnText: js.UndefOr[String] = js.undefined
    
    /** 表格行编辑时添加按钮 */
    var addRowBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 新增窗口标题 */
    var addTitle: js.UndefOr[String] = js.undefined
    
    /** 表格列齐方式 */
    var align: js.UndefOr[Align] = js.undefined
    
    /** 表格边框 */
    var border: js.UndefOr[Boolean] = js.undefined
    
    /** 表格的高度，默认为自动高度。如果设置为auto，会自适应窗口高度，配合calcHeight参数去调节范围 */
    var calcHeight: js.UndefOr[Double | String] = js.undefined
    
    /** 取消按钮 */
    var cancelBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 取消按钮图标 */
    var cancelBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 取消按钮文案 */
    var cancelBtnText: js.UndefOr[String] = js.undefined
    
    /** 表格以卡片分层模式显示，搜索部分和主体部分分层展示 */
    var card: js.UndefOr[Boolean] = js.undefined
    
    /** 表格行编辑操作按钮 */
    var cellBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 列操作按钮 */
    var columnBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 列拖拽排序 */
    var columnSort: js.UndefOr[Boolean] = js.undefined
    
    /** 表格列配置属性 */
    @JSName("column")
    var column_AvueCrudOption: js.UndefOr[js.Array[AvueCrudColumn[T]]] = js.undefined
    
    /** 行数据复制按钮 */
    var copyBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 日期组件按钮 */
    var dateBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 是否默认展开所有行，"expand"为true的时候有效 */
    var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    /** 表格的排序字段{prop:'date',order:'descending'}prop默认排序字段，order排序方式 */
    var defaultSort: js.UndefOr[Order] = js.undefined
    
    /** 删除按钮 */
    var delBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 删除按钮图标 */
    var delBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 删除按钮文案 */
    var delBtnText: js.UndefOr[String] = js.undefined
    
    /** 表格弹窗是否可以通过点击modal关闭 */
    var dialogClickModal: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗是否显示关闭按钮 */
    var dialogCloseBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗自定义class */
    var dialogCustomClass: js.UndefOr[String] = js.undefined
    
    /** 表格抽屉打开方向 */
    var dialogDirection: js.UndefOr[rtl | ltr | ttb | btt] = js.undefined
    
    /** 表格弹窗是否可以拖拽 */
    var dialogDrag: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗是否可以通过按下ESC关闭 */
    var dialogEscape: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗是否为全屏 */
    var dialogFullscreen: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗高度 */
    var dialogHeight: js.UndefOr[String | Double] = js.undefined
    
    /** 表格弹窗框按钮的位置 */
    var dialogMenuPosition: js.UndefOr[MenuPosition] = js.undefined
    
    /** 表格弹窗是否需要遮罩层 */
    var dialogModal: js.UndefOr[Boolean] = js.undefined
    
    /** 表格弹窗顶部的距离 */
    var dialogTop: js.UndefOr[String | Double] = js.undefined
    
    /** 表格弹窗方式 */
    var dialogType: js.UndefOr[dialog | drawer] = js.undefined
    
    /** 表格弹窗宽度 */
    var dialogWidth: js.UndefOr[String | Double] = js.undefined
    
    /** 编辑按钮 */
    var editBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 编辑按钮图标 */
    var editBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 编辑按钮文案 */
    var editBtnText: js.UndefOr[String] = js.undefined
    
    /** 编辑窗口标题 */
    var editTitle: js.UndefOr[String] = js.undefined
    
    /** 清空按钮图标 */
    var emptyBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 清空按钮文案 */
    var emptyBtnText: js.UndefOr[String] = js.undefined
    
    /** 导出按钮 */
    var excelBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 展开折叠行 */
    var expand: js.UndefOr[Boolean] = js.undefined
    
    /** 展开列是否行冻结 */
    var expandFixed: js.UndefOr[Boolean] = js.undefined
    
    /** 可以通过该属性设置目前的展开行，需要设置rowKey属性才能使用，该属性为展开行的keys数组。 */
    var expandRowKeys: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** 展开折叠行宽度 */
    var expandWidth: js.UndefOr[Double] = js.undefined
    
    /** 自定义过滤按钮 */
    var filterBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 是列的宽度是否自撑开属性 */
    var fit: js.UndefOr[Boolean] = js.undefined
    
    /** 分组表单,放入正常的column配置就行 */
    @JSName("group")
    var group_AvueCrudOption: js.UndefOr[js.Array[AvueCrudGroup[T]]] = js.undefined
    
    /** 表格头部中间菜单显隐 */
    var header: js.UndefOr[Boolean] = js.undefined
    
    /** 表头对齐方式 */
    var headerAlign: js.UndefOr[Align] = js.undefined
    
    /** 表格的高度，默认为自动高度。如果设置为auto，会自适应窗口高度，配合calcHeight参数去调节范围 */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** 是否要高亮当前行 */
    var highlightCurrentRow: js.UndefOr[Boolean] = js.undefined
    
    /** 只负责样式控制表格如果选择一半，不会出现半选 */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** 是否显示表格序号 */
    var index: js.UndefOr[Boolean] = js.undefined
    
    /** 序号列是否冻结 */
    var indexFixed: js.UndefOr[Boolean] = js.undefined
    
    /** 序号列标题名称 */
    var indexLabel: js.UndefOr[String] = js.undefined
    
    /** 序号列宽度 */
    var indexWidth: js.UndefOr[Double] = js.undefined
    
    /** 是否懒加载子节点数据,会调用tree-load方法回调 */
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    /** 表格的最大高度 */
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    /** 是否显示操作栏 */
    var menu: js.UndefOr[Boolean] = js.undefined
    
    /** 操作栏按钮的对齐方式 */
    var menuAlign: js.UndefOr[Align] = js.undefined
    
    /** 菜单按钮的文字信息 */
    var menuBtnTitle: js.UndefOr[String] = js.undefined
    
    /** 操作列是否冻结 */
    var menuFixed: js.UndefOr[Boolean] = js.undefined
    
    /** 操作栏表头的对齐方式 */
    var menuHeaderAlign: js.UndefOr[Align] = js.undefined
    
    /** 操作栏标题 */
    var menuTitle: js.UndefOr[String] = js.undefined
    
    /** 操作菜单的按钮样式 */
    var menuType: js.UndefOr[MenuType] = js.undefined
    
    /** 操作菜单栏的宽度 */
    var menuWidth: js.UndefOr[Double] = js.undefined
    
    /** 打印按钮 */
    var printBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 刷新数据按钮 */
    var refreshBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 仅对 selection为true 的列有效，类型为 Boolean，为 true 则会在数据更新之后保留之前选中的数据（需指定 rowKey） */
    var reserveSelection: js.UndefOr[Boolean] = js.undefined
    
    /** 行数据的Key的主键，用于其他相关操作 */
    var rowKey: js.UndefOr[String] = js.undefined
    
    /** 行数据的 Key，的父类Key用于局部刷新树形表格。 */
    var rowParentKey: js.UndefOr[String] = js.undefined
    
    /** 行拖拽排序 */
    var rowSort: js.UndefOr[Boolean] = js.undefined
    
    /** 保存按钮 */
    var saveBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 保存按钮图标 */
    var saveBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 保存按钮文案 */
    var saveBtnText: js.UndefOr[String] = js.undefined
    
    /** 搜索显隐按钮 */
    var searchBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索按钮图标 */
    var searchBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 搜索按钮文案 */
    var searchBtnText: js.UndefOr[String] = js.undefined
    
    /** 首次加载是否显示搜索 */
    var searchEnter: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索框的间距 */
    var searchGutter: js.UndefOr[Double] = js.undefined
    
    /** 是否展示半收缩按钮 */
    var searchIcon: js.UndefOr[Boolean] = js.undefined
    
    /** 展示半收缩按钮的触发条件个数 */
    var searchIndex: js.UndefOr[Double] = js.undefined
    
    /** 搜索项标题位置 */
    var searchLabelPosition: js.UndefOr[LabelPosition] = js.undefined
    
    /** 搜索框的标题宽度 */
    var searchLabelWidth: js.UndefOr[Double | String] = js.undefined
    
    /** 搜索操作按钮的位置 */
    var searchMenuPosition: js.UndefOr[MenuPosition] = js.undefined
    
    /** 搜索操作按钮栅格占据的列数 */
    var searchMenuSpan: js.UndefOr[Double] = js.undefined
    
    /** 搜索框辅助文字 */
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    /** 首次加载是否显示搜索 */
    var searchShow: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索显隐按钮 */
    var searchShowBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 搜索框整体布局大小 */
    var searchSize: js.UndefOr[Size] = js.undefined
    
    /** 搜索项栅格占据的列数 */
    var searchSpan: js.UndefOr[Double] = js.undefined
    
    /** 清空选中按钮（当selection为true起作用） */
    var selectClearBtn: js.UndefOr[Boolean] = js.undefined
    
    /** selection为true 的列有效，类型为 Function，Function 的返回值用来决定这一行的 CheckBox 是否可以勾选 */
    var selectable: js.UndefOr[js.Function1[/* row */ T, Boolean]] = js.undefined
    
    /** 表格勾选列 */
    var selection: js.UndefOr[Boolean] = js.undefined
    
    /** 表格勾选列 */
    var selectionFixed: js.UndefOr[Boolean] = js.undefined
    
    /** 表格勾选列的宽度 */
    var selectionWidth: js.UndefOr[Double] = js.undefined
    
    /** 是否显示表格的表头 */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** 是否在表尾显示合计行 */
    var showSummary: js.UndefOr[Boolean] = js.undefined
    
    /** 拖拽排序 */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /** 是否为斑马纹 */
    var stripe: js.UndefOr[Boolean] = js.undefined
    
    /** 表格合计需要配置的字段 */
    var sumColumnList: js.UndefOr[js.Array[String]] = js.undefined
    
    /** 表格标题 */
    var title: js.UndefOr[String] = js.undefined
    
    /** 修改按钮 */
    var updateBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 修改按钮图标 */
    var updateBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 修改按钮文案 */
    var updateBtnText: js.UndefOr[String] = js.undefined
    
    /** 弹出框更新按钮标题 */
    var updateBtnTitle: js.UndefOr[String] = js.undefined
    
    /** 查看按钮 */
    var viewBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 查看按钮图标 */
    var viewBtnIcon: js.UndefOr[String] = js.undefined
    
    /** 查看按钮文案 */
    var viewBtnText: js.UndefOr[String] = js.undefined
    
    /** 查看窗口标题 */
    var viewTitle: js.UndefOr[String] = js.undefined
  }
  object AvueCrudOption {
    
    inline def apply[T](): AvueCrudOption[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueCrudOption[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueCrudOption[?], T] (val x: Self & AvueCrudOption[T]) extends AnyVal {
      
      inline def setAddBtn(value: Boolean): Self = StObject.set(x, "addBtn", value.asInstanceOf[js.Any])
      
      inline def setAddBtnIcon(value: String): Self = StObject.set(x, "addBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setAddBtnIconUndefined: Self = StObject.set(x, "addBtnIcon", js.undefined)
      
      inline def setAddBtnText(value: String): Self = StObject.set(x, "addBtnText", value.asInstanceOf[js.Any])
      
      inline def setAddBtnTextUndefined: Self = StObject.set(x, "addBtnText", js.undefined)
      
      inline def setAddBtnUndefined: Self = StObject.set(x, "addBtn", js.undefined)
      
      inline def setAddRowBtn(value: Boolean): Self = StObject.set(x, "addRowBtn", value.asInstanceOf[js.Any])
      
      inline def setAddRowBtnUndefined: Self = StObject.set(x, "addRowBtn", js.undefined)
      
      inline def setAddTitle(value: String): Self = StObject.set(x, "addTitle", value.asInstanceOf[js.Any])
      
      inline def setAddTitleUndefined: Self = StObject.set(x, "addTitle", js.undefined)
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCalcHeight(value: Double | String): Self = StObject.set(x, "calcHeight", value.asInstanceOf[js.Any])
      
      inline def setCalcHeightUndefined: Self = StObject.set(x, "calcHeight", js.undefined)
      
      inline def setCancelBtn(value: Boolean): Self = StObject.set(x, "cancelBtn", value.asInstanceOf[js.Any])
      
      inline def setCancelBtnIcon(value: String): Self = StObject.set(x, "cancelBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setCancelBtnIconUndefined: Self = StObject.set(x, "cancelBtnIcon", js.undefined)
      
      inline def setCancelBtnText(value: String): Self = StObject.set(x, "cancelBtnText", value.asInstanceOf[js.Any])
      
      inline def setCancelBtnTextUndefined: Self = StObject.set(x, "cancelBtnText", js.undefined)
      
      inline def setCancelBtnUndefined: Self = StObject.set(x, "cancelBtn", js.undefined)
      
      inline def setCard(value: Boolean): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setCellBtn(value: Boolean): Self = StObject.set(x, "cellBtn", value.asInstanceOf[js.Any])
      
      inline def setCellBtnUndefined: Self = StObject.set(x, "cellBtn", js.undefined)
      
      inline def setColumn(value: js.Array[AvueCrudColumn[T]]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnBtn(value: Boolean): Self = StObject.set(x, "columnBtn", value.asInstanceOf[js.Any])
      
      inline def setColumnBtnUndefined: Self = StObject.set(x, "columnBtn", js.undefined)
      
      inline def setColumnSort(value: Boolean): Self = StObject.set(x, "columnSort", value.asInstanceOf[js.Any])
      
      inline def setColumnSortUndefined: Self = StObject.set(x, "columnSort", js.undefined)
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumnVarargs(value: AvueCrudColumn[T]*): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setCopyBtn(value: Boolean): Self = StObject.set(x, "copyBtn", value.asInstanceOf[js.Any])
      
      inline def setCopyBtnUndefined: Self = StObject.set(x, "copyBtn", js.undefined)
      
      inline def setDateBtn(value: Boolean): Self = StObject.set(x, "dateBtn", value.asInstanceOf[js.Any])
      
      inline def setDateBtnUndefined: Self = StObject.set(x, "dateBtn", js.undefined)
      
      inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      inline def setDefaultSort(value: Order): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
      
      inline def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
      
      inline def setDelBtn(value: Boolean): Self = StObject.set(x, "delBtn", value.asInstanceOf[js.Any])
      
      inline def setDelBtnIcon(value: String): Self = StObject.set(x, "delBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setDelBtnIconUndefined: Self = StObject.set(x, "delBtnIcon", js.undefined)
      
      inline def setDelBtnText(value: String): Self = StObject.set(x, "delBtnText", value.asInstanceOf[js.Any])
      
      inline def setDelBtnTextUndefined: Self = StObject.set(x, "delBtnText", js.undefined)
      
      inline def setDelBtnUndefined: Self = StObject.set(x, "delBtn", js.undefined)
      
      inline def setDialogClickModal(value: Boolean): Self = StObject.set(x, "dialogClickModal", value.asInstanceOf[js.Any])
      
      inline def setDialogClickModalUndefined: Self = StObject.set(x, "dialogClickModal", js.undefined)
      
      inline def setDialogCloseBtn(value: Boolean): Self = StObject.set(x, "dialogCloseBtn", value.asInstanceOf[js.Any])
      
      inline def setDialogCloseBtnUndefined: Self = StObject.set(x, "dialogCloseBtn", js.undefined)
      
      inline def setDialogCustomClass(value: String): Self = StObject.set(x, "dialogCustomClass", value.asInstanceOf[js.Any])
      
      inline def setDialogCustomClassUndefined: Self = StObject.set(x, "dialogCustomClass", js.undefined)
      
      inline def setDialogDirection(value: rtl | ltr | ttb | btt): Self = StObject.set(x, "dialogDirection", value.asInstanceOf[js.Any])
      
      inline def setDialogDirectionUndefined: Self = StObject.set(x, "dialogDirection", js.undefined)
      
      inline def setDialogDrag(value: Boolean): Self = StObject.set(x, "dialogDrag", value.asInstanceOf[js.Any])
      
      inline def setDialogDragUndefined: Self = StObject.set(x, "dialogDrag", js.undefined)
      
      inline def setDialogEscape(value: Boolean): Self = StObject.set(x, "dialogEscape", value.asInstanceOf[js.Any])
      
      inline def setDialogEscapeUndefined: Self = StObject.set(x, "dialogEscape", js.undefined)
      
      inline def setDialogFullscreen(value: Boolean): Self = StObject.set(x, "dialogFullscreen", value.asInstanceOf[js.Any])
      
      inline def setDialogFullscreenUndefined: Self = StObject.set(x, "dialogFullscreen", js.undefined)
      
      inline def setDialogHeight(value: String | Double): Self = StObject.set(x, "dialogHeight", value.asInstanceOf[js.Any])
      
      inline def setDialogHeightUndefined: Self = StObject.set(x, "dialogHeight", js.undefined)
      
      inline def setDialogMenuPosition(value: MenuPosition): Self = StObject.set(x, "dialogMenuPosition", value.asInstanceOf[js.Any])
      
      inline def setDialogMenuPositionUndefined: Self = StObject.set(x, "dialogMenuPosition", js.undefined)
      
      inline def setDialogModal(value: Boolean): Self = StObject.set(x, "dialogModal", value.asInstanceOf[js.Any])
      
      inline def setDialogModalUndefined: Self = StObject.set(x, "dialogModal", js.undefined)
      
      inline def setDialogTop(value: String | Double): Self = StObject.set(x, "dialogTop", value.asInstanceOf[js.Any])
      
      inline def setDialogTopUndefined: Self = StObject.set(x, "dialogTop", js.undefined)
      
      inline def setDialogType(value: dialog | drawer): Self = StObject.set(x, "dialogType", value.asInstanceOf[js.Any])
      
      inline def setDialogTypeUndefined: Self = StObject.set(x, "dialogType", js.undefined)
      
      inline def setDialogWidth(value: String | Double): Self = StObject.set(x, "dialogWidth", value.asInstanceOf[js.Any])
      
      inline def setDialogWidthUndefined: Self = StObject.set(x, "dialogWidth", js.undefined)
      
      inline def setEditBtn(value: Boolean): Self = StObject.set(x, "editBtn", value.asInstanceOf[js.Any])
      
      inline def setEditBtnIcon(value: String): Self = StObject.set(x, "editBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setEditBtnIconUndefined: Self = StObject.set(x, "editBtnIcon", js.undefined)
      
      inline def setEditBtnText(value: String): Self = StObject.set(x, "editBtnText", value.asInstanceOf[js.Any])
      
      inline def setEditBtnTextUndefined: Self = StObject.set(x, "editBtnText", js.undefined)
      
      inline def setEditBtnUndefined: Self = StObject.set(x, "editBtn", js.undefined)
      
      inline def setEditTitle(value: String): Self = StObject.set(x, "editTitle", value.asInstanceOf[js.Any])
      
      inline def setEditTitleUndefined: Self = StObject.set(x, "editTitle", js.undefined)
      
      inline def setEmptyBtnIcon(value: String): Self = StObject.set(x, "emptyBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setEmptyBtnIconUndefined: Self = StObject.set(x, "emptyBtnIcon", js.undefined)
      
      inline def setEmptyBtnText(value: String): Self = StObject.set(x, "emptyBtnText", value.asInstanceOf[js.Any])
      
      inline def setEmptyBtnTextUndefined: Self = StObject.set(x, "emptyBtnText", js.undefined)
      
      inline def setExcelBtn(value: Boolean): Self = StObject.set(x, "excelBtn", value.asInstanceOf[js.Any])
      
      inline def setExcelBtnUndefined: Self = StObject.set(x, "excelBtn", js.undefined)
      
      inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandFixed(value: Boolean): Self = StObject.set(x, "expandFixed", value.asInstanceOf[js.Any])
      
      inline def setExpandFixedUndefined: Self = StObject.set(x, "expandFixed", js.undefined)
      
      inline def setExpandRowKeys(value: js.Array[String | Double]): Self = StObject.set(x, "expandRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandRowKeysUndefined: Self = StObject.set(x, "expandRowKeys", js.undefined)
      
      inline def setExpandRowKeysVarargs(value: (String | Double)*): Self = StObject.set(x, "expandRowKeys", js.Array(value*))
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpandWidth(value: Double): Self = StObject.set(x, "expandWidth", value.asInstanceOf[js.Any])
      
      inline def setExpandWidthUndefined: Self = StObject.set(x, "expandWidth", js.undefined)
      
      inline def setFilterBtn(value: Boolean): Self = StObject.set(x, "filterBtn", value.asInstanceOf[js.Any])
      
      inline def setFilterBtnUndefined: Self = StObject.set(x, "filterBtn", js.undefined)
      
      inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      inline def setGroup(value: js.Array[AvueCrudGroup[T]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroupVarargs(value: AvueCrudGroup[T]*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlign(value: Align): Self = StObject.set(x, "headerAlign", value.asInstanceOf[js.Any])
      
      inline def setHeaderAlignUndefined: Self = StObject.set(x, "headerAlign", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightCurrentRow(value: Boolean): Self = StObject.set(x, "highlightCurrentRow", value.asInstanceOf[js.Any])
      
      inline def setHighlightCurrentRowUndefined: Self = StObject.set(x, "highlightCurrentRow", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexFixed(value: Boolean): Self = StObject.set(x, "indexFixed", value.asInstanceOf[js.Any])
      
      inline def setIndexFixedUndefined: Self = StObject.set(x, "indexFixed", js.undefined)
      
      inline def setIndexLabel(value: String): Self = StObject.set(x, "indexLabel", value.asInstanceOf[js.Any])
      
      inline def setIndexLabelUndefined: Self = StObject.set(x, "indexLabel", js.undefined)
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndexWidth(value: Double): Self = StObject.set(x, "indexWidth", value.asInstanceOf[js.Any])
      
      inline def setIndexWidthUndefined: Self = StObject.set(x, "indexWidth", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuAlign(value: Align): Self = StObject.set(x, "menuAlign", value.asInstanceOf[js.Any])
      
      inline def setMenuAlignUndefined: Self = StObject.set(x, "menuAlign", js.undefined)
      
      inline def setMenuBtnTitle(value: String): Self = StObject.set(x, "menuBtnTitle", value.asInstanceOf[js.Any])
      
      inline def setMenuBtnTitleUndefined: Self = StObject.set(x, "menuBtnTitle", js.undefined)
      
      inline def setMenuFixed(value: Boolean): Self = StObject.set(x, "menuFixed", value.asInstanceOf[js.Any])
      
      inline def setMenuFixedUndefined: Self = StObject.set(x, "menuFixed", js.undefined)
      
      inline def setMenuHeaderAlign(value: Align): Self = StObject.set(x, "menuHeaderAlign", value.asInstanceOf[js.Any])
      
      inline def setMenuHeaderAlignUndefined: Self = StObject.set(x, "menuHeaderAlign", js.undefined)
      
      inline def setMenuTitle(value: String): Self = StObject.set(x, "menuTitle", value.asInstanceOf[js.Any])
      
      inline def setMenuTitleUndefined: Self = StObject.set(x, "menuTitle", js.undefined)
      
      inline def setMenuType(value: MenuType): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      inline def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setMenuWidth(value: Double): Self = StObject.set(x, "menuWidth", value.asInstanceOf[js.Any])
      
      inline def setMenuWidthUndefined: Self = StObject.set(x, "menuWidth", js.undefined)
      
      inline def setPrintBtn(value: Boolean): Self = StObject.set(x, "printBtn", value.asInstanceOf[js.Any])
      
      inline def setPrintBtnUndefined: Self = StObject.set(x, "printBtn", js.undefined)
      
      inline def setRefreshBtn(value: Boolean): Self = StObject.set(x, "refreshBtn", value.asInstanceOf[js.Any])
      
      inline def setRefreshBtnUndefined: Self = StObject.set(x, "refreshBtn", js.undefined)
      
      inline def setReserveSelection(value: Boolean): Self = StObject.set(x, "reserveSelection", value.asInstanceOf[js.Any])
      
      inline def setReserveSelectionUndefined: Self = StObject.set(x, "reserveSelection", js.undefined)
      
      inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
      
      inline def setRowParentKey(value: String): Self = StObject.set(x, "rowParentKey", value.asInstanceOf[js.Any])
      
      inline def setRowParentKeyUndefined: Self = StObject.set(x, "rowParentKey", js.undefined)
      
      inline def setRowSort(value: Boolean): Self = StObject.set(x, "rowSort", value.asInstanceOf[js.Any])
      
      inline def setRowSortUndefined: Self = StObject.set(x, "rowSort", js.undefined)
      
      inline def setSaveBtn(value: Boolean): Self = StObject.set(x, "saveBtn", value.asInstanceOf[js.Any])
      
      inline def setSaveBtnIcon(value: String): Self = StObject.set(x, "saveBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setSaveBtnIconUndefined: Self = StObject.set(x, "saveBtnIcon", js.undefined)
      
      inline def setSaveBtnText(value: String): Self = StObject.set(x, "saveBtnText", value.asInstanceOf[js.Any])
      
      inline def setSaveBtnTextUndefined: Self = StObject.set(x, "saveBtnText", js.undefined)
      
      inline def setSaveBtnUndefined: Self = StObject.set(x, "saveBtn", js.undefined)
      
      inline def setSearchBtn(value: Boolean): Self = StObject.set(x, "searchBtn", value.asInstanceOf[js.Any])
      
      inline def setSearchBtnIcon(value: String): Self = StObject.set(x, "searchBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setSearchBtnIconUndefined: Self = StObject.set(x, "searchBtnIcon", js.undefined)
      
      inline def setSearchBtnText(value: String): Self = StObject.set(x, "searchBtnText", value.asInstanceOf[js.Any])
      
      inline def setSearchBtnTextUndefined: Self = StObject.set(x, "searchBtnText", js.undefined)
      
      inline def setSearchBtnUndefined: Self = StObject.set(x, "searchBtn", js.undefined)
      
      inline def setSearchEnter(value: Boolean): Self = StObject.set(x, "searchEnter", value.asInstanceOf[js.Any])
      
      inline def setSearchEnterUndefined: Self = StObject.set(x, "searchEnter", js.undefined)
      
      inline def setSearchGutter(value: Double): Self = StObject.set(x, "searchGutter", value.asInstanceOf[js.Any])
      
      inline def setSearchGutterUndefined: Self = StObject.set(x, "searchGutter", js.undefined)
      
      inline def setSearchIcon(value: Boolean): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
      
      inline def setSearchIconUndefined: Self = StObject.set(x, "searchIcon", js.undefined)
      
      inline def setSearchIndex(value: Double): Self = StObject.set(x, "searchIndex", value.asInstanceOf[js.Any])
      
      inline def setSearchIndexUndefined: Self = StObject.set(x, "searchIndex", js.undefined)
      
      inline def setSearchLabelPosition(value: LabelPosition): Self = StObject.set(x, "searchLabelPosition", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelPositionUndefined: Self = StObject.set(x, "searchLabelPosition", js.undefined)
      
      inline def setSearchLabelWidth(value: Double | String): Self = StObject.set(x, "searchLabelWidth", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelWidthUndefined: Self = StObject.set(x, "searchLabelWidth", js.undefined)
      
      inline def setSearchMenuPosition(value: MenuPosition): Self = StObject.set(x, "searchMenuPosition", value.asInstanceOf[js.Any])
      
      inline def setSearchMenuPositionUndefined: Self = StObject.set(x, "searchMenuPosition", js.undefined)
      
      inline def setSearchMenuSpan(value: Double): Self = StObject.set(x, "searchMenuSpan", value.asInstanceOf[js.Any])
      
      inline def setSearchMenuSpanUndefined: Self = StObject.set(x, "searchMenuSpan", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSearchShow(value: Boolean): Self = StObject.set(x, "searchShow", value.asInstanceOf[js.Any])
      
      inline def setSearchShowBtn(value: Boolean): Self = StObject.set(x, "searchShowBtn", value.asInstanceOf[js.Any])
      
      inline def setSearchShowBtnUndefined: Self = StObject.set(x, "searchShowBtn", js.undefined)
      
      inline def setSearchShowUndefined: Self = StObject.set(x, "searchShow", js.undefined)
      
      inline def setSearchSize(value: Size): Self = StObject.set(x, "searchSize", value.asInstanceOf[js.Any])
      
      inline def setSearchSizeUndefined: Self = StObject.set(x, "searchSize", js.undefined)
      
      inline def setSearchSpan(value: Double): Self = StObject.set(x, "searchSpan", value.asInstanceOf[js.Any])
      
      inline def setSearchSpanUndefined: Self = StObject.set(x, "searchSpan", js.undefined)
      
      inline def setSelectClearBtn(value: Boolean): Self = StObject.set(x, "selectClearBtn", value.asInstanceOf[js.Any])
      
      inline def setSelectClearBtnUndefined: Self = StObject.set(x, "selectClearBtn", js.undefined)
      
      inline def setSelectable(value: /* row */ T => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionFixed(value: Boolean): Self = StObject.set(x, "selectionFixed", value.asInstanceOf[js.Any])
      
      inline def setSelectionFixedUndefined: Self = StObject.set(x, "selectionFixed", js.undefined)
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setSelectionWidth(value: Double): Self = StObject.set(x, "selectionWidth", value.asInstanceOf[js.Any])
      
      inline def setSelectionWidthUndefined: Self = StObject.set(x, "selectionWidth", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowSummary(value: Boolean): Self = StObject.set(x, "showSummary", value.asInstanceOf[js.Any])
      
      inline def setShowSummaryUndefined: Self = StObject.set(x, "showSummary", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStripe(value: Boolean): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
      
      inline def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
      
      inline def setSumColumnList(value: js.Array[String]): Self = StObject.set(x, "sumColumnList", value.asInstanceOf[js.Any])
      
      inline def setSumColumnListUndefined: Self = StObject.set(x, "sumColumnList", js.undefined)
      
      inline def setSumColumnListVarargs(value: String*): Self = StObject.set(x, "sumColumnList", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUpdateBtn(value: Boolean): Self = StObject.set(x, "updateBtn", value.asInstanceOf[js.Any])
      
      inline def setUpdateBtnIcon(value: String): Self = StObject.set(x, "updateBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setUpdateBtnIconUndefined: Self = StObject.set(x, "updateBtnIcon", js.undefined)
      
      inline def setUpdateBtnText(value: String): Self = StObject.set(x, "updateBtnText", value.asInstanceOf[js.Any])
      
      inline def setUpdateBtnTextUndefined: Self = StObject.set(x, "updateBtnText", js.undefined)
      
      inline def setUpdateBtnTitle(value: String): Self = StObject.set(x, "updateBtnTitle", value.asInstanceOf[js.Any])
      
      inline def setUpdateBtnTitleUndefined: Self = StObject.set(x, "updateBtnTitle", js.undefined)
      
      inline def setUpdateBtnUndefined: Self = StObject.set(x, "updateBtn", js.undefined)
      
      inline def setViewBtn(value: Boolean): Self = StObject.set(x, "viewBtn", value.asInstanceOf[js.Any])
      
      inline def setViewBtnIcon(value: String): Self = StObject.set(x, "viewBtnIcon", value.asInstanceOf[js.Any])
      
      inline def setViewBtnIconUndefined: Self = StObject.set(x, "viewBtnIcon", js.undefined)
      
      inline def setViewBtnText(value: String): Self = StObject.set(x, "viewBtnText", value.asInstanceOf[js.Any])
      
      inline def setViewBtnTextUndefined: Self = StObject.set(x, "viewBtnText", js.undefined)
      
      inline def setViewBtnUndefined: Self = StObject.set(x, "viewBtn", js.undefined)
      
      inline def setViewTitle(value: String): Self = StObject.set(x, "viewTitle", value.asInstanceOf[js.Any])
      
      inline def setViewTitleUndefined: Self = StObject.set(x, "viewTitle", js.undefined)
    }
  }
  
  trait AvueCrudProps[T] extends StObject {
    
    /** 关闭前的回调，会暂停Dialog的打开，done用于关闭Dialog，type为当前窗口的类型 */
    var `before-close`: js.UndefOr[js.Function2[/* done */ js.Function0[Unit], /* type */ FormType, Unit]] = js.undefined
    
    /** 打开前的回调，会暂停Dialog的打开，done用于关闭Dialog，type为当前窗口的类型 */
    var `before-open`: js.UndefOr[js.Function2[/* done */ js.Function0[Unit], /* type */ FormType, Unit]] = js.undefined
    
    /** 单元格的className的回调方法，也可以使用字符串为所有单元格设置一个固定的className */
    var `cell-class-name`: js.UndefOr[CellCls[T]] = js.undefined
    
    /** 表格数据 */
    var data: js.UndefOr[js.Array[T]] = js.undefined
    
    /** 配置项结构 v-model */
    var defaults: js.UndefOr[AvueCrudDefaults] = js.undefined
    
    /** 表头单元格的className的回调方法，也可以使用字符串为所有表头单元格设置一个固定的className */
    var `header-cell-class-name`: js.UndefOr[CellCls[T]] = js.undefined
    
    /** 表单绑定值 v-model */
    var modelValue: js.UndefOr[T] = js.undefined
    
    /** 当某个单元格被点击时会触发该事件 */
    var onCellClick: js.UndefOr[CellEvent[T]] = js.undefined
    
    /** 当某个单元格被双击击时会触发该事件 */
    var onCellDblclick: js.UndefOr[CellEvent[T]] = js.undefined
    
    /** 当单元格hover进入时会触发该事件 */
    var onCellMouseEnter: js.UndefOr[CellEvent[T]] = js.undefined
    
    /** 当单元格hover退出时会触发该事件 */
    var onCellMouseLeave: js.UndefOr[CellEvent[T]] = js.undefined
    
    /** 分页页码改变时会触发 */
    var onCurrentChange: js.UndefOr[js.Function1[/* current */ Double, Any]] = js.undefined
    
    /** dateBtn为true时的选择日期回调方法 */
    var onDateChange: js.UndefOr[js.Function1[/* data */ typings.smallweiAvue.anon.Value, Any]] = js.undefined
    
    /** 当用户对某一行展开或者关闭的时候会触发该事件（展开行时，回调的第二个参数为 expandedRows；树形表格时第二参数为 expanded） */
    var onExpandChange: js.UndefOr[js.Function2[/* row */ T, /* expanded */ js.Array[T] | Boolean, Any]] = js.undefined
    
    /** 当表格的筛选条件发生变化的时候会触发该事件 */
    var onFilterChange: js.UndefOr[js.Function1[/* filters */ Record[String, js.Array[Any]], Any]] = js.undefined
    
    /** 当某一列的表头被点击时会触发该事件 */
    var onHeaderClick: js.UndefOr[HeaderEvent[T]] = js.undefined
    
    /** 当某一列的表头被鼠标右键点击时触发该事件 */
    var onHeaderContextMenu: js.UndefOr[HeaderEvent[T]] = js.undefined
    
    /** 当拖动表头改变了列的宽度的时候会触发该事件 */
    var onHeaderDragend: js.UndefOr[
        js.Function4[
          /* newWidth */ Double, 
          /* oldWidth */ Double, 
          /* column */ TableColumnCtx[T], 
          /* event */ Event, 
          Any
        ]
      ] = js.undefined
    
    /** 点击刷新按钮触发该事件 */
    var onRefreshChange: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** 当某一行被点击时会触发该事件 */
    var onRowClick: js.UndefOr[RowEvent[T]] = js.undefined
    
    /** 当某一行被鼠标右键点击时会触发该事件 */
    var onRowContextMenu: js.UndefOr[RowEvent[T]] = js.undefined
    
    /** 当某一行被双击时会触发该事件 */
    var onRowDblclick: js.UndefOr[RowEvent[T]] = js.undefined
    
    /** 行数据删除时触发该事件 */
    var onRowDel: js.UndefOr[js.Function2[/* row */ T, /* index */ Double, Any]] = js.undefined
    
    /** 新增数据后点击确定触发该事件 */
    var onRowSave: js.UndefOr[
        js.Function3[/* row */ T, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit], Any]
      ] = js.undefined
    
    /** 编辑数据后确定触发该事件 */
    var onRowUpdate: js.UndefOr[
        js.Function4[
          /* row */ T, 
          /* index */ Double, 
          /* done */ js.Function0[Unit], 
          /* loading */ js.Function0[Unit], 
          Any
        ]
      ] = js.undefined
    
    /** 点击搜索后触发该事件 */
    var onSearchChange: js.UndefOr[js.Function2[/* form */ Any, /* done */ js.Function0[Unit], Any]] = js.undefined
    
    /** 清空搜索回调方法 */
    var onSearchReset: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** 当用户手动勾选数据行的Checkbox时触发的事件 */
    var onSelect: js.UndefOr[js.Function2[/* selection */ js.Array[T], /* row */ T, Any]] = js.undefined
    
    /** 当选择所有项时会触发该事件 */
    var onSelectAll: js.UndefOr[js.Function1[/* selection */ js.Array[T], Any]] = js.undefined
    
    /** 当选择项发生变化时会触发该事件 */
    var onSelectionChange: js.UndefOr[js.Function1[/* selection */ js.Array[T], Any]] = js.undefined
    
    /** 分页条数改变时会触发 */
    var onSizeChange: js.UndefOr[js.Function1[/* size */ Double, Any]] = js.undefined
    
    /** 当表格的排序条件发生变化的时候会触发该事件 */
    var onSortChange: js.UndefOr[js.Function1[/* args */ Column[T], Any]] = js.undefined
    
    /** 加载子节点数据的函数，lazy 为 true 时生效，函数第二个参数包含了节点的层级信息 */
    var onTreeLoad: js.UndefOr[
        js.Function3[
          /* row */ T, 
          /* treeNode */ Any, 
          /* resolve */ js.Function1[/* data */ js.Array[T], Unit], 
          Any
        ]
      ] = js.undefined
    
    /** 更新配置项结构 */
    @JSName("onUpdate:defaults")
    var onUpdateColondefaults: js.UndefOr[js.Function1[/* defaluts */ AvueCrudDefaults, Any]] = js.undefined
    
    /** 更新表单值 */
    @JSName("onUpdate:modelValue")
    var onUpdateColonmodelValue: js.UndefOr[js.Function1[/* row */ T, Any]] = js.undefined
    
    /** 更新分页数据 */
    @JSName("onUpdate:page")
    var onUpdateColonpage: js.UndefOr[js.Function1[/* page */ PageOption, Any]] = js.undefined
    
    /** 更新搜索表单 */
    @JSName("onUpdate:search")
    var onUpdateColonsearch: js.UndefOr[js.Function1[/* form */ Any, Any]] = js.undefined
    
    /** 表格配置属性 */
    var option: js.UndefOr[AvueCrudOption[T]] = js.undefined
    
    /** 表格的分页数据 v-model */
    var page: js.UndefOr[PageOption] = js.undefined
    
    /** 表格多个按钮权限控制，采用函数方式可以精确到行控制 */
    var permission: js.UndefOr[
        AvueCrudOption[T] | (js.Function3[/* key */ String, /* row */ T, /* index */ Double, Boolean])
      ] = js.undefined
    
    /** 行的className的回调方法，也可以使用字符串为所有行设置一个固定的className */
    var `row-class-name`: js.UndefOr[ColumnCls[T]] = js.undefined
    
    /** 表格搜索的表单的变量 v-model */
    var search: js.UndefOr[Any] = js.undefined
    
    /** 合并行或列的计算方法 */
    var `span-method`: js.UndefOr[SpanMethod[T]] = js.undefined
    
    /** 自定义的合计计算方法 */
    var `summary-method`: js.UndefOr[SummaryMethod[T]] = js.undefined
    
    /** 表格等待框的控制 */
    var `table-loading`: js.UndefOr[Boolean] = js.undefined
    
    /** 图片上传后的回调，done用于结束操作，loading用于中断操作 */
    var `upload-after`: js.UndefOr[
        js.Function4[
          /* res */ Any, 
          /* done */ js.Function0[Unit], 
          /* loading */ js.Function0[Unit], 
          /* column */ AvueCrudColumn[T], 
          Unit
        ]
      ] = js.undefined
    
    /** 图片上传前的回调，会暂停图片上传，done用于继续图片上传，loading用于中断操作 */
    var `upload-before`: js.UndefOr[
        js.Function4[
          /* file */ UploadRawFile, 
          /* done */ js.Function1[/* File */ js.UndefOr[File], Unit], 
          /* loading */ js.Function0[Unit], 
          /* column */ AvueCrudColumn[T], 
          Unit
        ]
      ] = js.undefined
    
    /** 删除文件之前的钩子，参数为上传的文件和文件列表，若返回 false 或者返回 Promise 且被 reject，则停止删除 */
    var `upload-delete`: js.UndefOr[
        js.Function2[
          /* file */ UploadFile, 
          /* column */ AvueCrudColumn[T], 
          Boolean | js.Promise[Any] | Unit
        ]
      ] = js.undefined
    
    /** 上传失败错误回调 */
    var `upload-error`: js.UndefOr[js.Function2[/* error */ js.Error, /* column */ AvueCrudColumn[T], Unit]] = js.undefined
    
    /** 上传超过长度限制回调 */
    var `upload-exceed`: js.UndefOr[
        js.Function4[
          /* limit */ Double, 
          /* files */ js.Array[File], 
          /* fileList */ js.Array[UploadUserFile], 
          /* column */ AvueCrudColumn[T], 
          Unit
        ]
      ] = js.undefined
    
    /** 查看前的回调 */
    var `upload-preview`: js.UndefOr[
        js.Function3[
          /* file */ UploadFile, 
          /* column */ AvueCrudColumn[T], 
          /* done */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object AvueCrudProps {
    
    inline def apply[T](): AvueCrudProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueCrudProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueCrudProps[?], T] (val x: Self & AvueCrudProps[T]) extends AnyVal {
      
      inline def `setBefore-close`(value: (/* done */ js.Function0[Unit], /* type */ FormType) => Unit): Self = StObject.set(x, "before-close", js.Any.fromFunction2(value))
      
      inline def `setBefore-closeUndefined`: Self = StObject.set(x, "before-close", js.undefined)
      
      inline def `setBefore-open`(value: (/* done */ js.Function0[Unit], /* type */ FormType) => Unit): Self = StObject.set(x, "before-open", js.Any.fromFunction2(value))
      
      inline def `setBefore-openUndefined`: Self = StObject.set(x, "before-open", js.undefined)
      
      inline def `setCell-class-name`(value: CellCls[T]): Self = StObject.set(x, "cell-class-name", value.asInstanceOf[js.Any])
      
      inline def `setCell-class-nameFunction1`(value: /* data */ ColumnColumnIndex[T] => String): Self = StObject.set(x, "cell-class-name", js.Any.fromFunction1(value))
      
      inline def `setCell-class-nameUndefined`: Self = StObject.set(x, "cell-class-name", js.undefined)
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDefaults(value: AvueCrudDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def `setHeader-cell-class-name`(value: CellCls[T]): Self = StObject.set(x, "header-cell-class-name", value.asInstanceOf[js.Any])
      
      inline def `setHeader-cell-class-nameFunction1`(value: /* data */ ColumnColumnIndex[T] => String): Self = StObject.set(x, "header-cell-class-name", js.Any.fromFunction1(value))
      
      inline def `setHeader-cell-class-nameUndefined`: Self = StObject.set(x, "header-cell-class-name", js.undefined)
      
      inline def setModelValue(value: T): Self = StObject.set(x, "modelValue", value.asInstanceOf[js.Any])
      
      inline def setModelValueUndefined: Self = StObject.set(x, "modelValue", js.undefined)
      
      inline def setOnCellClick(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* cell */ Any, /* event */ Event) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction4(value))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellDblclick(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* cell */ Any, /* event */ Event) => Unit): Self = StObject.set(x, "onCellDblclick", js.Any.fromFunction4(value))
      
      inline def setOnCellDblclickUndefined: Self = StObject.set(x, "onCellDblclick", js.undefined)
      
      inline def setOnCellMouseEnter(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* cell */ Any, /* event */ Event) => Unit): Self = StObject.set(x, "onCellMouseEnter", js.Any.fromFunction4(value))
      
      inline def setOnCellMouseEnterUndefined: Self = StObject.set(x, "onCellMouseEnter", js.undefined)
      
      inline def setOnCellMouseLeave(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* cell */ Any, /* event */ Event) => Unit): Self = StObject.set(x, "onCellMouseLeave", js.Any.fromFunction4(value))
      
      inline def setOnCellMouseLeaveUndefined: Self = StObject.set(x, "onCellMouseLeave", js.undefined)
      
      inline def setOnCurrentChange(value: /* current */ Double => Any): Self = StObject.set(x, "onCurrentChange", js.Any.fromFunction1(value))
      
      inline def setOnCurrentChangeUndefined: Self = StObject.set(x, "onCurrentChange", js.undefined)
      
      inline def setOnDateChange(value: /* data */ typings.smallweiAvue.anon.Value => Any): Self = StObject.set(x, "onDateChange", js.Any.fromFunction1(value))
      
      inline def setOnDateChangeUndefined: Self = StObject.set(x, "onDateChange", js.undefined)
      
      inline def setOnExpandChange(value: (/* row */ T, /* expanded */ js.Array[T] | Boolean) => Any): Self = StObject.set(x, "onExpandChange", js.Any.fromFunction2(value))
      
      inline def setOnExpandChangeUndefined: Self = StObject.set(x, "onExpandChange", js.undefined)
      
      inline def setOnFilterChange(value: /* filters */ Record[String, js.Array[Any]] => Any): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction1(value))
      
      inline def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
      
      inline def setOnHeaderClick(value: (/* column */ TableColumnCtx[T], /* event */ Event) => Unit): Self = StObject.set(x, "onHeaderClick", js.Any.fromFunction2(value))
      
      inline def setOnHeaderClickUndefined: Self = StObject.set(x, "onHeaderClick", js.undefined)
      
      inline def setOnHeaderContextMenu(value: (/* column */ TableColumnCtx[T], /* event */ Event) => Unit): Self = StObject.set(x, "onHeaderContextMenu", js.Any.fromFunction2(value))
      
      inline def setOnHeaderContextMenuUndefined: Self = StObject.set(x, "onHeaderContextMenu", js.undefined)
      
      inline def setOnHeaderDragend(
        value: (/* newWidth */ Double, /* oldWidth */ Double, /* column */ TableColumnCtx[T], /* event */ Event) => Any
      ): Self = StObject.set(x, "onHeaderDragend", js.Any.fromFunction4(value))
      
      inline def setOnHeaderDragendUndefined: Self = StObject.set(x, "onHeaderDragend", js.undefined)
      
      inline def setOnRefreshChange(value: () => Any): Self = StObject.set(x, "onRefreshChange", js.Any.fromFunction0(value))
      
      inline def setOnRefreshChangeUndefined: Self = StObject.set(x, "onRefreshChange", js.undefined)
      
      inline def setOnRowClick(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* event */ Event) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction3(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowContextMenu(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* event */ Event) => Unit): Self = StObject.set(x, "onRowContextMenu", js.Any.fromFunction3(value))
      
      inline def setOnRowContextMenuUndefined: Self = StObject.set(x, "onRowContextMenu", js.undefined)
      
      inline def setOnRowDblclick(value: (/* row */ Any, /* column */ TableColumnCtx[T], /* event */ Event) => Unit): Self = StObject.set(x, "onRowDblclick", js.Any.fromFunction3(value))
      
      inline def setOnRowDblclickUndefined: Self = StObject.set(x, "onRowDblclick", js.undefined)
      
      inline def setOnRowDel(value: (/* row */ T, /* index */ Double) => Any): Self = StObject.set(x, "onRowDel", js.Any.fromFunction2(value))
      
      inline def setOnRowDelUndefined: Self = StObject.set(x, "onRowDel", js.undefined)
      
      inline def setOnRowSave(value: (/* row */ T, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit]) => Any): Self = StObject.set(x, "onRowSave", js.Any.fromFunction3(value))
      
      inline def setOnRowSaveUndefined: Self = StObject.set(x, "onRowSave", js.undefined)
      
      inline def setOnRowUpdate(
        value: (/* row */ T, /* index */ Double, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit]) => Any
      ): Self = StObject.set(x, "onRowUpdate", js.Any.fromFunction4(value))
      
      inline def setOnRowUpdateUndefined: Self = StObject.set(x, "onRowUpdate", js.undefined)
      
      inline def setOnSearchChange(value: (/* form */ Any, /* done */ js.Function0[Unit]) => Any): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction2(value))
      
      inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
      
      inline def setOnSearchReset(value: () => Any): Self = StObject.set(x, "onSearchReset", js.Any.fromFunction0(value))
      
      inline def setOnSearchResetUndefined: Self = StObject.set(x, "onSearchReset", js.undefined)
      
      inline def setOnSelect(value: (/* selection */ js.Array[T], /* row */ T) => Any): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectAll(value: /* selection */ js.Array[T] => Any): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction1(value))
      
      inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSelectionChange(value: /* selection */ js.Array[T] => Any): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
      
      inline def setOnSizeChange(value: /* size */ Double => Any): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction1(value))
      
      inline def setOnSizeChangeUndefined: Self = StObject.set(x, "onSizeChange", js.undefined)
      
      inline def setOnSortChange(value: /* args */ Column[T] => Any): Self = StObject.set(x, "onSortChange", js.Any.fromFunction1(value))
      
      inline def setOnSortChangeUndefined: Self = StObject.set(x, "onSortChange", js.undefined)
      
      inline def setOnTreeLoad(
        value: (/* row */ T, /* treeNode */ Any, /* resolve */ js.Function1[/* data */ js.Array[T], Unit]) => Any
      ): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction3(value))
      
      inline def setOnTreeLoadUndefined: Self = StObject.set(x, "onTreeLoad", js.undefined)
      
      inline def setOnUpdateColondefaults(value: /* defaluts */ AvueCrudDefaults => Any): Self = StObject.set(x, "onUpdate:defaults", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColondefaultsUndefined: Self = StObject.set(x, "onUpdate:defaults", js.undefined)
      
      inline def setOnUpdateColonmodelValue(value: /* row */ T => Any): Self = StObject.set(x, "onUpdate:modelValue", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColonmodelValueUndefined: Self = StObject.set(x, "onUpdate:modelValue", js.undefined)
      
      inline def setOnUpdateColonpage(value: /* page */ PageOption => Any): Self = StObject.set(x, "onUpdate:page", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColonpageUndefined: Self = StObject.set(x, "onUpdate:page", js.undefined)
      
      inline def setOnUpdateColonsearch(value: /* form */ Any => Any): Self = StObject.set(x, "onUpdate:search", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColonsearchUndefined: Self = StObject.set(x, "onUpdate:search", js.undefined)
      
      inline def setOption(value: AvueCrudOption[T]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def setPage(value: PageOption): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPermission(
        value: AvueCrudOption[T] | (js.Function3[/* key */ String, /* row */ T, /* index */ Double, Boolean])
      ): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
      
      inline def setPermissionFunction3(value: (/* key */ String, /* row */ T, /* index */ Double) => Boolean): Self = StObject.set(x, "permission", js.Any.fromFunction3(value))
      
      inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
      
      inline def `setRow-class-name`(value: ColumnCls[T]): Self = StObject.set(x, "row-class-name", value.asInstanceOf[js.Any])
      
      inline def `setRow-class-nameFunction1`(value: /* data */ RowIndex[T] => String): Self = StObject.set(x, "row-class-name", js.Any.fromFunction1(value))
      
      inline def `setRow-class-nameUndefined`: Self = StObject.set(x, "row-class-name", js.undefined)
      
      inline def setSearch(value: Any): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def `setSpan-method`(value: /* data */ ColumnColumnIndex[T] => js.UndefOr[js.Array[Double] | Colspan]): Self = StObject.set(x, "span-method", js.Any.fromFunction1(value))
      
      inline def `setSpan-methodUndefined`: Self = StObject.set(x, "span-method", js.undefined)
      
      inline def `setSummary-method`(value: /* data */ Data[T] => js.Array[String]): Self = StObject.set(x, "summary-method", js.Any.fromFunction1(value))
      
      inline def `setSummary-methodUndefined`: Self = StObject.set(x, "summary-method", js.undefined)
      
      inline def `setTable-loading`(value: Boolean): Self = StObject.set(x, "table-loading", value.asInstanceOf[js.Any])
      
      inline def `setTable-loadingUndefined`: Self = StObject.set(x, "table-loading", js.undefined)
      
      inline def `setUpload-after`(
        value: (/* res */ Any, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit], /* column */ AvueCrudColumn[T]) => Unit
      ): Self = StObject.set(x, "upload-after", js.Any.fromFunction4(value))
      
      inline def `setUpload-afterUndefined`: Self = StObject.set(x, "upload-after", js.undefined)
      
      inline def `setUpload-before`(
        value: (/* file */ UploadRawFile, /* done */ js.Function1[/* File */ js.UndefOr[File], Unit], /* loading */ js.Function0[Unit], /* column */ AvueCrudColumn[T]) => Unit
      ): Self = StObject.set(x, "upload-before", js.Any.fromFunction4(value))
      
      inline def `setUpload-beforeUndefined`: Self = StObject.set(x, "upload-before", js.undefined)
      
      inline def `setUpload-delete`(value: (/* file */ UploadFile, /* column */ AvueCrudColumn[T]) => Boolean | js.Promise[Any] | Unit): Self = StObject.set(x, "upload-delete", js.Any.fromFunction2(value))
      
      inline def `setUpload-deleteUndefined`: Self = StObject.set(x, "upload-delete", js.undefined)
      
      inline def `setUpload-error`(value: (/* error */ js.Error, /* column */ AvueCrudColumn[T]) => Unit): Self = StObject.set(x, "upload-error", js.Any.fromFunction2(value))
      
      inline def `setUpload-errorUndefined`: Self = StObject.set(x, "upload-error", js.undefined)
      
      inline def `setUpload-exceed`(
        value: (/* limit */ Double, /* files */ js.Array[File], /* fileList */ js.Array[UploadUserFile], /* column */ AvueCrudColumn[T]) => Unit
      ): Self = StObject.set(x, "upload-exceed", js.Any.fromFunction4(value))
      
      inline def `setUpload-exceedUndefined`: Self = StObject.set(x, "upload-exceed", js.undefined)
      
      inline def `setUpload-preview`(
        value: (/* file */ UploadFile, /* column */ AvueCrudColumn[T], /* done */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "upload-preview", js.Any.fromFunction3(value))
      
      inline def `setUpload-previewUndefined`: Self = StObject.set(x, "upload-preview", js.undefined)
    }
  }
  
  trait AvueCrudSlots[T]
    extends StObject
       with // [x: string]: (scoped: { row: T; index: number; dic: DicItem[]; size: Size; label: string }) => VNode[];
  /* x */ StringDictionary[
          (js.Function1[/* scoped */ Dic[T], js.Array[VNode]]) & (js.Function1[/* scoped */ ColumnAvueCrudColumn[T], js.Array[VNode]]) & (js.Function1[/* scoped */ Label[T], js.Array[VNode]]) & (js.Function1[/* scoped */ Readonly[T], js.Array[VNode]])
        ] {
    
    def empty(): js.Array[VNode]
    
    def expand(scoped: Index[T]): js.Array[VNode]
    
    def footer(): js.Array[VNode]
    
    def header(): js.Array[VNode]
    
    def menu(scoped: Disabled[T]): js.Array[VNode]
    
    def `menu-btn`(): js.Array[VNode]
    
    def `menu-form`(scoped: typings.smallweiAvue.anon.Size): js.Array[VNode]
    
    def `menu-left`(scoped: SizeSize): js.Array[VNode]
    
    def `menu-right`(scoped: SizeSize): js.Array[VNode]
    
    def page(): js.Array[VNode]
    
    def search(scoped: Row[T]): js.Array[VNode]
    
    def `search-menu`(scoped: Search[T]): js.Array[VNode]
  }
  object AvueCrudSlots {
    
    inline def apply[T](
      empty: () => js.Array[VNode],
      expand: Index[T] => js.Array[VNode],
      footer: () => js.Array[VNode],
      header: () => js.Array[VNode],
      menu: Disabled[T] => js.Array[VNode],
      `menu-btn`: () => js.Array[VNode],
      `menu-form`: typings.smallweiAvue.anon.Size => js.Array[VNode],
      `menu-left`: SizeSize => js.Array[VNode],
      `menu-right`: SizeSize => js.Array[VNode],
      page: () => js.Array[VNode],
      search: Row[T] => js.Array[VNode],
      `search-menu`: Search[T] => js.Array[VNode]
    ): AvueCrudSlots[T] = {
      val __obj = js.Dynamic.literal(empty = js.Any.fromFunction0(empty), expand = js.Any.fromFunction1(expand), footer = js.Any.fromFunction0(footer), header = js.Any.fromFunction0(header), menu = js.Any.fromFunction1(menu), page = js.Any.fromFunction0(page), search = js.Any.fromFunction1(search))
      __obj.updateDynamic("menu-btn")(js.Any.fromFunction0(`menu-btn`))
      __obj.updateDynamic("menu-form")(js.Any.fromFunction1(`menu-form`))
      __obj.updateDynamic("menu-left")(js.Any.fromFunction1(`menu-left`))
      __obj.updateDynamic("menu-right")(js.Any.fromFunction1(`menu-right`))
      __obj.updateDynamic("search-menu")(js.Any.fromFunction1(`search-menu`))
      __obj.asInstanceOf[AvueCrudSlots[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueCrudSlots[?], T] (val x: Self & AvueCrudSlots[T]) extends AnyVal {
      
      inline def setEmpty(value: () => js.Array[VNode]): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
      
      inline def setExpand(value: Index[T] => js.Array[VNode]): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setFooter(value: () => js.Array[VNode]): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
      
      inline def setHeader(value: () => js.Array[VNode]): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
      
      inline def setMenu(value: Disabled[T] => js.Array[VNode]): Self = StObject.set(x, "menu", js.Any.fromFunction1(value))
      
      inline def `setMenu-btn`(value: () => js.Array[VNode]): Self = StObject.set(x, "menu-btn", js.Any.fromFunction0(value))
      
      inline def `setMenu-form`(value: typings.smallweiAvue.anon.Size => js.Array[VNode]): Self = StObject.set(x, "menu-form", js.Any.fromFunction1(value))
      
      inline def `setMenu-left`(value: SizeSize => js.Array[VNode]): Self = StObject.set(x, "menu-left", js.Any.fromFunction1(value))
      
      inline def `setMenu-right`(value: SizeSize => js.Array[VNode]): Self = StObject.set(x, "menu-right", js.Any.fromFunction1(value))
      
      inline def setPage(value: () => js.Array[VNode]): Self = StObject.set(x, "page", js.Any.fromFunction0(value))
      
      inline def setSearch(value: Row[T] => js.Array[VNode]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def `setSearch-menu`(value: Search[T] => js.Array[VNode]): Self = StObject.set(x, "search-menu", js.Any.fromFunction1(value))
    }
  }
  
  trait PageOption extends StObject {
    
    /** 是否为分页按钮添加背景色 */
    var background: js.UndefOr[Boolean] = js.undefined
    
    /** 当前页数 */
    var currentPage: js.UndefOr[Double] = js.undefined
    
    /** 每页显示条目个数，支持.sync修饰符 */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** 分页的数组分段 */
    var pageSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** 页码按钮的数量，当总页数超过该值时会折叠 */
    var pagerCount: js.UndefOr[Double] = js.undefined
    
    /** 总条数,如果为0的话不显示分页 */
    var total: js.UndefOr[Double] = js.undefined
  }
  object PageOption {
    
    inline def apply(): PageOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageOption] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageSizes(value: js.Array[Double]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
      
      inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
      
      inline def setPageSizesVarargs(value: Double*): Self = StObject.set(x, "pageSizes", js.Array(value*))
      
      inline def setPagerCount(value: Double): Self = StObject.set(x, "pagerCount", value.asInstanceOf[js.Any])
      
      inline def setPagerCountUndefined: Self = StObject.set(x, "pagerCount", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
