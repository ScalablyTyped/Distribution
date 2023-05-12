package typings.smallweiAvue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.smallweiAvue.anon.ColumnAvueFormColumn
import typings.smallweiAvue.anon.ColumnDic
import typings.smallweiAvue.anon.ColumnIndex
import typings.smallweiAvue.anon.DicDisabled
import typings.smallweiAvue.anon.DisabledSize
import typings.smallweiAvue.anon.Slots
import typings.smallweiAvue.anon.typeformcrudundefinedrowA
import typings.smallweiAvue.dicMod.DicItem
import typings.smallweiAvue.dicMod.DicProps
import typings.std.File
import typings.std.InstanceType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue/form", "AvueForm")
  @js.native
  open class AvueForm ()
    extends StObject
       with Slots {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueFormProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueFormSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue/form", "AvueForm")
  @js.native
  val AvueForm: Instantiable0[Slots] = js.native
  
  trait AvueFormColumn[T, K]
    extends StObject
       with /** 其它属性根据type查看对应的文档 */
  /* x */ StringDictionary[Any] {
    
    /** 分组折叠 */
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    /** 深结构数据绑定值 */
    var bind: js.UndefOr[String] = js.undefined
    
    /** 失焦事件 */
    var blur: js.UndefOr[js.Function1[/* args */ ColumnIndex[T], Unit]] = js.undefined
    
    /** 值改变事件 */
    var change: js.UndefOr[js.Function1[/* args */ ColumnIndex[T], Unit]] = js.undefined
    
    /** 子表单 */
    var children: js.UndefOr[typeformcrudundefinedrowA] = js.undefined
    
    /** 是否可以清空选项 */
    var clearable: js.UndefOr[Boolean] = js.undefined
    
    /** 点击事件 */
    var click: js.UndefOr[js.Function1[/* args */ ColumnIndex[T], Unit]] = js.undefined
    
    /** 分组默认叠起 */
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    /** 等同于<component :is=""> */
    var component: js.UndefOr[String | Component] = js.undefined
    
    /** 字段控制器 */
    var control: js.UndefOr[
        js.Function2[
          /* val */ Any, 
          /* form */ T, 
          Record[
            String, 
            AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]
          ]
        ]
      ] = js.undefined
    
    /** 数据类型用于数组和字符串之间的转化 */
    var dataType: js.UndefOr[String] = js.undefined
    
    /** 数据字典值 */
    var dicData: js.UndefOr[js.Array[DicItem]] = js.undefined
    
    /** 数据字典接口url返回数据格式化方法 */
    var dicFormatter: js.UndefOr[js.Function1[/* res */ Any, js.Array[DicItem]]] = js.undefined
    
    /** 数据字典接口url携带头部参数 */
    var dicHeaders: js.UndefOr[js.Object] = js.undefined
    
    /** 数据字典接口请求方式 */
    var dicMethod: js.UndefOr[String] = js.undefined
    
    /** 数据字典接口url携带请求参数 */
    var dicQuery: js.UndefOr[js.Object] = js.undefined
    
    /** 数据字典接口url地址 */
    var dicUrl: js.UndefOr[String] = js.undefined
    
    /** 禁用 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** 是否可见 */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** 聚焦事件 */
    var focus: js.UndefOr[js.Function1[/* args */ ColumnIndex[T], Unit]] = js.undefined
    
    /** 栅格间隔 */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /** 标题名称 */
    var label: js.UndefOr[String] = js.undefined
    
    /** 表单域标签的位置，如果值为 left 或者 right 时，则需要设置 labelWidth */
    var labelPosition: js.UndefOr[LabelPosition] = js.undefined
    
    /** 标题文字提示 */
    var labelTip: js.UndefOr[String] = js.undefined
    
    /** 标题文字提示展示方向 */
    var labelTipPlacement: js.UndefOr[String] = js.undefined
    
    /** 标题名称宽度 */
    var labelWidth: js.UndefOr[Double | String] = js.undefined
    
    /** 栅格左侧的间隔格数 */
    var offset: js.UndefOr[Double] = js.undefined
    
    /** 字段位置排序，数字越大位置越靠前 */
    var order: js.UndefOr[Double] = js.undefined
    
    /** 传递给组件的参数 */
    var params: js.UndefOr[js.Object] = js.undefined
    
    /** 辅助语 */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** 列字段(唯一不重复) */
    var prop: js.UndefOr[K] = js.undefined
    
    /** 数据字典属性的配置对象 */
    var props: js.UndefOr[DicProps] = js.undefined
    
    /** 栅格向左移动格数 */
    var pull: js.UndefOr[Double] = js.undefined
    
    /** 栅格向右移动格数 */
    var push: js.UndefOr[Double] = js.undefined
    
    /** 只读 */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /** 栅格单独成行 */
    var row: js.UndefOr[Boolean] = js.undefined
    
    /** 验证规则可以参考 [async-validator](https://github.com/yiminghe/async-validator) */
    var rules: js.UndefOr[js.Array[FormItemRule]] = js.undefined
    
    /** 组件的尺寸 */
    var size: js.UndefOr[Size] = js.undefined
    
    /** 栅格占据的列数 */
    var span: js.UndefOr[Double] = js.undefined
    
    /** 文字提示 */
    var tip: js.UndefOr[String] = js.undefined
    
    /** 文字提示展示方向 */
    var tipPlacement: js.UndefOr[String] = js.undefined
    
    /** 表单项类型 */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** 初始化默认值 */
    var value: js.UndefOr[Any] = js.undefined
  }
  object AvueFormColumn {
    
    inline def apply[T, K](): AvueFormColumn[T, K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueFormColumn[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueFormColumn[?, ?], T, K] (val x: Self & (AvueFormColumn[T, K])) extends AnyVal {
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBind(value: String): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setBlur(value: /* args */ ColumnIndex[T] => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction1(value))
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setChange(value: /* args */ ColumnIndex[T] => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setChildren(value: typeformcrudundefinedrowA): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClearable(value: Boolean): Self = StObject.set(x, "clearable", value.asInstanceOf[js.Any])
      
      inline def setClearableUndefined: Self = StObject.set(x, "clearable", js.undefined)
      
      inline def setClick(value: /* args */ ColumnIndex[T] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setComponent(value: String | Component): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setControl(
        value: (/* val */ Any, /* form */ T) => Record[
              String, 
              AvueFormColumn[
                T, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "control", js.Any.fromFunction2(value))
      
      inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDicData(value: js.Array[DicItem]): Self = StObject.set(x, "dicData", value.asInstanceOf[js.Any])
      
      inline def setDicDataUndefined: Self = StObject.set(x, "dicData", js.undefined)
      
      inline def setDicDataVarargs(value: DicItem*): Self = StObject.set(x, "dicData", js.Array(value*))
      
      inline def setDicFormatter(value: /* res */ Any => js.Array[DicItem]): Self = StObject.set(x, "dicFormatter", js.Any.fromFunction1(value))
      
      inline def setDicFormatterUndefined: Self = StObject.set(x, "dicFormatter", js.undefined)
      
      inline def setDicHeaders(value: js.Object): Self = StObject.set(x, "dicHeaders", value.asInstanceOf[js.Any])
      
      inline def setDicHeadersUndefined: Self = StObject.set(x, "dicHeaders", js.undefined)
      
      inline def setDicMethod(value: String): Self = StObject.set(x, "dicMethod", value.asInstanceOf[js.Any])
      
      inline def setDicMethodUndefined: Self = StObject.set(x, "dicMethod", js.undefined)
      
      inline def setDicQuery(value: js.Object): Self = StObject.set(x, "dicQuery", value.asInstanceOf[js.Any])
      
      inline def setDicQueryUndefined: Self = StObject.set(x, "dicQuery", js.undefined)
      
      inline def setDicUrl(value: String): Self = StObject.set(x, "dicUrl", value.asInstanceOf[js.Any])
      
      inline def setDicUrlUndefined: Self = StObject.set(x, "dicUrl", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFocus(value: /* args */ ColumnIndex[T] => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: LabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelTip(value: String): Self = StObject.set(x, "labelTip", value.asInstanceOf[js.Any])
      
      inline def setLabelTipPlacement(value: String): Self = StObject.set(x, "labelTipPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelTipPlacementUndefined: Self = StObject.set(x, "labelTipPlacement", js.undefined)
      
      inline def setLabelTipUndefined: Self = StObject.set(x, "labelTip", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelWidth(value: Double | String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setProp(value: K): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setProps(value: DicProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setPull(value: Double): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      inline def setPush(value: Double): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRules(value: js.Array[FormItemRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: FormItemRule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipPlacement(value: String): Self = StObject.set(x, "tipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTipPlacementUndefined: Self = StObject.set(x, "tipPlacement", js.undefined)
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type AvueFormDefaults = Record[
    String, 
    AvueFormColumn[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof any extends string ? keyof any : string */ js.Any
    ]
  ]
  
  trait AvueFormGroup[T] extends StObject {
    
    /** 是否显示右侧箭头 */
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    /** 是否折叠 */
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    /** 表单项配置 */
    var column: js.UndefOr[
        js.Array[
          AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ]
        ]
      ] = js.undefined
    
    /** 是否禁用 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** 是否显示分组 */
    var display: js.UndefOr[Boolean] = js.undefined
    
    /** 左侧图标 */
    var icon: js.UndefOr[String] = js.undefined
    
    /** 标题 */
    var label: js.UndefOr[String] = js.undefined
    
    /** 分组字段唯一标识 */
    var prop: js.UndefOr[String] = js.undefined
  }
  object AvueFormGroup {
    
    inline def apply[T](): AvueFormGroup[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueFormGroup[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueFormGroup[?], T] (val x: Self & AvueFormGroup[T]) extends AnyVal {
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setColumn(
        value: js.Array[
              AvueFormColumn[
                T, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumnVarargs(
        value: (AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ])*
      ): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
    }
  }
  
  type AvueFormInstance = InstanceType[Instantiable0[Slots]] & AvueFormMethods
  
  @js.native
  trait AvueFormMethods extends StObject {
    
    /** 移除表单项的校验结果。传入待移除的表单项的 prop 属性或者 prop 组成的数组，如不传则移除整个表单的校验结果 */
    def clearValidate(): Unit = js.native
    
    /** 重新初始化字典 */
    def dicInit(): Unit = js.native
    
    /** 获取prop的ref对象 */
    def getPropRef(prop: String): Unit = js.native
    
    /** 重新初始化（多数用于服务端加载或者更新网络字典） */
    def init(): Unit = js.native
    
    /** 对整个表单进行重置，将所有字段值重置为初始值并移除校验结果 */
    def resetFields(): Unit = js.native
    
    /** 对整个表单进行重置 */
    def resetForm(): Unit = js.native
    
    /** 对整个表单进行提交 */
    def submit(): Unit = js.native
    
    /** 更新字典 */
    def updateDic(props: String): Unit = js.native
    
    /** 对整个表单进行校验的方法，参数为一个回调函数。该回调函数会在校验结束后被调用，并传入两个参数：是否校验成功和未通过校验的字段。若不传入回调函数，则会返回一个 promise */
    def validate(): js.Promise[Boolean] = js.native
    def validate(callback: js.Function3[/* valid */ Boolean, /* done */ js.Function0[Unit], /* msg */ String, Unit]): js.Promise[Boolean] = js.native
    
    /** 对部分表单字段进行校验的方法 */
    def validateField(props: js.Array[String]): Unit = js.native
  }
  
  trait AvueFormOption[T] extends StObject {
    
    /** 重值不清空的字段 */
    var clearExclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /** 表单项配置 */
    var column: js.UndefOr[
        js.Array[
          AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ]
        ]
      ] = js.undefined
    
    /** 查看模式 */
    var detail: js.UndefOr[Boolean] = js.undefined
    
    /** 清空按钮 */
    var emptyBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 清空按钮文案 */
    var emptyText: js.UndefOr[String] = js.undefined
    
    /** 回车按键触发提交表单 */
    var enter: js.UndefOr[Boolean] = js.undefined
    
    /** 表单分组配置 */
    var group: js.UndefOr[js.Array[AvueFormGroup[T]]] = js.undefined
    
    /** 间隔 */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /** 标题位置，如果值为 left 或者 right 时，则需要设置 labelWidth */
    var labelPosition: js.UndefOr[LabelPosition] = js.undefined
    
    /** 标题的后缀 */
    var labelSuffix: js.UndefOr[String] = js.undefined
    
    /** 标题宽度 */
    var labelWidth: js.UndefOr[Double | String] = js.undefined
    
    /** 表单操作栏 */
    var menuBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 表单操作菜单按钮的排列方式 */
    var menuPosition: js.UndefOr[MenuPosition] = js.undefined
    
    /** 表单操作菜单栅格占据的列数 */
    var menuSpan: js.UndefOr[Double] = js.undefined
    
    /** 表格总控件大小 */
    var size: js.UndefOr[Size] = js.undefined
    
    /** 栅格 */
    var span: js.UndefOr[Double] = js.undefined
    
    /** 提交按钮 */
    var submitBtn: js.UndefOr[Boolean] = js.undefined
    
    /** 提交按钮文案 */
    var submitText: js.UndefOr[String] = js.undefined
    
    /** 选项卡模式 */
    var tabs: js.UndefOr[Boolean] = js.undefined
  }
  object AvueFormOption {
    
    inline def apply[T](): AvueFormOption[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueFormOption[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueFormOption[?], T] (val x: Self & AvueFormOption[T]) extends AnyVal {
      
      inline def setClearExclude(value: js.Array[String]): Self = StObject.set(x, "clearExclude", value.asInstanceOf[js.Any])
      
      inline def setClearExcludeUndefined: Self = StObject.set(x, "clearExclude", js.undefined)
      
      inline def setClearExcludeVarargs(value: String*): Self = StObject.set(x, "clearExclude", js.Array(value*))
      
      inline def setColumn(
        value: js.Array[
              AvueFormColumn[
                T, 
                /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setColumnVarargs(
        value: (AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ])*
      ): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setDetail(value: Boolean): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setEmptyBtn(value: Boolean): Self = StObject.set(x, "emptyBtn", value.asInstanceOf[js.Any])
      
      inline def setEmptyBtnUndefined: Self = StObject.set(x, "emptyBtn", js.undefined)
      
      inline def setEmptyText(value: String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setGroup(value: js.Array[AvueFormGroup[T]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroupVarargs(value: AvueFormGroup[T]*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setLabelPosition(value: LabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelSuffix(value: String): Self = StObject.set(x, "labelSuffix", value.asInstanceOf[js.Any])
      
      inline def setLabelSuffixUndefined: Self = StObject.set(x, "labelSuffix", js.undefined)
      
      inline def setLabelWidth(value: Double | String): Self = StObject.set(x, "labelWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelWidthUndefined: Self = StObject.set(x, "labelWidth", js.undefined)
      
      inline def setMenuBtn(value: Boolean): Self = StObject.set(x, "menuBtn", value.asInstanceOf[js.Any])
      
      inline def setMenuBtnUndefined: Self = StObject.set(x, "menuBtn", js.undefined)
      
      inline def setMenuPosition(value: MenuPosition): Self = StObject.set(x, "menuPosition", value.asInstanceOf[js.Any])
      
      inline def setMenuPositionUndefined: Self = StObject.set(x, "menuPosition", js.undefined)
      
      inline def setMenuSpan(value: Double): Self = StObject.set(x, "menuSpan", value.asInstanceOf[js.Any])
      
      inline def setMenuSpanUndefined: Self = StObject.set(x, "menuSpan", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSubmitBtn(value: Boolean): Self = StObject.set(x, "submitBtn", value.asInstanceOf[js.Any])
      
      inline def setSubmitBtnUndefined: Self = StObject.set(x, "submitBtn", js.undefined)
      
      inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      inline def setTabs(value: Boolean): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    }
  }
  
  trait AvueFormProps[T] extends StObject {
    
    /** 配置项结构 */
    var defaults: js.UndefOr[AvueFormDefaults] = js.undefined
    
    /** 表单绑定值 v-model */
    var modelValue: js.UndefOr[T] = js.undefined
    
    /** 表单重置回调事件 */
    var onResetChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** 表单提交回调事件 */
    var onSubmit: js.UndefOr[js.Function2[/* form */ T, /* done */ js.Function0[Unit], Unit]] = js.undefined
    
    /** 更新配置项结构 */
    @JSName("onUpdate:defaults")
    var onUpdateColondefaults: js.UndefOr[js.Function1[/* defaluts */ AvueFormDefaults, Any]] = js.undefined
    
    /** 更新表单值 */
    @JSName("onUpdate:modelValue")
    var onUpdateColonmodelValue: js.UndefOr[js.Function1[/* row */ T, Any]] = js.undefined
    
    /** 表单总配置属性 */
    var option: js.UndefOr[AvueFormOption[T]] = js.undefined
    
    /** upload组件上传后的回调,done用于结束操作，loading用于中断操作 */
    var `upload-after`: js.UndefOr[
        js.Function4[
          /* res */ Any, 
          /* done */ js.Function0[Unit], 
          /* loading */ js.Function0[Unit], 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    /** upload组件上传前的回调,done用于继续图片上传，loading用于中断操作 */
    var `upload-before`: js.UndefOr[
        js.Function4[
          /* file */ UploadRawFile, 
          /* done */ js.Function1[/* file */ js.UndefOr[File], Unit], 
          /* loading */ js.Function0[Unit], 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    /** upload组件删除文件之前的钩子，参数为上传的文件和文件列表，若返回 false 或者返回 Promise 且被 reject，则停止删除 */
    var `upload-delete`: js.UndefOr[
        js.Function2[
          /* file */ UploadFile, 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          Boolean | js.Promise[Any] | Unit
        ]
      ] = js.undefined
    
    /** upload组件上传失败错误回调 */
    var `upload-error`: js.UndefOr[
        js.Function2[
          /* error */ js.Error, 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    /** upload组件上传超过长度限制回调 */
    var `upload-exceed`: js.UndefOr[
        js.Function4[
          /* limit */ Double, 
          /* files */ js.Array[File], 
          /* fileList */ js.Array[UploadUserFile], 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          Unit
        ]
      ] = js.undefined
    
    /** upload组件查看回调 */
    var `upload-preview`: js.UndefOr[
        js.Function3[
          /* file */ UploadFile, 
          /* column */ AvueFormColumn[
            T, 
            /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
          ], 
          /* done */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object AvueFormProps {
    
    inline def apply[T](): AvueFormProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueFormProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueFormProps[?], T] (val x: Self & AvueFormProps[T]) extends AnyVal {
      
      inline def setDefaults(value: AvueFormDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setModelValue(value: T): Self = StObject.set(x, "modelValue", value.asInstanceOf[js.Any])
      
      inline def setModelValueUndefined: Self = StObject.set(x, "modelValue", js.undefined)
      
      inline def setOnResetChange(value: () => Unit): Self = StObject.set(x, "onResetChange", js.Any.fromFunction0(value))
      
      inline def setOnResetChangeUndefined: Self = StObject.set(x, "onResetChange", js.undefined)
      
      inline def setOnSubmit(value: (/* form */ T, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction2(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnUpdateColondefaults(value: /* defaluts */ AvueFormDefaults => Any): Self = StObject.set(x, "onUpdate:defaults", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColondefaultsUndefined: Self = StObject.set(x, "onUpdate:defaults", js.undefined)
      
      inline def setOnUpdateColonmodelValue(value: /* row */ T => Any): Self = StObject.set(x, "onUpdate:modelValue", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColonmodelValueUndefined: Self = StObject.set(x, "onUpdate:modelValue", js.undefined)
      
      inline def setOption(value: AvueFormOption[T]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
      
      inline def `setUpload-after`(
        value: (/* res */ Any, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit], /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "upload-after", js.Any.fromFunction4(value))
      
      inline def `setUpload-afterUndefined`: Self = StObject.set(x, "upload-after", js.undefined)
      
      inline def `setUpload-before`(
        value: (/* file */ UploadRawFile, /* done */ js.Function1[/* file */ js.UndefOr[File], Unit], /* loading */ js.Function0[Unit], /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "upload-before", js.Any.fromFunction4(value))
      
      inline def `setUpload-beforeUndefined`: Self = StObject.set(x, "upload-before", js.undefined)
      
      inline def `setUpload-delete`(
        value: (/* file */ UploadFile, /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]) => Boolean | js.Promise[Any] | Unit
      ): Self = StObject.set(x, "upload-delete", js.Any.fromFunction2(value))
      
      inline def `setUpload-deleteUndefined`: Self = StObject.set(x, "upload-delete", js.undefined)
      
      inline def `setUpload-error`(
        value: (/* error */ js.Error, /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "upload-error", js.Any.fromFunction2(value))
      
      inline def `setUpload-errorUndefined`: Self = StObject.set(x, "upload-error", js.undefined)
      
      inline def `setUpload-exceed`(
        value: (/* limit */ Double, /* files */ js.Array[File], /* fileList */ js.Array[UploadUserFile], /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "upload-exceed", js.Any.fromFunction4(value))
      
      inline def `setUpload-exceedUndefined`: Self = StObject.set(x, "upload-exceed", js.undefined)
      
      inline def `setUpload-preview`(
        value: (/* file */ UploadFile, /* column */ AvueFormColumn[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof T extends string ? keyof T : string */ js.Any
            ], /* done */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "upload-preview", js.Any.fromFunction3(value))
      
      inline def `setUpload-previewUndefined`: Self = StObject.set(x, "upload-preview", js.undefined)
    }
  }
  
  trait AvueFormSlots[T]
    extends StObject
       with /* x */ StringDictionary[
          (js.Function1[/* scoped */ ColumnAvueFormColumn[T], js.Array[VNode]]) & (js.Function1[/* scoped */ ColumnDic[T], js.Array[VNode]]) & (js.Function1[/* scoped */ DicDisabled[T], js.Array[VNode]])
        ] {
    
    def `menu-form`(scoped: DisabledSize): js.Array[VNode]
  }
  object AvueFormSlots {
    
    inline def apply[T](`menu-form`: DisabledSize => js.Array[VNode]): AvueFormSlots[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("menu-form")(js.Any.fromFunction1(`menu-form`))
      __obj.asInstanceOf[AvueFormSlots[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueFormSlots[?], T] (val x: Self & AvueFormSlots[T]) extends AnyVal {
      
      inline def `setMenu-form`(value: DisabledSize => js.Array[VNode]): Self = StObject.set(x, "menu-form", js.Any.fromFunction1(value))
    }
  }
}
