package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IVideoOps[Self <: IVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetPosterUrl(value: () => java.lang.String): Self = this.set("getPosterUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPosterUrl: Self = this.set("getPosterUrl", js.undefined)
    @scala.inline
    def setPosterUrl(value: java.lang.String): Self = this.set("posterUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosterUrl: Self = this.set("posterUrl", js.undefined)
    @scala.inline
    def setSetPosterUrl(value: /* posterUrl */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setPosterUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPosterUrl: Self = this.set("setPosterUrl", js.undefined)
    @scala.inline
    def setSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = this.set("setUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUrl: Self = this.set("setUrl", js.undefined)
    @scala.inline
    def setUpdatePosterUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = this.set("updatePosterUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdatePosterUrl: Self = this.set("updatePosterUrl", js.undefined)
  }
  
}

