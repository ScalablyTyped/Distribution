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

