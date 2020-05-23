package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.AudioContextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AudioContext")
@js.native
class AudioContext ()
  extends typings.std.AudioContext {
  def this(contextOptions: AudioContextOptions) = this()
}

@JSGlobal("AudioContext")
@js.native
object AudioContext
  extends Instantiable0[typings.std.AudioContext]
     with Instantiable1[/* contextOptions */ AudioContextOptions, typings.std.AudioContext]

