package typings.storybookCoreCommon.distTs3Dot9TypesMod

import typings.storybookCoreCommon.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreConfig extends StObject {
  
  var builder: BuilderConfig
  
  var channelOptions: js.UndefOr[PartialOptions] = js.undefined
  
  /**
    * enable CORS headings to run document in a "secure context"
    * see: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SharedArrayBuffer#security_requirements
    * This enables these headers in development-mode:
    *   Cross-Origin-Opener-Policy: same-origin
    *   Cross-Origin-Embedder-Policy: require-corp
    */
  var crossOriginIsolated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disables the generation of project.json, a file containing Storybook metadata
    */
  var disableProjectJson: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disables Storybook telemetry
    * @see https://storybook.js.org/telemetry
    */
  var disableTelemetry: js.UndefOr[Boolean] = js.undefined
  
  var disableWebpackDefaults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable crash reports to be sent to Storybook telemetry
    * @see https://storybook.js.org/telemetry
    */
  var enableCrashReports: js.UndefOr[Boolean] = js.undefined
}
object CoreConfig {
  
  inline def apply(builder: BuilderConfig): CoreConfig = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreConfig] (val x: Self) extends AnyVal {
    
    inline def setBuilder(value: BuilderConfig): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setChannelOptions(value: PartialOptions): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
    
    inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
    
    inline def setCrossOriginIsolated(value: Boolean): Self = StObject.set(x, "crossOriginIsolated", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginIsolatedUndefined: Self = StObject.set(x, "crossOriginIsolated", js.undefined)
    
    inline def setDisableProjectJson(value: Boolean): Self = StObject.set(x, "disableProjectJson", value.asInstanceOf[js.Any])
    
    inline def setDisableProjectJsonUndefined: Self = StObject.set(x, "disableProjectJson", js.undefined)
    
    inline def setDisableTelemetry(value: Boolean): Self = StObject.set(x, "disableTelemetry", value.asInstanceOf[js.Any])
    
    inline def setDisableTelemetryUndefined: Self = StObject.set(x, "disableTelemetry", js.undefined)
    
    inline def setDisableWebpackDefaults(value: Boolean): Self = StObject.set(x, "disableWebpackDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableWebpackDefaultsUndefined: Self = StObject.set(x, "disableWebpackDefaults", js.undefined)
    
    inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
    
    inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
  }
}
