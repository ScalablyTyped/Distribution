package typings.reactAriaSsr

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-aria/ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SSRProvider(props: SSRProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SSRProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useIsSSR(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsSSR")().asInstanceOf[Boolean]
  
  inline def useSSRSafeId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSSRSafeId")().asInstanceOf[String]
  inline def useSSRSafeId(defaultId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useSSRSafeId")(defaultId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SSRProviderProps extends StObject {
    
    /** Your application here. */
    var children: ReactNode
  }
  object SSRProviderProps {
    
    inline def apply(): SSRProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SSRProviderProps]
    }
    
    extension [Self <: SSRProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
