package typings
package serveDashStaticLib.serveDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-static", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var mime: serveDashStaticLib.Anon_Defaulttype = js.native
  /**
    * Create a new middleware function to serve files from within a given root directory.
    * The file to serve will be determined by combining req.url with the provided root directory.
    * When a file is not found, instead of sending a 404 response, this module will instead call next() to move on to the next middleware, allowing for stacking and fall-backs.
    */
  def apply(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def apply(
    root: java.lang.String,
    options: serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions
  ): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(root: java.lang.String): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
  def serveStatic(
    root: java.lang.String,
    options: serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions
  ): expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Handler = js.native
}

