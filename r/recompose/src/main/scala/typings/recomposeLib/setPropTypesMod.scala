package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setproptypes
@JSImport("recompose/setPropTypes", JSImport.Namespace)
@js.native
object setPropTypesMod extends js.Object {
  def default[P](propTypes: reactLib.reactMod.ReactNs.ValidationMap[P]): js.Function1[
    /* component */ reactLib.reactMod.ReactNs.ComponentType[P], 
    reactLib.reactMod.ReactNs.ComponentType[P]
  ] = js.native
}

