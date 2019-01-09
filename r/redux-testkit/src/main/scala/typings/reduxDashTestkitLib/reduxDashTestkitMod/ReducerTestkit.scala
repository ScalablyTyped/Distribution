package typings
package reduxDashTestkitLib.reduxDashTestkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerTestkit extends js.Object {
  def execute(action: reduxLib.reduxMod.Action[_]): js.Any
  def expect(action: reduxLib.reduxMod.Action[_]): reduxDashTestkitLib.Anon_Expected
}

