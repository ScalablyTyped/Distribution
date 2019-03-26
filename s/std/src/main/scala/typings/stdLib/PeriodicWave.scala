package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodicWave extends js.Object

@JSGlobal("PeriodicWave")
@js.native
class PeriodicWaveCls protected () extends PeriodicWave {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: PeriodicWaveOptions) = this()
}

@JSGlobal("PeriodicWave")
@js.native
object PeriodicWave
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, PeriodicWave]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ PeriodicWaveOptions, PeriodicWave]

