package typings.rcRate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowClear extends js.Object {
  
  var allowClear: Boolean = js.native
  
  var allowHalf: Boolean = js.native
  
  var character: String = js.native
  
  var count: Double = js.native
  
  var defaultValue: Double = js.native
  
  var direction: String = js.native
  
  var onChange: js.Function0[Unit] = js.native
  
  var onHoverChange: js.Function0[Unit] = js.native
  
  var prefixCls: String = js.native
  
  var tabIndex: Double = js.native
}
object AllowClear {
  
  @scala.inline
  def apply(
    allowClear: Boolean,
    allowHalf: Boolean,
    character: String,
    count: Double,
    defaultValue: Double,
    direction: String,
    onChange: () => Unit,
    onHoverChange: () => Unit,
    prefixCls: String,
    tabIndex: Double
  ): AllowClear = {
    val __obj = js.Dynamic.literal(allowClear = allowClear.asInstanceOf[js.Any], allowHalf = allowHalf.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onHoverChange = js.Any.fromFunction0(onHoverChange), prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowClear]
  }
  
  @scala.inline
  implicit class AllowClearOps[Self <: AllowClear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalf(value: Boolean): Self = this.set("allowHalf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHoverChange(value: () => Unit): Self = this.set("onHoverChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
}
