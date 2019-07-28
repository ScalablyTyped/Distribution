package typings.recompose

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
@JSImport("recompose/nest", JSImport.Namespace)
@js.native
object nestMod extends js.Object {
  def default(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
}

