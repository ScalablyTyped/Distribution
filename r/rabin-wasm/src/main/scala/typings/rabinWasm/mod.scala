package typings.rabinWasm

import typings.rabinWasm.mod.ASModule.i32
import typings.rabinWasm.mod.ASModule.u32
import typings.rabinWasm.mod.ASModule.u64
import typings.rabinWasm.mod.ASModule.usize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("rabin-wasm/dist/rabin-wasm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Int32Array_ID")
    @js.native
    def Int32ArrayID: u32 = js.native
    
    inline def Int32ArrayID_=(x: u32): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32Array_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Rabin")
    @js.native
    open class Rabin protected ()
      extends StObject
         with typings.rabinWasm.mod.ASModule.Rabin {
      def this(average_bits: u32, minsize: u32, maxsize: u32, window_size: i32) = this()
      
      /* CompleteClass */
      var chunk_cut_fingerprint: u64 = js.native
      
      /* CompleteClass */
      var chunk_length: u64 = js.native
      
      /* CompleteClass */
      var chunk_start: u64 = js.native
      
      /* CompleteClass */
      var count: u64 = js.native
      
      /* CompleteClass */
      var digest: u64 = js.native
      
      /* CompleteClass */
      override def fingerprint(buf: usize, lengths: usize): usize = js.native
      
      /* CompleteClass */
      var mask: u64 = js.native
      
      /* CompleteClass */
      var maxsize: u64 = js.native
      
      /* CompleteClass */
      var minsize: u64 = js.native
      
      /* CompleteClass */
      var polynomial: u64 = js.native
      
      /* CompleteClass */
      var pos: u64 = js.native
      
      /* CompleteClass */
      var start: u64 = js.native
      
      /* CompleteClass */
      var window: usize = js.native
      
      /* CompleteClass */
      var window_size: i32 = js.native
      
      /* CompleteClass */
      var wpos: i32 = js.native
    }
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.Uint8Array_ID")
    @js.native
    def Uint8ArrayID: u32 = js.native
    
    inline def Uint8ArrayID_=(x: u32): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uint8Array_ID")(x.asInstanceOf[js.Any])
    
    inline def alloc(size: usize, id: u32): usize = (^.asInstanceOf[js.Dynamic].applyDynamic("__alloc")(size.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[usize]
    
    inline def collect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__collect")().asInstanceOf[Unit]
    
    inline def degree(polynom: u64): i32 = ^.asInstanceOf[js.Dynamic].applyDynamic("degree")(polynom.asInstanceOf[js.Any]).asInstanceOf[i32]
    
    inline def mod(x: u64, p: u64): u64 = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[u64]
    
    inline def release(ptr: usize): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("__release")(ptr.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def retain(ptr: usize): usize = ^.asInstanceOf[js.Dynamic].applyDynamic("__retain")(ptr.asInstanceOf[js.Any]).asInstanceOf[usize]
    
    @JSImport("rabin-wasm/dist/rabin-wasm", "default.__rtti_base")
    @js.native
    def rttiBase: usize = js.native
    
    inline def rttiBase_=(x: usize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__rtti_base")(x.asInstanceOf[js.Any])
  }
  
  object ASModule {
    
    trait Rabin extends StObject {
      
      var chunk_cut_fingerprint: u64
      
      var chunk_length: u64
      
      var chunk_start: u64
      
      var count: u64
      
      var digest: u64
      
      def fingerprint(buf: usize, lengths: usize): usize
      
      var mask: u64
      
      var maxsize: u64
      
      var minsize: u64
      
      var polynomial: u64
      
      var pos: u64
      
      var start: u64
      
      var window: usize
      
      var window_size: i32
      
      var wpos: i32
    }
    object Rabin {
      
      inline def apply(
        chunk_cut_fingerprint: u64,
        chunk_length: u64,
        chunk_start: u64,
        count: u64,
        digest: u64,
        fingerprint: (usize, usize) => usize,
        mask: u64,
        maxsize: u64,
        minsize: u64,
        polynomial: u64,
        pos: u64,
        start: u64,
        window: usize,
        window_size: i32,
        wpos: i32
      ): Rabin = {
        val __obj = js.Dynamic.literal(chunk_cut_fingerprint = chunk_cut_fingerprint.asInstanceOf[js.Any], chunk_length = chunk_length.asInstanceOf[js.Any], chunk_start = chunk_start.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], fingerprint = js.Any.fromFunction2(fingerprint), mask = mask.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], minsize = minsize.asInstanceOf[js.Any], polynomial = polynomial.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], window_size = window_size.asInstanceOf[js.Any], wpos = wpos.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rabin]
      }
      
      extension [Self <: Rabin](x: Self) {
        
        inline def setChunk_cut_fingerprint(value: u64): Self = StObject.set(x, "chunk_cut_fingerprint", value.asInstanceOf[js.Any])
        
        inline def setChunk_length(value: u64): Self = StObject.set(x, "chunk_length", value.asInstanceOf[js.Any])
        
        inline def setChunk_start(value: u64): Self = StObject.set(x, "chunk_start", value.asInstanceOf[js.Any])
        
        inline def setCount(value: u64): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setDigest(value: u64): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
        
        inline def setFingerprint(value: (usize, usize) => usize): Self = StObject.set(x, "fingerprint", js.Any.fromFunction2(value))
        
        inline def setMask(value: u64): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def setMaxsize(value: u64): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
        
        inline def setMinsize(value: u64): Self = StObject.set(x, "minsize", value.asInstanceOf[js.Any])
        
        inline def setPolynomial(value: u64): Self = StObject.set(x, "polynomial", value.asInstanceOf[js.Any])
        
        inline def setPos(value: u64): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
        
        inline def setStart(value: u64): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setWindow(value: usize): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
        
        inline def setWindow_size(value: i32): Self = StObject.set(x, "window_size", value.asInstanceOf[js.Any])
        
        inline def setWpos(value: i32): Self = StObject.set(x, "wpos", value.asInstanceOf[js.Any])
      }
    }
    
    type bool = Any
    
    type f32 = Double
    
    type f64 = Double
    
    type i16 = Double
    
    type i32 = Double
    
    type i64 = js.BigInt
    
    type i8 = Double
    
    type isize = Double
    
    type u16 = Double
    
    type u32 = Double
    
    type u64 = js.BigInt
    
    type u8 = Double
    
    type usize = Double
  }
}
