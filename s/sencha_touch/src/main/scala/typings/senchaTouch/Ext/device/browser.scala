package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browser {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Used to close the browser if one is opened  */
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Used to open a new browser window
      * @param options Object The options to use when opening a new browser window.
      */
    var open: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setOpen(value: /* options */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
  }
  
  type ISimulator = IBase
  
  type IWindow = IEvented
}
