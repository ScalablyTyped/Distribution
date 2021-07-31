package typings.rmcCalendar

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.rmcCalendar.anon.CloseIcon
import typings.rmcCalendar.dataTypesMod.Models.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod {
  
  @JSImport("rmc-calendar/lib/calendar/Header", JSImport.Default)
  @js.native
  class default () extends Header
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/calendar/Header", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/calendar/Header", "default.defaultProps")
    @js.native
    def defaultProps: CloseIcon = js.native
    @scala.inline
    def defaultProps_=(x: CloseIcon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Header
    extends PureComponent[PropsType, js.Object, js.Any]
  
  trait PropsType extends StObject {
    
    var clearIcon: js.UndefOr[ReactNode] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showClear: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    @scala.inline
    def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
