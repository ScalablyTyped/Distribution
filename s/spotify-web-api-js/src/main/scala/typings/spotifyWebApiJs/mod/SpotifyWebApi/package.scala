package typings.spotifyWebApiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object SpotifyWebApi {
  
  /**
    * An optional callback that receives 2 parameters. The first
    * one is the error object (null if no error), and the second is the value if the request succeeded.
    */
  type ResultsCallback[T] = js.Function2[
    /* error */ typings.spotifyWebApiJs.mod.SpotifyWebApi.ErrorObject, 
    /* value */ T, 
    js.Any
  ]
  
  type VoidResultsCallback = js.Function1[/* error */ typings.spotifyWebApiJs.mod.SpotifyWebApi.ErrorObject, js.Any]
}
