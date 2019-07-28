package typings.reactDashResolver.reactDashResolverMod

import typings.react.reactMod.Factory
import typings.reactDashResolver.Anon_Data
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  def render(factory: Factory[_]): Unit = js.native
  def render(factory: Factory[_], root: Node): Unit = js.native
  def resolve[P](factory: Factory[P]): js.Promise[Anon_Data[P]] = js.native
}

