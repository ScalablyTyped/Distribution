package typings.rdfLoaderCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object argumentsMod {
  
  type Arguments = js.Array[js.Any | (typings.std.Record[java.lang.String, js.Any])]
  
  type ArgumentsLoader = (typings.rdfLoadersRegistry.mod.Loader[
    typings.rdfLoaderCode.argumentsMod.Arguments, 
    typings.rdfLoaderCode.argumentsMod.Options
  ]) with typings.rdfLoaderCode.anon.Register
}
