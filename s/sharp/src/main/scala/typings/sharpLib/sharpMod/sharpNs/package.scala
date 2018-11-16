package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharpNs {
  /** 3 for sRGB, 4 for CMYK */
  type Channels = sharpLib.sharpLibNumbers.`3` | sharpLib.sharpLibNumbers.`4`
  type Color = java.lang.String | RGBA
  type Gravity = scala.Double | java.lang.String
}
