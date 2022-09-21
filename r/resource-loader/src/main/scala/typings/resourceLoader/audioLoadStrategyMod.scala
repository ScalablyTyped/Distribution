package typings.resourceLoader

import typings.resourceLoader.mediaElementLoadStrategyMod.IMediaElementLoadConfig
import typings.resourceLoader.mediaElementLoadStrategyMod.MediaElementLoadStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioLoadStrategyMod {
  
  @JSImport("resource-loader/dist/load_strategies/AudioLoadStrategy", "AudioLoadStrategy")
  @js.native
  open class AudioLoadStrategy protected () extends MediaElementLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
}
