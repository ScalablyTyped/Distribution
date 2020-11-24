package typings.sentryUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/utils/dist/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  
  def basename(path: String): String = js.native
  def basename(path: String, ext: String): String = js.native
  
  def dirname(path: String): String = js.native
  
  def isAbsolute(path: String): Boolean = js.native
  
  def join(args: String*): String = js.native
  
  def normalizePath(path: String): String = js.native
  
  def relative(from: String, to: String): String = js.native
  
  def resolve(args: String*): String = js.native
}
