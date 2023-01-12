package typings.rmcDialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AfterClose extends StObject {
    
    var afterClose: js.Function0[Unit]
    
    var className: String
    
    var closable: Boolean
    
    var mask: Boolean
    
    var maskClosable: Boolean
    
    var onClose: js.Function0[Unit]
    
    var prefixCls: String
    
    var visible: Boolean
  }
  object AfterClose {
    
    inline def apply(
      afterClose: () => Unit,
      className: String,
      closable: Boolean,
      mask: Boolean,
      maskClosable: Boolean,
      onClose: () => Unit,
      prefixCls: String,
      visible: Boolean
    ): AfterClose = {
      val __obj = js.Dynamic.literal(afterClose = js.Any.fromFunction0(afterClose), className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[AfterClose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterClose] (val x: Self) extends AnyVal {
      
      inline def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnClose extends StObject {
    
    var onClose: js.Function0[Unit]
    
    var prefixCls: String
    
    var visible: Boolean
  }
  object OnClose {
    
    inline def apply(onClose: () => Unit, prefixCls: String, visible: Boolean): OnClose = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnClose] (val x: Self) extends AnyVal {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait Visible extends StObject {
    
    var visible: Any
  }
  object Visible {
    
    inline def apply(visible: Any): Visible = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visible]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
