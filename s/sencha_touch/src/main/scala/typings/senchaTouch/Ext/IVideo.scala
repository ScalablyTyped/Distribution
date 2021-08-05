package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVideo
  extends StObject
     with IMedia {
  
  /** [Method] Returns the value of posterUrl
    * @returns String
    */
  var getPosterUrl: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Config Option] (String) */
  var posterUrl: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of posterUrl
    * @param posterUrl String The new value.
    */
  var setPosterUrl: js.UndefOr[js.Function1[/* posterUrl */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of url
    * @param url String/Array The new value.
    */
  @JSName("setUrl")
  var setUrl_IVideo: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Updates the URL to the poster even if it is rendered
    * @param newUrl Object
    */
  var updatePosterUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IVideo {
  
  inline def apply(): IVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVideo]
  }
  
  extension [Self <: IVideo](x: Self) {
    
    inline def setGetPosterUrl(value: () => java.lang.String): Self = StObject.set(x, "getPosterUrl", js.Any.fromFunction0(value))
    
    inline def setGetPosterUrlUndefined: Self = StObject.set(x, "getPosterUrl", js.undefined)
    
    inline def setPosterUrl(value: java.lang.String): Self = StObject.set(x, "posterUrl", value.asInstanceOf[js.Any])
    
    inline def setPosterUrlUndefined: Self = StObject.set(x, "posterUrl", js.undefined)
    
    inline def setSetPosterUrl(value: /* posterUrl */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPosterUrl", js.Any.fromFunction1(value))
    
    inline def setSetPosterUrlUndefined: Self = StObject.set(x, "setPosterUrl", js.undefined)
    
    inline def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    inline def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    inline def setUpdatePosterUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updatePosterUrl", js.Any.fromFunction1(value))
    
    inline def setUpdatePosterUrlUndefined: Self = StObject.set(x, "updatePosterUrl", js.undefined)
  }
}
