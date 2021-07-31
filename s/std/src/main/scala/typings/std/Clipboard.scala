package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clipboard
  extends StObject
     with EventTarget {
  
  def readText(): js.Promise[java.lang.String] = js.native
  
  def writeText(data: java.lang.String): js.Promise[Unit] = js.native
}
