package typings.rasha

import typings.rasha.rashaStrings.RSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rasha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // JWK-to-PEM
  inline def `export`(opts: ExportOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("export")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def generate(opts: GenerateOptions): js.Promise[RsaKeys] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaKeys]]
  
  // PEM-to-JWK
  inline def `import`(opts: ImportOptions): js.Promise[Jwk] = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jwk]]
  
  inline def thumbprint(jwk: Jwk): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("thumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  trait ExportOptions extends StObject {
    
    var format: String
    
    var jwk: Jwk
    
    var public: Boolean
  }
  object ExportOptions {
    
    inline def apply(format: String, jwk: Jwk, public: Boolean): ExportOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jwk = jwk.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setJwk(value: Jwk): Self = StObject.set(x, "jwk", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenerateOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var format: String
    
    var modulusLength: js.UndefOr[Double] = js.undefined
    
    var publicExponent: js.UndefOr[Double] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(format: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
      
      inline def setModulusLengthUndefined: Self = StObject.set(x, "modulusLength", js.undefined)
      
      inline def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    }
  }
  
  trait ImportOptions extends StObject {
    
    var pem: String
    
    var public: Boolean
  }
  object ImportOptions {
    
    inline def apply(pem: String, public: Boolean): ImportOptions = {
      val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
      
      inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait Jwk extends StObject {
    
    var d: String
    
    var dp: String
    
    var dq: String
    
    var e: String
    
    var kty: RSA
    
    var n: String
    
    var p: String
    
    var q: String
    
    var qi: String
  }
  object Jwk {
    
    inline def apply(d: String, dp: String, dq: String, e: String, n: String, p: String, q: String, qi: String): Jwk = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jwk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jwk] (val x: Self) extends AnyVal {
      
      inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      inline def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setKty(value: RSA): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    }
  }
  
  trait RsaKeys extends StObject {
    
    var `private`: String
    
    var public: String
  }
  object RsaKeys {
    
    inline def apply(`private`: String, public: String): RsaKeys = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaKeys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RsaKeys] (val x: Self) extends AnyVal {
      
      inline def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
