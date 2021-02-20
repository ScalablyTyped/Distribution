package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.fixUtilMod.FixedInfo
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponent
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/TableContext", JSImport.Default)
  @js.native
  val default: Context[TableContextProps] = js.native
  
  @js.native
  trait TableContextProps extends StObject {
    
    var direction: ltr | rtl = js.native
    
    var fixedInfoList: js.Array[FixedInfo] = js.native
    
    var getComponent: GetComponent = js.native
    
    var isSticky: Boolean = js.native
    
    var prefixCls: String = js.native
    
    var scrollbarSize: Double = js.native
  }
  object TableContextProps {
    
    @scala.inline
    def apply(
      direction: ltr | rtl,
      fixedInfoList: js.Array[FixedInfo],
      getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent,
      isSticky: Boolean,
      prefixCls: String,
      scrollbarSize: Double
    ): TableContextProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], fixedInfoList = fixedInfoList.asInstanceOf[js.Any], getComponent = js.Any.fromFunction2(getComponent), isSticky = isSticky.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContextProps]
    }
    
    @scala.inline
    implicit class TableContextPropsMutableBuilder[Self <: TableContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedInfoList(value: js.Array[FixedInfo]): Self = StObject.set(x, "fixedInfoList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedInfoListVarargs(value: FixedInfo*): Self = StObject.set(x, "fixedInfoList", js.Array(value :_*))
      
      @scala.inline
      def setGetComponent(
        value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
      ): Self = StObject.set(x, "getComponent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[TableContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableContextMod.foo` */
  override def _to: Context[TableContextProps] = default
}
