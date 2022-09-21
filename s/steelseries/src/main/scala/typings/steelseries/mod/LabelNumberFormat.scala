package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "LabelNumberFormat")
@js.native
open class LabelNumberFormat protected () extends StObject {
  def this(format: String) = this()
  
  var format: String = js.native
}
object LabelNumberFormat {
  
  @JSImport("steelseries", "LabelNumberFormat.FRACTIONAL")
  @js.native
  val FRACTIONAL: LabelNumberFormat = js.native
  
  @JSImport("steelseries", "LabelNumberFormat.SCIENTIFIC")
  @js.native
  val SCIENTIFIC: LabelNumberFormat = js.native
  
  @JSImport("steelseries", "LabelNumberFormat.STANDARD")
  @js.native
  val STANDARD: LabelNumberFormat = js.native
}
