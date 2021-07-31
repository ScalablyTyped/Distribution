package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariEventTarget extends StObject {
  
  def addEventListener(`type`: String, listener: SafariEventListener): Unit = js.native
  def addEventListener(`type`: String, listener: SafariEventListener, useCapture: Boolean): Unit = js.native
  
  def removeEventListener(`type`: String, listener: SafariEventListener): Unit = js.native
  def removeEventListener(`type`: String, listener: SafariEventListener, useCapture: Boolean): Unit = js.native
}
