package typings.sjcl

import typings.sjcl.mod.BitArray_
import typings.sjcl.mod.PseudoMersennePrimeStatic
import typings.sjcl.mod.SjclEllipticalCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait C192 extends StObject {
    
    var c192: SjclEllipticalCurve
    
    var c224: SjclEllipticalCurve
    
    var c256: SjclEllipticalCurve
    
    var c384: SjclEllipticalCurve
    
    var c521: SjclEllipticalCurve
    
    var k192: SjclEllipticalCurve
    
    var k224: SjclEllipticalCurve
    
    var k256: SjclEllipticalCurve
  }
  object C192 {
    
    inline def apply(
      c192: SjclEllipticalCurve,
      c224: SjclEllipticalCurve,
      c256: SjclEllipticalCurve,
      c384: SjclEllipticalCurve,
      c521: SjclEllipticalCurve,
      k192: SjclEllipticalCurve,
      k224: SjclEllipticalCurve,
      k256: SjclEllipticalCurve
    ): C192 = {
      val __obj = js.Dynamic.literal(c192 = c192.asInstanceOf[js.Any], c224 = c224.asInstanceOf[js.Any], c256 = c256.asInstanceOf[js.Any], c384 = c384.asInstanceOf[js.Any], c521 = c521.asInstanceOf[js.Any], k192 = k192.asInstanceOf[js.Any], k224 = k224.asInstanceOf[js.Any], k256 = k256.asInstanceOf[js.Any])
      __obj.asInstanceOf[C192]
    }
    
    extension [Self <: C192](x: Self) {
      
      inline def setC192(value: SjclEllipticalCurve): Self = StObject.set(x, "c192", value.asInstanceOf[js.Any])
      
      inline def setC224(value: SjclEllipticalCurve): Self = StObject.set(x, "c224", value.asInstanceOf[js.Any])
      
      inline def setC256(value: SjclEllipticalCurve): Self = StObject.set(x, "c256", value.asInstanceOf[js.Any])
      
      inline def setC384(value: SjclEllipticalCurve): Self = StObject.set(x, "c384", value.asInstanceOf[js.Any])
      
      inline def setC521(value: SjclEllipticalCurve): Self = StObject.set(x, "c521", value.asInstanceOf[js.Any])
      
      inline def setK192(value: SjclEllipticalCurve): Self = StObject.set(x, "k192", value.asInstanceOf[js.Any])
      
      inline def setK224(value: SjclEllipticalCurve): Self = StObject.set(x, "k224", value.asInstanceOf[js.Any])
      
      inline def setK256(value: SjclEllipticalCurve): Self = StObject.set(x, "k256", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: BitArray_
    
    var salt: BitArray_
  }
  object Key {
    
    inline def apply(key: BitArray_, salt: BitArray_): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: BitArray_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value*))
    }
  }
  
  trait P127 extends StObject {
    
    var p127: PseudoMersennePrimeStatic
    
    // NIST primes
    var p192: PseudoMersennePrimeStatic
    
    // Koblitz primes
    var p192k: PseudoMersennePrimeStatic
    
    var p224: PseudoMersennePrimeStatic
    
    var p224k: PseudoMersennePrimeStatic
    
    // Bernstein's prime for Curve25519
    var p25519: PseudoMersennePrimeStatic
    
    var p256: PseudoMersennePrimeStatic
    
    var p256k: PseudoMersennePrimeStatic
    
    var p384: PseudoMersennePrimeStatic
    
    var p521: PseudoMersennePrimeStatic
  }
  object P127 {
    
    inline def apply(
      p127: PseudoMersennePrimeStatic,
      p192: PseudoMersennePrimeStatic,
      p192k: PseudoMersennePrimeStatic,
      p224: PseudoMersennePrimeStatic,
      p224k: PseudoMersennePrimeStatic,
      p25519: PseudoMersennePrimeStatic,
      p256: PseudoMersennePrimeStatic,
      p256k: PseudoMersennePrimeStatic,
      p384: PseudoMersennePrimeStatic,
      p521: PseudoMersennePrimeStatic
    ): P127 = {
      val __obj = js.Dynamic.literal(p127 = p127.asInstanceOf[js.Any], p192 = p192.asInstanceOf[js.Any], p192k = p192k.asInstanceOf[js.Any], p224 = p224.asInstanceOf[js.Any], p224k = p224k.asInstanceOf[js.Any], p25519 = p25519.asInstanceOf[js.Any], p256 = p256.asInstanceOf[js.Any], p256k = p256k.asInstanceOf[js.Any], p384 = p384.asInstanceOf[js.Any], p521 = p521.asInstanceOf[js.Any])
      __obj.asInstanceOf[P127]
    }
    
    extension [Self <: P127](x: Self) {
      
      inline def setP127(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p127", value.asInstanceOf[js.Any])
      
      inline def setP192(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p192", value.asInstanceOf[js.Any])
      
      inline def setP192k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p192k", value.asInstanceOf[js.Any])
      
      inline def setP224(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p224", value.asInstanceOf[js.Any])
      
      inline def setP224k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p224k", value.asInstanceOf[js.Any])
      
      inline def setP25519(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p25519", value.asInstanceOf[js.Any])
      
      inline def setP256(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p256", value.asInstanceOf[js.Any])
      
      inline def setP256k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p256k", value.asInstanceOf[js.Any])
      
      inline def setP384(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p384", value.asInstanceOf[js.Any])
      
      inline def setP521(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p521", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var key: BitArray_
    
    var tag: BitArray_
  }
  object Tag {
    
    inline def apply(key: BitArray_, tag: BitArray_): Tag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setKey(value: BitArray_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setTag(value: BitArray_): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagVarargs(value: Double*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
}
