package typings.senchaUnderscoreTouch.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideo extends IMedia {
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
  @scala.inline
  def apply(
    IMedia: IMedia = null,
    baseCls: java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getPosterUrl: () => java.lang.String = null,
    getUrl: () => java.lang.String = null,
    initialize: () => Unit = null,
    posterUrl: java.lang.String = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setPosterUrl: /* posterUrl */ js.UndefOr[java.lang.String] => Unit = null,
    setUrl: /* url */ js.UndefOr[js.Any] => Unit = null,
    updatePosterUrl: /* newUrl */ js.UndefOr[js.Any] => Unit = null,
    updateUrl: /* newUrl */ js.UndefOr[js.Any] => Unit = null
  ): IVideo = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMedia)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getPosterUrl != null) __obj.updateDynamic("getPosterUrl")(js.Any.fromFunction0(getPosterUrl))
    if (getUrl != null) __obj.updateDynamic("getUrl")(js.Any.fromFunction0(getUrl))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (posterUrl != null) __obj.updateDynamic("posterUrl")(posterUrl)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setPosterUrl != null) __obj.updateDynamic("setPosterUrl")(js.Any.fromFunction1(setPosterUrl))
    if (setUrl != null) __obj.updateDynamic("setUrl")(js.Any.fromFunction1(setUrl))
    if (updatePosterUrl != null) __obj.updateDynamic("updatePosterUrl")(js.Any.fromFunction1(updatePosterUrl))
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(js.Any.fromFunction1(updateUrl))
    __obj.asInstanceOf[IVideo]
  }
}

