package typings.reactMdUtils

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingMediaOnlyMod {
  
  @JSImport("@react-md/utils/types/sizing/MediaOnly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DesktopOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("DesktopOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def MobileOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MobileOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def PhoneOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PhoneOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  inline def TabletOnly(param0: MediaOnlyProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("TabletOnly")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait MediaOnlyProps extends StObject {
    
    /**
      * The children to display.
      */
    var children: ReactElement | Null
    
    /**
      * An optional fallback element to show when the media queries do not match.
      */
    var fallback: js.UndefOr[ReactElement | Null] = js.undefined
  }
  object MediaOnlyProps {
    
    inline def apply(): MediaOnlyProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MediaOnlyProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaOnlyProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
