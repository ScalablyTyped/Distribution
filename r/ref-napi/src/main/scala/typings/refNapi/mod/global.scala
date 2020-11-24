package typings.refNapi.mod

import typings.refNapi.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Buffer extends js.Object {
    
    def address(buffer: this.type): Double = js.native
    @JSName("address")
    var address_Original: js.Function1[/* buffer */ this.type, Double] = js.native
    
    def deref(buffer: this.type): js.Any = js.native
    @JSName("deref")
    var deref_Original: js.Function1[/* buffer */ this.type, _] = js.native
    
    def isNull(buffer: this.type): Boolean = js.native
    @JSName("isNull")
    var isNull_Original: js.Function1[/* buffer */ this.type, Boolean] = js.native
    
    def readCString(buffer: this.type): String = js.native
    def readCString(buffer: this.type, offset: Double): String = js.native
    @JSName("readCString")
    var readCString_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], String] = js.native
    
    def readInt64BE(buffer: this.type): js.Any = js.native
    def readInt64BE(buffer: this.type, offset: Double): js.Any = js.native
    @JSName("readInt64BE")
    var readInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
    
    def readInt64LE(buffer: this.type): js.Any = js.native
    def readInt64LE(buffer: this.type, offset: Double): js.Any = js.native
    @JSName("readInt64LE")
    var readInt64LE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
    
    def readObject(buffer: this.type): js.Object = js.native
    def readObject(buffer: this.type, offset: Double): js.Object = js.native
    @JSName("readObject")
    var readObject_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Object] = js.native
    
    def readPointer(buffer: this.type): this.type = js.native
    def readPointer(buffer: this.type, offset: js.UndefOr[scala.Nothing], length: Double): this.type = js.native
    def readPointer(buffer: this.type, offset: Double): this.type = js.native
    def readPointer(buffer: this.type, offset: Double, length: Double): this.type = js.native
    @JSName("readPointer")
    var readPointer_Original: js.Function3[
        /* buffer */ this.type, 
        /* offset */ js.UndefOr[Double], 
        /* length */ js.UndefOr[Double], 
        this.type
      ] = js.native
    
    def readUInt64BE(buffer: this.type): js.Any = js.native
    def readUInt64BE(buffer: this.type, offset: Double): js.Any = js.native
    @JSName("readUInt64BE")
    var readUInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
    
    def ref(buffer: this.type): this.type = js.native
    @JSName("ref")
    var ref_Original: js.Function1[/* buffer */ this.type, this.type] = js.native
    
    def reinterpret(buffer: this.type, size: Double): this.type = js.native
    def reinterpret(buffer: this.type, size: Double, offset: Double): this.type = js.native
    
    def reinterpretUntilZeros(buffer: this.type, size: Double): this.type = js.native
    def reinterpretUntilZeros(buffer: this.type, size: Double, offset: Double): this.type = js.native
    @JSName("reinterpretUntilZeros")
    var reinterpretUntilZeros_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type] = js.native
    
    @JSName("reinterpret")
    var reinterpret_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type] = js.native
    
    var `type`: js.UndefOr[Type] = js.native
    
    def writeCString(buffer: this.type, offset: Double, string: String): Unit = js.native
    def writeCString(buffer: this.type, offset: Double, string: String, encoding: String): Unit = js.native
    @JSName("writeCString")
    var writeCString_Original: js.Function4[
        /* buffer */ this.type, 
        /* offset */ Double, 
        /* string */ String, 
        /* encoding */ js.UndefOr[String], 
        Unit
      ] = js.native
    
    def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
    def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
    @JSName("writeInt64BE")
    var writeInt64BE_Original: FnCall = js.native
    
    def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = js.native
    def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
    @JSName("writeInt64LE")
    var writeInt64LE_Original: FnCall = js.native
    
    def writeObject(buffer: this.type, offset: Double, `object`: js.Object): Unit = js.native
    @JSName("writeObject")
    var writeObject_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* object */ js.Object, Unit] = js.native
    
    def writePointer(buffer: this.type, offset: Double, pointer: this.type): Unit = js.native
    @JSName("writePointer")
    var writePointer_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* pointer */ this.type, Unit] = js.native
    
    def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
    def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
    @JSName("writeUInt64BE")
    var writeUInt64BE_Original: FnCall = js.native
  }
}
