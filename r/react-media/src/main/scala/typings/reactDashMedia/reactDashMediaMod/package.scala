package typings.reactDashMedia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMediaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.Component

  /**
    * Conditionally renders based on whether or not a media query matches.
    */
  type Media = Component[MediaProps, js.Object, js.Any]
  type MediaQueryObject = StringDictionary[Boolean | Double | String]
}
