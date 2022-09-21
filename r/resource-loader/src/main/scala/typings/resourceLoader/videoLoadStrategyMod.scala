package typings.resourceLoader

import typings.resourceLoader.mediaElementLoadStrategyMod.IMediaElementLoadConfig
import typings.resourceLoader.mediaElementLoadStrategyMod.MediaElementLoadStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoLoadStrategyMod {
  
  @JSImport("resource-loader/dist/load_strategies/VideoLoadStrategy", "VideoLoadStrategy")
  @js.native
  open class VideoLoadStrategy protected () extends MediaElementLoadStrategy {
    def this(config: IMediaElementLoadConfig) = this()
  }
}
