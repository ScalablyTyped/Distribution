package typings.rrule

import typings.rrule.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionstostringMod {
  
  @JSImport("rrule/dist/esm/src/optionstostring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def optionsToString(options: PartialOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsToString")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}
