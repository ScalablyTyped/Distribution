package typings.smallweiAvue

import org.scalablytyped.runtime.Instantiable0
import typings.smallweiAvue.anon.DataNode
import typings.smallweiAvue.anon.Node
import typings.smallweiAvue.anon.PropsSlots
import typings.smallweiAvue.formMod.AvueFormOption
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue/tree", "AvueTree")
  @js.native
  open class AvueTree ()
    extends StObject
       with PropsSlots {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueTreeProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueTreeSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue/tree", "AvueTree")
  @js.native
  val AvueTree: Instantiable0[PropsSlots] = js.native
  
  type AvueTreeInstance = InstanceType[Instantiable0[PropsSlots]]
  
  trait AvueTreeOption[T] extends StObject {
    
    // 新增按钮
    var addBtn: js.UndefOr[Boolean] = js.undefined
    
    // 是否展开节点
    var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    // 修改按钮
    var delBtn: js.UndefOr[Boolean] = js.undefined
    
    // 弹出框宽度
    var dialogWidth: js.UndefOr[String] = js.undefined
    
    // 编辑按钮
    var editBtn: js.UndefOr[Boolean] = js.undefined
    
    // 是否显示搜索框
    var filter: js.UndefOr[Boolean] = js.undefined
    
    // 自定义form表单，具体参考avue-form
    var formOption: js.UndefOr[AvueFormOption[T]] = js.undefined
    
    // 菜单栏
    var menu: js.UndefOr[Boolean] = js.undefined
    
    // 配置选项
    var props: js.UndefOr[TreeProps] = js.undefined
  }
  object AvueTreeOption {
    
    inline def apply[T](): AvueTreeOption[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueTreeOption[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueTreeOption[?], T] (val x: Self & AvueTreeOption[T]) extends AnyVal {
      
      inline def setAddBtn(value: Boolean): Self = StObject.set(x, "addBtn", value.asInstanceOf[js.Any])
      
      inline def setAddBtnUndefined: Self = StObject.set(x, "addBtn", js.undefined)
      
      inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      inline def setDelBtn(value: Boolean): Self = StObject.set(x, "delBtn", value.asInstanceOf[js.Any])
      
      inline def setDelBtnUndefined: Self = StObject.set(x, "delBtn", js.undefined)
      
      inline def setDialogWidth(value: String): Self = StObject.set(x, "dialogWidth", value.asInstanceOf[js.Any])
      
      inline def setDialogWidthUndefined: Self = StObject.set(x, "dialogWidth", js.undefined)
      
      inline def setEditBtn(value: Boolean): Self = StObject.set(x, "editBtn", value.asInstanceOf[js.Any])
      
      inline def setEditBtnUndefined: Self = StObject.set(x, "editBtn", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormOption(value: AvueFormOption[T]): Self = StObject.set(x, "formOption", value.asInstanceOf[js.Any])
      
      inline def setFormOptionUndefined: Self = StObject.set(x, "formOption", js.undefined)
      
      inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait AvueTreeProps[T] extends StObject {
    
    /** 存放结构体的数据 */
    var data: js.UndefOr[js.Array[T]] = js.undefined
    
    /** 删除节点回调 */
    var onDel: js.UndefOr[js.Function2[/* data */ Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
    
    /** 新增节点回调 */
    var onSave: js.UndefOr[
        js.Function4[
          /* parent */ Any, 
          /* data */ Any, 
          /* done */ js.Function0[Unit], 
          /* loading */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** 修改节点回调 */
    var onUpdate: js.UndefOr[
        js.Function4[
          /* parent */ Any, 
          /* data */ Any, 
          /* done */ js.Function0[Unit], 
          /* loading */ js.Function0[Unit], 
          Unit
        ]
      ] = js.undefined
    
    /** 组件配置属性 */
    var option: js.UndefOr[AvueTreeOption[T]] = js.undefined
  }
  object AvueTreeProps {
    
    inline def apply[T](): AvueTreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueTreeProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueTreeProps[?], T] (val x: Self & AvueTreeProps[T]) extends AnyVal {
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOnDel(value: (/* data */ Any, /* done */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onDel", js.Any.fromFunction2(value))
      
      inline def setOnDelUndefined: Self = StObject.set(x, "onDel", js.undefined)
      
      inline def setOnSave(
        value: (/* parent */ Any, /* data */ Any, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onSave", js.Any.fromFunction4(value))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setOnUpdate(
        value: (/* parent */ Any, /* data */ Any, /* done */ js.Function0[Unit], /* loading */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onUpdate", js.Any.fromFunction4(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setOption(value: AvueTreeOption[T]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    }
  }
  
  trait AvueTreeSlots[T] extends StObject {
    
    def default(scoped: DataNode[T]): js.Array[VNode]
    
    def addBtn(): js.Array[VNode]
    
    def menu(scoped: Node[T]): js.Array[VNode]
  }
  object AvueTreeSlots {
    
    inline def apply[T](
      addBtn: () => js.Array[VNode],
      default: DataNode[T] => js.Array[VNode],
      menu: Node[T] => js.Array[VNode]
    ): AvueTreeSlots[T] = {
      val __obj = js.Dynamic.literal(addBtn = js.Any.fromFunction0(addBtn), default = js.Any.fromFunction1(default), menu = js.Any.fromFunction1(menu))
      __obj.asInstanceOf[AvueTreeSlots[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueTreeSlots[?], T] (val x: Self & AvueTreeSlots[T]) extends AnyVal {
      
      inline def setAddBtn(value: () => js.Array[VNode]): Self = StObject.set(x, "addBtn", js.Any.fromFunction0(value))
      
      inline def setDefault(value: DataNode[T] => js.Array[VNode]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setMenu(value: Node[T] => js.Array[VNode]): Self = StObject.set(x, "menu", js.Any.fromFunction1(value))
    }
  }
  
  trait TreeProps extends StObject {
    
    // 指定子树为节点对象的某个属性值
    var children: js.UndefOr[String] = js.undefined
    
    // 指定节点标签为节点对象的某个属性值
    var label: js.UndefOr[String] = js.undefined
    
    // 弹窗添加节点的名称
    var labelText: js.UndefOr[String] = js.undefined
    
    // 指定节点选择框的值也作为节点的nodeKey
    var value: js.UndefOr[String] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
