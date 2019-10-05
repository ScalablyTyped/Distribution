package typings.atSindresorhusJimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Jimp {
  import typings.std.Error

  type ImageCallback = js.Function2[/* err */ Error | Null, /* image */ typings.atSindresorhusJimp.Jimp.Jimp, js.Any]
}
