package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "NumberBox")
@js.native
class NumberBox protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
  
  def blur(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MNumberBox(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNumberBox(e: js.Any): Unit = js.native
  
  def doSpinDown(): Unit = js.native
  
  def doSpinUp(): Unit = js.native
  
  def filter(e: js.Any): js.Any = js.native
  
  def formatter(e: js.Any): js.Any = js.native
  
  def handleInputChange(e: js.Any): Unit = js.native
  
  def handleKeyPress(e: js.Any): Unit = js.native
  
  def parser(e: js.Any): js.Any = js.native
  
  def renderInput(): js.Any = js.native
  
  def setValue(e: js.Any): Unit = js.native
}
object NumberBox {
  
  object contextTypes {
    
    object fieldAdd {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldAdd")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldAdd
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldAdd.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldBlur {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldBlur
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldChange {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldChange
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldFocus {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldFocus
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldName {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldName")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldName
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldName.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldRemove {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldRemove")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.fieldRemove
      @JSImport("rc-easyui", "NumberBox.contextTypes.fieldRemove.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object locale {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.locale
      @JSImport("rc-easyui", "NumberBox.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "NumberBox.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.contextTypes.t
      @JSImport("rc-easyui", "NumberBox.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.decimalSeparator")
    @js.native
    val decimalSeparator: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.editable")
    @js.native
    val editable: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.groupSeparator")
    @js.native
    val groupSeparator: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.iconAlign")
    @js.native
    val iconAlign: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.increment")
    @js.native
    val increment: Double = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.invalid")
    @js.native
    val invalid: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.multiline")
    @js.native
    val multiline: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.onBlur")
    @js.native
    def onBlur(): Unit = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.onChange")
    @js.native
    def onChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.onFocus")
    @js.native
    def onFocus(): Unit = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.precision")
    @js.native
    val precision: Double = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.prefix")
    @js.native
    val prefix: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.readOnly")
    @js.native
    val readOnly: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.reversed")
    @js.native
    val reversed: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.spinAlign")
    @js.native
    val spinAlign: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.spinners")
    @js.native
    val spinners: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.suffix")
    @js.native
    val suffix: String = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.textFormatter")
    @js.native
    def textFormatter(e: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.validateOnBlur")
    @js.native
    val validateOnBlur: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.validateOnChange")
    @js.native
    val validateOnChange: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.validateOnCreate")
    @js.native
    val validateOnCreate: Boolean = js.native
    
    @JSImport("rc-easyui", "NumberBox.defaultProps.value")
    @js.native
    val value: js.Any = js.native
  }
  
  object propTypes {
    
    object addonLeft {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.addonLeft")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.addonLeft
      @JSImport("rc-easyui", "NumberBox.propTypes.addonLeft.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object addonRight {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.addonRight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.addonRight
      @JSImport("rc-easyui", "NumberBox.propTypes.addonRight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.className
      @JSImport("rc-easyui", "NumberBox.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object decimalSeparator {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.decimalSeparator")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.decimalSeparator
      @JSImport("rc-easyui", "NumberBox.propTypes.decimalSeparator.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object disabled {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.disabled")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.disabled
      @JSImport("rc-easyui", "NumberBox.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editable {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.editable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.editable
      @JSImport("rc-easyui", "NumberBox.propTypes.editable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object groupSeparator {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.groupSeparator")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.groupSeparator
      @JSImport("rc-easyui", "NumberBox.propTypes.groupSeparator.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconAlign {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.iconAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.iconAlign
      @JSImport("rc-easyui", "NumberBox.propTypes.iconAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.iconCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.iconCls
      @JSImport("rc-easyui", "NumberBox.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object increment {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.increment")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.increment
      @JSImport("rc-easyui", "NumberBox.propTypes.increment.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputCls {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.inputCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.inputCls
      @JSImport("rc-easyui", "NumberBox.propTypes.inputCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputId {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.inputId")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.inputId
      @JSImport("rc-easyui", "NumberBox.propTypes.inputId.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputStyle {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.inputStyle")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.inputStyle
      @JSImport("rc-easyui", "NumberBox.propTypes.inputStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object max {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.max")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.max
      @JSImport("rc-easyui", "NumberBox.propTypes.max.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object min {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.min")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.min
      @JSImport("rc-easyui", "NumberBox.propTypes.min.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiline {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.multiline")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.multiline
      @JSImport("rc-easyui", "NumberBox.propTypes.multiline.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onBlur {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.onBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.onBlur
      @JSImport("rc-easyui", "NumberBox.propTypes.onBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onChange {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.onChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.onChange
      @JSImport("rc-easyui", "NumberBox.propTypes.onChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onFocus {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.onFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.onFocus
      @JSImport("rc-easyui", "NumberBox.propTypes.onFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object placeholder {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.placeholder")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.placeholder
      @JSImport("rc-easyui", "NumberBox.propTypes.placeholder.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object precision {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.precision")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.precision
      @JSImport("rc-easyui", "NumberBox.propTypes.precision.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object prefix {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.prefix")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.prefix
      @JSImport("rc-easyui", "NumberBox.propTypes.prefix.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object readOnly {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.readOnly")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.readOnly
      @JSImport("rc-easyui", "NumberBox.propTypes.readOnly.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object reversed {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.reversed")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.reversed
      @JSImport("rc-easyui", "NumberBox.propTypes.reversed.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object spinAlign {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.spinAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.spinAlign
      @JSImport("rc-easyui", "NumberBox.propTypes.spinAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object spinners {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.spinners")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.spinners
      @JSImport("rc-easyui", "NumberBox.propTypes.spinners.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.style
      @JSImport("rc-easyui", "NumberBox.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object suffix {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.suffix")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.suffix
      @JSImport("rc-easyui", "NumberBox.propTypes.suffix.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabIndex {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.tabIndex")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.tabIndex
      @JSImport("rc-easyui", "NumberBox.propTypes.tabIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object textFormatter {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.textFormatter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.textFormatter
      @JSImport("rc-easyui", "NumberBox.propTypes.textFormatter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object value {
      
      @JSImport("rc-easyui", "NumberBox.propTypes.value")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.NumberBox.propTypes.value
      @JSImport("rc-easyui", "NumberBox.propTypes.value.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
