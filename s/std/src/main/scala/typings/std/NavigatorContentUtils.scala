package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigatorContentUtils extends StObject {
  
  /** Available only in secure contexts. */
  /* standard dom */
  def registerProtocolHandler(scheme: java.lang.String, url: java.lang.String): Unit = js.native
  def registerProtocolHandler(scheme: java.lang.String, url: URL): Unit = js.native
}
