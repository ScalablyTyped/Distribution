package typings.routie.routieNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Routie extends RoutieStatic {
  def apply(path: String): Unit = js.native
  def apply(path: String, fn: js.Function): Unit = js.native
  def apply(routes: StringDictionary[js.Function]): Unit = js.native
}

