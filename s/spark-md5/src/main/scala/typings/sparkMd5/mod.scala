package typings.sparkMd5

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("spark-md5", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with SparkMD5
  @JSImport("spark-md5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("spark-md5", "ArrayBuffer")
  @js.native
  class ArrayBuffer () extends StObject {
    
    def append(str: JsArrayBuffer): ArrayBuffer = js.native
    
    def destroy(): Unit = js.native
    
    def end(): String = js.native
    def end(raw: Boolean): String = js.native
    
    def getState(): State = js.native
    
    def reset(): ArrayBuffer = js.native
    
    def setState(state: State): State = js.native
  }
  object ArrayBuffer {
    
    @JSImport("spark-md5", "ArrayBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def hash(arr: JsArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def hash(arr: JsArrayBuffer, raw: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(arr.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /* static member */
  @scala.inline
  def hash(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hash(str: String, raw: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def hashBinary(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashBinary")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hashBinary(content: String, raw: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashBinary")(content.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type JsArrayBuffer = typings.std.ArrayBuffer
  
  @js.native
  trait SparkMD5 extends StObject {
    
    def append(str: String): SparkMD5 = js.native
    
    def appendBinary(contents: String): SparkMD5 = js.native
    
    def destroy(): Unit = js.native
    
    def end(): String = js.native
    def end(raw: Boolean): String = js.native
    
    def getState(): State = js.native
    
    def reset(): SparkMD5 = js.native
    
    def setState(state: State): State = js.native
  }
  
  trait State extends StObject {
    
    var buff: Uint8Array
    
    var hash: js.Array[Double]
    
    var length: Double
  }
  object State {
    
    @scala.inline
    def apply(buff: Uint8Array, hash: js.Array[Double], length: Double): State = {
      val __obj = js.Dynamic.literal(buff = buff.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuff(value: Uint8Array): Self = StObject.set(x, "buff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: js.Array[Double]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashVarargs(value: Double*): Self = StObject.set(x, "hash", js.Array(value :_*))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
