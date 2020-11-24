package typings.requestAsCurl

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("request-as-curl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
  def apply(request: RequestAPI[Request, CoreOptions, RequiredUriUrl], body: js.Any): String = js.native
  
  def serialize(request: RequestAPI[Request, CoreOptions, RequiredUriUrl]): String = js.native
}
