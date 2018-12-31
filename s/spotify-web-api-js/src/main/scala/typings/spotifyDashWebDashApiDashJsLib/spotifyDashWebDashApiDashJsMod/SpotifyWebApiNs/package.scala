package typings
package spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SpotifyWebApiNs {
  /**
    * An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    */
  type ResultsCallback[T] = js.Function2[/* error */ ErrorObject, /* value */ T, js.Any]
  type VoidResultsCallback = js.Function1[/* error */ ErrorObject, js.Any]
}
