package typings.segmentIsodate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@segment/isodate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is(string: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(string.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(iso: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
