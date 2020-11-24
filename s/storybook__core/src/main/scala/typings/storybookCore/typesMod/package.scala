package typings.storybookCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Loadable = typings.storybookCore.typesMod.RequireContext | js.Array[typings.storybookCore.typesMod.RequireContext] | typings.storybookCore.typesMod.LoaderFunction
  
  type LoaderFunction = js.Function0[scala.Unit | js.Array[js.Any]]
  
  type RenderStoryFunction = js.Function1[/* context */ typings.storybookClientApi.typesMod.RenderContext, scala.Unit]
}
