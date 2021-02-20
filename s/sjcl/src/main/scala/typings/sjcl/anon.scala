package typings.sjcl

import typings.sjcl.mod.BitArray_
import typings.sjcl.mod.PseudoMersennePrimeStatic
import typings.sjcl.mod.SjclEllipticalCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait C192 extends StObject {
    
    var c192: SjclEllipticalCurve = js.native
    
    var c224: SjclEllipticalCurve = js.native
    
    var c256: SjclEllipticalCurve = js.native
    
    var c384: SjclEllipticalCurve = js.native
    
    var c521: SjclEllipticalCurve = js.native
    
    var k192: SjclEllipticalCurve = js.native
    
    var k224: SjclEllipticalCurve = js.native
    
    var k256: SjclEllipticalCurve = js.native
  }
  object C192 {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class C192MutableBuilder[Self <: C192] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC192(value: SjclEllipticalCurve): Self = StObject.set(x, "c192", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC224(value: SjclEllipticalCurve): Self = StObject.set(x, "c224", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC256(value: SjclEllipticalCurve): Self = StObject.set(x, "c256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC384(value: SjclEllipticalCurve): Self = StObject.set(x, "c384", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setC521(value: SjclEllipticalCurve): Self = StObject.set(x, "c521", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK192(value: SjclEllipticalCurve): Self = StObject.set(x, "k192", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK224(value: SjclEllipticalCurve): Self = StObject.set(x, "k224", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK256(value: SjclEllipticalCurve): Self = StObject.set(x, "k256", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: BitArray_ = js.native
    
    var salt: BitArray_ = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: BitArray_, salt: BitArray_): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: BitArray_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setSalt(value: BitArray_): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltVarargs(value: Double*): Self = StObject.set(x, "salt", js.Array(value :_*))
    }
  }
  
  @js.native
  trait P127 extends StObject {
    
    var p127: PseudoMersennePrimeStatic = js.native
    
    // NIST primes
    var p192: PseudoMersennePrimeStatic = js.native
    
    // Koblitz primes
    var p192k: PseudoMersennePrimeStatic = js.native
    
    var p224: PseudoMersennePrimeStatic = js.native
    
    var p224k: PseudoMersennePrimeStatic = js.native
    
    // Bernstein's prime for Curve25519
    var p25519: PseudoMersennePrimeStatic = js.native
    
    var p256: PseudoMersennePrimeStatic = js.native
    
    var p256k: PseudoMersennePrimeStatic = js.native
    
    var p384: PseudoMersennePrimeStatic = js.native
    
    var p521: PseudoMersennePrimeStatic = js.native
  }
  object P127 {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class P127MutableBuilder[Self <: P127] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP127(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p127", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP192(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p192", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP192k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p192k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP224(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p224", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP224k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p224k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP25519(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p25519", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p256", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP256k(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p256k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP384(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p384", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP521(value: PseudoMersennePrimeStatic): Self = StObject.set(x, "p521", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var key: BitArray_ = js.native
    
    var tag: BitArray_ = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(key: BitArray_, tag: BitArray_): Tag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: BitArray_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: Double*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: BitArray_): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagVarargs(value: Double*): Self = StObject.set(x, "tag", js.Array(value :_*))
    }
  }
}
