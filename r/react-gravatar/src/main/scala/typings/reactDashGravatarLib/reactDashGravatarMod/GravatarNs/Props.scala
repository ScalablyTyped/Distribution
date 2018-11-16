package typings
package reactDashGravatarLib.reactDashGravatarMod.GravatarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Gravatar has a number of built in options which you can use as defaults when an email address has no
  		 * matching Gravatar image.
  		 *
  		 * @default "retro"
  		 * @see https://gravatar.com/site/implement/images/#default-image
  		 */
  var default: js.UndefOr[DefaultImage] = js.undefined
  /**
  		 * The email address used to look up the Gravatar image.
  		 * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
  		 * pass the hash to the component using the `md5` prop instead of the `email` prop.
  		 */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The md5 hash of the email address used to look up the Gravatar image.
  		 * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
  		 * pass the hash to the component using the `md5` prop instead of the `email` prop.
  		 */
  var md5: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The protocol used to fetch the Gravatar image. Should be one of `http://`, `https://` or `//` (default).
  		 *
  		 * @default "//"
  		 * @see https://gravatar.com/site/implement/images/#secure-images
  		 */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Gravatar allows users to self-rate their images so that they can indicate if an image is appropriate for a
  		 * certain audience. By default, only `g` rated images are displayed unless you indicate that you would like
  		 * to see higher ratings.
  		 *
  		 * @default "g"
  		 * @see https://gravatar.com/site/implement/images/#rating
  		 */
  var rating: js.UndefOr[Rating] = js.undefined
  /**
  		 * By default, images are presented at 50px by 50px if no size prop is supplied.
  		 *
  		 * @default 50
  		 * @see https://gravatar.com/site/implement/images/#size
  		 */
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

