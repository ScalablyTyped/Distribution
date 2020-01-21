package typings.spotifyWebApiNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[
    /* error */ typings.std.Error, 
    /* response */ typings.spotifyWebApiNode.mod.Response[T], 
    scala.Unit
  ]
}
