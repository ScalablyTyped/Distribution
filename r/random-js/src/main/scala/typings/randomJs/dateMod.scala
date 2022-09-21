package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("random-js/dist/distribution/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def date(start: js.Date, end: js.Date): Distribution[js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.Date]]
}
