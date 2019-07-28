package typings.reactDashMedia

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMediaMod {
  /**
    * Conditionally renders based on whether or not a media query matches.
    */
  type Media = Component[MediaProps, js.Object, js.Any]
  type MediaQueryObject = StringDictionary[Boolean | Double | String]
}
