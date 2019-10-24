package typings.spotifyDashNodeDashApplescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spotifyDashNodeDashApplescriptMod {
  type GetTrackCallbackFn = js.Function2[/* error */ String, /* track */ TrackInfo, Unit]
  type IsRepeatingCallbackFn = js.Function2[/* error */ String, /* repeating */ Boolean, Unit]
  type IsRunningCallbackFn = js.Function2[/* error */ String, /* isRunning */ Boolean, Unit]
  type IsShufflingCallbackFn = js.Function2[/* error */ String, /* shuffling */ Boolean, Unit]
  type StateCallbackFn = js.Function2[/* error */ String, /* state */ SpotifyState, Unit]
  type SuccessCallbackFn = js.Function0[Unit]
}
