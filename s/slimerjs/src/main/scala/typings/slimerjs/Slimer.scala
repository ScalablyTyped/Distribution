package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slimer extends StObject {
  
  def clearHttpAuth(): Unit = js.native
  
  def exit(): Unit = js.native
  def exit(returnValue: Double): Unit = js.native
  
  var geckoVersion: Double = js.native
  
  def hasFeature(featureName: String): Boolean = js.native
  
  def isExiting(): Boolean = js.native
  
  var version: Double = js.native
  
  def wait(milliseconds: Double): Unit = js.native
}
