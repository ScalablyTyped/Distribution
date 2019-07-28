package typings.shpjs

import typings.node.Buffer
import typings.shpjs.Anon_Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shpjsMod {
  // All toBuffer() compatible buffers.
  type ShpJSBuffer = Buffer | ArrayBuffer | Anon_Buffer
}
