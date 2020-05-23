package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluginMod {
  type Commands = org.scalablytyped.runtime.StringDictionary[typings.serverless.anon.Commands]
  type Hooks = org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  type VariableResolver = js.Function1[/* variableSource */ java.lang.String, js.Promise[js.Any]]
  type VariableResolvers = org.scalablytyped.runtime.StringDictionary[
    typings.serverless.pluginMod.VariableResolver | typings.serverless.anon.IsDisabledAtPrepopulation
  ]
}
