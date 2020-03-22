package typings.serverlessJestPlugin.mod

import typings.lambdaWrapper.mod.Wrapped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless-jest-plugin", "getWrapper")
@js.native
object getWrapper extends js.Object {
  def apply(modName: String, modPath: String, handler: String): Wrapped[_, _] = js.native
}

