package typings
package resemblejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OutputSettings extends js.Object {
  /**
    * Set the resemblance image output style
    */
  def outputSettings(settings: resemblejsLib.resemblejsMod.ResembleNs.OutputSettings): /* import warning: ImportType.apply Failed type conversion: typeof Resemble */ js.Any
}

object Anon_OutputSettings {
  @scala.inline
  def apply(
    outputSettings: resemblejsLib.resemblejsMod.ResembleNs.OutputSettings => /* import warning: ImportType.apply Failed type conversion: typeof Resemble */ js.Any
  ): Anon_OutputSettings = {
    val __obj = js.Dynamic.literal(outputSettings = js.Any.fromFunction1(outputSettings))
  
    __obj.asInstanceOf[Anon_OutputSettings]
  }
}

