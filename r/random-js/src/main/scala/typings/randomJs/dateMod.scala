package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("random-js/dist/distribution/date", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def date(start: Date, end: Date): Distribution[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[Date]]
}
