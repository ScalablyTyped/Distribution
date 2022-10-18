package typings.reactShare

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.reactShare.anon.OmitPropsOptionsforwardedAccessKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinkedinShareButtonMod extends Shortcut {
  
  @JSImport("react-share/lib/LinkedinShareButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitPropsOptionsforwardedAccessKey] = js.native
  
  trait Options extends StObject {
    
    /** The url-encoded source of the content (e.g. your website or application name) */
    var source: js.UndefOr[String] = js.undefined
    
    /** The url-encoded description that you wish you use. */
    var summary: js.UndefOr[String] = js.undefined
    
    /** The url-encoded title value that you wish you use. */
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[OmitPropsOptionsforwardedAccessKey]
  
  /* This means you don't have to write `default`, but can instead just say `libLinkedinShareButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitPropsOptionsforwardedAccessKey] = default
}
