package typings.reactMdTabs

import typings.react.mod.MutableRefObject
import typings.react.mod.Provider
import typings.react.mod.Ref
import typings.reactMdTabs.reactMdTabsStrings.center
import typings.reactMdTabs.reactMdTabsStrings.left
import typings.reactMdTabs.reactMdTabsStrings.right
import typings.reactMdUtils.useKeyboardMovementMod.ItemRef
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabIndicatorStyleMod {
  
  @JSImport("@react-md/tabs/types/useTabIndicatorStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tabs/types/useTabIndicatorStyle", "UpdateIndicatorStylesProvider")
  @js.native
  val UpdateIndicatorStylesProvider: Provider[UpdateIndicatorStyles] = js.native
  
  inline def useTabIndicatorStyle(hasStylePropRefAlignItemRefsTotalTabsActiveIndex: Options): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabIndicatorStyle")(hasStylePropRefAlignItemRefsTotalTabsActiveIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
  
  inline def useUpdateIndicatorStyles(): UpdateIndicatorStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateIndicatorStyles")().asInstanceOf[UpdateIndicatorStyles]
  
  @js.native
  trait CSSProperties
    extends StObject
       with typings.react.mod.CSSProperties
       with CSSVariables
  
  @js.native
  trait CSSVariables extends StObject
  
  type MergedTabRef = js.Function1[/* instance */ HTMLDivElement | Null, Unit]
  
  trait Options extends StObject {
    
    var activeIndex: Double
    
    var align: left | center | right
    
    var itemRefs: ItemRefList[HTMLElement]
    
    var ref: js.UndefOr[Ref[HTMLDivElement | Null]] = js.undefined
    
    var style: js.UndefOr[typings.react.mod.CSSProperties] = js.undefined
    
    var totalTabs: Double
  }
  object Options {
    
    inline def apply(
      activeIndex: Double,
      align: left | center | right,
      itemRefs: ItemRefList[HTMLElement],
      totalTabs: Double
    ): Options = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], align = align.asInstanceOf[js.Any], itemRefs = itemRefs.asInstanceOf[js.Any], totalTabs = totalTabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setItemRefs(value: ItemRefList[HTMLElement]): Self = StObject.set(x, "itemRefs", value.asInstanceOf[js.Any])
      
      inline def setItemRefsVarargs(value: ItemRef[HTMLElement]*): Self = StObject.set(x, "itemRefs", js.Array(value :_*))
      
      inline def setRef(value: Ref[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ (HTMLDivElement | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: typings.react.mod.CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTotalTabs(value: Double): Self = StObject.set(x, "totalTabs", value.asInstanceOf[js.Any])
    }
  }
  
  type ReturnValue = js.Tuple4[
    CSSProperties, 
    MergedTabRef, 
    MutableRefObject[HTMLDivElement | Null], 
    UpdateIndicatorStyles
  ]
  
  type UpdateIndicatorStyles = js.Function0[Unit]
}
