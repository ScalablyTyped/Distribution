package typings.recompose

import typings.react.mod.ComponentType
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setproptypes
object setPropTypesMod {
  
  @JSImport("recompose/setPropTypes", JSImport.Default)
  @js.native
  def default[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
}
