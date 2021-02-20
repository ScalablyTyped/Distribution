package typings.safeRegex

import typings.safeRegex.anon.Limit
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-regex", JSImport.Namespace)
  @js.native
  def apply(re: String): Boolean = js.native
  @JSImport("safe-regex", JSImport.Namespace)
  @js.native
  def apply(re: String, opts: Limit): Boolean = js.native
  @JSImport("safe-regex", JSImport.Namespace)
  @js.native
  def apply(re: RegExp): Boolean = js.native
  @JSImport("safe-regex", JSImport.Namespace)
  @js.native
  def apply(re: RegExp, opts: Limit): Boolean = js.native
}
