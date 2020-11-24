package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverMod {
  
  type Response = typings.node.httpMod.ServerResponse
  
  type ServerType = typings.node.httpMod.Server | typings.soap.serverMod.IExpressApp
}
