package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigExtras extends StObject {
  
  /**
    * By default, the slot polyfill does not update `appendChild()` so that it appends
    * new child nodes into the correct child slot like how shadow dom works. This is an opt-in
    * polyfill for those who need it when using `element.appendChild(node)` and expecting the
    * child to be appended in the same location shadow dom would. This is not required for
    * IE11 or Edge 18, but can be enabled if the app is using `appendChild()`. Defaults to `false`.
    */
  var appendChildSlotFix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, the runtime does not polyfill `cloneNode()` when cloning a component
    * that uses the slot polyfill. This is an opt-in polyfill for those who need it.
    * This is not required for IE11 or Edge 18, but can be enabled if the app is using
    * `cloneNode()` and unexpected node are being cloned due to the slot polyfill
    * simulating shadow dom. Defaults to `false`.
    */
  var cloneNodeFix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include the CSS Custom Property polyfill/shim for legacy browsers. ESM builds will
    * not include the css vars shim. Defaults to `false`
    */
  var cssVarsShim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dynamic `import()` shim. This is only needed for Edge 18 and below, and Firefox 67
    * and below. Defaults to `false`.
    */
  var dynamicImportShim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Experimental flag. Projects that use a Stencil library built using the `dist` output target may have trouble lazily
    * loading components when using a bundler such as Vite or Parcel. Setting this flag to `true` will change how Stencil
    * lazily loads components in a way that works with additional bundlers. Setting this flag to `true` will increase
    * the size of the compiled output. Defaults to `false`.
    */
  var experimentalImportInjection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When a component is first attached to the DOM, this setting will wait a single tick before
    * rendering. This works around an Angular issue, where Angular attaches the elements before
    * settings their initial state, leading to double renders and unnecessary event dispatches.
    * Defaults to `false`.
    */
  var initializeNextTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dispatches component lifecycle events. Mainly used for testing. Defaults to `false`.
    */
  var lifecycleDOMEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Safari 10 supports ES modules with `<script type="module">`, however, it did not implement
    * `<script nomodule>`. When set to `true`, the runtime will patch support for Safari 10
    * due to its lack of `nomodule` support.
    * Defaults to `false`.
    */
  var safari10: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Experimental flag to align the behavior of invoking `textContent` on a scoped component to act more like a
    * component that uses the shadow DOM. Defaults to `false`
    */
  var scopedSlotTextContentFix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It is possible to assign data to the actual `<script>` element's `data-opts` property,
    * which then gets passed to Stencil's initial bootstrap. This feature is only required
    * for very special cases and rarely needed. Defaults to `false`.
    */
  var scriptDataOpts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If enabled `true`, the runtime will check if the shadow dom shim is required. However,
    * if it's determined that shadow dom is already natively supported by the browser then
    * it does not request the shim. When set to `false` it will avoid all shadow dom tests.
    * Defaults to `false`.
    */
  var shadowDomShim: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For browsers that do not support shadow dom (IE11 and Edge 18 and below), slot is polyfilled
    * to simulate the same behavior. However, the host element's `childNodes` and `children`
    * getters are not patched to only show the child nodes and elements of the default slot.
    * Defaults to `false`.
    */
  var slotChildNodesFix: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the tagNameTransform option of `defineCustomElements()`, so the component tagName
    * can be customized at runtime. Defaults to `false`.
    */
  var tagNameTransform: js.UndefOr[Boolean] = js.undefined
}
object ConfigExtras {
  
  inline def apply(): ConfigExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigExtras]
  }
  
  extension [Self <: ConfigExtras](x: Self) {
    
    inline def setAppendChildSlotFix(value: Boolean): Self = StObject.set(x, "appendChildSlotFix", value.asInstanceOf[js.Any])
    
    inline def setAppendChildSlotFixUndefined: Self = StObject.set(x, "appendChildSlotFix", js.undefined)
    
    inline def setCloneNodeFix(value: Boolean): Self = StObject.set(x, "cloneNodeFix", value.asInstanceOf[js.Any])
    
    inline def setCloneNodeFixUndefined: Self = StObject.set(x, "cloneNodeFix", js.undefined)
    
    inline def setCssVarsShim(value: Boolean): Self = StObject.set(x, "cssVarsShim", value.asInstanceOf[js.Any])
    
    inline def setCssVarsShimUndefined: Self = StObject.set(x, "cssVarsShim", js.undefined)
    
    inline def setDynamicImportShim(value: Boolean): Self = StObject.set(x, "dynamicImportShim", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportShimUndefined: Self = StObject.set(x, "dynamicImportShim", js.undefined)
    
    inline def setExperimentalImportInjection(value: Boolean): Self = StObject.set(x, "experimentalImportInjection", value.asInstanceOf[js.Any])
    
    inline def setExperimentalImportInjectionUndefined: Self = StObject.set(x, "experimentalImportInjection", js.undefined)
    
    inline def setInitializeNextTick(value: Boolean): Self = StObject.set(x, "initializeNextTick", value.asInstanceOf[js.Any])
    
    inline def setInitializeNextTickUndefined: Self = StObject.set(x, "initializeNextTick", js.undefined)
    
    inline def setLifecycleDOMEvents(value: Boolean): Self = StObject.set(x, "lifecycleDOMEvents", value.asInstanceOf[js.Any])
    
    inline def setLifecycleDOMEventsUndefined: Self = StObject.set(x, "lifecycleDOMEvents", js.undefined)
    
    inline def setSafari10(value: Boolean): Self = StObject.set(x, "safari10", value.asInstanceOf[js.Any])
    
    inline def setSafari10Undefined: Self = StObject.set(x, "safari10", js.undefined)
    
    inline def setScopedSlotTextContentFix(value: Boolean): Self = StObject.set(x, "scopedSlotTextContentFix", value.asInstanceOf[js.Any])
    
    inline def setScopedSlotTextContentFixUndefined: Self = StObject.set(x, "scopedSlotTextContentFix", js.undefined)
    
    inline def setScriptDataOpts(value: Boolean): Self = StObject.set(x, "scriptDataOpts", value.asInstanceOf[js.Any])
    
    inline def setScriptDataOptsUndefined: Self = StObject.set(x, "scriptDataOpts", js.undefined)
    
    inline def setShadowDomShim(value: Boolean): Self = StObject.set(x, "shadowDomShim", value.asInstanceOf[js.Any])
    
    inline def setShadowDomShimUndefined: Self = StObject.set(x, "shadowDomShim", js.undefined)
    
    inline def setSlotChildNodesFix(value: Boolean): Self = StObject.set(x, "slotChildNodesFix", value.asInstanceOf[js.Any])
    
    inline def setSlotChildNodesFixUndefined: Self = StObject.set(x, "slotChildNodesFix", js.undefined)
    
    inline def setTagNameTransform(value: Boolean): Self = StObject.set(x, "tagNameTransform", value.asInstanceOf[js.Any])
    
    inline def setTagNameTransformUndefined: Self = StObject.set(x, "tagNameTransform", js.undefined)
  }
}
