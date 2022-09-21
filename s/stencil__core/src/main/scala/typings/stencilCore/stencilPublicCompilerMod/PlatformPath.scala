package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformPath extends StObject {
  
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  
  var delimiter: String = js.native
  
  def dirname(p: String): String = js.native
  
  def extname(p: String): String = js.native
  
  def isAbsolute(p: String): Boolean = js.native
  
  def join(paths: String*): String = js.native
  
  def normalize(p: String): String = js.native
  
  def parse(p: String): ParsedPath = js.native
  
  var posix: Any = js.native
  
  def relative(from: String, to: String): String = js.native
  
  def resolve(pathSegments: String*): String = js.native
  
  var sep: String = js.native
  
  var win32: Any = js.native
}
