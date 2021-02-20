package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@sentry/utils/dist/path", "basename")
  @js.native
  def basename(path: String): String = js.native
  @JSImport("@sentry/utils/dist/path", "basename")
  @js.native
  def basename(path: String, ext: String): String = js.native
  
  @JSImport("@sentry/utils/dist/path", "dirname")
  @js.native
  def dirname(path: String): String = js.native
  
  @JSImport("@sentry/utils/dist/path", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("@sentry/utils/dist/path", "join")
  @js.native
  def join(args: String*): String = js.native
  
  @JSImport("@sentry/utils/dist/path", "normalizePath")
  @js.native
  def normalizePath(path: String): String = js.native
  
  @JSImport("@sentry/utils/dist/path", "relative")
  @js.native
  def relative(from: String, to: String): String = js.native
  
  @JSImport("@sentry/utils/dist/path", "resolve")
  @js.native
  def resolve(args: String*): String = js.native
}
