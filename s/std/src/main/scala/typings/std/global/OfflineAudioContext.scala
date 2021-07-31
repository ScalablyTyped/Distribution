package typings.std.global

import typings.std.OfflineAudioContextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("OfflineAudioContext")
@js.native
class OfflineAudioContext protected ()
  extends StObject
     with typings.std.OfflineAudioContext {
  def this(contextOptions: OfflineAudioContextOptions) = this()
  def this(numberOfChannels: Double, length: Double, sampleRate: Double) = this()
}
