package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var key: java.lang.String
  var origin: java.lang.String
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: atStorybookRouterLib.atStorybookRouterLibStrings.`http:` | atStorybookRouterLib.atStorybookRouterLibStrings.`https:`
  var search: java.lang.String
  var state: atStorybookRouterLib.Anon_Key
  def assign(url: java.lang.String): scala.Unit
  def reload(): scala.Unit
  def replace(url: java.lang.String): scala.Unit
}

@JSImport("@storybook/router/dist/router", "Location")
@js.native
object Location extends js.Object {
  var displayName: java.lang.String = js.native
  def apply(hasChildren: atStorybookRouterLib.distRouterMod.QueryLocationProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

