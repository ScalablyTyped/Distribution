package typings.reactShare

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactShare.anon.Call
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHocsCreateShareCountMod {
  
  @JSImport("react-share/lib/hocs/createShareCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    getCount: js.Function2[
      /* url */ String, 
      /* callback */ js.Function1[/* shareCount */ js.UndefOr[Double], Unit], 
      Unit
    ]
  ): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getCount.asInstanceOf[js.Any]).asInstanceOf[Call]
  
  trait SocialMediaShareCountProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    @JSName("children")
    var children_SocialMediaShareCountProps: js.UndefOr[js.Function1[/* shareCount */ Double, ReactNode]] = js.undefined
    
    def getCount(url: String, callback: js.Function1[/* shareCount */ js.UndefOr[Double], Unit]): Unit
    
    var url: String
  }
  object SocialMediaShareCountProps {
    
    inline def apply(getCount: (String, js.Function1[/* shareCount */ js.UndefOr[Double], Unit]) => Unit, url: String): SocialMediaShareCountProps = {
      val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction2(getCount), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialMediaShareCountProps]
    }
    
    extension [Self <: SocialMediaShareCountProps](x: Self) {
      
      inline def setChildren(value: /* shareCount */ Double => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGetCount(value: (String, js.Function1[/* shareCount */ js.UndefOr[Double], Unit]) => Unit): Self = StObject.set(x, "getCount", js.Any.fromFunction2(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
