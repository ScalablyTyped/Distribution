package typings.rabinWasm.mod.ASModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rabin extends js.Object {
  
  var chunk_cut_fingerprint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var chunk_length: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var chunk_start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var count: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var digest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  def fingerprint(buf: u32, lengths: u32): u32 = js.native
  
  var mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var maxsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var minsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var polynomial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any = js.native
  
  var window: u32 = js.native
  
  var window_size: i32 = js.native
  
  var wpos: i32 = js.native
}
object Rabin {
  
  @scala.inline
  def apply(
    chunk_cut_fingerprint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    chunk_length: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    chunk_start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    count: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    digest: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    fingerprint: (u32, u32) => u32,
    mask: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    maxsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    minsize: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    polynomial: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    start: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any,
    window: u32,
    window_size: i32,
    wpos: i32
  ): Rabin = {
    val __obj = js.Dynamic.literal(chunk_cut_fingerprint = chunk_cut_fingerprint.asInstanceOf[js.Any], chunk_length = chunk_length.asInstanceOf[js.Any], chunk_start = chunk_start.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], fingerprint = js.Any.fromFunction2(fingerprint), mask = mask.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], minsize = minsize.asInstanceOf[js.Any], polynomial = polynomial.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any], window_size = window_size.asInstanceOf[js.Any], wpos = wpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rabin]
  }
  
  @scala.inline
  implicit class RabinOps[Self <: Rabin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunk_cut_fingerprint(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("chunk_cut_fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_length(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("chunk_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk_start(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("chunk_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: (u32, u32) => u32): Self = this.set("fingerprint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMask(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxsize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("maxsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinsize(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("minsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolynomial(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("polynomial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U64 */ js.Any
    ): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: u32): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow_size(value: i32): Self = this.set("window_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpos(value: i32): Self = this.set("wpos", value.asInstanceOf[js.Any])
  }
}
