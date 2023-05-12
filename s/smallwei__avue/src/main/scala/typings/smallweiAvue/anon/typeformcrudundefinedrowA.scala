package typings.smallweiAvue.anon

import typings.smallweiAvue.Align
import typings.smallweiAvue.LabelPosition
import typings.smallweiAvue.MenuPosition
import typings.smallweiAvue.MenuType
import typings.smallweiAvue.crudMod.AvueCrudColumn
import typings.smallweiAvue.crudMod.AvueCrudGroup
import typings.smallweiAvue.smallweiAvueStrings.btt
import typings.smallweiAvue.smallweiAvueStrings.crud
import typings.smallweiAvue.smallweiAvueStrings.dialog
import typings.smallweiAvue.smallweiAvueStrings.drawer
import typings.smallweiAvue.smallweiAvueStrings.form
import typings.smallweiAvue.smallweiAvueStrings.ltr
import typings.smallweiAvue.smallweiAvueStrings.rtl
import typings.smallweiAvue.smallweiAvueStrings.ttb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'form' | 'crud' | undefined,   rowAdd :(done : (row : any): void): void | undefined,   rowDel :(row : any, done : (): void): void | undefined,   limit :number | undefined} & @smallwei/avue.@smallwei/avue/crud.AvueCrudOption<any> */
trait typeformcrudundefinedrowA extends StObject {
  
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
  
  /** 重值不清空的字段 */
  var clearExclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 表格列配置属性 */
  var column: js.UndefOr[js.Array[AvueCrudColumn[Any]]] = js.undefined
  
  /** 列操作按钮 */
  var columnBtn: js.UndefOr[Boolean] = js.undefined
  
  /** 列拖拽排序 */
  var columnSort: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** 查看模式 */
  var detail: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** 清空按钮 */
  var emptyBtn: js.UndefOr[Boolean] = js.undefined
  
  /** 清空按钮图标 */
  var emptyBtnIcon: js.UndefOr[String] = js.undefined
  
  /** 清空按钮文案 */
  var emptyBtnText: js.UndefOr[String] = js.undefined
  
  /** 空数据时显示的文本内容，也可以通过slot="empty"设置 */
  var emptyText: js.UndefOr[String] = js.undefined
  
  /** 回车按键触发提交表单 */
  var enter: js.UndefOr[Boolean] = js.undefined
  
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
  var group: js.UndefOr[js.Array[AvueCrudGroup[Any]]] = js.undefined
  
  /** 间隔 */
  var gutter: js.UndefOr[Double] = js.undefined
  
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
  
  /** 标题位置，如果值为 left 或者 right 时，则需要设置 labelWidth */
  var labelPosition: js.UndefOr[LabelPosition] = js.undefined
  
  /** 标题的后缀 */
  var labelSuffix: js.UndefOr[String] = js.undefined
  
  /** 标题宽度 */
  var labelWidth: js.UndefOr[Double | String] = js.undefined
  
  /** 是否懒加载子节点数据,会调用tree-load方法回调 */
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /** 限制当前最大行数 */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** 表格的最大高度 */
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  /** 是否显示操作栏 */
  var menu: js.UndefOr[Boolean] = js.undefined
  
  /** 操作栏按钮的对齐方式 */
  var menuAlign: js.UndefOr[Align] = js.undefined
  
  /** 表单操作栏 */
  var menuBtn: js.UndefOr[Boolean] = js.undefined
  
  /** 菜单按钮的文字信息 */
  var menuBtnTitle: js.UndefOr[String] = js.undefined
  
  /** 操作列是否冻结 */
  var menuFixed: js.UndefOr[Boolean] = js.undefined
  
  /** 操作栏表头的对齐方式 */
  var menuHeaderAlign: js.UndefOr[Align] = js.undefined
  
  /** 表格右侧行操作按钮的排列方式 */
  var menuPosition: js.UndefOr[MenuPosition] = js.undefined
  
  /** 表单操作菜单栅格占据的列数 */
  var menuSpan: js.UndefOr[Double] = js.undefined
  
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
  
  /** 新增方法 */
  var rowAdd: js.UndefOr[js.Function1[/* done */ js.Function1[/* row */ Any, Unit], Unit]] = js.undefined
  
  /** 删除方法 */
  var rowDel: js.UndefOr[js.Function2[/* row */ Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
  
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
  var searchSize: js.UndefOr[typings.smallweiAvue.Size] = js.undefined
  
  /** 搜索项栅格占据的列数 */
  var searchSpan: js.UndefOr[Double] = js.undefined
  
  /** 清空选中按钮（当selection为true起作用） */
  var selectClearBtn: js.UndefOr[Boolean] = js.undefined
  
  /** selection为true 的列有效，类型为 Function，Function 的返回值用来决定这一行的 CheckBox 是否可以勾选 */
  var selectable: js.UndefOr[js.Function1[/* row */ Any, Boolean]] = js.undefined
  
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
  
  /** 表格总控件大小 */
  var size: js.UndefOr[typings.smallweiAvue.Size] = js.undefined
  
  /** 拖拽排序 */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /** 栅格 */
  var span: js.UndefOr[Double] = js.undefined
  
  /** 是否为斑马纹 */
  var stripe: js.UndefOr[Boolean] = js.undefined
  
  /** 提交按钮 */
  var submitBtn: js.UndefOr[Boolean] = js.undefined
  
  /** 提交按钮文案 */
  var submitText: js.UndefOr[String] = js.undefined
  
  /** 表格合计需要配置的字段 */
  var sumColumnList: js.UndefOr[js.Array[String]] = js.undefined
  
  /** 选项卡模式 */
  var tabs: js.UndefOr[Boolean] = js.undefined
  
  /** 表格标题 */
  var title: js.UndefOr[String] = js.undefined
  
  /** 展示类型 */
  var `type`: js.UndefOr[form | crud] = js.undefined
  
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
object typeformcrudundefinedrowA {
  
  inline def apply(): typeformcrudundefinedrowA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typeformcrudundefinedrowA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typeformcrudundefinedrowA] (val x: Self) extends AnyVal {
    
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
    
    inline def setClearExclude(value: js.Array[String]): Self = StObject.set(x, "clearExclude", value.asInstanceOf[js.Any])
    
    inline def setClearExcludeUndefined: Self = StObject.set(x, "clearExclude", js.undefined)
    
    inline def setClearExcludeVarargs(value: String*): Self = StObject.set(x, "clearExclude", js.Array(value*))
    
    inline def setColumn(value: js.Array[AvueCrudColumn[Any]]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnBtn(value: Boolean): Self = StObject.set(x, "columnBtn", value.asInstanceOf[js.Any])
    
    inline def setColumnBtnUndefined: Self = StObject.set(x, "columnBtn", js.undefined)
    
    inline def setColumnSort(value: Boolean): Self = StObject.set(x, "columnSort", value.asInstanceOf[js.Any])
    
    inline def setColumnSortUndefined: Self = StObject.set(x, "columnSort", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setColumnVarargs(value: AvueCrudColumn[Any]*): Self = StObject.set(x, "column", js.Array(value*))
    
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
    
    inline def setDetail(value: Boolean): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
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
    
    inline def setEmptyBtn(value: Boolean): Self = StObject.set(x, "emptyBtn", value.asInstanceOf[js.Any])
    
    inline def setEmptyBtnIcon(value: String): Self = StObject.set(x, "emptyBtnIcon", value.asInstanceOf[js.Any])
    
    inline def setEmptyBtnIconUndefined: Self = StObject.set(x, "emptyBtnIcon", js.undefined)
    
    inline def setEmptyBtnText(value: String): Self = StObject.set(x, "emptyBtnText", value.asInstanceOf[js.Any])
    
    inline def setEmptyBtnTextUndefined: Self = StObject.set(x, "emptyBtnText", js.undefined)
    
    inline def setEmptyBtnUndefined: Self = StObject.set(x, "emptyBtn", js.undefined)
    
    inline def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
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
    
    inline def setGroup(value: js.Array[AvueCrudGroup[Any]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: AvueCrudGroup[Any]*): Self = StObject.set(x, "group", js.Array(value*))
    
    inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
    
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
    
    inline def setLabelPosition(value: LabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
    
    inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
    
    inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
    
    inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
    
    inline def setLabelWidth(value: Double | String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuAlign(value: Align): Self = StObject.set(x, "menuAlign", value.asInstanceOf[js.Any])
    
    inline def setMenuAlignUndefined: Self = StObject.set(x, "menuAlign", js.undefined)
    
    inline def setMenuBtn(value: Boolean): Self = StObject.set(x, "menuBtn", value.asInstanceOf[js.Any])
    
    inline def setMenuBtnTitle(value: String): Self = StObject.set(x, "menuBtnTitle", value.asInstanceOf[js.Any])
    
    inline def setMenuBtnTitleUndefined: Self = StObject.set(x, "menuBtnTitle", js.undefined)
    
    inline def setMenuBtnUndefined: Self = StObject.set(x, "menuBtn", js.undefined)
    
    inline def setMenuFixed(value: Boolean): Self = StObject.set(x, "menuFixed", value.asInstanceOf[js.Any])
    
    inline def setMenuFixedUndefined: Self = StObject.set(x, "menuFixed", js.undefined)
    
    inline def setMenuHeaderAlign(value: Align): Self = StObject.set(x, "menuHeaderAlign", value.asInstanceOf[js.Any])
    
    inline def setMenuHeaderAlignUndefined: Self = StObject.set(x, "menuHeaderAlign", js.undefined)
    
    inline def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
    
    inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
    
    inline def setMenuSpan(value: Double): Self = StObject.set(x, "menuSpan", value.asInstanceOf[js.Any])
    
    inline def setMenuSpanUndefined: Self = StObject.set(x, "menuSpan", js.undefined)
    
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
    
    inline def setRowAdd(value: /* done */ js.Function1[/* row */ Any, Unit] => Unit): Self = StObject.set(x, "rowAdd", js.Any.fromFunction1(value))
    
    inline def setRowAddUndefined: Self = StObject.set(x, "rowAdd", js.undefined)
    
    inline def setRowDel(value: (/* row */ Any, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "rowDel", js.Any.fromFunction2(value))
    
    inline def setRowDelUndefined: Self = StObject.set(x, "rowDel", js.undefined)
    
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
    
    inline def setSearchSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "searchSize", value.asInstanceOf[js.Any])
    
    inline def setSearchSizeUndefined: Self = StObject.set(x, "searchSize", js.undefined)
    
    inline def setSearchSpan(value: Double): Self = StObject.set(x, "searchSpan", value.asInstanceOf[js.Any])
    
    inline def setSearchSpanUndefined: Self = StObject.set(x, "searchSpan", js.undefined)
    
    inline def setSelectClearBtn(value: Boolean): Self = StObject.set(x, "selectClearBtn", value.asInstanceOf[js.Any])
    
    inline def setSelectClearBtnUndefined: Self = StObject.set(x, "selectClearBtn", js.undefined)
    
    inline def setSelectable(value: /* row */ Any => Boolean): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
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
    
    inline def setSize(value: typings.smallweiAvue.Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
    
    inline def setStripe(value: Boolean): Self = StObject.set(x, "stripe", value.asInstanceOf[js.Any])
    
    inline def setStripeUndefined: Self = StObject.set(x, "stripe", js.undefined)
    
    inline def setSubmitBtn(value: Boolean): Self = StObject.set(x, "submitBtn", value.asInstanceOf[js.Any])
    
    inline def setSubmitBtnUndefined: Self = StObject.set(x, "submitBtn", js.undefined)
    
    inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
    
    inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
    
    inline def setSumColumnList(value: js.Array[String]): Self = StObject.set(x, "sumColumnList", value.asInstanceOf[js.Any])
    
    inline def setSumColumnListUndefined: Self = StObject.set(x, "sumColumnList", js.undefined)
    
    inline def setSumColumnListVarargs(value: String*): Self = StObject.set(x, "sumColumnList", js.Array(value*))
    
    inline def setTabs(value: Boolean): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: form | crud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
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
