package typings.resourcejs.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request
  extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
  
  var countQuery: js.Any = js.native
  
  var modelQuery: js.Any = js.native
  
  var noResponse: Boolean = js.native
  
  var skipDelete: Boolean = js.native
  
  var skipResource: Boolean = js.native
}
