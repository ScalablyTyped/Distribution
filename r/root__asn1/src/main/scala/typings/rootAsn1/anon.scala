package typings.rootAsn1

import typings.rootAsn1.rootAsn1Booleans.`false`
import typings.rootAsn1.rootAsn1Booleans.`true`
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
  
  trait Der extends StObject {
    
    var der: js.typedarray.Uint8Array
    
    var json: js.UndefOr[`true`] = js.undefined
    
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Der {
    
    inline def apply(der: js.typedarray.Uint8Array): Der = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any])
      __obj.asInstanceOf[Der]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Der] (val x: Self) extends AnyVal {
      
      inline def setDer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait DerJson extends StObject {
    
    var der: js.typedarray.Uint8Array
    
    var json: js.UndefOr[`true`] = js.undefined
    
    var verbose: `true`
  }
  object DerJson {
    
    inline def apply(der: js.typedarray.Uint8Array): DerJson = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], verbose = true)
      __obj.asInstanceOf[DerJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DerJson] (val x: Self) extends AnyVal {
      
      inline def setDer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    }
  }
  
  trait JsonVerbose extends StObject {
    
    var der: js.typedarray.Uint8Array
    
    var json: `false`
    
    var verbose: `true`
  }
  object JsonVerbose {
    
    inline def apply(der: js.typedarray.Uint8Array): JsonVerbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = false, verbose = true)
      __obj.asInstanceOf[JsonVerbose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonVerbose] (val x: Self) extends AnyVal {
      
      inline def setDer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Verbose extends StObject {
    
    var der: js.typedarray.Uint8Array
    
    var json: `false`
    
    var verbose: js.UndefOr[`false`] = js.undefined
  }
  object Verbose {
    
    inline def apply(der: js.typedarray.Uint8Array): Verbose = {
      val __obj = js.Dynamic.literal(der = der.asInstanceOf[js.Any], json = false)
      __obj.asInstanceOf[Verbose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Verbose] (val x: Self) extends AnyVal {
      
      inline def setDer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "der", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `false`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: `false`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
