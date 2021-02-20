package typings.rasha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // JWK-to-PEM
  @JSImport("rasha", "export")
  @js.native
  def export(opts: ExportOptions): js.Promise[String] = js.native
  
  @JSImport("rasha", "generate")
  @js.native
  def generate(opts: GenerateOptions): js.Promise[RsaKeys] = js.native
  
  @JSImport("rasha", "thumbprint")
  @js.native
  def thumbprint(jwk: Jwk): js.Promise[_] = js.native
  
  @js.native
  trait ExportOptions extends StObject {
    
    var format: String = js.native
    
    var jwk: Jwk = js.native
    
    var public: Boolean = js.native
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
  
  @js.native
  trait GenerateOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var format: String = js.native
    
    var modulusLength: js.UndefOr[Double] = js.native
    
    var publicExponent: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait ImportOptions extends StObject {
    
    var pem: String = js.native
    
    var public: Boolean = js.native
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
  
  @js.native
  trait Jwk extends StObject {
    
    var d: String = js.native
    
    var dp: String = js.native
    
    var dq: String = js.native
    
    var e: String = js.native
    
    var kty: String = js.native
    
    var n: String = js.native
    
    var p: String = js.native
    
    var q: String = js.native
    
    var qi: String = js.native
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
  
  @js.native
  trait RsaKeys extends StObject {
    
    var `private`: String = js.native
    
    var public: String = js.native
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
  
  // PEM-to-JWK
  @JSImport("rasha", "import")
  @js.native
  def `import`(opts: ImportOptions): js.Promise[Jwk] = js.native
}
