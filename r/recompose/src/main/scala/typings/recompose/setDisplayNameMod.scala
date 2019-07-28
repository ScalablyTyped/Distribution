package typings.recompose

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setdisplayname
@JSImport("recompose/setDisplayName", JSImport.Namespace)
@js.native
object setDisplayNameMod extends js.Object {
  def default(displayName: String): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}

