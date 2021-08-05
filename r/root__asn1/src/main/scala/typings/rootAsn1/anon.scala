package typings.rootAsn1

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.rootAsn1.rootAsn1Booleans.`true`
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var json: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(json = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Der extends StObject {
    
    var der: Uint8Array
    
    var json: js.UndefOr[`true`] = js.undefined
    
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Der {
    
    inline def apply(der: Uint8Array): Der = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any])
      __obj.asInstanceOf[Der]
    }
    
    extension [Self <: Der](x: Self) {
      
      inline def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait DerJson extends StObject {
    
    var der: Uint8Array
    
    var json: js.UndefOr[`true`] = js.undefined
    
    var verbose: `true`
  }
  object DerJson {
    
    inline def apply(der: Uint8Array): DerJson = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], verbose = true)
      __obj.asInstanceOf[DerJson]
    }
    
    extension [Self <: DerJson](x: Self) {
      
      inline def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Json extends StObject {
    
    var json: js.UndefOr[`false`] = js.undefined
  }
  object Json {
    
    inline def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    extension [Self <: Json](x: Self) {
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait JsonVerbose extends StObject {
    
    var der: Uint8Array
    
    var json: `false`
    
    var verbose: `true`
  }
  object JsonVerbose {
    
    inline def apply(der: Uint8Array): JsonVerbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = false, verbose = true)
      __obj.asInstanceOf[JsonVerbose]
    }
    
    extension [Self <: JsonVerbose](x: Self) {
      
      inline def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Verbose extends StObject {
    
    var der: Uint8Array
    
    var json: `false`
    
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Verbose {
    
    inline def apply(der: Uint8Array): Verbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = false)
      __obj.asInstanceOf[Verbose]
    }
    
    extension [Self <: Verbose](x: Self) {
      
      inline def setDer(value: Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
