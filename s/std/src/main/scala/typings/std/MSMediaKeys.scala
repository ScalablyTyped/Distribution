package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSMediaKeys extends StObject {
  
  def createSession(`type`: java.lang.String, initData: Uint8Array): MSMediaKeySession = js.native
  def createSession(`type`: java.lang.String, initData: Uint8Array, cdmData: Uint8Array): MSMediaKeySession = js.native
  
  val keySystem: java.lang.String = js.native
}
