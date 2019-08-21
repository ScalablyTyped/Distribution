package typings.reduxDashDuck.reduxDashDuckMod

import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-duck", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDuck(a: DuckName): DuckBuilder[AnyAction] = js.native
  def createDuck(a: DuckName, b: AppName): DuckBuilder[AnyAction] = js.native
}

