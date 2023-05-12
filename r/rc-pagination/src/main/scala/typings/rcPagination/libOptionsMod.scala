package typings.rcPagination

import typings.rcPagination.anon.GoInputText
import typings.rcPagination.anon.Option
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.std.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionsMod {
  
  @JSImport("rc-pagination/lib/Options", JSImport.Default)
  @js.native
  open class default () extends Options
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-pagination/lib/Options", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-pagination/lib/Options", "default.defaultProps.pageSizeOptions")
      @js.native
      def pageSizeOptions: js.Array[String] = js.native
      inline def pageSizeOptions_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageSizeOptions")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends Component[Props, State, Any] {
    
    def buildOptionText(value: String): String = js.native
    
    def changeSize(value: Double): Unit = js.native
    
    def getPageSizeOptions(): js.Array[String | Double] = js.native
    
    def getValidValue(): Double = js.native
    
    def go(e: Any): Unit = js.native
    
    def handleBlur(e: FocusEvent[HTMLInputElement, Element]): Unit = js.native
    
    def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    @JSName("state")
    var state_Options: GoInputText = js.native
  }
  
  trait Props extends StObject {
    
    var buildOptionText: js.UndefOr[js.Function1[/* value */ String | Double, String]] = js.undefined
    
    def changeSize(size: Double): Unit
    
    var current: Double
    
    var disabled: Boolean
    
    var goButton: Boolean | String
    
    var locale: Any
    
    var pageSize: Double
    
    var pageSizeOptions: js.Array[String | Double]
    
    def quickGo(value: Double): Unit
    
    var rootPrefixCls: String
    
    var selectComponentClass: ComponentType[Any] & Option
    
    var selectPrefixCls: String
  }
  object Props {
    
    inline def apply(
      changeSize: Double => Unit,
      current: Double,
      disabled: Boolean,
      goButton: Boolean | String,
      locale: Any,
      pageSize: Double,
      pageSizeOptions: js.Array[String | Double],
      quickGo: Double => Unit,
      rootPrefixCls: String,
      selectComponentClass: ComponentType[Any] & Option,
      selectPrefixCls: String
    ): Props = {
      val __obj = js.Dynamic.literal(changeSize = js.Any.fromFunction1(changeSize), current = current.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], goButton = goButton.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], pageSizeOptions = pageSizeOptions.asInstanceOf[js.Any], quickGo = js.Any.fromFunction1(quickGo), rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any], selectPrefixCls = selectPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setBuildOptionText(value: /* value */ String | Double => String): Self = StObject.set(x, "buildOptionText", js.Any.fromFunction1(value))
      
      inline def setBuildOptionTextUndefined: Self = StObject.set(x, "buildOptionText", js.undefined)
      
      inline def setChangeSize(value: Double => Unit): Self = StObject.set(x, "changeSize", js.Any.fromFunction1(value))
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setGoButton(value: Boolean | String): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptions(value: js.Array[String | Double]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      inline def setPageSizeOptionsVarargs(value: (String | Double)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value*))
      
      inline def setQuickGo(value: Double => Unit): Self = StObject.set(x, "quickGo", js.Any.fromFunction1(value))
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectComponentClass(value: ComponentType[Any] & Option): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      inline def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var goInputText: String
  }
  object State {
    
    inline def apply(goInputText: String): State = {
      val __obj = js.Dynamic.literal(goInputText = goInputText.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setGoInputText(value: String): Self = StObject.set(x, "goInputText", value.asInstanceOf[js.Any])
    }
  }
}
