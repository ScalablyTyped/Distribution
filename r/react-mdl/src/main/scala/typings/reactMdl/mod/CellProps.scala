package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellProps
  extends StObject
     with HTMLProps[js.Any]
     with CustomRenderedComponent
     with ShadowedComponent {
  
  var align: js.UndefOr[String] = js.undefined
  
  var col: Double
  
  var hideDesktop: js.UndefOr[Boolean] = js.undefined
  
  var hidePhone: js.UndefOr[Boolean] = js.undefined
  
  var hideTablet: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var offsetDesktop: js.UndefOr[Double] = js.undefined
  
  var offsetPhone: js.UndefOr[Double] = js.undefined
  
  var offsetTablet: js.UndefOr[Double] = js.undefined
  
  var phone: js.UndefOr[Double] = js.undefined
  
  var tablet: js.UndefOr[Double] = js.undefined
}
object CellProps {
  
  @scala.inline
  def apply(col: Double): CellProps = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
  
  @scala.inline
  implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDesktop(value: Boolean): Self = StObject.set(x, "hideDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDesktopUndefined: Self = StObject.set(x, "hideDesktop", js.undefined)
    
    @scala.inline
    def setHidePhone(value: Boolean): Self = StObject.set(x, "hidePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidePhoneUndefined: Self = StObject.set(x, "hidePhone", js.undefined)
    
    @scala.inline
    def setHideTablet(value: Boolean): Self = StObject.set(x, "hideTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTabletUndefined: Self = StObject.set(x, "hideTablet", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDesktop(value: Double): Self = StObject.set(x, "offsetDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetDesktopUndefined: Self = StObject.set(x, "offsetDesktop", js.undefined)
    
    @scala.inline
    def setOffsetPhone(value: Double): Self = StObject.set(x, "offsetPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetPhoneUndefined: Self = StObject.set(x, "offsetPhone", js.undefined)
    
    @scala.inline
    def setOffsetTablet(value: Double): Self = StObject.set(x, "offsetTablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTabletUndefined: Self = StObject.set(x, "offsetTablet", js.undefined)
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPhone(value: Double): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setTablet(value: Double): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
  }
}
