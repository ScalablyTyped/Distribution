package typings.serverless.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineCustomProperties extends StObject {
  
  def defineCustomProperties(schema: Any): Unit = js.native
  
  def defineFunctionEvent(provider: String, event: String, schema: Record[String, Any]): Unit = js.native
  
  def defineFunctionEventProperties(provider: String, existingEvent: String, schema: Any): Unit = js.native
  
  def defineFunctionProperties(provider: String, schema: Any): Unit = js.native
  
  def defineProvider(provider: String): Unit = js.native
  def defineProvider(provider: String, options: Record[String, Any]): Unit = js.native
  
  def defineTopLevelProperty(provider: String, schema: Record[String, Any]): Unit = js.native
}
