package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("random-js/dist/distribution/date", "date")
  @js.native
  def date(start: Date, end: Date): Distribution[Date] = js.native
}
