package typings.sigmund

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(subject: Any): String = ^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(subject: Any, maxDepth: Double): String = (^.asInstanceOf[js.Dynamic].apply(subject.asInstanceOf[js.Any], maxDepth.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sigmund", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
