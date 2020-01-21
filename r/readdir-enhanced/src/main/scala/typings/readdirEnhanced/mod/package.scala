package typings.readdirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[
    /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
    /* result */ T, 
    scala.Unit
  ]
  type FilterFunction = js.Function1[/* stat */ typings.readdirEnhanced.mod.Stats, js.Any]
  type PathsArrayCallback = typings.readdirEnhanced.mod.Callback[js.Array[java.lang.String]]
  type StatsArrayCallback = typings.readdirEnhanced.mod.Callback[js.Array[typings.readdirEnhanced.mod.Stats]]
}
