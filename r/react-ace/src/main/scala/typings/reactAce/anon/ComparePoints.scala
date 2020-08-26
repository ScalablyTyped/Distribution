package typings.reactAce.anon

import org.scalablytyped.runtime.Instantiable4
import typings.aceBuilds.mod.Ace.Point
import typings.aceBuilds.mod.Ace.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComparePoints extends Instantiable4[
      /* startRow */ Double, 
      /* startColumn */ Double, 
      /* endRow */ Double, 
      /* endColumn */ Double, 
      Range
    ] {
  def comparePoints(p1: Point, p2: Point): Double = js.native
  def fromPoints(start: Point, end: Point): Range = js.native
}

