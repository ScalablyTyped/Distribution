package typings.storybookApi

import typings.react.mod.Context
import typings.storybookApi.anon.Api
import typings.storybookApi.mod.Combo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/api/dist/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  def createContext(hasApiState: Combo): Context[Api] = js.native
}
