package typings.protobufjsPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/path", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("@protobufjs/path", "normalize")
  @js.native
  def normalize(path: String): String = js.native
  
  @JSImport("@protobufjs/path", "resolve")
  @js.native
  def resolve(originPath: String, includePath: String): String = js.native
  @JSImport("@protobufjs/path", "resolve")
  @js.native
  def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = js.native
}
