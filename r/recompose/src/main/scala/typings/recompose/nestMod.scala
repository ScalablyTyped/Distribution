package typings.recompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
@JSImport("recompose/nest", JSImport.Namespace)
@js.native
object nestMod extends js.Object {
  
  def default(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
}
