package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.PeriodicWaveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PeriodicWave")
@js.native
class PeriodicWave protected ()
  extends typings.std.PeriodicWave {
  def this(context: typings.std.BaseAudioContext) = this()
  def this(context: typings.std.BaseAudioContext, options: PeriodicWaveOptions) = this()
}

@JSGlobal("PeriodicWave")
@js.native
object PeriodicWave
  extends Instantiable1[/* context */ typings.std.BaseAudioContext, typings.std.PeriodicWave]
     with Instantiable2[
      /* context */ typings.std.BaseAudioContext, 
      /* options */ PeriodicWaveOptions, 
      typings.std.PeriodicWave
    ]

