package typings.snappy

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snappyMod {
  type booleanCallback = js.Function2[/* err */ Error | Null, /* data */ Boolean, Unit]
  type bufferCallback = js.Function2[/* err */ Error | Null, /* data */ Buffer, Unit]
  type bufferOrStringCallback = js.Function2[/* err */ Error | Null, /* data */ Buffer | String, Unit]
}
