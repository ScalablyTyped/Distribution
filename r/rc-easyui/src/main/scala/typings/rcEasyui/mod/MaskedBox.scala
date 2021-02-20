package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "MaskedBox")
@js.native
class MaskedBox protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(args: js.Any*) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MMaskedBox(): Unit = js.native
  
  def deleteChar(e: js.Any): Unit = js.native
  
  def formatter(e: js.Any): js.Any = js.native
  
  def getInputOffset(e: js.Any): js.Any = js.native
  
  def handleKeyDown(e: js.Any): Unit = js.native
  
  def insertChar(e: js.Any): Unit = js.native
  
  def parser(e: js.Any): js.Any = js.native
  
  def renderInput(): js.Any = js.native
  
  def seekNext(e: js.Any): js.Any = js.native
  
  def seekPrev(e: js.Any): js.Any = js.native
}
object MaskedBox {
  
  object contextTypes {
    
    object fieldAdd {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldAdd")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldAdd
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldAdd.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldBlur {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldBlur
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldChange {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldChange
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldFocus {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldFocus
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldName {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldName")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldName
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldName.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object fieldRemove {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldRemove")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.fieldRemove
      @JSImport("rc-easyui", "MaskedBox.contextTypes.fieldRemove.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object locale {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.locale
      @JSImport("rc-easyui", "MaskedBox.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "MaskedBox.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.contextTypes.t
      @JSImport("rc-easyui", "MaskedBox.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.editable")
    @js.native
    val editable: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.iconAlign")
    @js.native
    val iconAlign: String = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.invalid")
    @js.native
    val invalid: Boolean = js.native
    
    object masks {
      
      @JSImport("rc-easyui", "MaskedBox.defaultProps.masks")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-easyui", "MaskedBox.defaultProps.masks.*")
      @js.native
      def _empty: String = js.native
      
      @scala.inline
      def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("*")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "MaskedBox.defaultProps.masks.a")
      @js.native
      def a: String = js.native
      @scala.inline
      def a_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-easyui", "MaskedBox.defaultProps.masks.9")
      @js.native
      val `9`: String = js.native
    }
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.multiline")
    @js.native
    val multiline: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.onBlur")
    @js.native
    def onBlur(): Unit = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.onChange")
    @js.native
    def onChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.onFocus")
    @js.native
    def onFocus(): Unit = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.promptChar")
    @js.native
    val promptChar: String = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.readOnly")
    @js.native
    val readOnly: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.textFormatter")
    @js.native
    def textFormatter(e: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.validateOnBlur")
    @js.native
    val validateOnBlur: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.validateOnChange")
    @js.native
    val validateOnChange: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.validateOnCreate")
    @js.native
    val validateOnCreate: Boolean = js.native
    
    @JSImport("rc-easyui", "MaskedBox.defaultProps.value")
    @js.native
    val value: js.Any = js.native
  }
  
  object propTypes {
    
    object addonLeft {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.addonLeft")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.addonLeft
      @JSImport("rc-easyui", "MaskedBox.propTypes.addonLeft.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object addonRight {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.addonRight")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.addonRight
      @JSImport("rc-easyui", "MaskedBox.propTypes.addonRight.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.className
      @JSImport("rc-easyui", "MaskedBox.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object disabled {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.disabled")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.disabled
      @JSImport("rc-easyui", "MaskedBox.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editable {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.editable")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.editable
      @JSImport("rc-easyui", "MaskedBox.propTypes.editable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconAlign {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.iconAlign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.iconAlign
      @JSImport("rc-easyui", "MaskedBox.propTypes.iconAlign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.iconCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.iconCls
      @JSImport("rc-easyui", "MaskedBox.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputCls {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.inputCls
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputId {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputId")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.inputId
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputId.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object inputStyle {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputStyle")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.inputStyle
      @JSImport("rc-easyui", "MaskedBox.propTypes.inputStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object mask {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.mask")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.mask
      @JSImport("rc-easyui", "MaskedBox.propTypes.mask.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object masks {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.masks")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.masks
      @JSImport("rc-easyui", "MaskedBox.propTypes.masks.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiline {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.multiline")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.multiline
      @JSImport("rc-easyui", "MaskedBox.propTypes.multiline.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onBlur {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.onBlur")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.onBlur
      @JSImport("rc-easyui", "MaskedBox.propTypes.onBlur.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onChange {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.onChange")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.onChange
      @JSImport("rc-easyui", "MaskedBox.propTypes.onChange.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onFocus {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.onFocus")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.onFocus
      @JSImport("rc-easyui", "MaskedBox.propTypes.onFocus.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object placeholder {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.placeholder")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.placeholder
      @JSImport("rc-easyui", "MaskedBox.propTypes.placeholder.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object promptChar {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.promptChar")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.promptChar
      @JSImport("rc-easyui", "MaskedBox.propTypes.promptChar.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object readOnly {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.readOnly")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.readOnly
      @JSImport("rc-easyui", "MaskedBox.propTypes.readOnly.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.style
      @JSImport("rc-easyui", "MaskedBox.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tabIndex {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.tabIndex")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.tabIndex
      @JSImport("rc-easyui", "MaskedBox.propTypes.tabIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object textFormatter {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.textFormatter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.textFormatter
      @JSImport("rc-easyui", "MaskedBox.propTypes.textFormatter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object value {
      
      @JSImport("rc-easyui", "MaskedBox.propTypes.value")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.MaskedBox.propTypes.value
      @JSImport("rc-easyui", "MaskedBox.propTypes.value.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
