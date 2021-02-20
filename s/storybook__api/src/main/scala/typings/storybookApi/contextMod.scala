package typings.storybookApi

import typings.react.mod.Context
import typings.storybookApi.anon.Api
import typings.storybookApi.mod.Combo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@storybook/api/dist/context", "createContext")
  @js.native
  def createContext(hasApiState: Combo): Context[Api] = js.native
}
