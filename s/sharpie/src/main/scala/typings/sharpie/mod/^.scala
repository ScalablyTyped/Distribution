package typings.sharpie.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharpie", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * A simple express middleware for resizing images using sharp and pipes.
    */
  def apply(defaults: SharpieOptions): RequestHandler[ParamsDictionary, _, _, ParsedQs] = js.native
}
