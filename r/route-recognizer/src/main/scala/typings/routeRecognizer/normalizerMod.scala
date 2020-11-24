package typings.routeRecognizer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("route-recognizer/dist/route-recognizer/normalizer", JSImport.Namespace)
@js.native
object normalizerMod extends js.Object {
  
  def encodePathSegment(str: String): String = js.native
  
  def normalizePath(path: String): String = js.native
  
  def normalizeSegment(segment: String): String = js.native
}
