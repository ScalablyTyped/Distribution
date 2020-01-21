package typings.randomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Distribution[T] = js.Function1[/* engine */ typings.randomJs.typesMod.Engine, T]
  type StringDistribution = js.Function2[
    /* engine */ typings.randomJs.typesMod.Engine, 
    /* length */ scala.Double, 
    java.lang.String
  ]
}
