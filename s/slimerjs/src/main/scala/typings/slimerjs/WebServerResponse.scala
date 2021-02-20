package typings.slimerjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebServerResponse extends StObject {
  
  def close(): Unit = js.native
  
  def closeGracefully(): Unit = js.native
  
  def header(name: String): String = js.native
  
  var headers: StringDictionary[String] = js.native
  
  def setEncoding(encoding: String): Unit = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  
  var statusCode: Double = js.native
  
  def write(data: String): Unit = js.native
  
  def writeHead(statusCode: Double): Unit = js.native
  def writeHead(statusCode: Double, headers: StringDictionary[String]): Unit = js.native
}
