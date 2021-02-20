package typings.rootAsn1

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.rootAsn1.rootAsn1Booleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var json: `true` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(json: `true`): `0` = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Der extends StObject {
    
    var der: Uint8Array = js.native
    
    var json: js.UndefOr[`true`] = js.native
    
    var verbose: js.UndefOr[`false`] = js.native
  }
  object Der {
    
    @scala.inline
    def apply(der: Uint8Array): Der = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any])
      __obj.asInstanceOf[Der]
    }
    
    @scala.inline
    implicit class DerMutableBuilder[Self <: Der] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait DerJson extends StObject {
    
    var der: Uint8Array = js.native
    
    var json: js.UndefOr[`true`] = js.native
    
    var verbose: `true` = js.native
  }
  object DerJson {
    
    @scala.inline
    def apply(der: Uint8Array, verbose: `true`): DerJson = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerJson]
    }
    
    @scala.inline
    implicit class DerJsonMutableBuilder[Self <: DerJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Json extends StObject {
    
    var json: js.UndefOr[`false`] = js.native
  }
  object Json {
    
    @scala.inline
    def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    @scala.inline
    implicit class JsonMutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  @js.native
  trait JsonVerbose extends StObject {
    
    var der: Uint8Array = js.native
    
    var json: `false` = js.native
    
    var verbose: `true` = js.native
  }
  object JsonVerbose {
    
    @scala.inline
    def apply(der: Uint8Array, json: `false`, verbose: `true`): JsonVerbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonVerbose]
    }
    
    @scala.inline
    implicit class JsonVerboseMutableBuilder[Self <: JsonVerbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Verbose extends StObject {
    
    var der: Uint8Array = js.native
    
    var json: `false` = js.native
    
    var verbose: js.UndefOr[`false`] = js.native
  }
  object Verbose {
    
    @scala.inline
    def apply(der: Uint8Array, json: `false`): Verbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit class VerboseMutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
