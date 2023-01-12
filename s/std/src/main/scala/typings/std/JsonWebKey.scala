package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonWebKey extends StObject {
  
  /* standard dom */
  var alg: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var crv: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var d: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var dp: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var dq: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var e: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var ext: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var k: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var kty: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var n: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var oth: js.UndefOr[js.Array[RsaOtherPrimesInfo]] = js.undefined
  
  /* standard dom */
  var p: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var q: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var qi: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var use: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var x: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var y: js.UndefOr[java.lang.String] = js.undefined
}
object JsonWebKey {
  
  inline def apply(): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonWebKey] (val x: Self) extends AnyVal {
    
    inline def setAlg(value: java.lang.String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCrv(value: java.lang.String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setD(value: java.lang.String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDp(value: java.lang.String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
    
    inline def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
    
    inline def setDq(value: java.lang.String): Self = StObject.set(x, "dq", value.asInstanceOf[js.Any])
    
    inline def setDqUndefined: Self = StObject.set(x, "dq", js.undefined)
    
    inline def setE(value: java.lang.String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setExt(value: scala.Boolean): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setK(value: java.lang.String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    inline def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    inline def setKey_ops(value: js.Array[java.lang.String]): Self = StObject.set(x, "key_ops", value.asInstanceOf[js.Any])
    
    inline def setKey_opsUndefined: Self = StObject.set(x, "key_ops", js.undefined)
    
    inline def setKey_opsVarargs(value: java.lang.String*): Self = StObject.set(x, "key_ops", js.Array(value*))
    
    inline def setKty(value: java.lang.String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: java.lang.String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setOth(value: js.Array[RsaOtherPrimesInfo]): Self = StObject.set(x, "oth", value.asInstanceOf[js.Any])
    
    inline def setOthUndefined: Self = StObject.set(x, "oth", js.undefined)
    
    inline def setOthVarargs(value: RsaOtherPrimesInfo*): Self = StObject.set(x, "oth", js.Array(value*))
    
    inline def setP(value: java.lang.String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    
    inline def setQ(value: java.lang.String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setQi(value: java.lang.String): Self = StObject.set(x, "qi", value.asInstanceOf[js.Any])
    
    inline def setQiUndefined: Self = StObject.set(x, "qi", js.undefined)
    
    inline def setUse(value: java.lang.String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setX(value: java.lang.String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: java.lang.String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
