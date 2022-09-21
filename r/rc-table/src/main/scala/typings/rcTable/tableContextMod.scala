package typings.rcTable

import org.scalablytyped.runtime.Shortcut
import typings.rcTable.contextSelectorMod.ReturnCreateContext
import typings.rcTable.fixUtilMod.FixedInfo
import typings.rcTable.interfaceMod.CustomizeComponent
import typings.rcTable.interfaceMod.GetComponent
import typings.rcTable.rcTableStrings.ltr
import typings.rcTable.rcTableStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/TableContext", JSImport.Default)
  @js.native
  val default: ReturnCreateContext[TableContextProps] = js.native
  
  trait TableContextProps extends StObject {
    
    var direction: ltr | rtl
    
    var fixedInfoList: js.Array[FixedInfo]
    
    var getComponent: GetComponent
    
    var isSticky: Boolean
    
    var prefixCls: String
    
    var scrollbarSize: Double
  }
  object TableContextProps {
    
    inline def apply(
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
    
    extension [Self <: TableContextProps](x: Self) {
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setFixedInfoList(value: js.Array[FixedInfo]): Self = StObject.set(x, "fixedInfoList", value.asInstanceOf[js.Any])
      
      inline def setFixedInfoListVarargs(value: FixedInfo*): Self = StObject.set(x, "fixedInfoList", js.Array(value*))
      
      inline def setGetComponent(
        value: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent]) => CustomizeComponent
      ): Self = StObject.set(x, "getComponent", js.Any.fromFunction2(value))
      
      inline def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReturnCreateContext[TableContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `tableContextMod.foo` */
  override def _to: ReturnCreateContext[TableContextProps] = default
}
