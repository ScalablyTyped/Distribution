package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "CheckBox")
@js.native
class CheckBox protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  def checkClasses(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCheckBox(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCheckBox(e: js.Any): Unit = js.native
  def handleChange(): Unit = js.native
  def handleClick(e: js.Any): Unit = js.native
  def initChecked(e: js.Any, args: js.Any*): Unit = js.native
  def updateValues(): Unit = js.native
  def wrapperClasses(): js.Any = js.native
}

@JSImport("rc-easyui", "CheckBox")
@js.native
object CheckBox extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object fieldAdd extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldAdd
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldBlur extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldBlur
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldChange extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldFocus extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldFocus
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldName extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldName
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldRemove extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.fieldRemove
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.CheckBox.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val checked: Boolean = js.native
    val disabled: Boolean = js.native
    val multiple: Boolean = js.native
    val values: js.Array[js.Any] = js.native
    def onChange(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object checked extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.checked
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object disabled extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.disabled
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object inputId extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.inputId
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object multiple extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.multiple
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onChange extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.onChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object value extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.value
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object values extends js.Object {
      // Circular reference from rc_easyui.CheckBox.propTypes.values
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

