package typings.sentryReplay.typesTypesReplayMod

import typings.sentryReplay.anon.PartialcaptureExceptionsb
import typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrameEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @sentry/replay.@sentry/replay/types/types/replay.ReplayIntegrationPrivacyOptions */
/* Inlined parent @sentry/replay.@sentry/replay/types/types/replay.OptionalReplayPluginOptions */
/* Inlined parent @sentry/replay.@sentry/replay/types/types/replay.DeprecatedPrivacyOptions */
/* Inlined parent std.Pick<@sentry/replay.@sentry/replay/types/types/replay.RecordingOptions, 'maskAllText' | 'maskAllInputs'> */
trait ReplayConfiguration extends StObject {
  
  var _experiments: js.UndefOr[PartialcaptureExceptionsb] = js.undefined
  
  var beforeAddRecordingEvent: js.UndefOr[BeforeAddRecordingEvent] = js.undefined
  
  /**
    * Block elements that match the CSS selectors in the list. Blocking replaces
    * the element with an empty placeholder with the same dimensions.
    */
  var block: js.UndefOr[js.Array[String]] = js.undefined
  
  var blockAllMedia: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated Use `block` which accepts an array of CSS selectors
    */
  var blockClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['blockClass'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `block` which accepts an array of CSS selectors
    */
  var blockSelector: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['blockSelector'] */ js.Any
  ] = js.undefined
  
  var errorSampleRate: js.UndefOr[Double] = js.undefined
  
  var flushMaxDelay: js.UndefOr[Double] = js.undefined
  
  var flushMinDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Ignore input events for elements that match the CSS selectors in the list.
    */
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @deprecated Use `ignore` which accepts an array of CSS selectors
    */
  var ignoreClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['ignoreClass'] */ js.Any
  ] = js.undefined
  
  /**
    * Mask text content for elements that match the CSS selectors in the list.
    */
  var mask: js.UndefOr[js.Array[String]] = js.undefined
  
  var maskAllInputs: js.UndefOr[Boolean] = js.undefined
  
  var maskAllText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback function to customize how your text is masked.
    */
  var maskFn: js.UndefOr[js.Function1[/* s */ String, String]] = js.undefined
  
  /**
    * @deprecated  Use `mask` which accepts an array of CSS selectors
    */
  var maskInputOptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskInputOptions'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `mask` which accepts an array of CSS selectors
    */
  var maskTextClass: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskTextClass'] */ js.Any
  ] = js.undefined
  
  /**
    * @deprecated Use `mask` which accepts an array of CSS selectors
    */
  var maskTextSelector: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskTextSelector'] */ js.Any
  ] = js.undefined
  
  var mutationBreadcrumbLimit: js.UndefOr[Double] = js.undefined
  
  var mutationLimit: js.UndefOr[Double] = js.undefined
  
  var networkCaptureBodies: js.UndefOr[Boolean] = js.undefined
  
  var networkDetailAllowUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var networkRequestHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var networkResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var sessionSampleRate: js.UndefOr[Double] = js.undefined
  
  var slowClickIgnoreSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var slowClickTimeout: js.UndefOr[Double] = js.undefined
  
  var stickySession: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Unblock elements that match the CSS selectors in the list. This is useful when using `blockAllMedia`.
    */
  var unblock: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Unmask text content for elements that match the CSS selectors in the list.
    */
  var unmask: js.UndefOr[js.Array[String]] = js.undefined
  
  var useCompression: js.UndefOr[Boolean] = js.undefined
}
object ReplayConfiguration {
  
  inline def apply(): ReplayConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplayConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplayConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBeforeAddRecordingEvent(value: /* event */ ReplayFrameEvent => js.UndefOr[ReplayFrameEvent | Null]): Self = StObject.set(x, "beforeAddRecordingEvent", js.Any.fromFunction1(value))
    
    inline def setBeforeAddRecordingEventUndefined: Self = StObject.set(x, "beforeAddRecordingEvent", js.undefined)
    
    inline def setBlock(value: js.Array[String]): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setBlockAllMedia(value: Boolean): Self = StObject.set(x, "blockAllMedia", value.asInstanceOf[js.Any])
    
    inline def setBlockAllMediaUndefined: Self = StObject.set(x, "blockAllMedia", js.undefined)
    
    inline def setBlockClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['blockClass'] */ js.Any
    ): Self = StObject.set(x, "blockClass", value.asInstanceOf[js.Any])
    
    inline def setBlockClassUndefined: Self = StObject.set(x, "blockClass", js.undefined)
    
    inline def setBlockSelector(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['blockSelector'] */ js.Any
    ): Self = StObject.set(x, "blockSelector", value.asInstanceOf[js.Any])
    
    inline def setBlockSelectorUndefined: Self = StObject.set(x, "blockSelector", js.undefined)
    
    inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    inline def setBlockVarargs(value: String*): Self = StObject.set(x, "block", js.Array(value*))
    
    inline def setErrorSampleRate(value: Double): Self = StObject.set(x, "errorSampleRate", value.asInstanceOf[js.Any])
    
    inline def setErrorSampleRateUndefined: Self = StObject.set(x, "errorSampleRate", js.undefined)
    
    inline def setFlushMaxDelay(value: Double): Self = StObject.set(x, "flushMaxDelay", value.asInstanceOf[js.Any])
    
    inline def setFlushMaxDelayUndefined: Self = StObject.set(x, "flushMaxDelay", js.undefined)
    
    inline def setFlushMinDelay(value: Double): Self = StObject.set(x, "flushMinDelay", value.asInstanceOf[js.Any])
    
    inline def setFlushMinDelayUndefined: Self = StObject.set(x, "flushMinDelay", js.undefined)
    
    inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['ignoreClass'] */ js.Any
    ): Self = StObject.set(x, "ignoreClass", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassUndefined: Self = StObject.set(x, "ignoreClass", js.undefined)
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
    
    inline def setMask(value: js.Array[String]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputs(value: Boolean): Self = StObject.set(x, "maskAllInputs", value.asInstanceOf[js.Any])
    
    inline def setMaskAllInputsUndefined: Self = StObject.set(x, "maskAllInputs", js.undefined)
    
    inline def setMaskAllText(value: Boolean): Self = StObject.set(x, "maskAllText", value.asInstanceOf[js.Any])
    
    inline def setMaskAllTextUndefined: Self = StObject.set(x, "maskAllText", js.undefined)
    
    inline def setMaskFn(value: /* s */ String => String): Self = StObject.set(x, "maskFn", js.Any.fromFunction1(value))
    
    inline def setMaskFnUndefined: Self = StObject.set(x, "maskFn", js.undefined)
    
    inline def setMaskInputOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskInputOptions'] */ js.Any
    ): Self = StObject.set(x, "maskInputOptions", value.asInstanceOf[js.Any])
    
    inline def setMaskInputOptionsUndefined: Self = StObject.set(x, "maskInputOptions", js.undefined)
    
    inline def setMaskTextClass(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskTextClass'] */ js.Any
    ): Self = StObject.set(x, "maskTextClass", value.asInstanceOf[js.Any])
    
    inline def setMaskTextClassUndefined: Self = StObject.set(x, "maskTextClass", js.undefined)
    
    inline def setMaskTextSelector(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @sentry/replay.@sentry/replay/types/types/replay.RecordingOptions['maskTextSelector'] */ js.Any
    ): Self = StObject.set(x, "maskTextSelector", value.asInstanceOf[js.Any])
    
    inline def setMaskTextSelectorUndefined: Self = StObject.set(x, "maskTextSelector", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setMaskVarargs(value: String*): Self = StObject.set(x, "mask", js.Array(value*))
    
    inline def setMutationBreadcrumbLimit(value: Double): Self = StObject.set(x, "mutationBreadcrumbLimit", value.asInstanceOf[js.Any])
    
    inline def setMutationBreadcrumbLimitUndefined: Self = StObject.set(x, "mutationBreadcrumbLimit", js.undefined)
    
    inline def setMutationLimit(value: Double): Self = StObject.set(x, "mutationLimit", value.asInstanceOf[js.Any])
    
    inline def setMutationLimitUndefined: Self = StObject.set(x, "mutationLimit", js.undefined)
    
    inline def setNetworkCaptureBodies(value: Boolean): Self = StObject.set(x, "networkCaptureBodies", value.asInstanceOf[js.Any])
    
    inline def setNetworkCaptureBodiesUndefined: Self = StObject.set(x, "networkCaptureBodies", js.undefined)
    
    inline def setNetworkDetailAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "networkDetailAllowUrls", value.asInstanceOf[js.Any])
    
    inline def setNetworkDetailAllowUrlsUndefined: Self = StObject.set(x, "networkDetailAllowUrls", js.undefined)
    
    inline def setNetworkDetailAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "networkDetailAllowUrls", js.Array(value*))
    
    inline def setNetworkRequestHeaders(value: js.Array[String]): Self = StObject.set(x, "networkRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkRequestHeadersUndefined: Self = StObject.set(x, "networkRequestHeaders", js.undefined)
    
    inline def setNetworkRequestHeadersVarargs(value: String*): Self = StObject.set(x, "networkRequestHeaders", js.Array(value*))
    
    inline def setNetworkResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "networkResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setNetworkResponseHeadersUndefined: Self = StObject.set(x, "networkResponseHeaders", js.undefined)
    
    inline def setNetworkResponseHeadersVarargs(value: String*): Self = StObject.set(x, "networkResponseHeaders", js.Array(value*))
    
    inline def setSessionSampleRate(value: Double): Self = StObject.set(x, "sessionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setSessionSampleRateUndefined: Self = StObject.set(x, "sessionSampleRate", js.undefined)
    
    inline def setSlowClickIgnoreSelectors(value: js.Array[String]): Self = StObject.set(x, "slowClickIgnoreSelectors", value.asInstanceOf[js.Any])
    
    inline def setSlowClickIgnoreSelectorsUndefined: Self = StObject.set(x, "slowClickIgnoreSelectors", js.undefined)
    
    inline def setSlowClickIgnoreSelectorsVarargs(value: String*): Self = StObject.set(x, "slowClickIgnoreSelectors", js.Array(value*))
    
    inline def setSlowClickTimeout(value: Double): Self = StObject.set(x, "slowClickTimeout", value.asInstanceOf[js.Any])
    
    inline def setSlowClickTimeoutUndefined: Self = StObject.set(x, "slowClickTimeout", js.undefined)
    
    inline def setStickySession(value: Boolean): Self = StObject.set(x, "stickySession", value.asInstanceOf[js.Any])
    
    inline def setStickySessionUndefined: Self = StObject.set(x, "stickySession", js.undefined)
    
    inline def setUnblock(value: js.Array[String]): Self = StObject.set(x, "unblock", value.asInstanceOf[js.Any])
    
    inline def setUnblockUndefined: Self = StObject.set(x, "unblock", js.undefined)
    
    inline def setUnblockVarargs(value: String*): Self = StObject.set(x, "unblock", js.Array(value*))
    
    inline def setUnmask(value: js.Array[String]): Self = StObject.set(x, "unmask", value.asInstanceOf[js.Any])
    
    inline def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
    
    inline def setUnmaskVarargs(value: String*): Self = StObject.set(x, "unmask", js.Array(value*))
    
    inline def setUseCompression(value: Boolean): Self = StObject.set(x, "useCompression", value.asInstanceOf[js.Any])
    
    inline def setUseCompressionUndefined: Self = StObject.set(x, "useCompression", js.undefined)
    
    inline def set_experiments(value: PartialcaptureExceptionsb): Self = StObject.set(x, "_experiments", value.asInstanceOf[js.Any])
    
    inline def set_experimentsUndefined: Self = StObject.set(x, "_experiments", js.undefined)
  }
}
