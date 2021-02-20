package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "InputBase")
@js.native
class InputBase protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def addonClasses(): js.Any = js.native
  
  def addonIconClasses(): js.Any = js.native
  
  def baseClasses(): js.Any = js.native
  
  def blur(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInputBase(e: js.Any): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getSelectionRange(): js.Any = js.native
  
  def getSelectionStart(): js.Any = js.native
  
  def handleInputChange(e: js.Any): Unit = js.native
  
  def inputClasses(): js.Any = js.native
  
  def isDiff(e: js.Any, t: js.Any): js.Any = js.native
  
  def renderAddon(e: js.Any): js.Any = js.native
  
  def renderInput(): js.Any = js.native
  
  def renderOthers(): js.Any = js.native
  
  def setSelectionRange(e: js.Any, t: js.Any): Unit = js.native
  
  def setValue(e: js.Any): Unit = js.native
  
  def text(): js.Any = js.native
}
object InputBase {
  
  object contextTypes {
    
    object fieldAdd {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldAdd")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldAdd
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldAdd.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldBlur {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldBlur
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldChange {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldChange
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldFocus {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldFocus
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldName {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldName")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldName
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldName.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldRemove {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldRemove")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.fieldRemove
      @JSImport("rc-easyui", "InputBase.contextTypes.fieldRemove.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object locale {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.locale
      @JSImport("rc-easyui", "InputBase.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "InputBase.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.contextTypes.t
      @JSImport("rc-easyui", "InputBase.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "InputBase.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.editable")
    @js.native
    val editable: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.iconAlign")
    @js.native
    val iconAlign: String = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.invalid")
    @js.native
    val invalid: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.multiline")
    @js.native
    val multiline: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.onBlur")
    @js.native
    def onBlur(): Unit = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.onChange")
    @js.native
    def onChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.onFocus")
    @js.native
    def onFocus(): Unit = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.readOnly")
    @js.native
    val readOnly: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.textFormatter")
    @js.native
    def textFormatter(e: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.validateOnBlur")
    @js.native
    val validateOnBlur: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.validateOnChange")
    @js.native
    val validateOnChange: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.validateOnCreate")
    @js.native
    val validateOnCreate: Boolean = js.native
    
    @JSImport("rc-easyui", "InputBase.defaultProps.value")
    @js.native
    val value: js.Any = js.native
  }
  
  object propTypes {
    
    object addonLeft {
      
      @JSImport("rc-easyui", "InputBase.propTypes.addonLeft")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.addonLeft
      @JSImport("rc-easyui", "InputBase.propTypes.addonLeft.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object addonRight {
      
      @JSImport("rc-easyui", "InputBase.propTypes.addonRight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.addonRight
      @JSImport("rc-easyui", "InputBase.propTypes.addonRight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      @JSImport("rc-easyui", "InputBase.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.className
      @JSImport("rc-easyui", "InputBase.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object disabled {
      
      @JSImport("rc-easyui", "InputBase.propTypes.disabled")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.disabled
      @JSImport("rc-easyui", "InputBase.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editable {
      
      @JSImport("rc-easyui", "InputBase.propTypes.editable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.editable
      @JSImport("rc-easyui", "InputBase.propTypes.editable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconAlign {
      
      @JSImport("rc-easyui", "InputBase.propTypes.iconAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.iconAlign
      @JSImport("rc-easyui", "InputBase.propTypes.iconAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      @JSImport("rc-easyui", "InputBase.propTypes.iconCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.iconCls
      @JSImport("rc-easyui", "InputBase.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputCls {
      
      @JSImport("rc-easyui", "InputBase.propTypes.inputCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.inputCls
      @JSImport("rc-easyui", "InputBase.propTypes.inputCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputId {
      
      @JSImport("rc-easyui", "InputBase.propTypes.inputId")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.inputId
      @JSImport("rc-easyui", "InputBase.propTypes.inputId.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputStyle {
      
      @JSImport("rc-easyui", "InputBase.propTypes.inputStyle")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.inputStyle
      @JSImport("rc-easyui", "InputBase.propTypes.inputStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiline {
      
      @JSImport("rc-easyui", "InputBase.propTypes.multiline")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.multiline
      @JSImport("rc-easyui", "InputBase.propTypes.multiline.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onBlur {
      
      @JSImport("rc-easyui", "InputBase.propTypes.onBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.onBlur
      @JSImport("rc-easyui", "InputBase.propTypes.onBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onChange {
      
      @JSImport("rc-easyui", "InputBase.propTypes.onChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.onChange
      @JSImport("rc-easyui", "InputBase.propTypes.onChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onFocus {
      
      @JSImport("rc-easyui", "InputBase.propTypes.onFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.onFocus
      @JSImport("rc-easyui", "InputBase.propTypes.onFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object placeholder {
      
      @JSImport("rc-easyui", "InputBase.propTypes.placeholder")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.placeholder
      @JSImport("rc-easyui", "InputBase.propTypes.placeholder.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object readOnly {
      
      @JSImport("rc-easyui", "InputBase.propTypes.readOnly")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.readOnly
      @JSImport("rc-easyui", "InputBase.propTypes.readOnly.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "InputBase.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.style
      @JSImport("rc-easyui", "InputBase.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabIndex {
      
      @JSImport("rc-easyui", "InputBase.propTypes.tabIndex")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.tabIndex
      @JSImport("rc-easyui", "InputBase.propTypes.tabIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object textFormatter {
      
      @JSImport("rc-easyui", "InputBase.propTypes.textFormatter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.textFormatter
      @JSImport("rc-easyui", "InputBase.propTypes.textFormatter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object value {
      
      @JSImport("rc-easyui", "InputBase.propTypes.value")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.InputBase.propTypes.value
      @JSImport("rc-easyui", "InputBase.propTypes.value.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
