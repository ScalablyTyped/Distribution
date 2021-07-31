package typings.rasha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rasha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // JWK-to-PEM
  @scala.inline
  def `export`(opts: ExportOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("export")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def generate(opts: GenerateOptions): js.Promise[RsaKeys] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaKeys]]
  
  // PEM-to-JWK
  @scala.inline
  def `import`(opts: ImportOptions): js.Promise[Jwk] = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jwk]]
  
  @scala.inline
  def thumbprint(jwk: Jwk): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("thumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  trait ExportOptions extends StObject {
    
    var format: String
    
    var jwk: Jwk
    
    var public: Boolean
  }
  object ExportOptions {
    
    @scala.inline
    def apply(format: String, jwk: Jwk, public: Boolean): ExportOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], jwk = jwk.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportOptions]
    }
    
    @scala.inline
    implicit class ExportOptionsMutableBuilder[Self <: ExportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwk(value: Jwk): Self = StObject.set(x, "jwk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait GenerateOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var format: String
    
    var modulusLength: js.UndefOr[Double] = js.undefined
    
    var publicExponent: js.UndefOr[Double] = js.undefined
  }
  object GenerateOptions {
    
    @scala.inline
    def apply(format: String): GenerateOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit class GenerateOptionsMutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulusLength(value: Double): Self = StObject.set(x, "modulusLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulusLengthUndefined: Self = StObject.set(x, "modulusLength", js.undefined)
      
      @scala.inline
      def setPublicExponent(value: Double): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
    }
  }
  
  trait ImportOptions extends StObject {
    
    var pem: String
    
    var public: Boolean
  }
  object ImportOptions {
    
    @scala.inline
    def apply(pem: String, public: Boolean): ImportOptions = {
      val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportOptions]
    }
    
    @scala.inline
    implicit class ImportOptionsMutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait Jwk extends StObject {
    
    var d: String
    
    var dp: String
    
    var dq: String
    
    var e: String
    
    var kty: String
    
    var n: String
    
    var p: String
    
    var q: String
    
    var qi: String
  }
  object Jwk {
    
    @scala.inline
    def apply(
      d: String,
      dp: String,
      dq: String,
      e: String,
      kty: String,
      n: String,
      p: String,
      q: String,
      qi: String
    ): Jwk = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jwk]
    }
    
    @scala.inline
    implicit class JwkMutableBuilder[Self <: Jwk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDq(value: String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQi(value: String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    }
  }
  
  trait RsaKeys extends StObject {
    
    var `private`: String
    
    var public: String
  }
  object RsaKeys {
    
    @scala.inline
    def apply(`private`: String, public: String): RsaKeys = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaKeys]
    }
    
    @scala.inline
    implicit class RsaKeysMutableBuilder[Self <: RsaKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
