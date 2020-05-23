package typings.reactD3Graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LinkLabelProperty[L /* <: typings.reactD3Graph.mod.GraphLink */] = (js.Function1[/* node */ L, java.lang.String]) | (/* keyof L */ java.lang.String)
  type NodeLabelProperty[N /* <: typings.reactD3Graph.mod.GraphNode */] = (js.Function1[/* node */ N, java.lang.String]) | (/* keyof N */ java.lang.String)
}
