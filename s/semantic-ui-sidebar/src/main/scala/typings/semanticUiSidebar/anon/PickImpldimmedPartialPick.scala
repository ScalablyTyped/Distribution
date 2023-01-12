package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, 'dimmed'> & std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.ClassNameSettings._Impl>> */
trait PickImpldimmedPartialPick
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var animating: js.UndefOr[String] = js.undefined
  
  var bottom: js.UndefOr[String] = js.undefined
  
  var dimmed: String
  
  var ios: js.UndefOr[String] = js.undefined
  
  var left: js.UndefOr[String] = js.undefined
  
  var pushable: js.UndefOr[String] = js.undefined
  
  var pushed: js.UndefOr[String] = js.undefined
  
  var right: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImpldimmedPartialPick {
  
  inline def apply(dimmed: String): PickImpldimmedPartialPick = {
    val __obj = js.Dynamic.literal(dimmed = dimmed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmedPartialPick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImpldimmedPartialPick] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDimmed(value: String): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
    
    inline def setIos(value: String): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
    
    inline def setIosUndefined: Self = StObject.set(x, "ios", js.undefined)
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setPushable(value: String): Self = StObject.set(x, "pushable", value.asInstanceOf[js.Any])
    
    inline def setPushableUndefined: Self = StObject.set(x, "pushable", js.undefined)
    
    inline def setPushed(value: String): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    
    inline def setPushedUndefined: Self = StObject.set(x, "pushed", js.undefined)
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
