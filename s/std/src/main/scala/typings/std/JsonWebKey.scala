package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonWebKey extends StObject {
  
  var alg: js.UndefOr[java.lang.String] = js.undefined
  
  var crv: js.UndefOr[java.lang.String] = js.undefined
  
  var d: js.UndefOr[java.lang.String] = js.undefined
  
  var dp: js.UndefOr[java.lang.String] = js.undefined
  
  var dq: js.UndefOr[java.lang.String] = js.undefined
  
  var e: js.UndefOr[java.lang.String] = js.undefined
  
  var ext: js.UndefOr[scala.Boolean] = js.undefined
  
  var k: js.UndefOr[java.lang.String] = js.undefined
  
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var kty: js.UndefOr[java.lang.String] = js.undefined
  
  var n: js.UndefOr[java.lang.String] = js.undefined
  
  var oth: js.UndefOr[js.Array[RsaOtherPrimesInfo]] = js.undefined
  
  var p: js.UndefOr[java.lang.String] = js.undefined
  
  var q: js.UndefOr[java.lang.String] = js.undefined
  
  var qi: js.UndefOr[java.lang.String] = js.undefined
  
  var use: js.UndefOr[java.lang.String] = js.undefined
  
  var x: js.UndefOr[java.lang.String] = js.undefined
  
  var y: js.UndefOr[java.lang.String] = js.undefined
}
object JsonWebKey {
  
  @scala.inline
  def apply(): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey]
  }
  
  @scala.inline
  implicit class JsonWebKeyMutableBuilder[Self <: JsonWebKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: java.lang.String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    @scala.inline
    def setCrv(value: java.lang.String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    @scala.inline
    def setD(value: java.lang.String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDp(value: java.lang.String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    @scala.inline
    def setDq(value: java.lang.String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    @scala.inline
    def setE(value: java.lang.String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setExt(value: scala.Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setK(value: java.lang.String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    @scala.inline
    def setKey_ops(value: js.Array[java.lang.String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
    
    @scala.inline
    def setKey_opsVarargs(value: java.lang.String*): Self = StObject.set(x, "key_ops", js.Array(value :_*))
    
    @scala.inline
    def setKty(value: java.lang.String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    @scala.inline
    def setN(value: java.lang.String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setOth(value: js.Array[RsaOtherPrimesInfo]): Self = StObject.set(x, "oth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOthUndefined: Self = StObject.set(x, "oth", js.undefined)
    
    @scala.inline
    def setOthVarargs(value: RsaOtherPrimesInfo*): Self = StObject.set(x, "oth", js.Array(value :_*))
    
    @scala.inline
    def setP(value: java.lang.String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    @scala.inline
    def setQ(value: java.lang.String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setQi(value: java.lang.String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    
    @scala.inline
    def setUse(value: java.lang.String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setX(value: java.lang.String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: java.lang.String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
