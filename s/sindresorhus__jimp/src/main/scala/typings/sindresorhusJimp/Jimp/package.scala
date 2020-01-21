package typings.sindresorhusJimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Jimp {
  type ImageCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* image */ typings.sindresorhusJimp.Jimp.Jimp, 
    js.Any
  ]
}
