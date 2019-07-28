package typings.recursiveDashReaddir.recursiveDashReaddirMod

import typings.node.fsMod.Stats
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RecursiveReaddirNs {
  type Callback = js.Function2[/* error */ Error, /* files */ js.Array[String], Unit]
  type IgnoreFunction = js.Function2[/* file */ String, /* stats */ Stats, Boolean]
  type Ignores = js.Array[String | IgnoreFunction]
}
