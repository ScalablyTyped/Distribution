package typings.sass.anon

import typings.sass.pluginThisMod.LegacyPluginThis
import typings.sass.sassInts.`0`
import typings.sass.sassInts.`10`
import typings.sass.sassInts.`1`
import typings.sass.sassStrings.Carriagereturn
import typings.sass.sassStrings.CarriagereturnLinefeed
import typings.sass.sassStrings.Linefeed
import typings.sass.sassStrings.LinefeedCarriagereturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  /** The same [[LegacyPluginThis]] instance that contains this object. */
  var context: LegacyPluginThis
  
  /** The value passed to [[LegacyStringOptions.data]]. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The value passed to [[LegacyFileOptions.file]] or
    * [[LegacyStringOptions.file]].
    */
  var file: js.UndefOr[String] = js.undefined
  
  /**
    * The value passed to [[LegacySharedOptions.includePaths]] separated by
    * `";"` on Windows or `":"` on other operating systems. This always
    * includes the current working directory as the first entry.
    */
  var includePaths: String
  
  /** 1 if [[LegacySharedOptions.indentType]] was `"tab"`, 0 otherwise. */
  var indentType: `1` | `0`
  
  /**
    * The value passed to [[LegacySharedOptions.indentWidth]], or `2` otherwise.
    */
  var indentWidth: Double
  
  /**
    * The value passed to [[LegacySharedOptions.linefeed]], or `"\n"`
    * otherwise.
    */
  var linefeed: Carriagereturn | CarriagereturnLinefeed | Linefeed | LinefeedCarriagereturn
  
  /** Always the number 10. */
  var precision: `10`
  
  /** A partially-constructed [[LegacyResult]] object. */
  var result: Stats
  
  /** Always the number 1. */
  var style: `1`
}
object Context {
  
  inline def apply(
    context: LegacyPluginThis,
    includePaths: String,
    indentType: `1` | `0`,
    indentWidth: Double,
    linefeed: Carriagereturn | CarriagereturnLinefeed | Linefeed | LinefeedCarriagereturn,
    result: Stats
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], includePaths = includePaths.asInstanceOf[js.Any], indentType = indentType.asInstanceOf[js.Any], indentWidth = indentWidth.asInstanceOf[js.Any], linefeed = linefeed.asInstanceOf[js.Any], precision = 10, result = result.asInstanceOf[js.Any], style = 1)
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: LegacyPluginThis): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setIncludePaths(value: String): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
    
    inline def setIndentType(value: `1` | `0`): Self = StObject.set(x, "indentType", value.asInstanceOf[js.Any])
    
    inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
    
    inline def setLinefeed(value: Carriagereturn | CarriagereturnLinefeed | Linefeed | LinefeedCarriagereturn): Self = StObject.set(x, "linefeed", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: `10`): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Stats): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: `1`): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
