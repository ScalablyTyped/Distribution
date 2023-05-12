package typings.sentryReplay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilGetPrivacyOptionsMod {
  
  @JSImport("@sentry/replay/types/util/getPrivacyOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrivacyOptions(param0: GetPrivacyOptions_): GetPrivacyReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrivacyOptions")(param0.asInstanceOf[js.Any]).asInstanceOf[GetPrivacyReturn]
  
  /* Inlined std.Required<std.Omit<@sentry/replay.@sentry/replay/types/types.ReplayIntegrationPrivacyOptions, 'maskFn'>> & std.Omit<@sentry/replay.@sentry/replay/types/types.DeprecatedPrivacyOptions, 'maskInputOptions'> */
  trait GetPrivacyOptions_ extends StObject {
    
    var block: js.Array[String]
    
    var blockClass: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockClass'] */ js.Any
      ] = js.undefined
    
    var blockSelector: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockSelector'] */ js.Any
      ] = js.undefined
    
    var ignore: js.Array[String]
    
    var ignoreClass: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['ignoreClass'] */ js.Any
      ] = js.undefined
    
    var mask: js.Array[String]
    
    var maskTextClass: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextClass'] */ js.Any
      ] = js.undefined
    
    var maskTextSelector: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextSelector'] */ js.Any
      ] = js.undefined
    
    var unblock: js.Array[String]
    
    var unmask: js.Array[String]
  }
  object GetPrivacyOptions_ {
    
    inline def apply(
      block: js.Array[String],
      ignore: js.Array[String],
      mask: js.Array[String],
      unblock: js.Array[String],
      unmask: js.Array[String]
    ): GetPrivacyOptions_ = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], unblock = unblock.asInstanceOf[js.Any], unmask = unmask.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrivacyOptions_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPrivacyOptions_] (val x: Self) extends AnyVal {
      
      inline def setBlock(value: js.Array[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockClass'] */ js.Any
      ): Self = StObject.set(x, "blockClass", value.asInstanceOf[js.Any])
      
      inline def setBlockClassUndefined: Self = StObject.set(x, "blockClass", js.undefined)
      
      inline def setBlockSelector(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['blockSelector'] */ js.Any
      ): Self = StObject.set(x, "blockSelector", value.asInstanceOf[js.Any])
      
      inline def setBlockSelectorUndefined: Self = StObject.set(x, "blockSelector", js.undefined)
      
      inline def setBlockVarargs(value: String*): Self = StObject.set(x, "block", js.Array(value*))
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['ignoreClass'] */ js.Any
      ): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setMask(value: js.Array[String]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskTextClass(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextClass'] */ js.Any
      ): Self = StObject.set(x, "maskTextClass", value.asInstanceOf[js.Any])
      
      inline def setMaskTextClassUndefined: Self = StObject.set(x, "maskTextClass", js.undefined)
      
      inline def setMaskTextSelector(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types.RecordingOptions['maskTextSelector'] */ js.Any
      ): Self = StObject.set(x, "maskTextSelector", value.asInstanceOf[js.Any])
      
      inline def setMaskTextSelectorUndefined: Self = StObject.set(x, "maskTextSelector", js.undefined)
      
      inline def setMaskVarargs(value: String*): Self = StObject.set(x, "mask", js.Array(value*))
      
      inline def setUnblock(value: js.Array[String]): Self = StObject.set(x, "unblock", value.asInstanceOf[js.Any])
      
      inline def setUnblockVarargs(value: String*): Self = StObject.set(x, "unblock", js.Array(value*))
      
      inline def setUnmask(value: js.Array[String]): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
      
      inline def setUnmaskVarargs(value: String*): Self = StObject.set(x, "unmask", js.Array(value*))
    }
  }
  
  trait GetPrivacyReturn extends StObject {
    
    var blockClass: js.UndefOr[js.RegExp] = js.undefined
    
    var blockSelector: String
    
    var ignoreSelector: String
    
    var maskInputSelector: String
    
    var maskTextClass: js.UndefOr[js.RegExp] = js.undefined
    
    var maskTextSelector: String
    
    var unblockSelector: String
    
    var unmaskInputSelector: String
    
    var unmaskTextSelector: String
  }
  object GetPrivacyReturn {
    
    inline def apply(
      blockSelector: String,
      ignoreSelector: String,
      maskInputSelector: String,
      maskTextSelector: String,
      unblockSelector: String,
      unmaskInputSelector: String,
      unmaskTextSelector: String
    ): GetPrivacyReturn = {
      val __obj = js.Dynamic.literal(blockSelector = blockSelector.asInstanceOf[js.Any], ignoreSelector = ignoreSelector.asInstanceOf[js.Any], maskInputSelector = maskInputSelector.asInstanceOf[js.Any], maskTextSelector = maskTextSelector.asInstanceOf[js.Any], unblockSelector = unblockSelector.asInstanceOf[js.Any], unmaskInputSelector = unmaskInputSelector.asInstanceOf[js.Any], unmaskTextSelector = unmaskTextSelector.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrivacyReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPrivacyReturn] (val x: Self) extends AnyVal {
      
      inline def setBlockClass(value: js.RegExp): Self = StObject.set(x, "blockClass", value.asInstanceOf[js.Any])
      
      inline def setBlockClassUndefined: Self = StObject.set(x, "blockClass", js.undefined)
      
      inline def setBlockSelector(value: String): Self = StObject.set(x, "blockSelector", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSelector(value: String): Self = StObject.set(x, "ignoreSelector", value.asInstanceOf[js.Any])
      
      inline def setMaskInputSelector(value: String): Self = StObject.set(x, "maskInputSelector", value.asInstanceOf[js.Any])
      
      inline def setMaskTextClass(value: js.RegExp): Self = StObject.set(x, "maskTextClass", value.asInstanceOf[js.Any])
      
      inline def setMaskTextClassUndefined: Self = StObject.set(x, "maskTextClass", js.undefined)
      
      inline def setMaskTextSelector(value: String): Self = StObject.set(x, "maskTextSelector", value.asInstanceOf[js.Any])
      
      inline def setUnblockSelector(value: String): Self = StObject.set(x, "unblockSelector", value.asInstanceOf[js.Any])
      
      inline def setUnmaskInputSelector(value: String): Self = StObject.set(x, "unmaskInputSelector", value.asInstanceOf[js.Any])
      
      inline def setUnmaskTextSelector(value: String): Self = StObject.set(x, "unmaskTextSelector", value.asInstanceOf[js.Any])
    }
  }
}
