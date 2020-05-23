package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.std.OfflineAudioContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfflineAudioContext")
@js.native
class OfflineAudioContext protected ()
  extends typings.std.OfflineAudioContext {
  def this(contextOptions: OfflineAudioContextOptions) = this()
  def this(numberOfChannels: Double, length: Double, sampleRate: Double) = this()
}

@JSGlobal("OfflineAudioContext")
@js.native
object OfflineAudioContext
  extends Instantiable1[/* contextOptions */ OfflineAudioContextOptions, typings.std.OfflineAudioContext]
     with Instantiable3[
      /* numberOfChannels */ Double, 
      /* length */ Double, 
      /* sampleRate */ Double, 
      typings.std.OfflineAudioContext
    ]

