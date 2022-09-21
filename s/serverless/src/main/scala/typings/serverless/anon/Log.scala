package typings.serverless.anon

import typings.serverless.mod.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends StObject {
  
  /**
    * @deprecated starting from Serverless V3, this method is deprecated, see https://www.serverless.com/framework/docs/guides/plugins/cli-output
    */
  def log(message: String): Null = js.native
  def log(message: String, entity: String): Null = js.native
  def log(message: String, entity: String, options: LogOptions): Null = js.native
  def log(message: String, entity: Unit, options: LogOptions): Null = js.native
}
