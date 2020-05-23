package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "TextEditor")
@js.native
class TextEditor protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  def baseClasses(): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTextEditor(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTextEditor(e: js.Any): Unit = js.native
  def handleInputBlur(e: js.Any): Unit = js.native
  def handleInputFocus(e: js.Any): Unit = js.native
  def isDiff(e: js.Any, t: js.Any): js.Any = js.native
  def setValue(e: js.Any): Unit = js.native
}

@JSImport("rc-easyui", "TextEditor")
@js.native
object TextEditor extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object fieldAdd extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldAdd
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldBlur extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldBlur
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldChange extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldFocus extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldFocus
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldName extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldName
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object fieldRemove extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.fieldRemove
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.TextEditor.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    def onBlur(): Unit = js.native
    def onChange(e: js.Any): Unit = js.native
    def onFocus(): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object invalid extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.invalid
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object name extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.name
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onBlur extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.onBlur
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onChange extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.onChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onFocus extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.onFocus
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object validateOnBlur extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.validateOnBlur
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object validateOnChange extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.validateOnChange
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object validateOnCreate extends js.Object {
      // Circular reference from rc_easyui.TextEditor.propTypes.validateOnCreate
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

