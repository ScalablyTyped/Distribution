package typings.recompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
object nestMod {
  
  @JSImport("recompose/nest", JSImport.Default)
  @js.native
  def default(Components: (String | ComponentType[_])*): ComponentClass[_, ComponentState] = js.native
}
