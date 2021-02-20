package typings.rmcDialog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AfterClose extends StObject {
    
    var afterClose: js.Function0[Unit] = js.native
    
    var className: String = js.native
    
    var closable: Boolean = js.native
    
    var mask: Boolean = js.native
    
    var maskClosable: Boolean = js.native
    
    var onClose: js.Function0[Unit] = js.native
    
    var prefixCls: String = js.native
    
    var visible: Boolean = js.native
  }
  object AfterClose {
    
    @scala.inline
    def apply(
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
    implicit class AfterCloseMutableBuilder[Self <: AfterClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnClose extends StObject {
    
    var onClose: js.Function0[Unit] = js.native
    
    var prefixCls: String = js.native
    
    var visible: Boolean = js.native
  }
  object OnClose {
    
    @scala.inline
    def apply(onClose: () => Unit, prefixCls: String, visible: Boolean): OnClose = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnClose]
    }
    
    @scala.inline
    implicit class OnCloseMutableBuilder[Self <: OnClose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Visible extends StObject {
    
    var visible: js.Any = js.native
  }
  object Visible {
    
    @scala.inline
    def apply(visible: js.Any): Visible = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visible]
    }
    
    @scala.inline
    implicit class VisibleMutableBuilder[Self <: Visible] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVisible(value: js.Any): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
