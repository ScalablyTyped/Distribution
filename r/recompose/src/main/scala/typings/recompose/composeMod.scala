package typings.recompose

import typings.recompose.mod.ComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#compose
@JSImport("recompose/compose", JSImport.Namespace)
@js.native
object composeMod extends js.Object {
  
  def default[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = js.native
}
