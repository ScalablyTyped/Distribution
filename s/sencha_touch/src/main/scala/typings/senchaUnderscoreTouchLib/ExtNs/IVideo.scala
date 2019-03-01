package typings
package senchaUnderscoreTouchLib.ExtNs

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
  var setPosterUrl: js.UndefOr[js.Function1[/* posterUrl */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of url
  		* @param url String/Array The new value.
  		*/
  @JSName("setUrl")
  var setUrl_IVideo: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Updates the URL to the poster even if it is rendered
  		* @param newUrl Object
  		*/
  var updatePosterUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IVideo {
  @scala.inline
  def apply(
    IMedia: IMedia = null,
    baseCls: java.lang.String = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getPosterUrl: js.Function0[java.lang.String] = null,
    getUrl: js.Function0[java.lang.String] = null,
    initialize: js.Function0[scala.Unit] = null,
    posterUrl: java.lang.String = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setPosterUrl: js.Function1[/* posterUrl */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUrl: js.Function1[/* url */ js.UndefOr[js.Any], scala.Unit] = null,
    updatePosterUrl: js.Function1[/* newUrl */ js.UndefOr[js.Any], scala.Unit] = null,
    updateUrl: js.Function1[/* newUrl */ js.UndefOr[js.Any], scala.Unit] = null
  ): IVideo = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMedia)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getPosterUrl != null) __obj.updateDynamic("getPosterUrl")(getPosterUrl)
    if (getUrl != null) __obj.updateDynamic("getUrl")(getUrl)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (posterUrl != null) __obj.updateDynamic("posterUrl")(posterUrl)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setPosterUrl != null) __obj.updateDynamic("setPosterUrl")(setPosterUrl)
    if (setUrl != null) __obj.updateDynamic("setUrl")(setUrl)
    if (updatePosterUrl != null) __obj.updateDynamic("updatePosterUrl")(updatePosterUrl)
    if (updateUrl != null) __obj.updateDynamic("updateUrl")(updateUrl)
    __obj.asInstanceOf[IVideo]
  }
}

