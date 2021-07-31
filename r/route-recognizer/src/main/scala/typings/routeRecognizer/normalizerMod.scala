package typings.routeRecognizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizerMod {
  
  @JSImport("route-recognizer/dist/route-recognizer/normalizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def encodePathSegment(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePathSegment")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeSegment(segment: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[String]
}
