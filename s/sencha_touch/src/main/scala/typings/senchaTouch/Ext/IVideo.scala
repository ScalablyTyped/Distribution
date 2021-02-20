package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVideo extends IMedia {
  
  /** [Method] Returns the value of posterUrl
    * @returns String
    */
  var getPosterUrl: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Config Option] (String) */
  var posterUrl: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Sets the value of posterUrl
    * @param posterUrl String The new value.
    */
  var setPosterUrl: js.UndefOr[js.Function1[/* posterUrl */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of url
    * @param url String/Array The new value.
    */
  @JSName("setUrl")
  var setUrl_IVideo: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Updates the URL to the poster even if it is rendered
    * @param newUrl Object
    */
  var updatePosterUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], Unit]] = js.native
}
object IVideo {
  
  @scala.inline
  def apply(): IVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVideo]
  }
  
  @scala.inline
  implicit class IVideoMutableBuilder[Self <: IVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPosterUrl(value: () => java.lang.String): Self = StObject.set(x, "getPosterUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosterUrlUndefined: Self = StObject.set(x, "getPosterUrl", js.undefined)
    
    @scala.inline
    def setPosterUrl(value: java.lang.String): Self = StObject.set(x, "posterUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosterUrlUndefined: Self = StObject.set(x, "posterUrl", js.undefined)
    
    @scala.inline
    def setSetPosterUrl(value: /* posterUrl */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setPosterUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosterUrlUndefined: Self = StObject.set(x, "setPosterUrl", js.undefined)
    
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUrlUndefined: Self = StObject.set(x, "setUrl", js.undefined)
    
    @scala.inline
    def setUpdatePosterUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "updatePosterUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdatePosterUrlUndefined: Self = StObject.set(x, "updatePosterUrl", js.undefined)
  }
}
