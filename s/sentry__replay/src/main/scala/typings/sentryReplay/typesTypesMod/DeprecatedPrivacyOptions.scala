package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedPrivacyOptions extends StObject {
  
  /**
    * @deprecated Use `block` which accepts an array of CSS selectors
    */
  var blockClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockClass'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `block` which accepts an array of CSS selectors
    */
  var blockSelector: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockSelector'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `ignore` which accepts an array of CSS selectors
    */
  var ignoreClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['ignoreClass'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated  Use `mask` which accepts an array of CSS selectors
    */
  var maskInputOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskInputOptions'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `mask` which accepts an array of CSS selectors
    */
  var maskTextClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextClass'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `mask` which accepts an array of CSS selectors
    */
  var maskTextSelector: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextSelector'] */ js.Any
  ] = js.undefined
}
object DeprecatedPrivacyOptions {
  
  inline def apply(): DeprecatedPrivacyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedPrivacyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedPrivacyOptions] (val x: Self) extends AnyVal {
    
    inline def setBlockClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockClass'] */ js.Any
    ): Self = StObject.set(x, "blockClass", value.asInstanceOf[js.Any])
    
    inline def setBlockClassUndefined: Self = StObject.set(x, "blockClass", js.undefined)
    
    inline def setBlockSelector(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockSelector'] */ js.Any
    ): Self = StObject.set(x, "blockSelector", value.asInstanceOf[js.Any])
    
    inline def setBlockSelectorUndefined: Self = StObject.set(x, "blockSelector", js.undefined)
    
    inline def setIgnoreClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['ignoreClass'] */ js.Any
    ): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
    
    inline def setMaskInputOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskInputOptions'] */ js.Any
    ): Self = StObject.set(x, "maskInputOptions", value.asInstanceOf[js.Any])
    
    inline def setMaskInputOptionsUndefined: Self = StObject.set(x, "maskInputOptions", js.undefined)
    
    inline def setMaskTextClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextClass'] */ js.Any
    ): Self = StObject.set(x, "maskTextClass", value.asInstanceOf[js.Any])
    
    inline def setMaskTextClassUndefined: Self = StObject.set(x, "maskTextClass", js.undefined)
    
    inline def setMaskTextSelector(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextSelector'] */ js.Any
    ): Self = StObject.set(x, "maskTextSelector", value.asInstanceOf[js.Any])
    
    inline def setMaskTextSelectorUndefined: Self = StObject.set(x, "maskTextSelector", js.undefined)
  }
}
