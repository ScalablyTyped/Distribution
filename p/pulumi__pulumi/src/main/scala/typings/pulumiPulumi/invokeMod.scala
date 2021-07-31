package typings.pulumiPulumi

import typings.pulumiPulumi.resourceMod.ProviderResource
import typings.pulumiPulumi.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeMod {
  
  trait InvokeOptions extends StObject {
    
    /**
      * Invoke this data source function asynchronously.  Defaults to `true` if unspecified.
      *
      * When `true`, only the `Promise<>` side of the invoke result is present.  Explicitly pass in
      * `false` to get the non-Promise side of the result.  Invoking data source functions
      * synchronously is deprecated.  The ability to do this will be removed at a later point in
      * time.
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional parent to use for default options for this invoke (e.g. the default provider to use).
      */
    var parent: js.UndefOr[Resource] = js.undefined
    
    /**
      * An optional provider to use for this invocation. If no provider is supplied, the default provider for the
      * invoked function's package will be used.
      */
    var provider: js.UndefOr[ProviderResource] = js.undefined
    
    /**
      * An optional version, corresponding to the version of the provider plugin that should be used when performing this
      * invoke.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object InvokeOptions {
    
    @scala.inline
    def apply(): InvokeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokeOptions]
    }
    
    @scala.inline
    implicit class InvokeOptionsMutableBuilder[Self <: InvokeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setParent(value: Resource): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setProvider(value: ProviderResource): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
