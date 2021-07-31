package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var focusable: Boolean
  
  var inlineIndent: Double
  
  var level: Double
  
  var manualRef: js.Function0[Unit]
  
  var mode: String
  
  var prefixCls: String
  
  var visible: Boolean
}
object ClassName {
  
  @scala.inline
  def apply(
    className: String,
    focusable: Boolean,
    inlineIndent: Double,
    level: Double,
    manualRef: () => Unit,
    mode: String,
    prefixCls: String,
    visible: Boolean
  ): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], inlineIndent = inlineIndent.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], manualRef = js.Any.fromFunction0(manualRef), mode = mode.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRef(value: () => Unit): Self = StObject.set(x, "manualRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
